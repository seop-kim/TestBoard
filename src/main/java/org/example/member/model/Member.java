package org.example.member.model;

public class Member {
    private Long id; // 멤버의 고유 id
    private String name; // 멤버의 이름 및 로그인 아이디
    private String pass; // 멤버의 비밀번호
    private Long age; // 나이

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
