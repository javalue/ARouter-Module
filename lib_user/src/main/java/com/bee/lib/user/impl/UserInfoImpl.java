package com.bee.lib.user.impl;


import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bee.lib_base.IUserInfo;

@Route(path = "/service/userinfo")
public class UserInfoImpl implements IUserInfo {
    @Override
    public String getUserName() {
        return "Hello World!";
    }

    @Override
    public void init(Context context) {

    }
}


