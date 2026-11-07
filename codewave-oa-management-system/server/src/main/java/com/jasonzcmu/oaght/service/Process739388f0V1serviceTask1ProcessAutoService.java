package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure52c579d8; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureDc488bc4; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureE3b0c442; 
import com.netease.codewave.process.api.service.engine.logic.ServiceTaskServiceInterface; 
import com.netease.codewave.process.util.ProcessConstant; 
import com.netease.codewave.process.util.ProcessUtil; 
import java.util.Map; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service("Process739388f0V1serviceTask1ProcessAutoService")
public class Process739388f0V1serviceTask1ProcessAutoService implements ServiceTaskServiceInterface {

    /**
     * changeStatusLogicService
     */
    @Autowired
    private ChangeStatusLogicService changeStatusLogicService;

    /**
     * leaveProcessEntityService
     */
    @Autowired
    private LeaveProcessEntityService leaveProcessEntityService;

    /**
     * execute.
     *
     * @param variables Map<String, Object>
     * @throws Exception
     */
    @Override
    public void execute(Map<String, Object> variables) throws Exception {
        AnonymousStructure52c579d8 processSystem = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_VARIABLE_PROCESS_SYSTEM)), AnonymousStructure52c579d8.class); 
        AnonymousStructureDc488bc4 custom = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_VARIABLE_CUSTOM)), AnonymousStructureDc488bc4.class); 
        AnonymousStructureE3b0c442 processVariable = ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(variables.get(ProcessConstant.KEY_PROCESS_VARIABLE)), AnonymousStructureE3b0c442.class); 
        serviceTask1(processSystem, custom, processVariable);
        ((Map<String, Object>) variables.get(ProcessConstant.KEY_VARIABLE_CUSTOM)).putAll(ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(custom), Map.class));
        variables.put(ProcessConstant.KEY_PROCESS_VARIABLE, ProcessUtil.readValueToType(ProcessUtil.writeValueAsString(processVariable), Map.class));
    } 

    /**
     * serviceTask1.
     *
     * @param processSystem AnonymousStructure52c579d8
     * @param custom AnonymousStructureDc488bc4
     * @param processVariable AnonymousStructureE3b0c442
     */
    public void serviceTask1(AnonymousStructure52c579d8 processSystem, AnonymousStructureDc488bc4 custom, AnonymousStructureE3b0c442 processVariable) {
        changeStatusLogicService.changeStatus(2L, custom.data);
        leaveProcessEntityService.update(custom.data, null);
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
        return "serviceTask1";
    } 

}