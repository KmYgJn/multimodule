package dev.be.api.service;

import dev.be.common.domain.Member;
import dev.be.common.enums.CodeEnum;
import dev.be.common.repository.MemberRepository;
import dev.be.common.service.CommonDemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DemoService {
    private final CommonDemoService commonDemoService;
    private final MemberRepository  memberRepository;

    public String save() {
        memberRepository.save(Member.builder()
                .name(Thread.currentThread().getName()).build());
        return "save";
    }

    public String find() {
        int size = memberRepository.findAll().size();
        System.out.println("DB size : " + size);
        return "find";
    }

    public String exception() {
        return "exception";
    }
}
