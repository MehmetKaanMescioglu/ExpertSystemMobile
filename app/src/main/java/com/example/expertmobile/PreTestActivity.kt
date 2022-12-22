package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityMainMenuBinding
import com.example.expertmobile.databinding.ActivityPreTestBinding

class PreTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreTestBinding

    lateinit var Drugs: String
    lateinit var preInfo: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = intent.getStringExtra("USERID")

        // burada kullanıcıdan 2 adet bilgi daha alınıyor bunlar veritabanına eklenmeli. Kullandığı ilaçlar ve önceki tanıları.
        // burada muhattap userId intent ile veriliyor. o kullanıcının database verilerine eklenecek bu kısım.
        Drugs = binding.etDrugs.text.toString()
        preInfo = binding.etPreInfo.text.toString()
        // bu iki bilgiyi database e yolla

        binding.btnStartTest.setOnClickListener {
            val intent = Intent(this,QuestionActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }



    }
}