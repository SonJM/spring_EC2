package com.example.demo.post;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PostController {
    private PostService postService;
    PostController(){
        this.postService = new PostService();
    }
//    @CrossOrigin(origins = "http://localhost:8080/csr/json") -> 하나의 메서드에만 적용
    @GetMapping("/csr/json")
    @ResponseBody
    public List<Post> findAll(){
        return postService.findAll();
    }


    @GetMapping("/ssr")
    public String findAllSsr(Model model){
        List<Post> posts = postService.findAll();
        model.addAttribute("posts",posts);
        return "postList";
    }
}
