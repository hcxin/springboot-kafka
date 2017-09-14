package com.chen.common.util;

import java.util.Random;
import java.util.UUID;

/**
 * 类的功能描述：
 * 工具类
 *
 * @ClassName: ToolsUtil
 * @Author hcxin
 * @Date 2017-09-13 03:49:22
 */
public class ToolsUtil {

    public synchronized static String getNextCode() {
        return UUID.randomUUID().toString();
    }


    public synchronized static Float getFee() {
        Random rand = new Random();
        float fee = rand.nextFloat();

        return fee;
    }


}
