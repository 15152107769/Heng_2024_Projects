package com.heng.comprehensive.function;

/**
 * @FileName BeanCopyCallBack
 * @Description
 * @Author zhaoheng
 * @date 2024-07-10 00:39
 **/

@FunctionalInterface
public interface BeanCopyCallBack<S, T> {
    void callBack(S t, T s);
}