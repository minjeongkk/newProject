package com.example.board.Service;

import java.util.List;

import com.example.board.Entity.Board;
import com.example.board.Repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamRecruitmentBoardService {

    @Autowired
    private BoardRepository boardRepository;

    // get boards data
    public List<Board> getAllBoard() {
        return boardRepository.findAll();
    }

}
