package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.jasonzcmu.oaght.enumeration.AssertStutasEnum; 
import com.netease.codewave.common.annotation.Label; 
import com.netease.codewave.core.config.DateTimeFormatConfiguration; 
import java.math.BigDecimal; 
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
public class AssetEntity {

    /**
     * id
     */
    @Label("主键")
    @NotNull
    public Long id;

    /**
     * createdTime
     */
    @Label("入库时间")
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
     * name
     */
    @Label("产品名称")
    public String name;

    /**
     * brand
     */
    @Label("品牌")
    public String brand;

    /**
     * descrition
     */
    @Label("详细参数")
    public String descrition;

    /**
     * specification
     */
    @Label("规格/型号")
    public String specification;

    /**
     * inventory
     */
    @Label("库存")
    public Long inventory;

    /**
     * residuallnventory
     */
    @Label("剩余库存")
    public Long residuallnventory;

    /**
     * picture
     */
    @Label("图片")
    public String picture;

    /**
     * price
     */
    @Label("采购价")
    public BigDecimal price;

    /**
     * status
     */
    @Label("资产状态")
    public AssertStutasEnum status;

    /**
     * supplierid
     */
    @Label("供应商id")
    public Long supplierid;

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
     * getBrand.
     *
     * @return String
     */
    public String getBrand() {
        return brand;
    } 

    /**
     * setBrand.
     *
     * @param brand String
     */
    public void setBrand(String brand) {
        this.brand = brand; 
    } 

    /**
     * getDescrition.
     *
     * @return String
     */
    public String getDescrition() {
        return descrition;
    } 

    /**
     * setDescrition.
     *
     * @param descrition String
     */
    public void setDescrition(String descrition) {
        this.descrition = descrition; 
    } 

    /**
     * getSpecification.
     *
     * @return String
     */
    public String getSpecification() {
        return specification;
    } 

    /**
     * setSpecification.
     *
     * @param specification String
     */
    public void setSpecification(String specification) {
        this.specification = specification; 
    } 

    /**
     * getInventory.
     *
     * @return Long
     */
    public Long getInventory() {
        return inventory;
    } 

    /**
     * setInventory.
     *
     * @param inventory Long
     */
    public void setInventory(Long inventory) {
        this.inventory = inventory; 
    } 

    /**
     * getResiduallnventory.
     *
     * @return Long
     */
    public Long getResiduallnventory() {
        return residuallnventory;
    } 

    /**
     * setResiduallnventory.
     *
     * @param residuallnventory Long
     */
    public void setResiduallnventory(Long residuallnventory) {
        this.residuallnventory = residuallnventory; 
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
     * getPrice.
     *
     * @return BigDecimal
     */
    public BigDecimal getPrice() {
        return price;
    } 

    /**
     * setPrice.
     *
     * @param price BigDecimal
     */
    public void setPrice(BigDecimal price) {
        this.price = price; 
    } 

    /**
     * getStatus.
     *
     * @return AssertStutasEnum
     */
    public AssertStutasEnum getStatus() {
        return status;
    } 

    /**
     * setStatus.
     *
     * @param status AssertStutasEnum
     */
    public void setStatus(AssertStutasEnum status) {
        this.status = status; 
    } 

    /**
     * getSupplierid.
     *
     * @return Long
     */
    public Long getSupplierid() {
        return supplierid;
    } 

    /**
     * setSupplierid.
     *
     * @param supplierid Long
     */
    public void setSupplierid(Long supplierid) {
        this.supplierid = supplierid; 
    } 

}