package com.jiuair.its.service;

import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

/**
 * Created by reason on 17/6/6.
 */
public interface PsgService {
    String changeName(String orderId, String oldName, String newName) throws BadHanyuPinyinOutputFormatCombination;
}
