package com.example.expertmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.core.graphics.drawable.DrawableCompat.inflate
import com.example.expertmobile.databinding.ActivitySignUpBinding
import java.util.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpBinding

    lateinit var userName: String
    lateinit var name: String
    lateinit var surname: String
    lateinit var age: String
    lateinit var Email: String
    lateinit var password: String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_sign_up)

        binding = ActivitySignUpBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSignup.setOnClickListener {
            userName = binding.etUsername.text.toString()
            name = binding.etName.text.toString()
            surname = binding.etSurname.text.toString()
            age = binding.etAge.text.toString()
            Email = binding.etEmail.text.toString()
            password = binding.etPass.text.toString()

            // bu veriler backende yollayıp kayıt ettirilmeli

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()

        }
    }
}