package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_level_1.*
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*
import kotlinx.android.synthetic.main.activity_main5.*
import kotlinx.android.synthetic.main.activity_main7.*

class Main7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        if (supportActionBar != null)
            supportActionBar?.hide()
        object : CountDownTimer(21000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time7.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                time7.setText("หมดเวลา !!")

                val builder = AlertDialog.Builder(this@Main7Activity)
                builder.setTitle("หมดเวลาแล้ว !")
                builder.setMessage(">>> คุณตอบช้าเกินไปนะ ไป Level ต่อไปกันเลย !!")
                builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                    Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                    var i = Intent(applicationContext, Main8Activity::class.java)
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(i)
                }

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }.start()


        bt25.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main7Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main8Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt27.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main7Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main8Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt28.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main7Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main8Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt26.setOnClickListener {

            val builder = AlertDialog.Builder(this@Main7Activity)

            builder.setTitle("ยินดีด้วย  คุณตอบถูก !!!")

            builder.setMessage("         ----->  ไป Level ต่อไปกันเถอะ")


            builder.setPositiveButton("เล่นต่อ"){dialog, which ->

                Toast.makeText(applicationContext,"เยี่ยมไปเลย", Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main8Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)

            }


            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
    }
}
