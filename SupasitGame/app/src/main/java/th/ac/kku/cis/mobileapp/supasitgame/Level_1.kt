package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_level_1.*

class Level_1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_level_1)
        val btnlogout: Button = findViewById(R.id.bt1)
        if (supportActionBar != null)
            supportActionBar?.hide()


        bt1.setOnClickListener {

            var i = Intent(this, Main2Activity::class.java)
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)

            val builder = AlertDialog.Builder(this@Level_1)

            builder.setTitle("App background color")

            builder.setMessage("Are you want to set the app background color to RED?")


            builder.setPositiveButton("YES"){dialog, which ->

                Toast.makeText(applicationContext,"Ok, we change the app background.",Toast.LENGTH_SHORT).show()

            }



            builder.setNegativeButton("No"){dialog,which ->
                Toast.makeText(applicationContext,"You are not agree.",Toast.LENGTH_SHORT).show()
            }



            builder.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
            }


            val dialog: AlertDialog = builder.create()


            dialog.show()
        }
    }
}
