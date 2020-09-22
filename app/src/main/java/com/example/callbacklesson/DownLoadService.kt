package com.example.callbacklesson

class DownLoadService() {
    private var mDownLoadcallback: OnDownLoadCallback? = null

    constructor(callback: OnDownLoadCallback) : this() {
        this.mDownLoadcallback = callback
    }


//模擬一個八秒的下載
fun startDownLoad() {
    val thread = Thread(Runnable() {
        run {
            try {
                Thread.sleep(8000);
                mDownLoadcallback?.onComplete("完成囉！");
            } catch (e: InterruptedException) {
                mDownLoadcallback?.onFail();
            }
        }
    });

    thread.start();
}

}

