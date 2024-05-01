import './App.css'
import { Component } from 'react'

class App extends Component {
  state = {
    name: "Gabriel Henrique",
    age: 20,
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
  
  render() {
    const { posts } = this.state
    
    return (
      <div className='App'>
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
