package com.example.callbacklesson

interface OnDownLoadCallback {
    fun onComplete(message: String?)
    fun onFail()
}