package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureC31374c2; 
import com.jasonzcmu.oaght.repository.LoadAssetListSelect8Supplier1LogicMapper; 
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
public class LoadAssetListSelect8Supplier1LogicService {

    /**
     * loadAssetListSelect8Supplier1LogicMapper
     */
    @Autowired
    private LoadAssetListSelect8Supplier1LogicMapper loadAssetListSelect8Supplier1LogicMapper;

    /**
     * loadAssetListSelect8Supplier1.
     *
     * @param page Long
     * @param size Long
     * @return AnonymousStructureC31374c2
     */
    public AnonymousStructureC31374c2 loadAssetListSelect8Supplier1(Long page, Long size) {
        AnonymousStructureC31374c2 result = new AnonymousStructureC31374c2();
        result = Buildins.function().createListPage(loadAssetListSelect8Supplier1LogicMapper.getAnonymousStructureE25019c0(size, page), loadAssetListSelect8Supplier1LogicMapper.countAnonymousStructureE25019c0(size, page).intValue(), AnonymousStructureC31374c2.class); 
        return result;
    } 

}