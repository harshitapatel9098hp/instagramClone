package com.social.instagram.controller;

import com.social.instagram.dto.PostRequest;
import com.social.instagram.model.post;
import com.social.instagram.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class Postcontroller {

    private final PostService postService;

    public Postcontroller(PostService postService) {
        this.postService = postService;
    }


    @PostMapping
    public ResponseEntity<post> createPost(@RequestBody PostRequest request) {
        return ResponseEntity.ok(postService.createPost(request));
    }


    @PostMapping("/{postId}/like")
    public ResponseEntity<String> likePost(@PathVariable Long postId) {
        postService.likePost(postId);
        return ResponseEntity.ok("Post liked");
    }

    @PostMapping("/{postId}/unlike")
    public ResponseEntity<String> unlikePost(@PathVariable Long postId) {
        postService.unlikePost(postId);
        return ResponseEntity.ok("Post unliked");
    }


    @GetMapping("/feed")
    public ResponseEntity<List<post>> getFeed() {
        return ResponseEntity.ok(postService.getFeed());
    }
}
