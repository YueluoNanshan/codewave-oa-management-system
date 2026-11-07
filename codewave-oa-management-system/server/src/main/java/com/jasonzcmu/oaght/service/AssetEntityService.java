package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.context.UserContext; 
import com.jasonzcmu.oaght.context.UserContext.UserInfo ; 
import com.jasonzcmu.oaght.entity.AssetEntity; 
import com.jasonzcmu.oaght.repository.AssetEntityMapper; 
import com.netease.codewave.common.util.SnowflakeIdWorker; 
import com.netease.codewave.core.error.ErrorCodeEnum; 
import com.netease.codewave.core.error.ErrorManager; 
import com.netease.codewave.core.error.HttpCodeException; 
import com.netease.codewave.domain.datasource.filters.AbstractQueryFilter; 
import com.netease.codewave.domain.datasource.filters.atomic.ColumnQueryFilter; 
import com.netease.codewave.domain.datasource.filters.atomic.ListLiteralQueryFilter; 
import com.netease.codewave.domain.datasource.filters.logic.binary.matching.InQueryFilter; 
import com.netease.codewave.domain.datasource.filters.logic.unary.UnaryExpressionFilter; 
import com.netease.codewave.domain.datasource.filters.logic.variadic.VariadicExpressionFilter; 
import com.netease.codewave.domain.datasource.service.entities.AbstractService; 
import com.netease.codewave.domain.datasource.service.entities.inner.RelationInnerService; 
import com.netease.codewave.domain.datasource.utils.ExcelUtil; 
import java.math.BigDecimal; 
import java.time.ZoneId; 
import java.time.ZonedDateTime; 
import java.util.ArrayList; 
import java.util.LinkedHashMap; 
import java.util.List; 
import java.util.Map; 
import javax.servlet.http.HttpServletRequest; 
import org.apache.commons.lang3.StringUtils; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.core.io.FileUrlResource; 
import org.springframework.core.io.Resource; 
import org.springframework.dao.DuplicateKeyException; 
import org.springframework.http.HttpHeaders; 
import org.springframework.http.MediaType; 
import org.springframework.http.ResponseEntity; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional; 
import org.springframework.web.multipart.MultipartFile; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class AssetEntityService extends AbstractService {

    /**
     * mapper
     */
    @Autowired
    private AssetEntityMapper mapper;

    /**
     * relationInnerService
     */
    @Autowired
    private RelationInnerService relationInnerService;

    /**
     * entityFieldNameTitleMap
     */
    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<>();

    /**
     * entityFieldTitleNameMap
     */
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<>();

    /**
     * entityFiledColumnNameMap
     */
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    /**
     * Constructor.
     *
     */
    public AssetEntityService() {
        entityFieldNameTitleMap.put("id", "主键");
        entityFieldTitleNameMap.put("主键", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("createdTime", "入库时间");
        entityFieldTitleNameMap.put("入库时间", "createdTime");
        entityFiledColumnNameMap.put("createdTime", "created_time");
        entityFieldNameTitleMap.put("updatedTime", "更新时间");
        entityFieldTitleNameMap.put("更新时间", "updatedTime");
        entityFiledColumnNameMap.put("updatedTime", "updated_time");
        entityFieldNameTitleMap.put("createdBy", "创建者");
        entityFieldTitleNameMap.put("创建者", "createdBy");
        entityFiledColumnNameMap.put("createdBy", "created_by");
        entityFieldNameTitleMap.put("updatedBy", "更新者");
        entityFieldTitleNameMap.put("更新者", "updatedBy");
        entityFiledColumnNameMap.put("updatedBy", "updated_by");
        entityFieldNameTitleMap.put("name", "产品名称");
        entityFieldTitleNameMap.put("产品名称", "name");
        entityFiledColumnNameMap.put("name", "name");
        entityFieldNameTitleMap.put("brand", "品牌");
        entityFieldTitleNameMap.put("品牌", "brand");
        entityFiledColumnNameMap.put("brand", "brand");
        entityFieldNameTitleMap.put("descrition", "详细参数");
        entityFieldTitleNameMap.put("详细参数", "descrition");
        entityFiledColumnNameMap.put("descrition", "descrition");
        entityFieldNameTitleMap.put("specification", "规格/型号");
        entityFieldTitleNameMap.put("规格/型号", "specification");
        entityFiledColumnNameMap.put("specification", "specification");
        entityFieldNameTitleMap.put("inventory", "库存");
        entityFieldTitleNameMap.put("库存", "inventory");
        entityFiledColumnNameMap.put("inventory", "inventory");
        entityFieldNameTitleMap.put("residuallnventory", "剩余库存");
        entityFieldTitleNameMap.put("剩余库存", "residuallnventory");
        entityFiledColumnNameMap.put("residuallnventory", "residuallnventory");
        entityFieldNameTitleMap.put("picture", "图片");
        entityFieldTitleNameMap.put("图片", "picture");
        entityFiledColumnNameMap.put("picture", "picture");
        entityFieldNameTitleMap.put("price", "采购价");
        entityFieldTitleNameMap.put("采购价", "price");
        entityFiledColumnNameMap.put("price", "price");
        entityFieldNameTitleMap.put("status", "资产状态");
        entityFieldTitleNameMap.put("资产状态", "status");
        entityFiledColumnNameMap.put("status", "status");
        entityFieldNameTitleMap.put("supplierid", "供应商id");
        entityFieldTitleNameMap.put("供应商id", "supplierid");
        entityFiledColumnNameMap.put("supplierid", "supplierid");
    } 

    /**
     * list.
     *
     * @param queryFilter AbstractQueryFilter
     * @return List<AssetEntity>
     */
    public List<AssetEntity> list(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter(); 
        } 

        preHandleQueryExpression(queryFilter);
        return mapper.selectList(queryFilter);
    } 

    /**
     * count.
     *
     * @param queryFilter AbstractQueryFilter
     * @return long
     */
    public long count(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter(); 
        } 

        preHandleQueryExpression(queryFilter);
        return mapper.count(queryFilter);
    } 

    /**
     * export.
     *
     * @param queryFilter AbstractQueryFilter
     * @param fields String
     * @param request HttpServletRequest
     * @return ResponseEntity<Resource>
     */
    public ResponseEntity<Resource> export(AbstractQueryFilter queryFilter, String fields, HttpServletRequest request) {
        try {
            Map<String, String> exportFieldMap = entityFieldNameTitleMap;
            if (fields != null && !"".equals(fields.trim())) {
                for (String filedName : fields.split(",")) {
                    exportFieldMap = new LinkedHashMap<>(); 
                    exportFieldMap.put(filedName, entityFieldNameTitleMap.get(filedName));
                } 
            } 

            List<AssetEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, AssetEntity.class, exportFieldMap);
            Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath); 
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath()); 
            if (contentType == null) {
                contentType = "application/octet-stream"; 
            } 

            return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + AssetEntity.class.getSimpleName() + ".xlsx\"").body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * get.
     *
     * @param id Long
     * @return AssetEntity
     */
    public AssetEntity get(Long id) {
        if (id == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
        } 

        return mapper.selectOne(id);
    } 

    /**
     * create.
     *
     * @param entity AssetEntity
     * @return AssetEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public AssetEntity create(AssetEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required"); 
        } 

        entity.setId(SnowflakeIdWorker.getInstance().nextId());
        entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
        entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
        entity.setInventory(getOrDefault(entity.getInventory(), 0L));
        entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
        entityValidate(entity, null);
        try {
            mapper.insert(entity);
        } catch (DuplicateKeyException e) {
            throw ErrorManager.ofDatabaseDuplicateKeyError(e); 
        } 
        return entity;
    } 

    /**
     * batchCreate.
     *
     * @param entities List<AssetEntity>
     * @return List<AssetEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<AssetEntity> batchCreate(List<AssetEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<AssetEntity> batchList = new ArrayList<>(100);
        for (AssetEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setInventory(getOrDefault(entity.getInventory(), 0L));
            entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, null);
            if (batchList.size() >= 100) {
                mapper.batchInsert(batchList);
                batchList.clear();
            } 

            batchList.add(entity);
        } 
        if (batchList.size() >= 0) {
            mapper.batchInsert(batchList);
        } 

        return entities;
    } 

    /**
     * update.
     *
     * @param entity AssetEntity
     * @param updateFields List<String>
     * @return AssetEntity
     */
    @Transactional
    public AssetEntity update(AssetEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "AssetEntity"); 
        } 

        if (entity.getId() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
        } 

        if (null != updateFields && updateFields.size() == 1 && updateFields.contains("id")) {
            return entity;
        } else {
            UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, updateFields);
            mapper.update(entity, updateFields);
            return get(entity.getId());
        } 

    } 

    /**
     * batchUpdate.
     *
     * @param entities List<AssetEntity>
     * @param updateFields List<String>
     * @return List<AssetEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<AssetEntity> batchUpdate(List<AssetEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        if (updateFields != null && updateFields.size() == 1 && updateFields.contains("id")) {
            return entities;
        } 

        List<AssetEntity> result = new ArrayList<>(entities.size());
        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<AssetEntity> batchList = new ArrayList<>(100);
        List<Long> batchIdList = new ArrayList<>(100);
        for (AssetEntity entity : entities) {
            if (entity.getId() == null) {
                throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
            } 

            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, updateFields);
            batchList.add(entity);
            batchIdList.add(entity.getId());
            if (batchList.size() >= 100) {
                mapper.batchUpdate(batchList, updateFields);
                AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("Asset", "asset", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
                result.addAll(mapper.selectList(inQueryFilter));
                batchList.clear();
                batchIdList.clear();
            } 

        } 
        if (!batchList.isEmpty()) {
            mapper.batchUpdate(batchList, updateFields);
            AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("Asset", "asset", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
            result.addAll(mapper.selectList(inQueryFilter));
            batchList.clear();
            batchIdList.clear();
        } 

        return result;
    } 

    /**
     * delete.
     *
     * @param id Long
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long delete(Long id) {
        if (id == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
        } 

        AssetEntity entity = mapper.selectOne(id);
        if (null == entity) {
            return 0;
        } 

        relationInnerService.onDelete(entity, "defaultDS");
        return mapper.delete(id);
    } 

    /**
     * batchDelete.
     *
     * @param ids List<Long>
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long batchDelete(List<Long> ids) {
        if (null == ids || ids.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("Asset", "asset", "id", "id")).right(new ListLiteralQueryFilter(ids));
        preHandleQueryExpression(inQueryFilter);
        List<AssetEntity> entities = mapper.selectList(inQueryFilter);
        for (AssetEntity entity : entities) {
            relationInnerService.onDelete(entity, "defaultDS");
        } 
        return mapper.batchDelete(ids);
    } 

    /**
     * importFile.
     *
     * @param file MultipartFile
     * @return String
     */
    @Transactional(rollbackFor = Exception.class)
    public String importFile(MultipartFile file) {
        String type;
        String[] items = file.getOriginalFilename().split("\\.");
        if (items.length > 1) {
            type = items[items.length - 1]; 
            if (!"xls".equalsIgnoreCase(type) && !"xlsx".equalsIgnoreCase(type)) {
                return "不支持的文件类型";
            } 

        } else {
            return "不支持的文件类型";
        } 

        try {
            List<AssetEntity> data = ExcelUtil.read(file.getInputStream(), type, AssetEntity.class, entityFieldTitleNameMap);
            batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * createOrUpdate.
     *
     * @param entity AssetEntity
     * @param updateFields List<String>
     * @return AssetEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public AssetEntity createOrUpdate(AssetEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AssetEntity.class); 
        } 

        if (entity.getId() == null) {
            entity = create(entity); 
        } else {
            AssetEntity existEntity = mapper.selectOne(entity.getId());
            if (null == existEntity) {
                entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
                entity.setInventory(getOrDefault(entity.getInventory(), 0L));
                entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
                entityValidate(entity, null);
                mapper.createOrUpdate(entity);
            } else {
                entity = update(entity, updateFields); 
            } 

        } 

        return entity;
    } 

    /**
     * updateBy.
     *
     * @param entity AssetEntity
     * @param updateFields List<String>
     * @param filter AbstractQueryFilter
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(AssetEntity entity, List<String> updateFields, AbstractQueryFilter filter) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AssetEntity.class); 
        } 

        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class); 
        } 

        if (null != updateFields && updateFields.size() == 1 && updateFields.contains("id")) {
            return 0;
        } else {
            UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            preHandleQueryExpression(filter);
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setPrice(null != entity.getPrice() ? entity.getPrice().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, updateFields);
            return mapper.updateBy(entity, updateFields, filter);
        } 

    } 

    /**
     * deleteBy.
     *
     * @param filter AbstractQueryFilter
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long deleteBy(AbstractQueryFilter filter) {
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class); 
        } 

        preHandleQueryExpression(filter);
        return mapper.deleteBy(filter);
    } 

    /**
     * entityValidate.
     *
     * @param entity AssetEntity
     * @param updateFields List<String>
     */
    protected void entityValidate(AssetEntity entity, List<String> updateFields) {
        if ((null == updateFields || updateFields.contains("inventory")) && null != entity.getInventory() && entity.getInventory() < 0L) {
            throw ErrorManager.ofDatabaseConstraintViolationError("属性inventory不能小于0，当前值'" + entity.getInventory() + "'"); 
        } 

        if ((null == updateFields || updateFields.contains("residuallnventory")) && null != entity.getResiduallnventory() && entity.getResiduallnventory() < 0L) {
            throw ErrorManager.ofDatabaseConstraintViolationError("属性residuallnventory不能小于0，当前值'" + entity.getResiduallnventory() + "'"); 
        } 

        if ((null == updateFields || updateFields.contains("picture")) && null != entity.getPicture() && entity.getPicture().length() > 16777215L) {
            throw ErrorManager.ofDatabaseConstraintViolationError("属性picture长度不能超过16777215，当前值'" + entity.getPicture() + "'"); 
        } 

    } 

    /**
     * preHandleQueryExpression.
     *
     * @param filter AbstractQueryFilter
     */
    private void preHandleQueryExpression(AbstractQueryFilter filter) {
        if (filter == null) {
            return ;
        } 

        if (filter instanceof ColumnQueryFilter) {
            String propertyName = ((ColumnQueryFilter) filter).getProperty().getName();
            String columnName = entityFiledColumnNameMap.get(propertyName);
            columnName = null == columnName ? propertyName : columnName; 
            ((ColumnQueryFilter) filter).setColumnName(columnName);
            return ;
        } 

        if (filter instanceof VariadicExpressionFilter) {
            List<AbstractQueryFilter> expressions = ((VariadicExpressionFilter) filter).getExpressions();
            for (AbstractQueryFilter expressionFilter : expressions) {
                preHandleQueryExpression(expressionFilter);
            } 
            return ;
        } 

        preHandleQueryExpression(filter.getLeft());
        preHandleQueryExpression(filter.getRight());
    } 

}