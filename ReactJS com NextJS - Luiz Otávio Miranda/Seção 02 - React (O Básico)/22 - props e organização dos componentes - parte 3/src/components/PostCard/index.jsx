/* eslint-disable react/prop-types */
export const PostCard = ({cover, title, body}) => {
    return (
        <div className='flex flex-col gap-1.5 items-start bg-gray-400/80 hover:bg-gray-400 hover:cursor-pointer rounded-md shadow-md transition-all'>
            <img src={cover} alt={title}/>
            <h1 className='font-semibold text-ellipsis text-xl px-2'>{title}</h1>
            <p className='font-thin text-ellipsis px-2 py-1'>{body}</p>
        </div>
    )
}
