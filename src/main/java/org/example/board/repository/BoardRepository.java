package org.example.board.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.example.board.model.Board;

public class BoardRepository {
    // DB
    private static final Map<Long, Board> BOARDS = new HashMap<>();
    private static Long ID = 1L;

    public Long save(Board board) {
        board.setId(ID++);
        BOARDS.put(board.getId(), board);
        return board.getId();
    }

    public Board findOne(Long id) {
        return BOARDS.get(id);
    }

    public List<Board> findAll() {
        return new ArrayList<>(BOARDS.values());
    }

    public void mod(Board board) {
        BOARDS.put(board.getId(), board);
    }

    public void del(Long id) {
        BOARDS.remove(id);
    }
}
