package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.SupplierEntity; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureC31374c2; 
import com.jasonzcmu.oaght.repository.LoadSupplierListTableView2LogicMapper; 
import com.netease.codewave.core.error.HttpCodeException; 
import com.netease.codewave.nasl.java.tools.Buildins; 
import java.lang.reflect.Field; 
import java.util.HashMap; 
import java.util.List; 
import java.util.Map; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class LoadSupplierListTableView2LogicService {

    /**
     * loadSupplierListTableView2LogicMapper
     */
    @Autowired
    private LoadSupplierListTableView2LogicMapper loadSupplierListTableView2LogicMapper;

    /**
     * loadSupplierListTableView2.
     *
     * @param page Long
     * @param size Long
     * @param sort String
     * @param order String
     * @param filter SupplierEntity
     * @return AnonymousStructureC31374c2
     */
    public AnonymousStructureC31374c2 loadSupplierListTableView2(Long page, Long size, String sort, String order, SupplierEntity filter) {
        AnonymousStructureC31374c2 result = new AnonymousStructureC31374c2();
        result = Buildins.function().createListPage(loadSupplierListTableView2LogicMapper.getAnonymousStructureE25019c0(filter, size, page, getTableField("AnonymousStructureE25019c0", sort), order), loadSupplierListTableView2LogicMapper.countAnonymousStructureE25019c0(filter, size, page, getTableField("AnonymousStructureE25019c0", sort), order).intValue(), AnonymousStructureC31374c2.class); 
        return result;
    } 

    /**
     * orderByParamToColumnMap
     */
    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap<>();

    /**
     * Constructor.
     *
     */
    public LoadSupplierListTableView2LogicService() {
        orderByParamToColumnMap.put("AnonymousStructureE25019c0", new HashMap<>());
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.name", "`supplier`.`name`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.phone", "`supplier`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.level", "`supplier`.`level`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("supplier.status", "`supplier`.`status`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("name", "`supplier`.`name`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("phone", "`supplier`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("level", "`supplier`.`level`");
        orderByParamToColumnMap.get("AnonymousStructureE25019c0").put("status", "`supplier`.`status`");
    } 

    /**
     * getTableField.
     *
     * @param structureName String
     * @param propertyName String
     * @return String
     */
    private String getTableField(String structureName, String propertyName) {
        if (null == structureName || null == propertyName || null == orderByParamToColumnMap.get(structureName) || "".equals(propertyName)) {
            return null;
        } 

        if (null == orderByParamToColumnMap.get(structureName).get(propertyName)) {
            throw new HttpCodeException(404, "排序参数{" + propertyName + "}不存在"); 
        } 

        return orderByParamToColumnMap.get(structureName).get(propertyName);
    } 

    /**
     * getObjectTableField.
     *
     * @param structureName String
     * @param obj T
     * @param fieldNames List<String>
     * @return T
     */
    public <T> T getObjectTableField(String structureName, T obj, List<String> fieldNames) {
        try {
            T cloneObj = Buildins.function().clone(obj); 
            for (String fieldRef : fieldNames) {
                String[] fieldNameSplit = fieldRef.split("\\."); 
                Field field = obj.getClass().getDeclaredField(fieldNameSplit[0]); 
                Object fieldObject = cloneObj; 
                for (int fieldIndex = 1; fieldIndex < fieldNameSplit.length; fieldIndex++) {
                    fieldObject = field.get(fieldObject); 
                    field = field.getType().getDeclaredField(fieldNameSplit[fieldIndex]); 
                } 
                field.set(fieldObject, getTableField(structureName, String.valueOf(field.get(fieldObject))));
            } 
            return cloneObj;
        } catch (Exception e) {
            throw new HttpCodeException("500", e); 
        } 
    } 

}