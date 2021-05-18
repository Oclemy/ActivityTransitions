package info.camposha.activity_transitions

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
    }

    fun intentC(view: View?) {
        startActivity(Intent(this, ActivityC::class.java))
    }

    fun intentA(view: View?) {
        startActivity(Intent(this, ActivityA::class.java))
    }
}