package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.CompanyPolicyEntity; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure6284f1bf; 
import com.jasonzcmu.oaght.repository.LoadTopPolicyLogicMapper; 
import com.netease.codewave.nasl.java.tools.Buildins; 
import java.util.ArrayList; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class LoadTopPolicyLogicService {

    /**
     * loadTopPolicyLogicMapper
     */
    @Autowired
    private LoadTopPolicyLogicMapper loadTopPolicyLogicMapper;

    /**
     * loadTopPolicy.
     *
     * @return CompanyPolicyEntity
     */
    public CompanyPolicyEntity loadTopPolicy() {
        List<AnonymousStructure6284f1bf> returnof = new ArrayList<>();
        CompanyPolicyEntity result = new CompanyPolicyEntity();
        returnof = loadTopPolicyLogicMapper.getAnonymousStructure6284f1bf(); 
        if (Buildins.function().hasValue(returnof)) {
            result = Buildins.function().listHead(returnof).companyPolicy; 
        } 

        return result;
    } 

}