package org.koreait.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @Builder
@NoArgsConstructor @AllArgsConstructor // builder와 NoArgsConstructor 두개를 함께 사용하려면 AllArgsConstructor를 함께 사용하면 된다.
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long id;

    @Column(length=45, nullable = false)
    private String poster;

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    private long viewCount;


}
