# states com arrays e objetos

| Para fazer a iteração de arrays e objetos em um componente, é preciso informar no elemento root uma key para iteração.

```
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

```

| Dessa forma, não existirá a duplicidade de elementos durante a iteração do array.