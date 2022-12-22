package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityAboutBinding
import com.example.expertmobile.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = intent.getStringExtra("USERID")
        binding.btnBack.setOnClickListener {
            val intent = Intent(this,MainMenuActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }

        //burada databaseden yukarıdaki id ye ait kullanıcının bilgileri çekilmelidir.
        //sonra textview ile ekranda profil sayfasında gösterilecektir.
    }
}