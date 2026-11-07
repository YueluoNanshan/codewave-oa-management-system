package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureC31374c2; 
import com.jasonzcmu.oaght.repository.LoadAssetListSelect11SupplierLogicMapper; 
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
public class LoadAssetListSelect11SupplierLogicService {

    /**
     * loadAssetListSelect11SupplierLogicMapper
     */
    @Autowired
    private LoadAssetListSelect11SupplierLogicMapper loadAssetListSelect11SupplierLogicMapper;

    /**
     * loadAssetListSelect11Supplier.
     *
     * @param page Long
     * @param size Long
     * @return AnonymousStructureC31374c2
     */
    public AnonymousStructureC31374c2 loadAssetListSelect11Supplier(Long page, Long size) {
        AnonymousStructureC31374c2 result = new AnonymousStructureC31374c2();
        result = Buildins.function().createListPage(loadAssetListSelect11SupplierLogicMapper.getAnonymousStructureE25019c0(size, page), loadAssetListSelect11SupplierLogicMapper.countAnonymousStructureE25019c0(size, page).intValue(), AnonymousStructureC31374c2.class); 
        return result;
    } 

}