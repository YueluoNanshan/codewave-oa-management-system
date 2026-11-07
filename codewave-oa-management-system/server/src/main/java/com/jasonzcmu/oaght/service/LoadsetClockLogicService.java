package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.AttendanceSettingEntity; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure6199015e; 
import com.jasonzcmu.oaght.repository.LoadsetClockLogicMapper; 
import com.netease.codewave.nasl.java.tools.Buildins; 
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
public class LoadsetClockLogicService {

    /**
     * loadsetClockLogicMapper
     */
    @Autowired
    private LoadsetClockLogicMapper loadsetClockLogicMapper;

    /**
     * loadsetClock.
     *
     * @return AttendanceSettingEntity
     */
    public AttendanceSettingEntity loadsetClock() {
        List<AnonymousStructure6199015e> variable1 = new ArrayList<>();
        AttendanceSettingEntity result = new AttendanceSettingEntity();
        variable1 = loadsetClockLogicMapper.getAnonymousStructure6199015e(); 
        if (Buildins.function().hasValue(variable1)) {
            result = Buildins.function().listHead(variable1).attendanceSetting; 
        } 

        return result;
    } 

}