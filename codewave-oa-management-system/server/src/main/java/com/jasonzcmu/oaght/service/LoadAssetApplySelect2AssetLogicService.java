package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureFffa9df4; 
import com.jasonzcmu.oaght.repository.LoadAssetApplySelect2AssetLogicMapper; 
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
public class LoadAssetApplySelect2AssetLogicService {

    /**
     * loadAssetApplySelect2AssetLogicMapper
     */
    @Autowired
    private LoadAssetApplySelect2AssetLogicMapper loadAssetApplySelect2AssetLogicMapper;

    /**
     * loadAssetApplySelect2Asset.
     *
     * @param page Long
     * @param size Long
     * @return AnonymousStructureFffa9df4
     */
    public AnonymousStructureFffa9df4 loadAssetApplySelect2Asset(Long page, Long size) {
        AnonymousStructureFffa9df4 result = new AnonymousStructureFffa9df4();
        result = Buildins.function().createListPage(loadAssetApplySelect2AssetLogicMapper.getAnonymousStructureC1729443(size, page), loadAssetApplySelect2AssetLogicMapper.countAnonymousStructureC1729443(size, page).intValue(), AnonymousStructureFffa9df4.class); 
        return result;
    } 

}