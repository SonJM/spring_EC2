package com.example.demo.post;


import java.util.List;

public class PostService {
    private PostRepo postRepo;

    PostService(){
        this.postRepo = new PostRepo();
    }

    List<Post> findAll(){
        return this.postRepo.findAll();
    }
}
