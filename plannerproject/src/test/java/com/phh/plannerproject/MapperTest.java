package com.phh.plannerproject;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.phh.plannerproject.board.BoardFreeDto;
import com.phh.plannerproject.board.IBoardFreeMyBatisMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    IBoardFreeMyBatisMapper mapper;



    @Test
    void insert(){
        BoardFreeDto dto = BoardFreeDto.builder()
                .title("1번제목")
                .content("1번 내용")
                .createId("박현호")
                .createDt("1111")
                .build();

        this.mapper.insert(dto);
        List<BoardFreeDto> list = mapper.findAll();
        System.out.println("게시글 수는 "+list.size()+"개");
    }

    @Test
    void findById(){
        BoardFreeDto find = this.mapper.findById(1L);

        try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(find);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void update(){
        BoardFreeDto dto = BoardFreeDto.builder()
                .id(1L)
                .title("2번 제목")
                .content("2번 내용")
                .build();
        this.mapper.update(dto);

        BoardFreeDto find = this.mapper.findById(1L);
        try {
            String postJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(find);
            System.out.println(postJson);

        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void delete(){
        List<BoardFreeDto> list = this.mapper.findAll();
        System.out.println("삭제 전 게시글 수 :"+list.size());
        this.mapper.delete(1L);
        List<BoardFreeDto> list2 = this.mapper.findAll();
        System.out.println("삭제 후 게시글 수 :"+list2.size());
    }
}
