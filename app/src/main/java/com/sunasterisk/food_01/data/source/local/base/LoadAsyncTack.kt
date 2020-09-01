package com.sunasterisk.food_01.data.source.local.base

import android.os.AsyncTask
import com.sunasterisk.food_01.data.source.local.onDataLoadedCallBack

const val FAILED: String = "FAILED"
const val LOAD_FAILED: String = "LOAD FAILED"

class LoadAsyncTack<P, T> constructor(
    private val listener: onDataLoadedCallBack<T>,
    private val handle: (P) -> T
) : AsyncTask<P, Void, T>() {
    override fun doInBackground(vararg params: P): T? =
        try {
            handle(params.first()) ?: throw Exception(FAILED)
        } catch (e: Exception) {
            null
        }

    override fun onPostExecute(result: T) {
        super.onPostExecute(result)
        result?.let {
            listener.onSuccess(it)
        } ?: listener.onFailure(Exception(LOAD_FAILED))
    }
}

object EmptyInput
