# trabalhando com inputs de texto

## renderização condicional de componentes

Utilizando a lógica abaixo, os componentes são renderizados na tela conforme o estado informado nas condições.

```
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

```

