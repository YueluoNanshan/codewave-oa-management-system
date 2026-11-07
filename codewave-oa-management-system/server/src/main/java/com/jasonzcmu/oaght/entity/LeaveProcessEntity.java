package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.jasonzcmu.oaght.enumeration.LeavePstatusEnum; 
import com.jasonzcmu.oaght.enumeration.LeavePtypeEnum; 
import com.netease.codewave.common.annotation.Label; 
import com.netease.codewave.core.config.DateTimeFormatConfiguration; 
import java.math.BigDecimal; 
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
public class LeaveProcessEntity {

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
     * type
     */
    @Label("请假类型")
    public LeavePtypeEnum type;

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
     * startTime
     */
    @Label("开始时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime startTime;

    /**
     * endTime
     */
    @Label("结束时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime endTime;

    /**
     * reason
     */
    @Label("请假原因")
    public String reason;

    /**
     * accessory
     */
    @Label("附件")
    public String accessory;

    /**
     * status
     */
    @Label("流程状态")
    public LeavePstatusEnum status;

    /**
     * leaveTime
     */
    @Label("请假时长")
    public BigDecimal leaveTime;

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
     * getType.
     *
     * @return LeavePtypeEnum
     */
    public LeavePtypeEnum getType() {
        return type;
    } 

    /**
     * setType.
     *
     * @param type LeavePtypeEnum
     */
    public void setType(LeavePtypeEnum type) {
        this.type = type; 
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
     * getStartTime.
     *
     * @return LocalTime
     */
    public LocalTime getStartTime() {
        return startTime;
    } 

    /**
     * setStartTime.
     *
     * @param startTime LocalTime
     */
    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime; 
    } 

    /**
     * getEndTime.
     *
     * @return LocalTime
     */
    public LocalTime getEndTime() {
        return endTime;
    } 

    /**
     * setEndTime.
     *
     * @param endTime LocalTime
     */
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime; 
    } 

    /**
     * getReason.
     *
     * @return String
     */
    public String getReason() {
        return reason;
    } 

    /**
     * setReason.
     *
     * @param reason String
     */
    public void setReason(String reason) {
        this.reason = reason; 
    } 

    /**
     * getAccessory.
     *
     * @return String
     */
    public String getAccessory() {
        return accessory;
    } 

    /**
     * setAccessory.
     *
     * @param accessory String
     */
    public void setAccessory(String accessory) {
        this.accessory = accessory; 
    } 

    /**
     * getStatus.
     *
     * @return LeavePstatusEnum
     */
    public LeavePstatusEnum getStatus() {
        return status;
    } 

    /**
     * setStatus.
     *
     * @param status LeavePstatusEnum
     */
    public void setStatus(LeavePstatusEnum status) {
        this.status = status; 
    } 

    /**
     * getLeaveTime.
     *
     * @return BigDecimal
     */
    public BigDecimal getLeaveTime() {
        return leaveTime;
    } 

    /**
     * setLeaveTime.
     *
     * @param leaveTime BigDecimal
     */
    public void setLeaveTime(BigDecimal leaveTime) {
        this.leaveTime = leaveTime; 
    } 

}