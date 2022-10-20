package com.example.board.Entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Board")
@DynamicInsert
@DynamicUpdate
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    // 작성자 id
    @Column(name = "writerId")
    private String writerId;

    // 제목
    @Column(name = "title")
    private String title;

    // 내용
    @Column(name = "contents")
    private String contents;

    // 작성 날짜
    @Column(name = "createdDate")
    private Date createdDate;

    // 모집 기간
    @Column(name = "period")
    private Integer period;


}
