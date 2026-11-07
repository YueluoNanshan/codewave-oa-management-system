package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.DayStructureStructure; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureF492ae78; 
import com.jasonzcmu.oaght.repository.LoadDayClockLogicMapper; 
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
public class LoadDayClockLogicService {

    /**
     * loadDayClockLogicMapper
     */
    @Autowired
    private LoadDayClockLogicMapper loadDayClockLogicMapper;

    /**
     * loadDayClock.
     *
     * @param day LocalDate
     * @return DayStructureStructure
     */
    public DayStructureStructure loadDayClock(LocalDate day) {
        List<AnonymousStructureF492ae78> returnof = new ArrayList<>();
        DayStructureStructure result = new DayStructureStructure();
        returnof = loadDayClockLogicMapper.getAnonymousStructureF492ae78(day); 
        if (Buildins.function().hasValue(returnof)) {
            result.clockIn = Buildins.function().listHead(returnof).attendanceRecord; 
        } 

        returnof = loadDayClockLogicMapper.getAnonymousStructureF492ae781(day); 
        if (Buildins.function().hasValue(returnof)) {
            result.clockOut = Buildins.function().listLast(returnof).attendanceRecord; 
        } 

        return result;
    } 

}