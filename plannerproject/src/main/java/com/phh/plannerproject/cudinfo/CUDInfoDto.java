//package com.phh.plannerproject.cudinfo;
//
//import com.phh.plannerproject.boardbase.IBoardBase;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
//
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Date;
//
//@NoArgsConstructor
//public class CUDInfoDto {
//
//    public String getSystemDt(){
//        Date now = new Date();
//        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy.MM.dd");
//        SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm");
//
//        // 오늘 날짜와 비교하기 위해 현재 날짜를 얻습니다.
//        Calendar currentCalendar = Calendar.getInstance();
//        currentCalendar.setTime(now);
//
//        // 현재의 년, 월, 일 값을 얻습니다.
//        int currentYear = currentCalendar.get(Calendar.YEAR);
//        int currentMonth = currentCalendar.get(Calendar.MONTH);
//        int currentDay = currentCalendar.get(Calendar.DAY_OF_MONTH);
//
//        // 현재의 시간 값도 얻습니다.
//        Calendar todayCalendar = Calendar.getInstance();
//        todayCalendar.set(currentYear, currentMonth, currentDay, 0, 0, 0); // 오늘의 00:00:00으로 설정
//
//        // 오늘인지 확인합니다.
//        if (now.after(todayCalendar.getTime())) {
//            // 오늘이라면 시간 형식으로 반환합니다.
//            return sdfTime.format(now);
//        } else {
//            // 오늘이 아니라면 날짜 형식으로 반환합니다.
//            return sdfDate.format(now);
//        }
//    }
//
//    private void setCreateInfo(IBoardBase base) {
//        if (base == null) {
//            return;
//        }
//        base.setCreateDt(this.getSystemDt());
//        base.setCreateId("임시작성자");
//    }
//    private void setUpdateInfo(IBoardBase base) {
//        if (base == null) {
//            return;
//        }
//        base.setUpdateDt(this.getSystemDt());
//        base.setUpdateId("임시수정자");
//    }
//    private void setDeleteInfo(IBoardBase base) {
//        if (base == null) {
//            return;
//        }
//        base.setDeleteDt(this.getSystemDt());
//        base.setDeleteId("임시삭제자");
//    }
//}
