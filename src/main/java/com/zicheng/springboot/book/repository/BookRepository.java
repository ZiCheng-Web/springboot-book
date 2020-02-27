package com.zicheng.springboot.book.repository;

import com.zicheng.springboot.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
