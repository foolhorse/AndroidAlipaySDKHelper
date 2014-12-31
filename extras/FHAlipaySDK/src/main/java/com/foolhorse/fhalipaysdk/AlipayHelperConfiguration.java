package com.foolhorse.fhalipaysdk;


public class AlipayHelperConfiguration {

    /**
     * 合作身份者id，以2088开头的16位纯数字
     */
    private static String sDefaultPartner;
    /**
     * 收款支付宝账号
     */
    private static String sDefaultSeller ;
    /**
     * 商户私钥，自助生成
     */
    private static String sRsaPrivate ;
    /**
     * 商户公钥，自助生成
     */
    private static String sRsaPublic ;

    /**
     * 调试开关
     */
    private static boolean sIsDebug = true;

    /**
     * 回调地址
     */
    private static String sNotifyUrl  ;

    public static void setDefaultPartner(String defaultPartner) {
        AlipayHelperConfiguration.sDefaultPartner = defaultPartner;
    }

    public static void setDefaultSeller(String defaultSeller) {
        AlipayHelperConfiguration.sDefaultSeller = defaultSeller;
    }

    public static void setRsaPrivate(String rsaPrivate) {
        AlipayHelperConfiguration.sRsaPrivate = rsaPrivate;
    }

    public static void setRsaPublic(String rsaPublic) {
        AlipayHelperConfiguration.sRsaPublic = rsaPublic;
    }

    public static void setIsDebug(boolean isDebug) {
        AlipayHelperConfiguration.sIsDebug = isDebug;
    }

    public static void setNotifyUrl(String notifyUrl) {
        AlipayHelperConfiguration.sNotifyUrl = notifyUrl;
    }


    public static String getDefaultPartner() {
        return sDefaultPartner;
    }

    public static String getDefaultSeller() {
        return sDefaultSeller;
    }

    public static String getRsaPrivate() {
        return sRsaPrivate;
    }

    public static String getRsaPublic() {
        return sRsaPublic;
    }

    public static boolean isIsDebug() {
        return sIsDebug;
    }

    public static String getNotifyUrl() {
        return sNotifyUrl;
    }

}
