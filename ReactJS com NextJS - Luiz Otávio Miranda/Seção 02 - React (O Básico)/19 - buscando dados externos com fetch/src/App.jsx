import './index.css'
import { Component } from 'react'

class App extends Component {

  state = {
    posts: []
  }
  
  componentDidMount() {
    this.loadPosts()
  }

  loadPosts = async () => {
    const postsResponse = fetch("https://jsonplaceholder.typicode.com/posts")
    const photosResponse = fetch("https://jsonplaceholder.typicode.com/photos")

    const [posts, photos] = await Promise.all([postsResponse, photosResponse])

    const postsJson = await posts.json()
    const photosJson = await photos.json()

    const postsAndPhotos = postsJson.map((post, index) => {
      return { ...post, cover: photosJson[index].url}
    })

    this.setState({ posts: postsAndPhotos })
  }

  render() {
    const { posts } = this.state
    
    return (
      <div className='grid grid-cols-3 px-2 py-2 gap-2'>
        {posts.map(post => (
          <div key={post.id} className='flex flex-col gap-1.5 items-start bg-gray-400/80 hover:bg-gray-400 hover:cursor-pointer rounded-md shadow-md transition-all'>
            <img src={post.cover} alt={post.title}/>
            <h1 className='font-semibold text-ellipsis text-xl px-2'>{post.title}</h1>
            <p className='font-thin text-ellipsis px-2 py-1'>{post.body}</p>
          </div>
        ))}
      </div>
    )
  }
}


export default App
