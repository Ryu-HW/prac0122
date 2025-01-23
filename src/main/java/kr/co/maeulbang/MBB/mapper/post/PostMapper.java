package kr.co.maeulbang.MBB.mapper.post;

import kr.co.maeulbang.MBB.DTO.PostDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    public void insertPost( PostDto post);
    public List<PostDto> selectPostsForShow(int limit,int offset);
    public PostDto selectPostById(int id);
    public long countAllPosts();
}
