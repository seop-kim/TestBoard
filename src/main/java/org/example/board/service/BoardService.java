package org.example.board.service;

import java.util.List;
import org.example.board.model.Board;
import org.example.member.model.Member;

public interface BoardService {
    void addBoard(String title, String content, Member member);

    List<Board> findAll();

    Board findOne(Long id);

    void modBoard(Long boardId, String updateTitle, String updateContent, Member member);

    void delBoard(Long boardId, Member member);
}
