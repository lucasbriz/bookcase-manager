package com.lucorp.bookcase_manager.controller;

import com.lucorp.bookcase_manager.entity.Author;
import com.lucorp.bookcase_manager.service.AuthorService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Author> getAll() {
    return authorService.findAll();
  }

  @GetMapping("/{name}")
  @ResponseStatus(HttpStatus.OK)
  public Optional<Author> findByName(@PathVariable String name) {
    return authorService.findByName(name.toUpperCase());
  }
}
