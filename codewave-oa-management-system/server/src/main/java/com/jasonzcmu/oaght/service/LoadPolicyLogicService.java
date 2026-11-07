package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureD4aacb9e; 
import com.jasonzcmu.oaght.enumeration.CompanyPtypeEnum; 
import com.jasonzcmu.oaght.repository.LoadPolicyLogicMapper; 
import com.netease.codewave.nasl.java.tools.Buildins; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class LoadPolicyLogicService {

    /**
     * loadPolicyLogicMapper
     */
    @Autowired
    private LoadPolicyLogicMapper loadPolicyLogicMapper;

    /**
     * loadPolicy.
     *
     * @param type CompanyPtypeEnum
     * @return AnonymousStructureD4aacb9e
     */
    public AnonymousStructureD4aacb9e loadPolicy(CompanyPtypeEnum type) {
        AnonymousStructureD4aacb9e result = new AnonymousStructureD4aacb9e();
        result = Buildins.function().createListPage(loadPolicyLogicMapper.getAnonymousStructure6284f1bf(type), loadPolicyLogicMapper.countAnonymousStructure6284f1bf(type).intValue(), AnonymousStructureD4aacb9e.class); 
        return result;
    } 

}