package com.lucorp.bookcase_manager.Repository;

import com.lucorp.bookcase_manager.entity.Author;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, UUID> {

  Optional<Author> findByName(String name);

}
