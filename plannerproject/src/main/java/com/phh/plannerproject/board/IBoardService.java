package com.phh.plannerproject.board;

import java.util.List;

public interface IBoardService {


    IBoard insert(BoardDto dto);

    IBoard update(BoardDto dto);

    IBoard findById(Long id);

    Boolean delete(Long id);

    List<BoardDto> findAllByNameContains();

}
