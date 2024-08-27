package com.phh.plannerproject.board;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IBoardFreeMyBatisMapper {

    //게시글 등록
    void insert(BoardFreeDto dto);

    //게시글 상세정보 조회
    BoardFreeDto findById(Long id);

    //게시글 수정
    void update(BoardFreeDto dto);

    //게시글 삭제
    void delete(Long id);

    //게시글 리스트 조회
    List<BoardFreeDto> findAll();

    //게시글 수 카운트
    Integer countAll();

}
