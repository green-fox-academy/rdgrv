package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Comment;
import com.greenfoxacademy.reddit.services.CommentService;
import com.greenfoxacademy.reddit.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @Autowired
  PostService postService;

  @Autowired
  CommentService commentService;

  @GetMapping("/")
  public String homepage(Model model){
    model.addAttribute("posts", postService.getPosts());
    return "index";
  }

  @GetMapping("/add")
  public String getAdd(){
    return "/add";
  }

  @PostMapping("/add")
  public String postAdd(@RequestParam(value= "title", required = false) String title,
                        @RequestParam(value= "url", required = false) String url) {
    postService.save(title, url);
    return "redirect:/";
  }

  @GetMapping("/post/{id}")
  public String post(Model model, @PathVariable(value = "id") long id){
    model.addAttribute("post", postService.getPostById(id));
    model.addAttribute("comments", commentService.getCommentsById(id));
    return "/post";
  }

  @PostMapping("/post/{id}/comment")
  public String comment(Model model, @PathVariable(value = "id") long id,
                        @RequestParam(value= "title", required = false) String title,
                        @RequestParam(value= "content", required = false) String content){
    model.addAttribute("post", postService.getPostById(id));
    postService.addCommentById(id, title, content);
    return "redirect:/post/" + id;
  }

  @GetMapping("/upvote/post/{id}")
  public String upvotePost(@PathVariable(value = "id") long id){
    postService.upvoteById(id);
    return "redirect:/";
  }

  @GetMapping("/downvote/post/{id}")
  public String downvotePost(@PathVariable(value = "id") long id){
    postService.downvoteById(id);
    return "redirect:/";
  }

  @GetMapping("/upvote/comment/{id}")
  public String upvoteComment(@PathVariable(value = "id") long id){
    commentService.upvoteById(id);
    return "redirect:/post/" + id;
  }

  @GetMapping("/downvote/comment/{id}")
  public String downvoteComment(@PathVariable(value = "id") long id){
    commentService.downvoteById(id);
    return "redirect:/post/" + id;
  }
}
