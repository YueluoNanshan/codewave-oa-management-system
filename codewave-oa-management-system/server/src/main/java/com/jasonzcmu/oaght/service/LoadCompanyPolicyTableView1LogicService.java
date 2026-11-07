package com.jasonzcmu.oaght.service; 

import com.jasonzcmu.oaght.entity.anonymous.AnonymousStructureD4aacb9e; 
import com.jasonzcmu.oaght.enumeration.CompanyPtypeEnum; 
import com.jasonzcmu.oaght.repository.LoadCompanyPolicyTableView1LogicMapper; 
import com.netease.codewave.nasl.java.tools.Buildins; 
import java.math.BigDecimal; 
import java.util.Objects; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 

/**
 * Auto-Generated.
 *
 * @author NASL编译器
 * @date 2025-12-02
 */
@Service
public class LoadCompanyPolicyTableView1LogicService {

    /**
     * loadCompanyPolicyTableView1LogicMapper
     */
    @Autowired
    private LoadCompanyPolicyTableView1LogicMapper loadCompanyPolicyTableView1LogicMapper;

    /**
     * loadCompanyPolicyTableView1.
     *
     * @param page Long
     * @param size Long
     * @param sort String
     * @param order String
     * @param tab Long
     * @return AnonymousStructureD4aacb9e
     */
    public AnonymousStructureD4aacb9e loadCompanyPolicyTableView1(Long page, Long size, String sort, String order, Long tab) {
        CompanyPtypeEnum type = null;
        AnonymousStructureD4aacb9e result = new AnonymousStructureD4aacb9e();
{
            Long itIntrinsicus0 = tab;
            if (Buildins.function().equals((Objects.isNull(itIntrinsicus0) ? null : new BigDecimal(String.valueOf(itIntrinsicus0))), (Objects.isNull(0L) ? null : new BigDecimal(String.valueOf(0L))))) {
            } else if (Buildins.function().equals((Objects.isNull(itIntrinsicus0) ? null : new BigDecimal(String.valueOf(itIntrinsicus0))), (Objects.isNull(1L) ? null : new BigDecimal(String.valueOf(1L))))) {
                type = CompanyPtypeEnum.FIELD_1; 
            } else if (Buildins.function().equals((Objects.isNull(itIntrinsicus0) ? null : new BigDecimal(String.valueOf(itIntrinsicus0))), (Objects.isNull(2L) ? null : new BigDecimal(String.valueOf(2L))))) {
                type = CompanyPtypeEnum.FIELD_2; 
            } 

        } 
        result = Buildins.function().createListPage(loadCompanyPolicyTableView1LogicMapper.getAnonymousStructure6284f1bf(size, page, type), loadCompanyPolicyTableView1LogicMapper.countAnonymousStructure6284f1bf(size, page, type).intValue(), AnonymousStructureD4aacb9e.class); 
        return result;
    } 

}