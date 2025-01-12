package com.thc.fallsprbasic.domain;

import com.thc.fallsprbasic.dto.DefaultDto;
import com.thc.fallsprbasic.dto.UserDto;
import com.thc.fallsprbasic.dto.NoticeDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
<<<<<<< HEAD

@Getter
@Entity
public class User extends AuditingFields{
    @Setter @Column(nullable=false, unique=true)
    String username;
    @Setter @Column(nullable=false)
    String password;
    @Setter
    String name;
    @Setter
    String phone;

    protected User(){}
    private User(Boolean deleted, String username, String password, String name, String phone){
        this.deleted = deleted;
        this.username = username;
=======
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@Entity
public class User{
    @Id
    @Setter @Column(nullable=false, unique=true)
    String email;
    @Setter @Column(nullable=false)
    String password;
    @Setter @Column(nullable=false, unique=false)
    String name;
    @Setter
    String phone;
    @Setter
    String phone;
    @Column(nullable = false)
    @Setter
    protected boolean deleted;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt; // 생성일시

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @LastModifiedDate
    @Column(nullable = false)
    protected LocalDateTime modifiedAt; // 수정일시

    protected User(){}
    private User(Boolean deleted, String name, String password, String name, String phone){
        this.deleted = deleted;
        this.name = name;
>>>>>>> 41abcc8 (last commit)
        this.password = password;
        this.name = name;
        this.phone = phone;
    }

<<<<<<< HEAD
    public static User of(String username, String password, String name, String phone){
        return new User(false, username, password, name, phone);
=======
    public static User of(String name, String password, String name, String phone){
        return new User(false, name, password, name, phone);
>>>>>>> 41abcc8 (last commit)
    }

    public DefaultDto.CreateResDto toCreateResDto() {
        return DefaultDto.CreateResDto.builder().id(getId()).build();
    }
}
