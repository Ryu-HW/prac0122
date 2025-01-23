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
    public String showPost(@RequestParam(name ="page", defaultValue = "1")int page,
                           @RequestParam(name ="size", defaultValue = "10")int size,
                           Model model){

        model.addAttribute("pageDto",postService.getPostsForShow(page,size));
        //
        return "post/show";
    }

    @GetMapping("/show/{id}")
    public String showPost(@PathVariable("id") int id, Model model){
        model.addAttribute("post",postService.getPostById(id));
        return "post/detail";
    }

}
