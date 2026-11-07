package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.AttendanceRecordEntity; 
import com.jasonzcmu.oaght.entity.DayStructureStructure; 
import com.jasonzcmu.oaght.entity.LeaveProcessEntity; 
import com.jasonzcmu.oaght.entity.MyClockStructureStructure; 
import com.jasonzcmu.oaght.entity.SessionVariables; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure5b58080e; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureE170ef43; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureF492ae78; 
import com.jasonzcmu.oaght.enumeration.AttendanceRstatusEnum; 
import com.jasonzcmu.oaght.repository.LoadClockRecordLogicMapper; 
import com.netease.codewave.common.util.LambdaParamWrapper; 
import com.netease.codewave.nasl.java.tools.Buildins; 
import java.time.LocalDate; 
import java.util.ArrayList; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class LoadClockRecordLogicService {

    /**
     * loadClockRecordLogicMapper
     */
    @Autowired
    private LoadClockRecordLogicMapper loadClockRecordLogicMapper;

    /**
     * loadClockRecord.
     *
     * @param chooseDate LocalDate
     * @return List<MyClockStructureStructure>
     */
    public List<MyClockStructureStructure> loadClockRecord(LocalDate chooseDate) {
        List<LocalDate> dateList = new ArrayList<>();
        List<AnonymousStructureF492ae78> userClockList = new ArrayList<>();
        List<AnonymousStructure5b58080e> leaveList = new ArrayList<>();
        MyClockStructureStructure myClockStructure = new MyClockStructureStructure();
        List<AnonymousStructureF492ae78> filter_list = new ArrayList<>();
        AttendanceRecordEntity clock = new AttendanceRecordEntity();
        List<MyClockStructureStructure> result = new ArrayList<>();
        if (Buildins.function().hasValue(chooseDate)) {
            dateList = Buildins.function().getSpecificDaysOfWeek(Buildins.function().alterDateTime(chooseDate, "Decrease", 30L, "day"), chooseDate, Buildins.function().newWithInitiation(new ArrayList<Long>(), listIntrinsicus1 -> {
                listIntrinsicus1.add(1L);
                listIntrinsicus1.add(2L);
                listIntrinsicus1.add(3L);
                listIntrinsicus1.add(4L);
                listIntrinsicus1.add(5L);
                listIntrinsicus1.add(6L);
                listIntrinsicus1.add(7L);
            } )); 
        } else {
            dateList = Buildins.function().getSpecificDaysOfWeek(Buildins.function().alterDateTime(Buildins.function().currDate(), "Decrease", 30L, "day"), Buildins.function().currDate("global"), Buildins.function().newWithInitiation(new ArrayList<Long>(), listIntrinsicus1 -> {
                listIntrinsicus1.add(1L);
                listIntrinsicus1.add(2L);
                listIntrinsicus1.add(3L);
                listIntrinsicus1.add(4L);
                listIntrinsicus1.add(5L);
                listIntrinsicus1.add(6L);
                listIntrinsicus1.add(7L);
            } )); 
        } 

        userClockList = loadClockRecordLogicMapper.getAnonymousStructureF492ae78(SessionVariables.getInstance().currentUser, dateList); 
        leaveList = loadClockRecordLogicMapper.getAnonymousStructure5b58080e(); 
        Buildins.function().listReverse(dateList);
        if (Buildins.function().hasValue(userClockList)) {
            for (Long index = 0L; index < dateList.size(); index++) {
                LambdaParamWrapper<LocalDate> item = new LambdaParamWrapper<>(dateList.get(index.intValue()));
                Buildins.function().clear(myClockStructure, "deep");
                myClockStructure.leave = Buildins.function().New(LeaveProcessEntity.class); 
                myClockStructure.clock = Buildins.function().New(DayStructureStructure.class); 

                myClockStructure.date = Buildins.function().clone(item.param); 
                filter_list = Buildins.function().listFilter(userClockList, (item1) -> Buildins.function().equals(item1.attendanceRecord.clockDate, item.param)); 
                if (Buildins.function().hasValue(filter_list)) {
                    Buildins.function().listSort(filter_list, (item1) -> Buildins.function().newWithInitiation(new AnonymousStructureE170ef43(), beanIntrinsicus1 -> {
                        beanIntrinsicus1.asc = true; 
                        beanIntrinsicus1.by = item1.attendanceRecord.createdTime; 
                    } ));
                    clock = Buildins.function().listHead(filter_list).attendanceRecord; 
                    if (Buildins.function().equals(clock.clockType, AttendanceRstatusEnum.FIELD_0) || Buildins.function().equals(clock.clockType, AttendanceRstatusEnum.FIELD_2)) {
                        myClockStructure.clock.clockIn = Buildins.function().clone(clock); 
                    } 

                    clock = Buildins.function().listLast(filter_list).attendanceRecord; 
                    if (Buildins.function().equals(clock.clockType, AttendanceRstatusEnum.FIELD_3) || Buildins.function().equals(clock.clockType, AttendanceRstatusEnum.FIELD_1)) {
                        myClockStructure.clock.clockOut = Buildins.function().clone(clock); 
                    } 

                } 

                if (Buildins.function().hasValue(leaveList)) {
                    for (Long index1 = 0L; index1 < leaveList.size(); index1++) {
                        AnonymousStructure5b58080e item1 = leaveList.get(index1.intValue());
                        if (item.param.compareTo(item1.leaveProcess.endDate) <= 0 && item1.leaveProcess.startDate.compareTo(item.param) <= 0) {
                            myClockStructure.leave = Buildins.function().clone(item1.leaveProcess); 
                        } 

                    } 

                } 

                Buildins.function().add(result, Buildins.function().clone(myClockStructure));
            } 

        } 

        return result;
    } 

}