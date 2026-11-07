package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.SessionVariables; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureD1f18142; 
import com.jasonzcmu.oaght.repository.LoadMyAssetTableView5LogicMapper; 
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
public class LoadMyAssetTableView5LogicService {

    /**
     * loadMyAssetTableView5LogicMapper
     */
    @Autowired
    private LoadMyAssetTableView5LogicMapper loadMyAssetTableView5LogicMapper;

    /**
     * loadMyAssetTableView5.
     *
     * @param page Long
     * @param size Long
     * @param sort String
     * @param order String
     * @return AnonymousStructureD1f18142
     */
    public AnonymousStructureD1f18142 loadMyAssetTableView5(Long page, Long size, String sort, String order) {
        AnonymousStructureD1f18142 result = new AnonymousStructureD1f18142();
        result = Buildins.function().createListPage(loadMyAssetTableView5LogicMapper.getAnonymousStructure8df66773(size, SessionVariables.getInstance().currentUser, page, getTableField("AnonymousStructure8df66773", sort), order), loadMyAssetTableView5LogicMapper.countAnonymousStructure8df66773(size, SessionVariables.getInstance().currentUser, page, getTableField("AnonymousStructure8df66773", sort), order).intValue(), AnonymousStructureD1f18142.class); 
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
    public LoadMyAssetTableView5LogicService() {
        orderByParamToColumnMap.put("AnonymousStructure8df66773", new HashMap<>());
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.id", "`asset`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.createdTime", "`asset`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.updatedTime", "`asset`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.createdBy", "`asset`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.updatedBy", "`asset`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.name", "`asset`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.brand", "`asset`.`brand`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.descrition", "`asset`.`descrition`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.specification", "`asset`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.inventory", "`asset`.`inventory`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.residuallnventory", "`asset`.`residuallnventory`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.picture", "`asset`.`picture`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.price", "`asset`.`price`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.status", "`asset`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("asset.supplierid", "`asset`.`supplierid`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.id", "`lcap_user_50b822`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.createdTime", "`lcap_user_50b822`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.updatedTime", "`lcap_user_50b822`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.userId", "`lcap_user_50b822`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.userName", "`lcap_user_50b822`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.password", "`lcap_user_50b822`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.phone", "`lcap_user_50b822`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.email", "`lcap_user_50b822`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.displayName", "`lcap_user_50b822`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.status", "`lcap_user_50b822`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.source", "`lcap_user_50b822`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.directLeaderId", "`lcap_user_50b822`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.picture", "`lcap_user_50b822`.`picture`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("lcapUser.badge", "`lcap_user_50b822`.`badge`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.id", "`user_asset_mapping`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.createdTime", "`user_asset_mapping`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.updatedTime", "`user_asset_mapping`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.createdBy", "`user_asset_mapping`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.updatedBy", "`user_asset_mapping`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.userName", "`user_asset_mapping`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.assetid", "`user_asset_mapping`.`assetid`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.num", "`user_asset_mapping`.`num`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userAssetMapping.returnTime", "`user_asset_mapping`.`return_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("id", "`user_asset_mapping`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("createdTime", "`user_asset_mapping`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("updatedTime", "`user_asset_mapping`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("createdBy", "`user_asset_mapping`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("updatedBy", "`user_asset_mapping`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("name", "`asset`.`name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("brand", "`asset`.`brand`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("descrition", "`asset`.`descrition`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("specification", "`asset`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("inventory", "`asset`.`inventory`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("residuallnventory", "`asset`.`residuallnventory`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("picture", "`lcap_user_50b822`.`picture`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("price", "`asset`.`price`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("status", "`lcap_user_50b822`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("supplierid", "`asset`.`supplierid`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userId", "`lcap_user_50b822`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("userName", "`user_asset_mapping`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("password", "`lcap_user_50b822`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("phone", "`lcap_user_50b822`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("email", "`lcap_user_50b822`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("displayName", "`lcap_user_50b822`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("source", "`lcap_user_50b822`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("directLeaderId", "`lcap_user_50b822`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("badge", "`lcap_user_50b822`.`badge`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("assetid", "`user_asset_mapping`.`assetid`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("num", "`user_asset_mapping`.`num`");
        orderByParamToColumnMap.get("AnonymousStructure8df66773").put("returnTime", "`user_asset_mapping`.`return_time`");
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