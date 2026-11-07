package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.context.UserContext; 
import com.jasonzcmu.oaght.context.UserContext.UserInfo ; 
import com.jasonzcmu.oaght.entity.LeaveProcessEntity; 
import com.jasonzcmu.oaght.repository.LeaveProcessEntityMapper; 
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
public class LeaveProcessEntityService extends AbstractService {

    /**
     * mapper
     */
    @Autowired
    private LeaveProcessEntityMapper mapper;

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
    public LeaveProcessEntityService() {
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
        entityFieldNameTitleMap.put("type", "请假类型");
        entityFieldTitleNameMap.put("请假类型", "type");
        entityFiledColumnNameMap.put("type", "type");
        entityFieldNameTitleMap.put("title", "标题");
        entityFieldTitleNameMap.put("标题", "title");
        entityFiledColumnNameMap.put("title", "title");
        entityFieldNameTitleMap.put("startDate", "开始日期");
        entityFieldTitleNameMap.put("开始日期", "startDate");
        entityFiledColumnNameMap.put("startDate", "start_date");
        entityFieldNameTitleMap.put("endDate", "结束日期");
        entityFieldTitleNameMap.put("结束日期", "endDate");
        entityFiledColumnNameMap.put("endDate", "end_date");
        entityFieldNameTitleMap.put("startTime", "开始时间");
        entityFieldTitleNameMap.put("开始时间", "startTime");
        entityFiledColumnNameMap.put("startTime", "start_time");
        entityFieldNameTitleMap.put("endTime", "结束时间");
        entityFieldTitleNameMap.put("结束时间", "endTime");
        entityFiledColumnNameMap.put("endTime", "end_time");
        entityFieldNameTitleMap.put("reason", "请假原因");
        entityFieldTitleNameMap.put("请假原因", "reason");
        entityFiledColumnNameMap.put("reason", "reason");
        entityFieldNameTitleMap.put("accessory", "附件");
        entityFieldTitleNameMap.put("附件", "accessory");
        entityFiledColumnNameMap.put("accessory", "accessory");
        entityFieldNameTitleMap.put("status", "流程状态");
        entityFieldTitleNameMap.put("流程状态", "status");
        entityFiledColumnNameMap.put("status", "status");
        entityFieldNameTitleMap.put("leaveTime", "请假时长");
        entityFieldTitleNameMap.put("请假时长", "leaveTime");
        entityFiledColumnNameMap.put("leaveTime", "leave_time");
    } 

    /**
     * list.
     *
     * @param queryFilter AbstractQueryFilter
     * @return List<LeaveProcessEntity>
     */
    public List<LeaveProcessEntity> list(AbstractQueryFilter queryFilter) {
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

            List<LeaveProcessEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, LeaveProcessEntity.class, exportFieldMap);
            Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath); 
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath()); 
            if (contentType == null) {
                contentType = "application/octet-stream"; 
            } 

            return ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + LeaveProcessEntity.class.getSimpleName() + ".xlsx\"").body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * get.
     *
     * @param id Long
     * @return LeaveProcessEntity
     */
    public LeaveProcessEntity get(Long id) {
        if (id == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
        } 

        return mapper.selectOne(id);
    } 

    /**
     * create.
     *
     * @param entity LeaveProcessEntity
     * @return LeaveProcessEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public LeaveProcessEntity create(LeaveProcessEntity entity) {
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
        entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
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
     * @param entities List<LeaveProcessEntity>
     * @return List<LeaveProcessEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<LeaveProcessEntity> batchCreate(List<LeaveProcessEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<LeaveProcessEntity> batchList = new ArrayList<>(100);
        for (LeaveProcessEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
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
     * @param entity LeaveProcessEntity
     * @param updateFields List<String>
     * @return LeaveProcessEntity
     */
    @Transactional
    public LeaveProcessEntity update(LeaveProcessEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "LeaveProcessEntity"); 
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
            entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, updateFields);
            mapper.update(entity, updateFields);
            return get(entity.getId());
        } 

    } 

    /**
     * batchUpdate.
     *
     * @param entities List<LeaveProcessEntity>
     * @param updateFields List<String>
     * @return List<LeaveProcessEntity>
     */
    @Transactional(rollbackFor = Exception.class)
    public List<LeaveProcessEntity> batchUpdate(List<LeaveProcessEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code); 
        } 

        if (updateFields != null && updateFields.size() == 1 && updateFields.contains("id")) {
            return entities;
        } 

        List<LeaveProcessEntity> result = new ArrayList<>(entities.size());
        UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<LeaveProcessEntity> batchList = new ArrayList<>(100);
        List<Long> batchIdList = new ArrayList<>(100);
        for (LeaveProcessEntity entity : entities) {
            if (entity.getId() == null) {
                throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code); 
            } 

            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
            entityValidate(entity, updateFields);
            batchList.add(entity);
            batchIdList.add(entity.getId());
            if (batchList.size() >= 100) {
                mapper.batchUpdate(batchList, updateFields);
                AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LeaveProcess", "leave_process", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
                result.addAll(mapper.selectList(inQueryFilter));
                batchList.clear();
                batchIdList.clear();
            } 

        } 
        if (!batchList.isEmpty()) {
            mapper.batchUpdate(batchList, updateFields);
            AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LeaveProcess", "leave_process", "id", "id")).right(new ListLiteralQueryFilter(batchIdList));
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

        LeaveProcessEntity entity = mapper.selectOne(id);
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

        AbstractQueryFilter inQueryFilter = new InQueryFilter().left(new ColumnQueryFilter("LeaveProcess", "leave_process", "id", "id")).right(new ListLiteralQueryFilter(ids));
        preHandleQueryExpression(inQueryFilter);
        List<LeaveProcessEntity> entities = mapper.selectList(inQueryFilter);
        for (LeaveProcessEntity entity : entities) {
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
            List<LeaveProcessEntity> data = ExcelUtil.read(file.getInputStream(), type, LeaveProcessEntity.class, entityFieldTitleNameMap);
            batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e); 
        } 
    } 

    /**
     * createOrUpdate.
     *
     * @param entity LeaveProcessEntity
     * @param updateFields List<String>
     * @return LeaveProcessEntity
     */
    @Transactional(rollbackFor = Exception.class)
    public LeaveProcessEntity createOrUpdate(LeaveProcessEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LeaveProcessEntity.class); 
        } 

        if (entity.getId() == null) {
            entity = create(entity); 
        } else {
            LeaveProcessEntity existEntity = mapper.selectOne(entity.getId());
            if (null == existEntity) {
                entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                UserInfo  currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
                entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
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
     * @param entity LeaveProcessEntity
     * @param updateFields List<String>
     * @param filter AbstractQueryFilter
     * @return long
     */
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(LeaveProcessEntity entity, List<String> updateFields, AbstractQueryFilter filter) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LeaveProcessEntity.class); 
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
            entity.setLeaveTime(null != entity.getLeaveTime() ? entity.getLeaveTime().setScale(2, BigDecimal.ROUND_HALF_UP) : null);
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
     * @param entity LeaveProcessEntity
     * @param updateFields List<String>
     */
    protected void entityValidate(LeaveProcessEntity entity, List<String> updateFields) {
        // no filed need validate, do nothing
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