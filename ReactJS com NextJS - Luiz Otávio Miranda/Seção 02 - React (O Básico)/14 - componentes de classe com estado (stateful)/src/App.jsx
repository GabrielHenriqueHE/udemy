import './App.css'
import { Component } from 'react'

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


export default App
