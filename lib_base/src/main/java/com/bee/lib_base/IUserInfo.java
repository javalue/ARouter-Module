package com.bee.lib_base;


import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 这边对外暴露接口，都要继承它的IProvider，不然就编译不过
 * Arouter在跳转的时候，需要判断类型，是activity or fragment or interface
 */
public interface IUserInfo extends IProvider {
    String getUserName();
}
