package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.expertmobile.databinding.ActivityLoginBinding
import com.example.expertmobile.databinding.ActivityResultsBinding

class ResultsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userId = intent.getStringExtra("USERID")

        //burada backendden request ile sonuçları alacağız. Bu sonuçlara göre aşağıda if else blokları ile çıktıyı ekrana vereceğiz.
        // buradaki 1 2 3 rastgele değerlerdir. backennden gelen sonuca göre bu if else'lerden birine girmek üzere ayarlama yapabilirsin.
        // backennde test sonucu o kullanıcı database table'ında bir değişkene atansın result olarak. Bu Activity'e her girildiğinde o değer çağırılsın.

        val result : Int = 1 // kullanıcının database'inden çekilen değer.

        if(result == 1)
        {
            binding.tvTestResult.setText(R.string.goodResult)
        }
        else if(result == 2)
        {
            binding.tvTestResult.setText(R.string.mediumResult)
        }
        else if(result == 3)
        {
            binding.tvTestResult.setText(R.string.badResult)
        }


        binding.btnMain.setOnClickListener {
            val intent = Intent(this,MainMenuActivity::class.java)
            intent.putExtra("USERID", userId.toString())
            startActivity(intent)
            finish()
        }
    }
}