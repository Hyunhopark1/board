package com.phh.plannerproject.board;

public interface IBoardService {


    IBoard insert(BoardDto dto);

    IBoard update(BoardDto dto);

    IBoard findById(Long id);

    Boolean delete(Long id);



}
