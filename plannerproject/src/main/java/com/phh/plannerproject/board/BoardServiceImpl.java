package com.phh.plannerproject.board;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements IBoardService{

    @Autowired
    IBoardMyBatisMapper boardMyBatisMapper;

    
}
