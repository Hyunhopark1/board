package com.phh.plannerproject.boardbase;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder

public class BoardBaseDto implements IBoardBase{

    //작성일,작성자
    String createDt;
    String createId;
    //수정일,수정자
    String updateDt;
    String updateId;
    //삭제일,삭제자
    String deleteDt;
    String deleteId;
    //삭제 여부
    Boolean deleteFlag;

}
