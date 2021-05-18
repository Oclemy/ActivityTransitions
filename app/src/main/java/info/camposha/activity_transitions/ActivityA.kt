package info.camposha.activity_transitions

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun intentB(view: View?) {
        startActivity(Intent(this, ActivityB::class.java))
    }

    fun intentC(view: View?) {
        startActivity(Intent(this, ActivityC::class.java))
    }
}