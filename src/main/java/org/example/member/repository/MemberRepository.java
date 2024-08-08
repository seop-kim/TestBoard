package org.example.member.repository;

import java.util.HashMap;
import java.util.Map;
import org.example.member.model.Member;

public class MemberRepository {
    private static final Map<Long, Member> MEMBERS = new HashMap<>();
    private static Long ID = 1L;

    public Long save(Member member) {
        member.setId(ID++);
        MEMBERS.put(member.getId(), member);
        return member.getId();
    }

    public Member login(String name, String pass) {
        for (Member member : MEMBERS.values()) {
            if (member.getName().equals(name)) {
                if (member.getPass().equals(pass)) {
                    return member;
                }
            }
        }

        throw new IllegalArgumentException("일치하는 회원이 없습니다.");
    }
    public Member findOne(Long id) {
        return MEMBERS.get(id);
    }
}
