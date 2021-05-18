package info.camposha.activity_transitions

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
    }

    fun intentA(view: View?) {
        startActivity(Intent(this, ActivityA::class.java))
    }

    fun intentB(view: View?) {
        startActivity(Intent(this, ActivityB::class.java))
    }
}