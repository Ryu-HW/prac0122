package kr.co.maeulbang.MBB.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostDto {
    private Integer id;
    private String title;
    private String content;

    public PostDto(String title, String content) {
        this.id = null;
        this.title = title;
        this.content = content;
    }
}
