package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.expertmobile.databinding.ActivityLoginBinding
import com.example.expertmobile.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    lateinit var userName: String
    lateinit var password: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLogin.setOnClickListener {
            userName = binding.etName.text.toString()
            password = binding.etPass.text.toString()

            // bu kısımda backendden kontrol için veriler gönderilip alınır.
            // Eğer doğru kullanıcı girişi yapılmış ise if'e girilir.
            // backendden gelen cevaba göre if parantezleri içini ayarla.
            //şuanlık her koşulda if'e girecek onu ayarla

            if(true)
            {
                // sisteme giriş yapmaya çalışan kullanıcı id'si intent ile main menuye atilmalidir.
                //BACKEND TARAFINDAN GELECEK KULLANICI ID'Sİ BU VARIABLE'A KAYDEDILMELI.
                var userId: Int
                userId = 5

                val intent = Intent(this,MainMenuActivity::class.java)
                intent.putExtra("USERID", userId.toString())
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(applicationContext, "Wrong Informations!", Toast.LENGTH_SHORT).show()
            }
        }
        binding.btnSignup.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}