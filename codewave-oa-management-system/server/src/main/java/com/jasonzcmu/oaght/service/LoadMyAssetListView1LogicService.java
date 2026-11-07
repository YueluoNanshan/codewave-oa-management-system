package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.SessionVariables; 
import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureD1f18142; 
import com.jasonzcmu.oaght.repository.LoadMyAssetListView1LogicMapper; 
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
public class LoadMyAssetListView1LogicService {

    /**
     * loadMyAssetListView1LogicMapper
     */
    @Autowired
    private LoadMyAssetListView1LogicMapper loadMyAssetListView1LogicMapper;

    /**
     * loadMyAssetListView1.
     *
     * @param page Long
     * @param size Long
     * @return AnonymousStructureD1f18142
     */
    public AnonymousStructureD1f18142 loadMyAssetListView1(Long page, Long size) {
        AnonymousStructureD1f18142 result = new AnonymousStructureD1f18142();
        result = Buildins.function().createListPage(loadMyAssetListView1LogicMapper.getAnonymousStructure8df66773(size, SessionVariables.getInstance().currentUser, page), loadMyAssetListView1LogicMapper.countAnonymousStructure8df66773(size, SessionVariables.getInstance().currentUser, page).intValue(), AnonymousStructureD1f18142.class); 
        return result;
    } 

}