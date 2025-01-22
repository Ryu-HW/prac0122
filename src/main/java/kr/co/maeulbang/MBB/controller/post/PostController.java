package kr.co.maeulbang.MBB.controller.post;

import kr.co.maeulbang.MBB.DTO.PostDto;
import kr.co.maeulbang.MBB.service.post.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/create")
    public String createPostHTML(){
        return "post/create";
    }

    @PostMapping("/insert")
    public String createPost(@ModelAttribute PostDto post){
        postService.createPost(post);
        return "post/show"; //목록보러가야함
    }

    @GetMapping("/show")
    public String showPost(Model model){
        model.addAttribute("posts",postService.getAllPosts());
        return "post/show";
    }

}
