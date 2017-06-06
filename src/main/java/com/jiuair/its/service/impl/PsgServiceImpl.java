package com.jiuair.its.service.impl;

import com.jiuair.its.dao.OPsgListMapper;
import com.jiuair.its.dao.OrderPsgMapper;
import com.jiuair.its.domain.OrderPsg;
import com.jiuair.its.service.PsgService;
import com.jiuair.its.util.ChineseToPinyinUtils;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by reason on 17/6/6.
 */
@Service("psgService")
public class PsgServiceImpl implements PsgService {
    private static final Logger logger = LoggerFactory.getLogger(PsgServiceImpl.class);
    @Autowired
    private OrderPsgMapper orderPsgMapper;
    @Autowired
    private OPsgListMapper oPsgListMapper;

    @Override
    public String changeName(String orderId, String oldName, String newName) throws BadHanyuPinyinOutputFormatCombination {
        List<OrderPsg> orderPsgs = orderPsgMapper.selectByOrderIdAndName(orderId, oldName);
        if(orderPsgs!=null && orderPsgs.size() == 1){
            OrderPsg orderPsg = orderPsgs.get(0);
            String psgId = orderPsg.getPsgId();
            String newNameEn = ChineseToPinyinUtils.getPinyin(newName);
            int i = oPsgListMapper.changeName(psgId, oldName, newName, newNameEn);
            System.out.println(i);
            int i1 = orderPsgMapper.changeName(psgId, oldName, newName);
            System.out.println("2t"+i1);
            return psgId;
        }else{
            logger.error("");
            return "";
        }
    }

}
