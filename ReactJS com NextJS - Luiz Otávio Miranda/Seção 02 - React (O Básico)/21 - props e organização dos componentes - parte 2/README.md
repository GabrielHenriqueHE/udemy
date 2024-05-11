# props e organização dos componentes

Props são as propriedades definidas para os componentes. Através delas, é possível acessar os dados fornecidos e exibi-los na renderização de cada um dos componentes.

```
/*
  cover, title, e body são atributos do objeto props, enviado como argumento
  para a função que faz a renderização. Nesse caso, a desestruturação de props
  é enviada como argumento.
*/

// props.cover, props.title, props.body
export const PostCard = ({cover, title, body}) => {
    return (
        <div>
            <img src={cover} alt={title} />
            <div>
                <h1>{title}</h1>
                <p>{body}</p>
            </div>
        </div>
    )
}

```