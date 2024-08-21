package com.phh.plannerproject.board;

import com.phh.plannerproject.boardbase.BoardBaseDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BoardDto extends BoardBaseDto implements IBoard {

   private Long id;
   private String title;
   private String content;
   private Integer viewQty;
   private Integer likeQty;


}
