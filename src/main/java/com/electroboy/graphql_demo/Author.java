package com.electroboy.graphql_demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

  public static List<Author> authors = Arrays.asList(
      new Author(1, "J.K.Rowling"),
      new Author(2, "J.R.Tolkien"),
      new Author(3, "Wilkie Collins"),
      new Author(4, "Brian Kernighan")
  );

  public static Optional<Author> getAuthorById(Integer id){
    return authors.stream()
        .filter(b -> b.id.equals(id))
        .findFirst();
  }
}
