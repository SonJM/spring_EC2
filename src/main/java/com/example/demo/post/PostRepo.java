package com.example.demo.post;

import java.util.ArrayList;
import java.util.List;

public class PostRepo {
    List<Post> posts;

    PostRepo(){
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1,"점심시간","난 이 시간만을 기다리고있어","손정민"));
        this.posts.add(new Post(2,"저녁시간","난 이 시간만을 기다리고있어","손정민"));
        this.posts.add(new Post(3,"아침밥시간","난 이 시간만을 기다리고있어","손정민"));
        this.posts.add(new Post(4,"야식시간","난 이 시간만을 기다리고있어","손정민"));

    }

    List<Post> findAll(){
        return this.posts;
    }
}
