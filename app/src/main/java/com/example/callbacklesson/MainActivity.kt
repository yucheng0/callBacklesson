package com.example.callbacklesson

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
/*
andy02172001.blogspot.com/2017/10/androidinterfacecall-back.html
 */
val TAG= "myTag"
class MainActivity : AppCompatActivity(),OnDownLoadCallback{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   val downloadservice = DownLoadService(this)
      downloadservice.startDownLoad()

    }

    override fun onComplete(message: String?) {
        Log.i(TAG, "$message")
    }

    override fun onFail() {
        Log.i(TAG, "${"下載失敗"}")
    }
}