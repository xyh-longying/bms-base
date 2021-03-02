package com.longying.bmsbase.base;

import cn.hutool.core.util.ReUtil;
import cn.hutool.crypto.digest.BCrypt;

/**
 * Create by chenglong on 2021/2/23
 */
public class BaseUtil {

    /**
     * 校验是否是手机号
     * @param phoneNum
     * @return
     */
    public static boolean isPhoneNum(String phoneNum){
        String regex = "^1[3|4|5|7|8][0-9]\\d{4,8}$";
        return ReUtil.isMatch(regex, phoneNum);
    }

    /**
     * 密码加密
     * @param password
     * @return
     */
    public static String bcryptPwd(String password){
        return BCrypt.hashpw(password, BCrypt.gensalt(10));
    }

    /**
     * 校验密码
     * @param password
     * @param hashed
     * @return
     */
    public static boolean checkPwd(String password, String hashed){
        return BCrypt.checkpw(password, hashed);
    }

    public static void main(String[] args) {
        System.out.println(bcryptPwd("68823d73c6"));
    }
}
