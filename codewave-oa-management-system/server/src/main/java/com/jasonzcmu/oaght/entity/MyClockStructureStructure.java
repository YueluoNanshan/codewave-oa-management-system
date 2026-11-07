package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.time.LocalDate; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY,getterVisibility = Visibility.NONE)
public class MyClockStructureStructure {

    /**
     * clock
     */
    public DayStructureStructure clock;

    /**
     * leave
     */
    public LeaveProcessEntity leave;

    /**
     * date
     */
    public LocalDate date;

    /**
     * getClock.
     *
     * @return DayStructureStructure
     */
    public DayStructureStructure getClock() {
        return clock;
    } 

    /**
     * setClock.
     *
     * @param clock DayStructureStructure
     */
    public void setClock(DayStructureStructure clock) {
        this.clock = clock; 
    } 

    /**
     * getLeave.
     *
     * @return LeaveProcessEntity
     */
    public LeaveProcessEntity getLeave() {
        return leave;
    } 

    /**
     * setLeave.
     *
     * @param leave LeaveProcessEntity
     */
    public void setLeave(LeaveProcessEntity leave) {
        this.leave = leave; 
    } 

    /**
     * getDate.
     *
     * @return LocalDate
     */
    public LocalDate getDate() {
        return date;
    } 

    /**
     * setDate.
     *
     * @param date LocalDate
     */
    public void setDate(LocalDate date) {
        this.date = date; 
    } 

}