package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.context.UserContext; 
import com.jasonzcmu.oaght.context.UserContext.UserInfo ; 
import com.jasonzcmu.oaght.entity.LcapRolePerMappingEntity; 
import com.jasonzcmu.oaght.repository.LcapRolePerMappingEntityMapper; 
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
public class LcapRolePerMappingEntityService extends AbstractService {

    /**
     * mapper
     */
    @Autowired
    private LcapRolePerMappingEntityMapper mapper;

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
    public LcapRolePerMappingEntityService() {
        entityFieldNameTitleMap.put("id", "主键");
        entityFieldTitleNameMap.put("主键", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("createdTime", "创建时间");
        entityFieldTitleNameMap.put("创建时间", "createdTime");
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
        entityFieldNameTitleMap.put("roleId", "角色唯一ID");
        entityFieldTitleNameMap.put("角色唯一ID", "roleId");
        entityFiledColumnNameMap.put("roleId", "role_id");
        entityFieldNameTitleMap.put("permissionId", "权限唯一ID");
        entityFieldTitleNameMap.put("权限唯一ID", "permissionId");
        entityFiledColumnNameMap.put("permissionId", "permission_id");
    } 

    /**
     * list.
     *
     * @param queryFilter AbstractQueryFilter
     * @return List<LcapRolePerMappingEntity>
     */
    public List<LcapRolePerMappingEntity> list(AbstractQueryFilter queryFilter) {
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

            List<LcapRolePerMappingEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, LcapRolePerMappingEntity.class, exportFieldMap);
            Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath); 
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath()); 
            if (contentType == null) {
                contentType = "application/octet-stream"; 
            } 

            return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + LcapRolePerMappingEntity.class.getSimpleName() + ".xlsx\"").body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * get.
     *
     * @param id Long
     * @return LcapRolePerMappingEntity
     */
    public LcapRolePerMappingEntity get(Long id) {
        if (id == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
        } 

        return mapper.selectOne(id);
    } 

    /**
     * create.
     *
     * @param entity LcapRolePerMappingEntity
     * @return LcapRolePerMappingEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public LcapRolePerMappingEntity create(LcapRolePerMappingEntity entity) {
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
        entity.setRoleId(getOrDefault(entity.getRoleId(), 0L));
        entity.setPermissionId(getOrDefault(entity.getPermissionId(), 0L));
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
     * @param entities List<LcapRolePerMappingEntity>
     * @return List<LcapRolePerMappingEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<LcapRolePerMappingEntity> batchCreate(List<LcapRolePerMappingEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<LcapRolePerMappingEntity> batchList = new ArrayList<>(100);
        for (LcapRolePerMappingEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setRoleId(getOrDefault(entity.getRoleId(), 0L));
            entity.setPermissionId(getOrDefault(entity.getPermissionId(), 0L));
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
     * @param entity LcapRolePerMappingEntity
     * @param updateFields List<String>
     * @return LcapRolePerMappingEntity
     */
    @Transactional
    public LcapRolePerMappingEntity update(LcapRolePerMappingEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "LcapRolePerMappingEntity"); 
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
            entityValidate(entity, updateFields);
            mapper.update(entity, updateFields);
            return get(entity.getId());
        } 

    } 

    /**
     * batchUpdate.
     *
     * @param entities List<LcapRolePerMappingEntity>
     * @param updateFields List<String>
     * @return List<LcapRolePerMappingEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<LcapRolePerMappingEntity> batchUpdate(List<LcapRolePerMappingEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        if (updateFields != null && updateFields.size() == 1 && updateFields.contains("id")) {
            return entities;
        } 

        List<LcapRolePerMappingEntity> result = new ArrayList<>(entities.size());
        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<LcapRolePerMappingEntity> batchList = new ArrayList<>(100);
        List<Long> batchIdList = new ArrayList<>(100);
        for (LcapRolePerMappingEntity entity : entities) {
            if (entity.getId() == null) {
                throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
            } 

            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entityValidate(entity, updateFields);
            batchList.add(entity);
            batchIdList.add(entity.getId());
            if (batchList.size() >= 100) {
                mapper.batchUpdate(batchList, updateFields);
                AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LcapRolePerMapping", "lcap_role_per_mapping_50b822", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
                result.addAll(mapper.selectList(inQueryFilter));
                batchList.clear();
                batchIdList.clear();
            } 

        } 
        if (!batchList.isEmpty()) {
            mapper.batchUpdate(batchList, updateFields);
            AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LcapRolePerMapping", "lcap_role_per_mapping_50b822", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
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

        LcapRolePerMappingEntity entity = mapper.selectOne(id);
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

        AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LcapRolePerMapping", "lcap_role_per_mapping_50b822", "id", "id")).right(new ListLiteralQueryFilter(ids));
        preHandleQueryExpression(inQueryFilter);
        List<LcapRolePerMappingEntity> entities = mapper.selectList(inQueryFilter);
        for (LcapRolePerMappingEntity entity : entities) {
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
            List<LcapRolePerMappingEntity> data = ExcelUtil.read(file.getInputStream(), type, LcapRolePerMappingEntity.class, entityFieldTitleNameMap);
            batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * createOrUpdate.
     *
     * @param entity LcapRolePerMappingEntity
     * @param updateFields List<String>
     * @return LcapRolePerMappingEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public LcapRolePerMappingEntity createOrUpdate(LcapRolePerMappingEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LcapRolePerMappingEntity.class); 
        } 

        if (entity.getId() == null) {
            entity = create(entity); 
        } else {
            LcapRolePerMappingEntity existEntity = mapper.selectOne(entity.getId());
            if (null == existEntity) {
                entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
                entity.setRoleId(getOrDefault(entity.getRoleId(), 0L));
                entity.setPermissionId(getOrDefault(entity.getPermissionId(), 0L));
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
     * @param entity LcapRolePerMappingEntity
     * @param updateFields List<String>
     * @param filter AbstractQueryFilter
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(LcapRolePerMappingEntity entity, List<String> updateFields, AbstractQueryFilter filter) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LcapRolePerMappingEntity.class); 
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
     * @param entity LcapRolePerMappingEntity
     * @param updateFields List<String>
     */
    protected void entityValidate(LcapRolePerMappingEntity entity, List<String> updateFields) {
        if ((null == updateFields || updateFields.contains("roleId")) && null == entity.getRoleId()) {
            throw ErrorManager.ofDatabaseConstraintViolationError("属性roleId不能为空"); 
        } 

        if ((null == updateFields || updateFields.contains("permissionId")) && null == entity.getPermissionId()) {
            throw ErrorManager.ofDatabaseConstraintViolationError("属性permissionId不能为空"); 
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