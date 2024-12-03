package com.lucorp.bookcase_manager.controller;

import com.lucorp.bookcase_manager.entity.Author;
import com.lucorp.bookcase_manager.service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookcase-manager/authors")
public class AuthorController {

  private final AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Author save(@RequestBody Author author) {
    return authorService.save(author);
  }
}
