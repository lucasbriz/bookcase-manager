package com.lucorp.bookcase_manager.service;

import com.lucorp.bookcase_manager.Repository.AuthorRepository;
import com.lucorp.bookcase_manager.entity.Author;

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
    return authorRepository.save(author);
  }
}
