package com.example.board.Controller;

import java.util.List;

import com.example.board.Entity.Board;
import com.example.board.Service.TeamRecruitmentBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class TeamRecruitmentController {

    @Autowired
    private TeamRecruitmentBoardService boardService;

    // get all board
    @GetMapping("/board")
    public List<Board> getAllBoards() {

        return boardService.getAllBoard();
    }

}
