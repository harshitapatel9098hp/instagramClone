package com.social.instagram.controller;

import com.social.instagram.model.comment;
import com.social.instagram.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.stream.events.Comment;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @PostMapping("/{postId}")
    public ResponseEntity<comment> addComment(
            @PathVariable Long postId,
            @RequestBody String content) {

        return ResponseEntity.ok(commentService.addComment(postId, content));
    }
}