package com.example.test
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.example.routefiberhelps.R
import com.routethis.rtclientnative.*
import com.routethis.rtclientnative.RTClientNative.getInstance
import org.json.JSONObject
import java.util.*
import java.util.jar.Manifest
import kotlin.collections.HashMap

class MainActivity : AppCompatActivity() {
    lateinit var rtclientNative: RTClientNative

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       //  rtclientNative = getInstance(this@MainActivity,"bdfcc852-0a9c-4def-9d0e-2b5c7a927ba9")

    }
}