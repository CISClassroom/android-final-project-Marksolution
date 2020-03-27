package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main2.*


class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if (supportActionBar != null)
            supportActionBar?.hide()

        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)

        object : CountDownTimer(21000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time2.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                time2.setText("หมดเวลา !!")

                val builder = AlertDialog.Builder(this@Main2Activity)
                builder.setTitle("หมดเวลาแล้ว !")
                builder.setMessage(">>> คุณตอบช้าเกินไปนะ ไป Level ต่อไปกันเลย !!"+m)
                builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                    Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                    var i = Intent(applicationContext, Main3Activity::class.java)
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(i)
                }

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }.start()

        bt7.setOnClickListener {

            val builder = AlertDialog.Builder(this@Main2Activity)

            builder.setTitle("ยินดีด้วย  คุณตอบถูก !!!")

            builder.setMessage("         ----->  ไป Level ต่อไปกันเถอะ")


            builder.setPositiveButton("เล่นต่อ"){dialog, which ->

                Toast.makeText(applicationContext,"เยี่ยมไปเลย", Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main3Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)

            }


            // Finally, make the alert dialog using builder
            val dialog: AlertDialog = builder.create()

            // Display the alert dialog on app interface
            dialog.show()
        }
        bt5.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main2Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main3Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt6.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main2Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main3Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt8.setOnClickListener {
            val builder = AlertDialog.Builder(this@Main2Activity)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main3Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

    }
}
