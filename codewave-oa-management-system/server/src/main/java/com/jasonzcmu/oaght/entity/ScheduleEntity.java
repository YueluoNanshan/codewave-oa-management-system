package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.jasonzcmu.oaght.enumeration.ScheduleTypeEnum; 
import com.netease.codewave.common.annotation.Label; 
import com.netease.codewave.core.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import java.time.LocalTime; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = Visibility.ANY,getterVisibility = Visibility.NONE)
public class ScheduleEntity {

    /**
     * id
     */
    @Label("主键")
    @NotNull
    public Long id;

    /**
     * createdTime
     */
    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime createdTime;

    /**
     * updatedTime
     */
    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime updatedTime;

    /**
     * createdBy
     */
    @Label("创建者")
    public String createdBy;

    /**
     * updatedBy
     */
    @Label("更新者")
    public String updatedBy;

    /**
     * title
     */
    @Label("标题")
    public String title;

    /**
     * startDate
     */
    @Label("开始日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate startDate;

    /**
     * endDate
     */
    @Label("结束日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate endDate;

    /**
     * start
     */
    @Label("开始时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime start;

    /**
     * end
     */
    @Label("结束时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime end;

    /**
     * type
     */
    @Label("日程类型")
    public ScheduleTypeEnum type;

    /**
     * defined
     */
    @Label("自定义类型")
    public String defined;

    /**
     * remark
     */
    @Label("备注")
    public String remark;

    /**
     * place
     */
    @Label("日程地点")
    public String place;

    /**
     * ifAllDay
     */
    @Label("是否全天")
    public Boolean ifAllDay = false;

    /**
     * getId.
     *
     * @return Long
     */
    public Long getId() {
        return id;
    } 

    /**
     * setId.
     *
     * @param id Long
     */
    public void setId(Long id) {
        this.id = id; 
    } 

    /**
     * getCreatedTime.
     *
     * @return ZonedDateTime
     */
    public ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    /**
     * setCreatedTime.
     *
     * @param createdTime ZonedDateTime
     */
    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    /**
     * getUpdatedTime.
     *
     * @return ZonedDateTime
     */
    public ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    /**
     * setUpdatedTime.
     *
     * @param updatedTime ZonedDateTime
     */
    public void setUpdatedTime(ZonedDateTime updatedTime) {
        this.updatedTime = updatedTime; 
    } 

    /**
     * getCreatedBy.
     *
     * @return String
     */
    public String getCreatedBy() {
        return createdBy;
    } 

    /**
     * setCreatedBy.
     *
     * @param createdBy String
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    /**
     * getUpdatedBy.
     *
     * @return String
     */
    public String getUpdatedBy() {
        return updatedBy;
    } 

    /**
     * setUpdatedBy.
     *
     * @param updatedBy String
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy; 
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

    /**
     * getStartDate.
     *
     * @return LocalDate
     */
    public LocalDate getStartDate() {
        return startDate;
    } 

    /**
     * setStartDate.
     *
     * @param startDate LocalDate
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate; 
    } 

    /**
     * getEndDate.
     *
     * @return LocalDate
     */
    public LocalDate getEndDate() {
        return endDate;
    } 

    /**
     * setEndDate.
     *
     * @param endDate LocalDate
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate; 
    } 

    /**
     * getStart.
     *
     * @return LocalTime
     */
    public LocalTime getStart() {
        return start;
    } 

    /**
     * setStart.
     *
     * @param start LocalTime
     */
    public void setStart(LocalTime start) {
        this.start = start; 
    } 

    /**
     * getEnd.
     *
     * @return LocalTime
     */
    public LocalTime getEnd() {
        return end;
    } 

    /**
     * setEnd.
     *
     * @param end LocalTime
     */
    public void setEnd(LocalTime end) {
        this.end = end; 
    } 

    /**
     * getType.
     *
     * @return ScheduleTypeEnum
     */
    public ScheduleTypeEnum getType() {
        return type;
    } 

    /**
     * setType.
     *
     * @param type ScheduleTypeEnum
     */
    public void setType(ScheduleTypeEnum type) {
        this.type = type; 
    } 

    /**
     * getDefined.
     *
     * @return String
     */
    public String getDefined() {
        return defined;
    } 

    /**
     * setDefined.
     *
     * @param defined String
     */
    public void setDefined(String defined) {
        this.defined = defined; 
    } 

    /**
     * getRemark.
     *
     * @return String
     */
    public String getRemark() {
        return remark;
    } 

    /**
     * setRemark.
     *
     * @param remark String
     */
    public void setRemark(String remark) {
        this.remark = remark; 
    } 

    /**
     * getPlace.
     *
     * @return String
     */
    public String getPlace() {
        return place;
    } 

    /**
     * setPlace.
     *
     * @param place String
     */
    public void setPlace(String place) {
        this.place = place; 
    } 

    /**
     * getIfAllDay.
     *
     * @return Boolean
     */
    public Boolean getIfAllDay() {
        return ifAllDay;
    } 

    /**
     * setIfAllDay.
     *
     * @param ifAllDay Boolean
     */
    public void setIfAllDay(Boolean ifAllDay) {
        this.ifAllDay = ifAllDay; 
    } 

}