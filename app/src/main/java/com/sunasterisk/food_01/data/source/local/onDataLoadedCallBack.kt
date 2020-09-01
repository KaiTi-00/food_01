package com.sunasterisk.food_01.data.source.local

import java.lang.Exception

interface onDataLoadedCallBack<T> {
    fun onSuccess(data: T)
    fun onFailure(exception: Exception)
}