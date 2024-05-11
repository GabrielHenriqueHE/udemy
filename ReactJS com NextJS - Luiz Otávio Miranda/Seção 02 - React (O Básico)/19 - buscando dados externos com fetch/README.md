# buscando dados com lifecycles methods

Lifecycle methods podem ser usados para executar ações em momentos específicos da execução do código. Podemos usar um desses métodos para fazer uma requisição em uma API quando um componente for criado, por exemplo.

```
state = {
    posts: []
  }
  
  componentDidMount() {
    this.loadPosts()
  }

  loadPosts = () => {
    fetch("https://jsonplaceholder.typicode.com/posts")
    .then(response => response.json())
    .then(posts => this.setState({ posts }))
  }

  render() {
    const { posts } = this.state
    
    return (
      <div className='App'>
        {posts.map(post => (
          <div key={post.id}>
            <h1>{post.title}</h1>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    )
  }

```