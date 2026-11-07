package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.jasonzcmu.oaght.enumeration.CompanyPtypeEnum; 
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
public class CompanyPolicyEntity {

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
    @Label("发布人")
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
     * descition
     */
    @Label("副标题")
    public String descition;

    /**
     * pv
     */
    @Label("浏览量")
    public Long pv;

    /**
     * concert
     */
    @Label("内容")
    public String concert;

    /**
     * accessory
     */
    @Label("附件")
    public String accessory;

    /**
     * type
     */
    @Label("政策类型")
    public CompanyPtypeEnum type;

    /**
     * picture
     */
    @Label("封面")
    public String picture;

    /**
     * ifTop
     */
    @Label("是否置顶")
    public Boolean ifTop = true;

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
     * getDescition.
     *
     * @return String
     */
    public String getDescition() {
        return descition;
    } 

    /**
     * setDescition.
     *
     * @param descition String
     */
    public void setDescition(String descition) {
        this.descition = descition; 
    } 

    /**
     * getPv.
     *
     * @return Long
     */
    public Long getPv() {
        return pv;
    } 

    /**
     * setPv.
     *
     * @param pv Long
     */
    public void setPv(Long pv) {
        this.pv = pv; 
    } 

    /**
     * getConcert.
     *
     * @return String
     */
    public String getConcert() {
        return concert;
    } 

    /**
     * setConcert.
     *
     * @param concert String
     */
    public void setConcert(String concert) {
        this.concert = concert; 
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
     * getType.
     *
     * @return CompanyPtypeEnum
     */
    public CompanyPtypeEnum getType() {
        return type;
    } 

    /**
     * setType.
     *
     * @param type CompanyPtypeEnum
     */
    public void setType(CompanyPtypeEnum type) {
        this.type = type; 
    } 

    /**
     * getPicture.
     *
     * @return String
     */
    public String getPicture() {
        return picture;
    } 

    /**
     * setPicture.
     *
     * @param picture String
     */
    public void setPicture(String picture) {
        this.picture = picture; 
    } 

    /**
     * getIfTop.
     *
     * @return Boolean
     */
    public Boolean getIfTop() {
        return ifTop;
    } 

    /**
     * setIfTop.
     *
     * @param ifTop Boolean
     */
    public void setIfTop(Boolean ifTop) {
        this.ifTop = ifTop; 
    } 

}