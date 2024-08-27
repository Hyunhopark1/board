//package com.phh.plannerproject.boardbase;
//
//public interface IBoardBase {
//    String getCreateDt();
//    void setCreateDt(String createDt);
//
//    String getCreateId();
//    void setCreateId(String createId);
//
//    String getUpdateDt();
//    void setUpdateDt(String updateDt);
//
//    Boolean getDeleteYn();
//    void setDeleteYn(Boolean deleteYn);
//
//    default void copyFields(IBoardBase from) {
//        if (from == null) {
//            return;
//        }
//        if (from.getCreateDt() != null && !from.getCreateDt().isEmpty()) {
//            this.setCreateDt(from.getCreateDt());
//        }
//        if (from.getCreateId() != null && !from.getCreateId().isEmpty()) {
//            this.setCreateId(from.getCreateId());
//        }
//        if (from.getUpdateDt() != null && !from.getUpdateDt().isEmpty()) {
//            this.setUpdateDt(from.getUpdateDt());
//        }
//
//        if (from.getDeleteYn() != null) {
//            this.setDeleteYn(from.getDeleteYn());
//        }
//    }
//}
