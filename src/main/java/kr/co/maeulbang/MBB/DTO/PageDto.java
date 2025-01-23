package kr.co.maeulbang.MBB.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PageDto<T> {
    private int currentPage;
    private int size;
    private int totalPageNum;
    private List<T> objects;


    public PageDto(int page, int size, long totalPageNum, List<T> objects) {
        this.currentPage = page;
        this.size = size;
        this.totalPageNum = (int) Math.ceil((double) totalPageNum/size);
        this.objects = objects;
    }
}
