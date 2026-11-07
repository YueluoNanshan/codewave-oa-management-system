package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.ScheduleStructureStructure; 
import com.jasonzcmu.oaght.entity.SessionVariables; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureFe8a024f; 
import com.jasonzcmu.oaght.enumeration.ScheduleTypeEnum; 
import com.jasonzcmu.oaght.repository.LoadScheduleLogicMapper; 
import com.netease.codewave.common.util.LambdaParamWrapper; 
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
public class LoadScheduleLogicService {

    /**
     * loadScheduleLogicMapper
     */
    @Autowired
    private LoadScheduleLogicMapper loadScheduleLogicMapper;

    /**
     * loadSchedule.
     *
     * @param list List<ScheduleTypeEnum>
     * @return List<ScheduleStructureStructure>
     */
    public List<ScheduleStructureStructure> loadSchedule(List<ScheduleTypeEnum> list) {
        List<AnonymousStructureFe8a024f> returnOf = new ArrayList<>();
        List<ScheduleStructureStructure> result = new ArrayList<>();
        returnOf = loadScheduleLogicMapper.getAnonymousStructureFe8a024f(SessionVariables.getInstance().currentUser, list); 
        if (Buildins.function().hasValue(returnOf)) {
            for (Long index = 0L; index < returnOf.size(); index++) {
                LambdaParamWrapper<AnonymousStructureFe8a024f> item = new LambdaParamWrapper<>(returnOf.get(index.intValue()));
{
                    Boolean itIntrinsicus0 = item.param.schedule.ifAllDay;
                    if (Buildins.function().equals(itIntrinsicus0, true)) {
                        Buildins.function().add(result, Buildins.function().clone(Buildins.function().newWithInitiation(new ScheduleStructureStructure(), beanIntrinsicus1 -> {
                            beanIntrinsicus1.id = Buildins.function().toString(item.param.schedule.id); 
                            beanIntrinsicus1.start = new StringBuilder().append(Buildins.function().toString(item.param.schedule.startDate)).toString(); 
                            beanIntrinsicus1.end = new StringBuilder().append(Buildins.function().toString(item.param.schedule.endDate)).toString(); 
                            beanIntrinsicus1.title = item.param.schedule.title; 
                            beanIntrinsicus1.allDay = item.param.schedule.ifAllDay; 
                        } )));
                    } else if (Buildins.function().equals(itIntrinsicus0, false)) {
                        Buildins.function().add(result, Buildins.function().clone(Buildins.function().newWithInitiation(new ScheduleStructureStructure(), beanIntrinsicus1 -> {
                            beanIntrinsicus1.id = Buildins.function().toString(item.param.schedule.id); 
                            beanIntrinsicus1.start = new StringBuilder().append(Buildins.function().toString(item.param.schedule.startDate)).append(Buildins.function().toString("T")).append(Buildins.function().toString(item.param.schedule.start)).toString(); 
                            beanIntrinsicus1.end = new StringBuilder().append(Buildins.function().toString(item.param.schedule.endDate)).append(Buildins.function().toString("T")).append(Buildins.function().toString(item.param.schedule.end)).toString(); 
                            beanIntrinsicus1.title = item.param.schedule.title; 
                            beanIntrinsicus1.allDay = item.param.schedule.ifAllDay; 
                        } )));
                    } 

                } 
            } 

        } 

        return result;
    } 

}