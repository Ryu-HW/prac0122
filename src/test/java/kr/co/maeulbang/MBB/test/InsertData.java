package kr.co.maeulbang.MBB.test;

import kr.co.maeulbang.MBB.DTO.PostDto;
import kr.co.maeulbang.MBB.mapper.post.PostMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

@SpringBootTest
@Component
public class InsertData {
    @Autowired
    PostMapper postMapper;

    @Test
    void testInsertData(){
        for(int i=0;i<100;i++){

            String title = i+"번 제목";
            String content = i+"번 내용";
            PostDto post = new PostDto(title,content);
            postMapper.insertPost(post);
        }
    }
}
