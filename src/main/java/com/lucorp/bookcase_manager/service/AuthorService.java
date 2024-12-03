package com.lucorp.bookcase_manager.service;

import com.lucorp.bookcase_manager.entity.Author;
import java.util.List;
import java.util.Optional;

public interface AuthorService {

  Author save(Author author);
  List<Author> findAll();
  Optional<Author> findByName(String name);

}
