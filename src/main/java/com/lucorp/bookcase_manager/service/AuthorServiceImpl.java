package com.lucorp.bookcase_manager.service;

import com.lucorp.bookcase_manager.Repository.AuthorRepository;
import com.lucorp.bookcase_manager.entity.Author;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorServiceImpl implements AuthorService{

  private final AuthorRepository authorRepository;

  public AuthorServiceImpl(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  @Transactional
  public Author save(Author author) {
    author.setName(author.getName().toUpperCase());

    return authorRepository.save(author);
  }

  @Transactional
  public List<Author> findAll() {
    return authorRepository.findAll();
  }
}
