package com.saerok.controller;

import com.saerok.service.MemberService;
import com.saerok.service.dto.CreateMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/member")
public class MemberController {
    private MemberService memberService;

    @PostMapping("/signup")
    public Long signup(@RequestBody CreateMemberDto memberDto) {
        return memberService.create(memberDto);
    }
}
