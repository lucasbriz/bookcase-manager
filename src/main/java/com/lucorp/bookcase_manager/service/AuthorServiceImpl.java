package com.lucorp.bookcase_manager.service;

import com.lucorp.bookcase_manager.Repository.AuthorRepository;
import com.lucorp.bookcase_manager.entity.Author;

import java.util.List;
import java.util.Optional;
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
    final var name = author.getName().toUpperCase();

    if(findByName(name).isPresent()){
      throw new IllegalArgumentException("Author " + name +  " already exists");
    }

    author.setName(name);

    return authorRepository.save(author);
  }

  @Transactional
  public List<Author> findAll() {
    return authorRepository.findAll();
  }

  @Transactional
  public Optional<Author> findByName(String name) {
    return authorRepository.findByName(name);
  }
}
