package kr.co.maeulbang.MBB.service.post;

import kr.co.maeulbang.MBB.DTO.PageDto;
import kr.co.maeulbang.MBB.DTO.PostDto;
import kr.co.maeulbang.MBB.mapper.post.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    PostMapper postMapper;

    public void createPost(PostDto post){
        postMapper.insertPost(post);
    }

    public PageDto<PostDto> getPostsForShow(int page, int size){
        int offset = (page-1)*size;
        List<PostDto> posts = postMapper.selectPostsForShow(size,offset);
        long numOfAllPosts = postMapper.countAllPosts();
        PageDto<PostDto> pageDto = new PageDto<>(page, size, numOfAllPosts, posts);
        return pageDto;

    }

    public PostDto getPostById(int id){
        return postMapper.selectPostById(id);
    }
}
