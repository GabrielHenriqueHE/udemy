import './index.css'
import { Component } from 'react'
import { PostCard } from './components/PostCard'

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
          <PostCard 
            key={post.id}
            cover={post.cover}
            id={post.id}
            title={post.title}
            body={post.body}
          />
        ))}
      </div>
    )
  }
}


export default App
