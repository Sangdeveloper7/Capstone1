package com.thc.fallsprbasic.domain;

import com.thc.fallsprbasic.dto.DefaultDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

//2024-07-11 추가(클래스 처음 추가함)
@Getter
@Table
@Entity
public class Tbpaper extends AuditingFields{
    @Setter @Column(nullable = false) private String papertypeId;
    @Setter @Column(nullable = false) private String papername;
    @Setter @Column(nullable = false) private String content;


    protected Tbpaper(){}
    private Tbpaper(String papertypeId, String papername, String content) {
        this.papertypeId = papertypeId;
        this.papername = papername;
        this.content = content;
    }
    public static Tbpaper of(String papertypeId, String papername, String content){
        return new Tbpaper(papertypeId, papername, content);
    }
    public DefaultDto.CreateResDto toCreateResDto() {
        return DefaultDto.CreateResDto.builder().id(getId()).build();
    }

}
