package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityAboutBinding
import com.example.expertmobile.databinding.ActivityGamesBinding

class GamesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGamesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = intent.getStringExtra("USERID")
        binding.btnBack.setOnClickListener {
            val intent = Intent(this,MainMenuActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }
    }
}