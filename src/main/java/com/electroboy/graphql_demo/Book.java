package com.electroboy.graphql_demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

  public static List<Book> books = Arrays.asList(
      new Book(1, "Harry Potter and Philosopher's Stone",405, 1),
      new Book(2, "Phoenix Project",375, 4),
      new Book(3, "Lord of the Rings",650, 2),
      new Book(4, "Woman in White",710, 3)
  );

  public static Optional<Book> getBookById(Integer id){
    return books.stream()
        .filter(b -> b.id.equals(id))
        .findFirst();
  }
}
