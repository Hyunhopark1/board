package com.phh.plannerproject.board;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BoardFreeDto implements IBoardFree {

   private Long id;
   private String title;
   private String content;
   private Integer viewQty;
   private Integer likeQty;
   private String createId;
   private String createDt;
   private String updateDt;
   private Boolean deleteYn;


}
