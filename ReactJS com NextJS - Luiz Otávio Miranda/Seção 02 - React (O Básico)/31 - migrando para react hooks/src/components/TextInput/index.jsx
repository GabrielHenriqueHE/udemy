/* eslint-disable react/prop-types */
export const Input = ({ searchValue, onChange }) =>  {    
    return (
        <input 
          onChange={onChange}
          value={searchValue}
          type="search" 
          placeholder='Digite o título do post'
          className='p-1 rounded-md border-2 focus:outline-none focus:border-black/50'
        />
    )
}