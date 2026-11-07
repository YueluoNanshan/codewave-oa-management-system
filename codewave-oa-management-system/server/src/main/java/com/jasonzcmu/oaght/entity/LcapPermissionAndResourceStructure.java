package com.jasonzcmu.oaght.entity; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.netease.codewave.common.annotation.Label; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@JsonAutoDetect(fieldVisibility = Visibility.ANY,getterVisibility = Visibility.NONE)
public class LcapPermissionAndResourceStructure {

    /**
     * text
     */
    @Label("资源描述（资源名称）")
    public String text;

    /**
     * value
     */
    @Label("资源ID")
    public Long value;

    /**
     * getText.
     *
     * @return String
     */
    public String getText() {
        return text;
    } 

    /**
     * setText.
     *
     * @param text String
     */
    public void setText(String text) {
        this.text = text; 
    } 

    /**
     * getValue.
     *
     * @return Long
     */
    public Long getValue() {
        return value;
    } 

    /**
     * setValue.
     *
     * @param value Long
     */
    public void setValue(Long value) {
        this.value = value; 
    } 

}