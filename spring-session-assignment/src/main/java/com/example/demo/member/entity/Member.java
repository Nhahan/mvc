package com.example.demo.member.entity;

import com.example.demo.member.dto.MemberResponseDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;

    public Member(String email) {
        this.email = email;
    }

    private Member(Long id) {
        this.id = id;
    }

    public static Member fromDto(MemberResponseDto dto) {
        return new Member(dto.getId());
    }

    public void update(String email) {
        this.email = email;
    }
}
