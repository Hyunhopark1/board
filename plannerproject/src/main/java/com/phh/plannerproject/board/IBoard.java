package com.phh.plannerproject.board;

import com.phh.plannerproject.boardbase.IBoardBase;

public interface IBoard extends IBoardBase {
    Long getId();
    void setId(Long id);

    String getTitle();
    void setTitle(String title);

    String getContent();
    void setContent(String content);

    Integer getViewQty();
    void setViewQty(Integer viewQty);

    Integer getLikeQty();
    void setLikeQty(Integer likeQty);

    default void copyFields(IBoard from) {
        if (from == null) {
            return;
        }
        if (from.getId() != null) {
            this.setId(from.getId());
        }
        if (from.getTitle() != null && !from.getTitle().isEmpty()) {
            this.setTitle(from.getTitle());
        }
        if (from.getContent() != null && !from.getContent().isEmpty()) {
            this.setContent(from.getContent());
        }
        if (from.getViewQty() != null) {
            this.setViewQty(from.getViewQty());
        }
        if (from.getLikeQty() != null) {
            this.setLikeQty(from.getLikeQty());
        }
        IBoardBase.super.copyFields(from);
    }
}
