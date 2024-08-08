package org.example;

import java.util.List;
import java.util.Scanner;
import org.example.board.controller.BoardController;
import org.example.board.dto.request.HttpAddBoardRequest;
import org.example.board.dto.request.HttpModBoardRequest;
import org.example.board.model.Board;
import org.example.member.model.Member;
import org.example.member.repository.MemberRepository;

public class Main {
    public static Scanner SC = new Scanner(System.in);
    public static Member LOGIN_MEMBER = null;

    public static void main(String[] args) {
        while (true) {
            while (LOGIN_MEMBER == null) { // 회원 기능 반복문
                memberFunction();
            }
            boardFunction();
        }
    }

    public static void boardFunction() {
        // TODO
        //  BoardController를 초기화 하세요.
        BoardController boardController;

        System.out.println("1. 게시글 작성 | 2. 게시글 전체 보기 | 3. 게시글 상세 보기 | 4. 게시글 수정 | 5. 게시글 삭제");
        int selectNumber = SC.nextInt();

        if (selectNumber == 1) {
            System.out.println("게시글 제목 입력 : ");
            String inputTitle = SC.next();
            System.out.println("게시글 내용 입력 : ");
            String inputContent = SC.next();

            // TODO
            //  게시글 작성에 관련된 contrller에 연결하세요.
            //  tip : HttpAddBoardRequest에 사용자가 입력한 데이터를 삽입하여 Controller로 전달하세요.
            HttpAddBoardRequest request = new HttpAddBoardRequest();
            request.setTitle();
            request.setContent();

            boardController.addBoard(request, LOGIN_MEMBER);

            System.out.println("게시글 저장 완료");
        }

        if (selectNumber == 2) {
            // TODO
            //  게시글 전체보기에 관련된 contrller에 연결하세요.
            List<Board> findAll;

            for (Board board : findAll) {
                System.out.println("=================================");
                System.out.println("게시글 번호 : " + board.getId());
                System.out.println("게시글 작성자 : " + board.getMember().getName());
                System.out.println("게시글 제목 : " + board.getTitle());
                System.out.println("=================================");
            }
        }

        if (selectNumber == 3) {
            System.out.println("게시글 번호를 입력해 주세요.");
            Long inputBoardId = SC.nextLong();

            // TODO
            //  게시글 상세보기에 관련된 contrller의 메서드를 확인하여 매개변수를 삽입하세요.
            Board findOne = boardController.findOne();

            System.out.println("=================================");
            System.out.println("게시글 번호 : " + findOne.getId());
            System.out.println("게시글 작성자 : " + findOne.getMember().getName());
            System.out.println("게시글 제목 : " + findOne.getTitle());
            System.out.println("게시글 내용 : " + findOne.getContent());
            System.out.println("=================================");
        }

        if (selectNumber == 4) {
            System.out.println("수정할 게시글 번호를 입력해 주세요.");
            Long inputBoardId = SC.nextLong();

            System.out.println("수정할 제목을 입력해 주세요.");
            String inputModTitle = SC.next();

            System.out.println("수정할 내용을 입력해 주세요.");
            String inputModContent = SC.next();

            // TODO
            //  게시글 수정에 관련된 contrller에 연결하세요.
            //  tip : HttpModBoardRequest class의 필드를 확인하고 사용자가 입력한 데이터를 삽입하여 Controller로 전달하세요.
            HttpModBoardRequest request = new HttpModBoardRequest();

            boardController.modBoard(inputBoardId, request, LOGIN_MEMBER);
            System.out.println("수정이 완료되었습니다.");
        }

        if (selectNumber == 5) {
            System.out.println("삭제할 게시글 번호를 입력해 주세요.");
            Long inputBoardId = SC.nextLong();

            // TODO
            //  게시글 수정에 관련된 contrller에 연결하세요.
            //  tip : boardController.delBoard() 의 매개변수를 확인하여 데이터를 전달하세요.
            boardController.delBoard();
            System.out.println("삭제가 완료되었습니다.");
        }
    }

    // 회원 기능
    public static void memberFunction() {
        MemberRepository memberRepository = new MemberRepository();
        System.out.println("1. 로그인 | 2. 회원가입");

        int selectNumber = SC.nextInt();
        if (selectNumber == 1) {
            System.out.println("아이디 입력 : ");
            String inputId = SC.next();
            System.out.println("패스워드 입력 : ");
            String inputPass = SC.next();

            LOGIN_MEMBER = memberRepository.login(inputId, inputPass);
            System.out.println("로그인 완료");
        }

        if (selectNumber == 2) {
            System.out.println("회원가입 아이디 입력 : ");
            String inputId = SC.next();
            System.out.println("회원가입 패스워드 입력 : ");
            String inputPass = SC.next();
            System.out.println("회원가입 나이 입력 : ");
            Long inputAge = SC.nextLong();

            Member member = new Member();
            member.setName(inputId);
            member.setPass(inputPass);
            member.setAge(inputAge);

            memberRepository.save(member);
            System.out.println("회원가입 완료");
        }
    }
}