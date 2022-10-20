package com.example.board.Repository;

import java.util.List;

import com.example.board.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
