package com.example.anguish_sadness_gpssignal

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Receive : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        var getresult: String = intent!!.getStringExtra("extra").toString()

        var serviceIntent: Intent = Intent(context, SignalService::class.java)
        serviceIntent.putExtra("extra", getresult)
        context!!.startService(serviceIntent)
    }
}