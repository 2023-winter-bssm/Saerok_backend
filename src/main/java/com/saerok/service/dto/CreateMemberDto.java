package com.saerok.service.dto;

import com.saerok.domain.entity.Member;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateMemberDto {
    private String userName;
    private String password;
    private String nickname;
    private int grade;
    private int classNo;
    private int studentNo;

    @Builder
    public CreateMemberDto(String userName, String password, String nickname, int grade, int classNo, int studentNo) {
        this.userName = userName;
        this.password = password;
        this.nickname = nickname;
        this.grade = grade;
        this.classNo = classNo;
        this.studentNo = studentNo;
    }

    public Member toEntity() {
//        return Member.builder()
//                .userName(userName)
//                .password(password)
//                .nickname(nickname)
//                .grade(grade)
//                .classNo(classNo)
//                .studentNo(studentNo)
//                .build();
        return new Member(userName, password, nickname, grade, classNo, studentNo);
    }
}
