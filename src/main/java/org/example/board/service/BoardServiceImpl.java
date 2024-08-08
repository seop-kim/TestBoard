package org.example.board.service;

import java.util.List;
import org.example.board.model.Board;
import org.example.board.repository.BoardRepository;
import org.example.member.model.Member;

public class BoardServiceImpl implements BoardService {
    private final BoardRepository boardRepository = new BoardRepository();

    @Override
    public void addBoard(String title, String content, Member member) {
        // TODO
        //  addBoard 관련 로직 구현
        //  tip : 사용자가 입력한 데이터를 Board를 생성하여 삽입 후 boardRepository에 전달한다.

        boardRepository.save();
    }

    @Override
    public List<Board> findAll() {
        // TODO
        //  findAll 관련 로직 구현
        //  tip : BoardRepository 에서 관련 메서드를 찾아 사용하세요.
        return null;
    }

    @Override
    public Board findOne(Long id) {
        // TODO
        //  findOne 관련 로직 구현
        //  tip : BoardRepository 에서 관련 메서드를 찾아 사용하세요.
        return null;
    }

    @Override
    public void modBoard(Long boardId, String updateTitle, String updateContent, Member member) {
        Board findBoard = boardRepository.findOne(boardId);
        // check member
        if (findBoard.getMember().getId().equals(member.getId())) {
            throw new IllegalStateException("로그인 회원의 정보가 일치하지 않습니다.");
        }

        // TODO
        //  modBoard 관련 로직 구현
        //  tip : findBoard 변수에 수정할 제목과 내용을 삽입하세요.


        // TODO
        //  tip : BoardRepository 에서 관련 메서드를 찾아 매개변수를 입력해 주세요.
        boardRepository.mod();
    }

    @Override
    public void delBoard(Long boardId, Member member) {
        // TODO
        //  delAll 관련 로직 구현
        //  tip : modBoard 메서드에서 사용한 "check member"를 사용하여 Member 정보를 확인합니다.

        // TODO
        //  tip : BoardRepository 에서 관련 메서드를 찾아 사용하세요.

    }
}
