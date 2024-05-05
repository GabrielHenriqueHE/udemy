import '../../index.css'
import { Component } from 'react'
import { loadPosts } from '../../utils/loadPosts'

import { Posts } from '../../components/Posts'
import { Button } from "../../components/Button"

export class Home extends Component {

  state = {
    posts: [],
    allPosts: [],
    page: 0,
    postsPerPage: 50
  }
  
  async componentDidMount() {
    await this.loadPosts()
  }

  loadPosts = async () => {
    const postsAndPhotos = await loadPosts()

    const { page, postsPerPage } = this.state

    this.setState({
      posts: postsAndPhotos.slice(page, postsPerPage),
      allPosts: postsAndPhotos
    })
  }

  loadMorePosts = () => {
    const { posts, allPosts, page, postsPerPage } = this.state
    

    const nextPage = page + postsPerPage
    const nextPosts = allPosts.slice(nextPage, nextPage + postsPerPage)

    posts.push(...nextPosts)
    this.setState({ posts: posts, page: nextPage })
  }
  
  render() {
    const { posts, page, postsPerPage, allPosts } = this.state
    const noMorePosts = page + postsPerPage >= allPosts.length
    
    return (
      <div className='flex flex-col gap-2 p-2'>
        <Posts posts={posts} />
        <Button 
          onClick={this.loadMorePosts}
          disabled={noMorePosts}
        >
            Load more posts
        </Button>
      </div>
    )
  }
}

