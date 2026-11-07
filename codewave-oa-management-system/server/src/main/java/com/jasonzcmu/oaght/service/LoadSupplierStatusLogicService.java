package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.repository.LoadSupplierStatusLogicMapper; 
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
public class LoadSupplierStatusLogicService {

    /**
     * loadSupplierStatusLogicMapper
     */
    @Autowired
    private LoadSupplierStatusLogicMapper loadSupplierStatusLogicMapper;

    /**
     * loadSupplierStatus.
     *
     * @return Long
     */
    public Long loadSupplierStatus() {
        Long result = 0L;
        result = Buildins.function().length(loadSupplierStatusLogicMapper.getAnonymousStructureE25019c0()); 
        return result;
    } 

}