package com.example.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class postController {


    @Autowired
    private PostService postService;

    @RequestMapping(value = "/posts")
    public List<Post> getAllPosts() {
    return postService.getAllPosts();
    }
}
