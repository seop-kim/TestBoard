package org.example.board.dto.request;

import org.example.member.model.Member;

public class HttpAddBoardRequest {
    // 게시글 제목
    private String title;

    // 게시글 제목
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
