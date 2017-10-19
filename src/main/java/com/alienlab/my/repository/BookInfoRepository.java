package com.alienlab.my.repository;

import com.alienlab.my.entity.BookInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookInfoRepository extends JpaRepository<BookInfo, Long> {
    BookInfo findBookByISBN13(String isbn);
    Page<BookInfo> findBookByISBN13OrISBN10OrNameOrAuthorAndLexileTag(String value, String value2, String value3, String value4,int tag,Pageable pageable);
    Page<BookInfo> findBookByISBN13OrISBN10OrNameOrAuthorAndArtag(String value, String value2, String value3, String value4,int tag, Pageable pageable);
    Page<BookInfo> findBookByISBN13OrISBN10OrNameOrAuthor(String value, String value2, String value3, String value4, Pageable pageable);
};
