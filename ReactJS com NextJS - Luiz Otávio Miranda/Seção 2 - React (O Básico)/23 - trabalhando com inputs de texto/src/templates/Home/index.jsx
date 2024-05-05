import '../../index.css'
import { Component } from 'react'
import { loadPosts } from '../../utils/loadPosts'

import { Posts } from '../../components/Posts'
import { Button } from "../../components/Button"
import { Input } from '../../components/TextInput'

export class Home extends Component {

  state = {
    posts: [],
    allPosts: [],
    page: 0,
    postsPerPage: 2,
    searchValue: ""
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

  handleChange = (e) => {
    const { value } = e.target
    this.setState({ searchValue: value })
  }
  
  render() {
    const { posts, page, postsPerPage, allPosts, searchValue } = this.state
    const noMorePosts = page + postsPerPage >= allPosts.length

    const filteredPosts = searchValue ? allPosts.filter(post => {
      return post.title.toLowerCase().includes(searchValue)
    }) : posts
    
    return (
      <div className='flex flex-col gap-2 p-2'>
        <Input onChange={this.handleChange} value={searchValue}/>

        {searchValue && (
          <h1 className='font-semibold'>Busca: {searchValue}</h1>
        )}
        
        {filteredPosts.length > 0 && (
          <Posts posts={filteredPosts} />        
        )}

        {filteredPosts.length === 0 && (
          <p>Não existem posts :&apos;(</p>
        )}
        
        {!searchValue && (
          <>
            <Button 
              onClick={this.loadMorePosts}
              disabled={noMorePosts}
            >
                Load more posts
            </Button>
          </>
        )}
        
      </div>
    )
  }
}

