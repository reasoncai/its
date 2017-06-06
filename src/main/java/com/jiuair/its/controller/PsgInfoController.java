package com.jiuair.its.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jiuair.its.dao.OrderPsgMapper;
import com.jiuair.its.domain.OrderPsg;
import com.jiuair.its.service.PsgService;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by reason on 17/6/6.
 */
@RestController
@RequestMapping("/psginfo")
public class PsgInfoController {
    @Autowired
    private PsgService psgService;
    @Autowired
    private OrderPsgMapper orderPsgMapper;

    @RequestMapping(value = "/psgList",method = RequestMethod.GET)
    public String getPsgList(@RequestParam("orderid")String orderid){
        List<OrderPsg> orderPsgs = orderPsgMapper.selectByOrderId(orderid);
        return JSONArray.toJSON(orderPsgs).toString();
    }

    @RequestMapping(value = "/changeName",method = RequestMethod.POST)
    public JSONObject changeName(@RequestBody String req) throws BadHanyuPinyinOutputFormatCombination {
        JSONObject reqJson = JSONObject.parseObject(req);
        String orderId = reqJson.getString("orderId");
        String oldName = reqJson.getString("oldName");
        String newName = reqJson.getString("newName");

            String s = psgService.changeName(orderId, oldName, newName);
            OrderPsg orderPsg = orderPsgMapper.selectByPrimaryKey(s);
        JSONObject o = (JSONObject)JSONObject.toJSON(orderPsg);
        return o;
    }
}
