import './index.css'
import { Component } from 'react'
import { loadPosts } from './utils/loadPosts'

import { Posts } from './components/Posts'

class App extends Component {

  state = {
    posts: []
  }
  
  async componentDidMount() {
    await this.loadPostsAndPhotos()
  }

  loadPostsAndPhotos = async () => {
    const postsAndPhotos = await loadPosts()
    this.setState({ posts: postsAndPhotos })
  }
  
  render() {
    const { posts } = this.state
    
    return (
      <Posts posts={posts} />
    )
  }
}


export default App
