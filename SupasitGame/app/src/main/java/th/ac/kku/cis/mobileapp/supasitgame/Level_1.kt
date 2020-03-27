package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_level_1.*


class Level_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_1)

        if (supportActionBar != null)
            supportActionBar?.hide()


        object : CountDownTimer(21000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                time.setText(" " + millisUntilFinished / 1000)
            }

            override fun onFinish() {
                time.setText("หมดเวลา !!")

                val builder = AlertDialog.Builder(this@Level_1)
                builder.setTitle("หมดเวลาแล้ว !")
                builder.setMessage(">>> คุณตอบช้าเกินไปนะ ไป Level ต่อไปกันเลย !!")
                builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                    Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                    var i = Intent(applicationContext, Main2Activity::class.java)
                    i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                    startActivity(i)

                }

                val dialog: AlertDialog = builder.create()
                dialog.show()

            }
        }.start()

        bt1.setOnClickListener {
            val builder = AlertDialog.Builder(this@Level_1)
            builder.setTitle("ยินดีด้วย  คุณตอบถูก !!!")
            builder.setMessage("         ----->  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"เยี่ยมไปเลย",Toast.LENGTH_SHORT).show()
                val n = 10
                val Ba = Intent(this@Level_1, Main2Activity::class.java)
                Ba.putExtra("EXTRA_SESSION_ID", n);
                startActivity(Ba)
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

        bt2.setOnClickListener {
            val builder = AlertDialog.Builder(this@Level_1)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                val n = 0
                val Ba1 = Intent(this@Level_1, Main2Activity::class.java)
                Ba1.putExtra("EXTRA_SESSION_ID", n);
                startActivity(Ba1)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt3.setOnClickListener {
            val builder = AlertDialog.Builder(this@Level_1)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("   >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main2Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }
        bt4.setOnClickListener {
            val builder = AlertDialog.Builder(this@Level_1)
            builder.setTitle("เสียใจด้วย  คุณตอบผิด !")
            builder.setMessage("  >>> ไม่เป็นไรนะสู้ๆ  ไป Level ต่อไปกันเถอะ")
            builder.setPositiveButton("เล่นต่อ"){dialog, which ->
                Toast.makeText(applicationContext,"สู้ๆ นะ <3 ",Toast.LENGTH_SHORT).show()
                var i = Intent(this, Main2Activity::class.java)
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(i)
            }

            val dialog: AlertDialog = builder.create()
            dialog.show()
        }




    }

}