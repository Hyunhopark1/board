package com.phh.plannerproject.board;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/boardFree")
public class BoardFreeController {

    private final IBoardFreeService boardFreeService;

    @PostMapping()
    public ResponseEntity<IBoardFree> insert(Model model, @RequestBody BoardFreeDto dto){
        try {
            if (dto == null) {
                return ResponseEntity.badRequest().build();
            }
            //이부분에서 로그인유저 객체 받아와서 BoardFreeDto의 createId(작성자id) 값 설정해야함

            IBoardFree result = this.boardFreeService.insert(dto);
            if (result == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(result);
        } catch (Exception ex) {
            log.error(ex.toString());
            return ResponseEntity.badRequest().build();
        }
    }

    @PatchMapping
    public ResponseEntity<IBoardFree> update(Model model, @RequestBody BoardFreeDto dto) {
        try {
            if (dto == null) {
                return ResponseEntity.badRequest().build();
            }
            IBoardFree result = this.boardFreeService.update(dto);
            if (result == null) {
                return ResponseEntity.notFound().build();
            }
            return ResponseEntity.ok(result);

        } catch (Exception ex) {
            log.error(ex.toString());
            return ResponseEntity.badRequest().build();
        }
    }



}
