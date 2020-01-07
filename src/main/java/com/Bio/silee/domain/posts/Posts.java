package com.Bio.silee.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/**
 * jpa Entity
 * @author 이상일
 * @version 1.0
 * (2020.01.06) 이상일, 최초 작성
 */
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자 자동 추가 = public Posts() {}
@Entity // 테이블과 링크될 클래스, CamelCase -> Underscore 테이블 이름 매칭, ex)SalesManager.java -> sales_manager.table
public class Posts {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // PK 생성규칙. 부트2.0부터는 IDENTITY 옵션 추가해야 auto_increment가 됨.
    private Long id;

    @Column(length = 500, nullable = false) // 테이블 컬럼, 변경이 필요하면 선언해서 쓴다.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 해당 클래스의 빌더 패턴 클래스 생성
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
