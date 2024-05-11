# componentes stateful

| Componentes stateful devem ser implementados como classe, enquanto componentes stateless podem ser implementados como função ou classe.

```
class App extends Component {
  state = {
    name: "Gabriel Henrique",
    age: 20
  }

  handleButtonClick = (e) => {
    e.preventDefault()
    const { age } = this.state
    this.setState({ age: age  + 1 })
  }
  
  render() {
    const { name, age } = this.state
    
    return (
      <div>
        <h1>Name: {name}</h1>
        <h2>Age: {age}</h2>
        <button onClick={this.handleButtonClick}>Increment Age</button>
      </div>
    )
  }
}
```

| Os métodos em componentes como classe não tem acesso ao this. Para resolver isso, pode ser feito um bind para o método usando: this.metodo = this.metodo.bind(this).

| No entanto, a forma mais simples é utilizar arrows function. Como a arrow function não tem acesso ao this, ela busca no elemento pai, que é o this da classe.