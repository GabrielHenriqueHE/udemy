import './App.css'
import { Component } from 'react'

class App extends Component {
  state = {
    counter: 0,
    posts: [
      {
        id: 1,
        title: "Primeiro Post",
        content: "Conteúdo do primeiro post..."
      },
      {
          id: 2,
          title: "Segundo Post",
          content: "Conteúdo do segundo post..."
      },
      {
          id: 3,
          title: "Terceiro Post",
          content: "Conteúdo do terceiro post..."
      }
    ]
  }
  timeoutUpdate = null

  componentDidMount() {
    this.handleTimeout()
  }

  componentDidUpdate() {
    this.handleTimeout()
  }

  componentWillUnmount() {
    clearTimeout(this.timeoutUpdate)
  }

  handleTimeout = () => {
    const { posts, counter } = this.state
    posts[0].title = "O título mudou"

    this.timeoutUpdate = setTimeout(() => {
      this.setState({ posts: posts, counter: counter + 1 })
    }, 750)
  }

  render() {
    const { posts, counter } = this.state
    
    return (
      <div className='App'>
        <h1>{counter}</h1>
        {posts.map(post => {
          return (
            <div key={post.id}>
              <h1>{post.title}</h1>
              <p>{post.content}</p>
            </div>
          )
        })}
      </div>
    )
  }
}


export default App
