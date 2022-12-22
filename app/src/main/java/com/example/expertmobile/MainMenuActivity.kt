package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityMainMenuBinding
import com.example.expertmobile.databinding.ActivitySignUpBinding

class MainMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userId = intent.getStringExtra("USERID")

        binding.btnADHDTest.setOnClickListener {
            val intent = Intent(this,PreTestActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnResults.setOnClickListener {
            val intent = Intent(this,ResultsActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnAdvice.setOnClickListener {
            val intent = Intent(this,AdviceActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnFindDr.setOnClickListener {
            val intent = Intent(this,FindDrActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnProfile.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnGames.setOnClickListener {
            val intent = Intent(this,GamesActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnAbout.setOnClickListener {
            val intent = Intent(this,AboutActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        binding.btnEthics.setOnClickListener {
            val intent = Intent(this,EthicsActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }



    }
}