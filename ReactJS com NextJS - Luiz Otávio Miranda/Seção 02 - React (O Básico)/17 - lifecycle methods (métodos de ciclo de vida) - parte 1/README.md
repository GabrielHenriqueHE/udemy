# lifecycle methods - parte 1

Lifecycle methods são métodos que reconhecem quando algumas ações acontecem com os componentes.

```
componentDidMount() {
  // Executa as operações assim que o componente é montado na tela
    this.handleTimeout()
  }

  componentDidUpdate() {
    // Executa as operações assim que o componente é atualizado
    this.handleTimeout()
  }

  componentWillUnmount() {
    // Executa as operações assim que o componente será desmontado da tela
    clearTimeout(this.timeoutUpdate)
  }

```