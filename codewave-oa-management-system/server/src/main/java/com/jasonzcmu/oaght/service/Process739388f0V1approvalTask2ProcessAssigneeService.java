package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure52c579d8; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureDc488bc4; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureE3b0c442; 
import com.netease.codewave.process.api.service.engine.logic.AssigneeServiceInterface; 
import com.netease.codewave.process.util.ProcessConstant; 
import com.netease.codewave.process.util.ProcessUtil; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Map; 
import java.util.stream.Collectors; 
import org.apache.commons.lang3.StringUtils; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service("Process739388f0V1approvalTask2ProcessAssigneeService")
public class Process739388f0V1approvalTask2ProcessAssigneeService implements AssigneeServiceInterface {

    /**
     * getAssigneeList.
     *
     * @param variables Map<String, Object>
     * @return List<String>
     * @throws Exception
     */
    @Override
    public List<String> getAssigneeList(Map<String, Object> variables) throws Exception {
        AnonymousStructure52c579d8 processSystem = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_VARIABLE_PROCESS_SYSTEM)), AnonymousStructure52c579d8.class); 
        AnonymousStructureDc488bc4 custom = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_VARIABLE_CUSTOM)), AnonymousStructureDc488bc4.class); 
        AnonymousStructureE3b0c442 processVariable = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_PROCESS_VARIABLE)), AnonymousStructureE3b0c442.class); 
        List<String> assigneeList = new ArrayList<>(); 
        usersHandler(assigneeList, processSystem, custom, processVariable);
        ((Map<String, Object>) variables.get(ProcessConstant.KEY_VARIABLE_CUSTOM)).putAll(ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(custom), Map.class));
        variables.put(ProcessConstant.KEY_PROCESS_VARIABLE, ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(processVariable), Map.class));
        return assigneeList.stream().filter(StringUtils::isNoneBlank).distinct().collect(Collectors.toList());
    } 

    /**
     * usersHandler.
     *
     * @param assigneeList List<String>
     * @param processSystem AnonymousStructure52c579d8
     * @param custom AnonymousStructureDc488bc4
     * @param processVariable AnonymousStructureE3b0c442
     */
    public void usersHandler(List<String> assigneeList, AnonymousStructure52c579d8 processSystem, AnonymousStructureDc488bc4 custom, AnonymousStructureE3b0c442 processVariable) {
        // 用户
        assigneeList.add("DEVACC-oaght");
    } 

    /**
     * getProcessUniqueKey.
     *
     * @return String
     */
    @Override
    public String getProcessUniqueKey() {
        return "Process_739388f0";
    } 

    /**
     * getVersion.
     *
     * @return String
     */
    @Override
    public String getVersion() {
        return "1";
    } 

    /**
     * getElementName.
     *
     * @return String
     */
    @Override
    public String getElementName() {
        return "approvalTask2";
    } 

}