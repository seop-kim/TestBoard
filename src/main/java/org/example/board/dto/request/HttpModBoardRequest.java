package org.example.board.dto.request;

public class HttpModBoardRequest {
    // 수정 제목
    private String modTitle;

    // 수정 내용
    private String modContent;

    public String getModTitle() {
        return modTitle;
    }

    public void setModTitle(String modTitle) {
        this.modTitle = modTitle;
    }

    public String getModContent() {
        return modContent;
    }

    public void setModContent(String modContent) {
        this.modContent = modContent;
    }
}
