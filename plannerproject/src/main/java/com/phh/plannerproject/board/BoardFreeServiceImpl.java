package com.phh.plannerproject.board;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardFreeServiceImpl implements IBoardFreeService {

    private final IBoardFreeMyBatisMapper boardMyBatisMapper;


    @Override
    public IBoardFree insert(BoardFreeDto dto) {
        if (dto == null) {
            return null;
        }
        BoardFreeDto insert = BoardFreeDto.builder().build();
        insert.copyFields(dto);
        this.boardMyBatisMapper.insert(insert);
        return insert;
    }

    @Override
    public IBoardFree update(BoardFreeDto dto) {
        if (dto == null) {
            return null;
        }
        BoardFreeDto update = BoardFreeDto.builder().build();
        update.copyFields(dto);
        this.boardMyBatisMapper.update(update);
        return update;
    }

    @Override
    public IBoardFree findById(Long id) {
        if (id == null || id < 0) {
            return null;
        }
        IBoardFree find = this.boardMyBatisMapper.findById(id);
        return find;
    }

    @Override
    public Boolean delete(Long id) {
        if (id == null || id < 0) {
            return false;
        }
        this.boardMyBatisMapper.delete(id);
        return true;
    }

    @Override
    public List<BoardFreeDto> findAllByNameContains() {
        return List.of();
    }
}
