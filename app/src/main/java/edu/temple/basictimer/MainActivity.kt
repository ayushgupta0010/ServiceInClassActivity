package edu.temple.basictimer

import android.content.ComponentName
import android.content.ServiceConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.IBinder
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val startButton : Button by lazy {
        findViewById(R.id.startButton)
    }

    val stopButton : Button by lazy {
        findViewById(R.id.stopButton)
    }

    val timerTextView : TextView by lazy {
        findViewById(R.id.textView)
    }

    var timerBinder: TimerService.TimerBinder? = null // woah

    val serviceConnection = object : ServiceConnection {
        override fun onServiceConnected(
            name: ComponentName?, service: IBinder?
        ) {
            timerBinder = service as TimerService.TimerBinder
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            timerBinder = null
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {

        }

        stopButton.setOnClickListener {

        }
    }
}