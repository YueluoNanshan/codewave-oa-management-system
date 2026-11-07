package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.netease.codewave.common.annotation.Label; 
import com.netease.codewave.core.config.DateTimeFormatConfiguration; 
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
public class AttendanceSettingEntity {

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
     * startTime
     */
    @Label("上班时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime startTime;

    /**
     * endTime
     */
    @Label("下班时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_TIME_FORMAT)
    public LocalTime endTime;

    /**
     * location
     */
    @Label("打卡地点")
    public String location;

    /**
     * radius
     */
    @Label("打卡半径")
    public Long radius;

    /**
     * locationName
     */
    @Label("打卡地名")
    public String locationName;

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
     * getLocation.
     *
     * @return String
     */
    public String getLocation() {
        return location;
    } 

    /**
     * setLocation.
     *
     * @param location String
     */
    public void setLocation(String location) {
        this.location = location; 
    } 

    /**
     * getRadius.
     *
     * @return Long
     */
    public Long getRadius() {
        return radius;
    } 

    /**
     * setRadius.
     *
     * @param radius Long
     */
    public void setRadius(Long radius) {
        this.radius = radius; 
    } 

    /**
     * getLocationName.
     *
     * @return String
     */
    public String getLocationName() {
        return locationName;
    } 

    /**
     * setLocationName.
     *
     * @param locationName String
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName; 
    } 

}