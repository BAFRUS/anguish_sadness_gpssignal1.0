package com.example.anguish_sadness_gpssignal

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.TimePicker
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationServices


class MainActivity : AppCompatActivity() {
    lateinit var am: AlarmManager
    lateinit var tp: TimePicker
    lateinit var alarmTxt: TextView
    lateinit var con: Context
    lateinit var btnStart: Button
    lateinit var btnEnd: Button
    var hour: Int = 0
    var minute: Int = 0
    lateinit var pi: PendingIntent

    private var PERMISSION_ID = 52
    lateinit var fusedLPC: FusedLocationProviderClient
    lateinit var locationRequest: LocationRequest
    lateinit var btngps: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.con = this
        am = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        tp = findViewById(R.id.TimePicker)
        alarmTxt = findViewById(R.id.alarmTxt)
        alarmTxt.setText(R.string.txtAlarm)
        btnStart = findViewById(R.id.StartAlarm)
        btnEnd = findViewById(R.id.EndAlarm)
        btngps = findViewById(R.id.btnGPS)

        fusedLPC = LocationServices.getFusedLocationProviderClient(this)
    }
}