package com.duguletian.repository;

import com.duguletian.module.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by lth on 2017/6/11.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader (String reader);

}
