package com.saerok.service;

import com.saerok.domain.entity.Member;
import com.saerok.repository.MemberRepository;
import com.saerok.service.dto.CreateMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private MemberRepository memberRepository;

    @Transactional
    public Long create(CreateMemberDto memberDto) {
        Member member = memberDto.toEntity();
        memberRepository.save(member);
        return member.getId();
    }
}
