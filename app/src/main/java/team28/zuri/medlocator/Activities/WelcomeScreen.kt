package team28.zuri.medlocator.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import team28.zuri.medlocator.R

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)
        val btn_next:Button = findViewById(R.id.btn_welcome_next);

        btn_next.setOnClickListener(){
            startActivity(Intent(this,UserHomeScreen::class.java))
        }

    }
}