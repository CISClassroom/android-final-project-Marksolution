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
import kotlinx.android.synthetic.main.activity_main8.*

class Main8Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        if (supportActionBar != null)
            supportActionBar?.hide()
        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)
        tv7.text =  intent.getIntExtra("EXTRA_SESSION_ID",0).toString()
        object : CountDownTimer(21000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time8.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                time8.setText("หมดเวลา !!")

                val builder = AlertDialog.Builder(this@Main8Activity)
                builder.setTitle("หมดเวลาแล้ว !")
                builder.setMessage(">>> คุณตอบช้าเกินไปนะ ไป Level ต่อไปกันเลย !!")
                builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                    Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                    val Ba = Intent(this@Main8Activity, Main9Activity::class.java)
                    Ba.putExtra("EXTRA_SESSION_ID", m);
                    startActivity(Ba)
                }

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }.start()


        bt30.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main8Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main8Activity, Main9Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt31.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main8Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main8Activity, Main9Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt32.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main8Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val Ba = Intent(this@Main8Activity, Main9Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", m);
                startActivity(Ba)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt29.setOnClickListener {

            val builder = AlertDialog.Builder(this@Main8Activity)

            builder.setTitle("ยินดีด้วย  คุณตอบถูก !!!")

            builder.setMessage("         ----->  ไป Level ต่อไปกันเถอะ")


            builder.setPositiveButton("เล่นต่อ"){dialog, which ->

                Toast.makeText(applicationContext,"เยี่ยมไปเลย", Toast.LENGTH_SHORT).show()
                val n = m +10
                val Ba = Intent(this@Main8Activity, Main9Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", n);
                startActivity(Ba)

            }


            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
    }
}
