package com.example.expertmobile

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuestionActivity : AppCompatActivity() {

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val userId = intent.getStringExtra("USERID")

        val btn =findViewById<Button>(R.id.btnNext) as Button
        val btn1 =findViewById<Button>(R.id.btnNext1) as Button
        val rbtn =findViewById<RadioGroup>(R.id.rdGroup) as RadioGroup

        val qhText = findViewById<TextView>(R.id.tvQHeader) as TextView
        val qText = findViewById<TextView>(R.id.tvQuestion) as TextView

        qhText.setText(R.string.q1h)
        qText.setText(R.string.q1)

        val qHeader = Array<String>(48){""}
        qHeader[0] = R.string.q1h.toString()
        qHeader[1] = R.string.q2h.toString()
        qHeader[2] = R.string.q3h.toString()
        qHeader[3] = R.string.q4h.toString()
        qHeader[4] = R.string.q5h.toString()
        qHeader[5] = R.string.q6h.toString()
        qHeader[6] = R.string.q7h.toString()
        qHeader[7] = R.string.q8h.toString()
        qHeader[8] = R.string.q9h.toString()
        qHeader[9] = R.string.q10h.toString()
        qHeader[10] = R.string.q11h.toString()
        qHeader[11] = R.string.q12h.toString()
        qHeader[12] = R.string.q13h.toString()
        qHeader[13] = R.string.q14h.toString()
        qHeader[14] = R.string.q15h.toString()
        qHeader[15] = R.string.q16h.toString()
        qHeader[16] = R.string.q17h.toString()
        qHeader[17] = R.string.q18h.toString()
        qHeader[18] = R.string.q19h.toString()
        qHeader[19] = R.string.q20h.toString()
        qHeader[20] = R.string.q21h.toString()
        qHeader[21] = R.string.q22h.toString()
        qHeader[22] = R.string.q23h.toString()
        qHeader[23] = R.string.q24h.toString()
        qHeader[24] = R.string.q25h.toString()
        qHeader[25] = R.string.q26h.toString()
        qHeader[26] = R.string.q27h.toString()
        qHeader[27] = R.string.q28h.toString()
        qHeader[28] = R.string.q29h.toString()
        qHeader[29] = R.string.q30h.toString()
        qHeader[30] = R.string.q31h.toString()
        qHeader[31] = R.string.q32h.toString()
        qHeader[32] = R.string.q33h.toString()
        qHeader[33] = R.string.q34h.toString()
        qHeader[34] = R.string.q35h.toString()
        qHeader[35] = R.string.q36h.toString()
        qHeader[36] = R.string.q37h.toString()
        qHeader[37] = R.string.q38h.toString()
        qHeader[38] = R.string.q39h.toString()
        qHeader[39] = R.string.q40h.toString()
        qHeader[40] = R.string.q41h.toString()
        qHeader[41] = R.string.q42h.toString()
        qHeader[42] = R.string.q43h.toString()
        qHeader[43] = R.string.q44h.toString()
        qHeader[44] = R.string.q45h.toString()
        qHeader[45] = R.string.q46h.toString()
        qHeader[46] = R.string.q47h.toString()
        qHeader[47] = R.string.q48h.toString()

        val questionArray = Array<String>(48){""}
        questionArray[0] = R.string.q1.toString()
        questionArray[1] = R.string.q2.toString()
        questionArray[2] = R.string.q3.toString()
        questionArray[3] = R.string.q4.toString()
        questionArray[4] = R.string.q5.toString()
        questionArray[5] = R.string.q6.toString()
        questionArray[6] = R.string.q7.toString()
        questionArray[7] = R.string.q8.toString()
        questionArray[8] = R.string.q9.toString()
        questionArray[9] = R.string.q10.toString()
        questionArray[10] = R.string.q11.toString()
        questionArray[11] = R.string.q12.toString()
        questionArray[12] = R.string.q13.toString()
        questionArray[13] = R.string.q14.toString()
        questionArray[14] = R.string.q15.toString()
        questionArray[15] = R.string.q16.toString()
        questionArray[16] = R.string.q17.toString()
        questionArray[17] = R.string.q18.toString()
        questionArray[18] = R.string.q19.toString()
        questionArray[19] = R.string.q20.toString()
        questionArray[20] = R.string.q21.toString()
        questionArray[21] = R.string.q22.toString()
        questionArray[22] = R.string.q23.toString()
        questionArray[23] = R.string.q24.toString()
        questionArray[24] = R.string.q25.toString()
        questionArray[25] = R.string.q26.toString()
        questionArray[26] = R.string.q27.toString()
        questionArray[27] = R.string.q28.toString()
        questionArray[28] = R.string.q29.toString()
        questionArray[29] = R.string.q30.toString()
        questionArray[30] = R.string.q31.toString()
        questionArray[31] = R.string.q32.toString()
        questionArray[32] = R.string.q33.toString()
        questionArray[33] = R.string.q34.toString()
        questionArray[34] = R.string.q35.toString()
        questionArray[35] = R.string.q36.toString()
        questionArray[36] = R.string.q37.toString()
        questionArray[37] = R.string.q38.toString()
        questionArray[38] = R.string.q39.toString()
        questionArray[39] = R.string.q40.toString()
        questionArray[40] = R.string.q41.toString()
        questionArray[41] = R.string.q42.toString()
        questionArray[42] = R.string.q43.toString()
        questionArray[43] = R.string.q44.toString()
        questionArray[44] = R.string.q45.toString()
        questionArray[45] = R.string.q46.toString()
        questionArray[46] = R.string.q47.toString()
        questionArray[47] = R.string.q48.toString()



        var firstPoint: Int = 0
        var secondPoint: Int = 0
        var thirdPoint: Int = 0
        var a : Int = 0
        var checker : Int = 0

            btn.setOnClickListener {
                rbtn.setOnCheckedChangeListener { group, i ->
                    if(R.id.btnNever == i)
                    {

                        checker = 1
                        if(a < 9)
                        {
                            firstPoint += 0
                        }
                        else if(a >= 9 && a < 18)
                        {
                            secondPoint += 0
                        }
                        else if(a >= 18)
                        {
                            thirdPoint += 0
                        }
                    }
                    else if(R.id.btnSometime == i)
                    {
                        checker = 1
                        if(a < 9)
                        {
                            firstPoint += 1
                        }
                        else if(a >= 9 && a < 18)
                        {
                            secondPoint += 1
                        }
                        else if(a >= 18)
                        {
                            thirdPoint += 1
                        }

                    }
                    else if(R.id.btnOften == i)
                    {
                        checker = 1
                        if(a < 9)
                        {
                            firstPoint += 2
                        }
                        else if(a >= 9 && a < 18)
                        {
                            secondPoint += 2
                        }
                        else if(a >= 18)
                        {
                            thirdPoint += 2
                        }
                    }
                    else if(R.id.btnMany == i)
                    {
                        checker = 1
                        if(a < 9)
                        {
                            firstPoint += 3
                        }
                        else if(a >= 9 && a < 18)
                        {
                            secondPoint += 3
                        }
                        else if(a >= 18)
                        {
                            thirdPoint += 3
                        }
                    }

                }

                if(a > 46)
                {
                    // burada Node.js a firstPoint, secondPoint ve thirdPoint gönderilecek.
                    //ve o kullanıcıya özel kendi tableında işlemler yapılacaktır.
                    btn.setVisibility(View.GONE)
                    btn1.setVisibility(View.VISIBLE)
                    btn1.setOnClickListener {
                        val intent = Intent(this,ResultsActivity::class.java)
                        intent.putExtra("USERID", userId.toString())
                        startActivity(intent)
                        finish()
                    }

                }
                else{
                        a++
                        qhText.setText(qHeader[a].toInt())
                        qText.setText(questionArray[a].toInt())
                        checker = 0
                        rbtn.clearCheck()
                }
            }

    }
}