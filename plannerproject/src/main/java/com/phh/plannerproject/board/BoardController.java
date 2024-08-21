package com.phh.plannerproject.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {

    @Autowired
    private IBoardService boardService;
}
