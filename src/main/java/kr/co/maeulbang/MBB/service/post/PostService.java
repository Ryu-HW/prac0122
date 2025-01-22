package kr.co.maeulbang.MBB.service.post;

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

    public List<PostDto> getAllPosts(){
        return postMapper.selectAllPosts();
    }
}
