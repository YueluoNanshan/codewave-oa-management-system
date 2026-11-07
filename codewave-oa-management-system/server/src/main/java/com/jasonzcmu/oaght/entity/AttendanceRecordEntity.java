package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.jasonzcmu.oaght.enumeration.AttendanceRstatusEnum; 
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
public class AttendanceRecordEntity {

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
     * clockTime
     */
    @Label("时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime clockTime;

    /**
     * clockDate
     */
    @Label("日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate clockDate;

    /**
     * clockType
     */
    @Label("打卡状态")
    public AttendanceRstatusEnum clockType;

    /**
     * remark
     */
    @Label("外勤备注")
    public String remark;

    /**
     * ifOutWork
     */
    @Label("是否外勤")
    public Boolean ifOutWork;

    /**
     * attendanceId
     */
    @Label("考勤设置")
    public AttendanceSettingEntity attendanceId;

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
     * getClockTime.
     *
     * @return LocalTime
     */
    public LocalTime getClockTime() {
        return clockTime;
    } 

    /**
     * setClockTime.
     *
     * @param clockTime LocalTime
     */
    public void setClockTime(LocalTime clockTime) {
        this.clockTime = clockTime; 
    } 

    /**
     * getClockDate.
     *
     * @return LocalDate
     */
    public LocalDate getClockDate() {
        return clockDate;
    } 

    /**
     * setClockDate.
     *
     * @param clockDate LocalDate
     */
    public void setClockDate(LocalDate clockDate) {
        this.clockDate = clockDate; 
    } 

    /**
     * getClockType.
     *
     * @return AttendanceRstatusEnum
     */
    public AttendanceRstatusEnum getClockType() {
        return clockType;
    } 

    /**
     * setClockType.
     *
     * @param clockType AttendanceRstatusEnum
     */
    public void setClockType(AttendanceRstatusEnum clockType) {
        this.clockType = clockType; 
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
     * getIfOutWork.
     *
     * @return Boolean
     */
    public Boolean getIfOutWork() {
        return ifOutWork;
    } 

    /**
     * setIfOutWork.
     *
     * @param ifOutWork Boolean
     */
    public void setIfOutWork(Boolean ifOutWork) {
        this.ifOutWork = ifOutWork; 
    } 

    /**
     * getAttendanceId.
     *
     * @return AttendanceSettingEntity
     */
    public AttendanceSettingEntity getAttendanceId() {
        return attendanceId;
    } 

    /**
     * setAttendanceId.
     *
     * @param attendanceId AttendanceSettingEntity
     */
    public void setAttendanceId(AttendanceSettingEntity attendanceId) {
        this.attendanceId = attendanceId; 
    } 

}