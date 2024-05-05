# props e organização dos componentes

## paginação com componentes

Utilizando a lógica abaixo, foi desenvolvida uma função para fazer a paginação dos posts, inserindo novos posts ao clicar no botão

```
state = {
    posts: [], //posts que estão sendo exibidos na tela
    allPosts: [], //armazena todos os posts
    page: 0, //qual página está sendo exibida
    postsPerPage: 2 // define quantos posts são exibidos na tela
}

loadMorePosts = () => {
    const { posts, allPosts, page, postsPerPage } = this.state

    const nextPage = page + postsPerPage
    const nextPosts = allPosts.slice(nextPage, nextPage + postsPerPage)

    posts.push(...nextPosts)
    this.setState({ posts: posts, page: nextPage })
  }

```

No objeto state são definidos posts (), allPosts (), page () e postsPerPage().