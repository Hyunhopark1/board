package com.phh.plannerproject.board;

import java.util.List;

public interface IBoardFreeService {


    IBoardFree insert(BoardFreeDto dto);

    IBoardFree update(BoardFreeDto dto);

    IBoardFree findById(Long id);

    Boolean delete(Long id);

    List<BoardFreeDto> findAllByNameContains();

}
