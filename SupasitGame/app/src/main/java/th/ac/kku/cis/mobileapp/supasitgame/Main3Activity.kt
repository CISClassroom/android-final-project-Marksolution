package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_level_1.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        if (supportActionBar != null)
            supportActionBar?.hide()
        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)
        tv2.text =  intent.getIntExtra("EXTRA_SESSION_ID",0).toString()
        object : CountDownTimer(21000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time3.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                time3.setText("หมดเวลา !!")

                val builder = AlertDialog.Builder(this@Main3Activity)
                builder.setTitle("หมดเวลาแล้ว !")
                builder.setMessage(">>> คุณตอบช้าเกินไปนะ ไป Level ต่อไปกันเลย !!")
                builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                    Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                    val Ba = Intent(this@Main3Activity, Main4Activity::class.java)
                    Ba.putExtra("EXTRA_SESSION_ID", m);
                    startActivity(Ba)
                }

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }.start()

        bt10.setOnClickListener {

            val builder = AlertDialog.Builder(this@Main3Activity)

            builder.setTitle("ยินดีด้วย  คุณตอบถูก !!!")

            builder.setMessage("         ----->  ไป Level ต่อไปกันเถอะ")


            builder.setPositiveButton("เล่นต่อ"){dialog, which ->

                Toast.makeText(applicationContext,"เยี่ยมไปเลย", Toast.LENGTH_SHORT).show()
                val n = m +10
                val Ba = Intent(this@Main3Activity, Main4Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", n);
                startActivity(Ba)

            }


            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
        bt9.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main3Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main3Activity, Main4Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt11.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main3Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main3Activity, Main4Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt12.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main3Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main3Activity, Main4Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
    }
}

