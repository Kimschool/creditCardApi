package com.weavus.api.credit.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@NoArgsConstructor
@Entity
@Getter
@Setter
public class CreditInfo {

    @Id
    @Column(length = 19)
    private String creditNo;

    @Column(length = 100)
    private String name;

    private long gendoGaku;

    private long siyoGaku;

}
