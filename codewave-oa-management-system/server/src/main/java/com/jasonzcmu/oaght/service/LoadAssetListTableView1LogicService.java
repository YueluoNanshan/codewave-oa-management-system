package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.AssetEntity; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureD10ff9e3; 
import com.jasonzcmu.oaght.repository.LoadAssetListTableView1LogicMapper; 
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
public class LoadAssetListTableView1LogicService {

    /**
     * loadAssetListTableView1LogicMapper
     */
    @Autowired
    private LoadAssetListTableView1LogicMapper loadAssetListTableView1LogicMapper;

    /**
     * loadAssetListTableView1.
     *
     * @param page Long
     * @param size Long
     * @param sort String
     * @param order String
     * @param filter AssetEntity
     * @return AnonymousStructureD10ff9e3
     */
    public AnonymousStructureD10ff9e3 loadAssetListTableView1(Long page, Long size, String sort, String order, AssetEntity filter) {
        AnonymousStructureD10ff9e3 result = new AnonymousStructureD10ff9e3();
        result = Buildins.function().createListPage(loadAssetListTableView1LogicMapper.getAnonymousStructure6b425155(filter, size, page, getTableField("AnonymousStructure6b425155", sort), order), loadAssetListTableView1LogicMapper.countAnonymousStructure6b425155(filter, size, page, getTableField("AnonymousStructure6b425155", sort), order).intValue(), AnonymousStructureD10ff9e3.class); 
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
    public LoadAssetListTableView1LogicService() {
        orderByParamToColumnMap.put("AnonymousStructure6b425155", new HashMap<>());
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.id", "`asset`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.createdTime", "`asset`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.updatedTime", "`asset`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.createdBy", "`asset`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.updatedBy", "`asset`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.name", "`asset`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.brand", "`asset`.`brand`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.descrition", "`asset`.`descrition`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.specification", "`asset`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.inventory", "`asset`.`inventory`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.residuallnventory", "`asset`.`residuallnventory`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.picture", "`asset`.`picture`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.price", "`asset`.`price`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.status", "`asset`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("asset.supplierid", "`asset`.`supplierid`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.name", "`supplier`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.phone", "`supplier`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.level", "`supplier`.`level`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplier.status", "`supplier`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("name", "`supplier`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("brand", "`asset`.`brand`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("descrition", "`asset`.`descrition`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("specification", "`asset`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("inventory", "`asset`.`inventory`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("residuallnventory", "`asset`.`residuallnventory`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("picture", "`asset`.`picture`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("price", "`asset`.`price`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("status", "`supplier`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("supplierid", "`asset`.`supplierid`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("phone", "`supplier`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure6b425155").put("level", "`supplier`.`level`");
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