/* eslint-disable react/prop-types */
import { PostCard } from "../PostCard"

export const Posts = ({ posts }) => {
    return (
        <div className='grid grid-cols-3 p-2 gap-2'>
        {posts.map(post => (
          <PostCard 
            key={post.id}
            cover={post.cover}
            id={post.id}
            title={post.title}
            body={post.body}
          />
        ))}
        </div>
    )
}