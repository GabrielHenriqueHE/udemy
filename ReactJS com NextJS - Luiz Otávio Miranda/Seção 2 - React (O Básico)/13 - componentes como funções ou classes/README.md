# componentes como funções ou classes

| Componentes podem ser criados como funções ou classes.

function component() {
    return (
        <div>
            <h1>Eu sou um componente como função</h1>
        </div>
    )
}

class MeuComponente extends Component {
    render (){
        <div>
            <h1>Eu sou um componente como classe</h1>
        </div>
    }
}