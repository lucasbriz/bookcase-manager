package com.lucorp.bookcase_manager.service;

import com.lucorp.bookcase_manager.entity.Author;
import java.util.List;

public interface AuthorService {

  Author save(Author author);
  List<Author> findAll();

}
