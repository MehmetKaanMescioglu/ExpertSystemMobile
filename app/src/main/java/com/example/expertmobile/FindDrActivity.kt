package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityAboutBinding
import com.example.expertmobile.databinding.ActivityFindDrBinding

class FindDrActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFindDrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindDrBinding.inflate(layoutInflater)
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