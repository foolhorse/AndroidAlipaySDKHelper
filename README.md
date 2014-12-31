# Android Alipay SDK Helper

## Introduction
根据支付宝快捷支付的SDK封装的一个使用起来更加便捷的库

## Usage

在程序的入口设置好各种key：
```java
    AlipayHelperConfiguration.setDefaultPartner(mDefaultPartner);
    AlipayHelperConfiguration.setDefaultSeller(mDefaultSeller);
    AlipayHelperConfiguration.setRsaPrivate(mRsaPrivate);
    AlipayHelperConfiguration.setRsaPublic(mRsaPublic);
    AlipayHelperConfiguration.setIsDebug(true);
    AlipayHelperConfiguration.setNotifyUrl("");
```

支付：
```java
    AliPayHelper.getInstance(MainActivity.this).pay(randomOutTradeNo,"0.01", new AliPayHelper.AliPayCallback() {
        @Override
        public void onPay(int status) {

        }
    });
```



## Copyright

Copyright 2014, machao

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
