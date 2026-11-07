package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.netease.codewave.common.annotation.Label; 
import com.netease.codewave.core.config.DateTimeFormatConfiguration; 
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
public class LcapRoleEntity {

    /**
     * id
     */
    @Label("主键")
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
     * uuid
     */
    @Label("唯一标识")
    public String uuid;

    /**
     * name
     */
    @Label("角色名称")
    @NotNull
    public String name;

    /**
     * description
     */
    @Label("角色描述")
    public String description;

    /**
     * roleStatus
     */
    @Label("角色状态")
    public Boolean roleStatus = true;

    /**
     * editable
     */
    @Label("是否可编辑")
    public Boolean editable = true;

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
     * getUuid.
     *
     * @return String
     */
    public String getUuid() {
        return uuid;
    } 

    /**
     * setUuid.
     *
     * @param uuid String
     */
    public void setUuid(String uuid) {
        this.uuid = uuid; 
    } 

    /**
     * getName.
     *
     * @return String
     */
    public String getName() {
        return name;
    } 

    /**
     * setName.
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name; 
    } 

    /**
     * getDescription.
     *
     * @return String
     */
    public String getDescription() {
        return description;
    } 

    /**
     * setDescription.
     *
     * @param description String
     */
    public void setDescription(String description) {
        this.description = description; 
    } 

    /**
     * getRoleStatus.
     *
     * @return Boolean
     */
    public Boolean getRoleStatus() {
        return roleStatus;
    } 

    /**
     * setRoleStatus.
     *
     * @param roleStatus Boolean
     */
    public void setRoleStatus(Boolean roleStatus) {
        this.roleStatus = roleStatus; 
    } 

    /**
     * getEditable.
     *
     * @return Boolean
     */
    public Boolean getEditable() {
        return editable;
    } 

    /**
     * setEditable.
     *
     * @param editable Boolean
     */
    public void setEditable(Boolean editable) {
        this.editable = editable; 
    } 

}