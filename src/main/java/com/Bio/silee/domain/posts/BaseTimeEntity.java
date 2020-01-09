package com.Bio.silee.domain.posts;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * Entity Data의 생성, 수정 시간 정보를 갖는다.
 * @author 이상일
 * @version 1.0
 * (2020.01.07) 이상일, 최초 작성
 */
@Getter
@MappedSuperclass // JPA Entity 클래스들이 이 클래스를 상속하는 경우 createdDate 와 modifiedDate도 칼럼으로 인식하게 한다
@EntityListeners(AuditingEntityListener.class) // Auditing 기능을 포함
public class BaseTimeEntity {
    @CreatedDate // Entity 생성되어 저장될 때 시간 자동저장
    private LocalDateTime creatdDate;

    @LastModifiedDate // Entity 값 변경할 때의 시간 자동저장
    private LocalDateTime modifiedDate;
}
