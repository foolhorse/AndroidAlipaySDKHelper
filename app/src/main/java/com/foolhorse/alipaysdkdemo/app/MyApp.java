package com.foolhorse.alipaysdkdemo.app;

import android.app.Application;

import com.foolhorse.fhalipaysdk.AlipayHelperConfiguration;

/**
 * Created by ID_MARR on 2014/12/31.
 */
public class MyApp extends Application {
    /**
     * 合作身份者id，以2088开头的16位纯数字
     */
    private final String mDefaultPartner = "";
    /**
     * 收款支付宝账号
     */
    private final String mDefaultSeller = "";
    /**
     * 商户私钥，自助生成
     */
    private final String mRsaPrivate = "";
    /**
     * 商户公钥，自助生成
     */
    private final String mRsaPublic = "";


    @Override
    public void onCreate() {
        super.onCreate();
        initAlipay();

    }

    private void initAlipay() {
        AlipayHelperConfiguration.setDefaultPartner(mDefaultPartner);
        AlipayHelperConfiguration.setDefaultSeller(mDefaultSeller);
        AlipayHelperConfiguration.setRsaPrivate(mRsaPrivate);
        AlipayHelperConfiguration.setRsaPublic(mRsaPublic);
        AlipayHelperConfiguration.setIsDebug(true);
        AlipayHelperConfiguration.setNotifyUrl("");
    }

}
