package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructure749010d3; 
import com.jasonzcmu.oaght.repository.LoadAssetApplySelect1LcapUserLogicMapper; 
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
public class LoadAssetApplySelect1LcapUserLogicService {

    /**
     * loadAssetApplySelect1LcapUserLogicMapper
     */
    @Autowired
    private LoadAssetApplySelect1LcapUserLogicMapper loadAssetApplySelect1LcapUserLogicMapper;

    /**
     * loadAssetApplySelect1LcapUser.
     *
     * @param page Long
     * @param size Long
     * @return AnonymousStructure749010d3
     */
    public AnonymousStructure749010d3 loadAssetApplySelect1LcapUser(Long page, Long size) {
        AnonymousStructure749010d3 result = new AnonymousStructure749010d3();
        result = Buildins.function().createListPage(loadAssetApplySelect1LcapUserLogicMapper.getAnonymousStructureAa660520(size, page), loadAssetApplySelect1LcapUserLogicMapper.countAnonymousStructureAa660520(size, page).intValue(), AnonymousStructure749010d3.class); 
        return result;
    } 

}