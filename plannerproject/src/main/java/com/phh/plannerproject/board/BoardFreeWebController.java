package com.phh.plannerproject.board;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardFreeWebController {


    @GetMapping("board_list")
    public String boardList(){
        return "board/board_list";
    }
}
