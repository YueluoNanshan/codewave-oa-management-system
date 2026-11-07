package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY,getterVisibility = Visibility.NONE)
public class ScheduleStructureStructure {

    /**
     * id
     */
    public String id;

    /**
     * start
     */
    public String start;

    /**
     * end
     */
    public String end;

    /**
     * allDay
     */
    public Boolean allDay;

    /**
     * title
     */
    public String title;

    /**
     * getId.
     *
     * @return String
     */
    public String getId() {
        return id;
    } 

    /**
     * setId.
     *
     * @param id String
     */
    public void setId(String id) {
        this.id = id; 
    } 

    /**
     * getStart.
     *
     * @return String
     */
    public String getStart() {
        return start;
    } 

    /**
     * setStart.
     *
     * @param start String
     */
    public void setStart(String start) {
        this.start = start; 
    } 

    /**
     * getEnd.
     *
     * @return String
     */
    public String getEnd() {
        return end;
    } 

    /**
     * setEnd.
     *
     * @param end String
     */
    public void setEnd(String end) {
        this.end = end; 
    } 

    /**
     * getAllDay.
     *
     * @return Boolean
     */
    public Boolean getAllDay() {
        return allDay;
    } 

    /**
     * setAllDay.
     *
     * @param allDay Boolean
     */
    public void setAllDay(Boolean allDay) {
        this.allDay = allDay; 
    } 

    /**
     * getTitle.
     *
     * @return String
     */
    public String getTitle() {
        return title;
    } 

    /**
     * setTitle.
     *
     * @param title String
     */
    public void setTitle(String title) {
        this.title = title; 
    } 

}