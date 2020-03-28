package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_name.*
import kotlinx.android.synthetic.main.activity_rank.*

// Model

class Rank : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)
        if (supportActionBar != null)
            supportActionBar?.hide()
        var students = mutableListOf<Model>()
        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)

        students.add(Model("1","Mas ", "SCORE : "+m, R.drawable.po))
        students.add(Model("2","Mark ", "SCORE : ", R.drawable.po))
        students.add(Model("3","Kas ", "SCORE : ", R.drawable.po))

        var listview: ListView = findViewById(R.id.itemlist)

        listview.adapter = Adapter(
            this,
            R.layout.activity_main11, students
        )
        listview.setOnItemClickListener { parent, view, position, id ->
            //Toast.makeText(this,position.toString(),Toast.LENGTH_SHORT).show()
            if (position == 0) {
                var i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }else if(position == 1) {
                var i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }else if(position == 2) {
                var i = Intent(this, MainActivity::class.java)
                startActivity(i)
            }
        }

        vv.setOnClickListener {

/*
            var i = Intent(this, MainActivity::class.java)
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)*/
        }



    }


}
