package com.myblog.myblog11.controller;


import com.myblog.myblog11.payload.PostDto;
import com.myblog.myblog11.service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {


    public PostController(PostService postService) {
        this.postService = postService;
    }

    private PostService postService;




    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postdto ) {


        PostDto dto = postService.createPost(postdto);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }


}