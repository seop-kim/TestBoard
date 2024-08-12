package org.example.board.controller;

import java.util.List;
import org.example.board.dto.request.HttpAddBoardRequest;
import org.example.board.dto.request.HttpModBoardRequest;
import org.example.board.model.Board;
import org.example.board.service.BoardService;
import org.example.board.service.BoardServiceImpl;
import org.example.member.model.Member;

public class BoardController {
    private final BoardService boardService = new BoardServiceImpl();

    public void addBoard(HttpAddBoardRequest request, Member member) {
        // TODO
        //  addBoard 관련 service 접근 코드 구현
        boardService.addBoard(request.getTitle(), request.getContent(), member);
    }

    public List<Board> findAll() {
        // TODO
        //  findAll 관련 service 접근 코드 구현
        return null;
    }

    public Board findOne(Long boardId) {
        // TODO
        //  findOne 관련 service 접근 코드 구현
        return null;
    }

    public void modBoard(Long boardId, HttpModBoardRequest request, Member member) {
        // TODO
        //  modBoard 관련 service 접근 코드 구현
    }

    public void delBoard(Long boardId, Member member) {
        // TODO
        //  delBoard 관련 service 접근 코드 구현
    }
}
