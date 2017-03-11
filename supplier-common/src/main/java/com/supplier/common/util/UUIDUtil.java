package com.supplier.common.util;

import java.util.UUID;

/**
 * Created by LinQ on 2017/3/11.
 */
public class UUIDUtil {


    /**
     * @Title: getUUID
     * @Description: 生成32位编码
     * @return
     * @return String
     * @throws
     */
    public static String getUUID() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }


}
