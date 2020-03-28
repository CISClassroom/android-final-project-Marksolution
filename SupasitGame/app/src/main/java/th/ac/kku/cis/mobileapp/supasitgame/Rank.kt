package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_name.*
import kotlinx.android.synthetic.main.activity_rank.*

// Model

class Rank : AppCompatActivity() {
    lateinit var listView: ListView
    lateinit var ref: DatabaseReference
    lateinit var items:MutableList<Model>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)
        if (supportActionBar != null)
            supportActionBar?.hide()
        var students = mutableListOf<Model>()
        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)
        listView = findViewById(R.id.itemlist)
        items = mutableListOf()
        var listview: ListView = findViewById(R.id.itemlist)

        listview.adapter = Adapter(
            this,
            R.layout.activity_main11, items
        )

        ref = FirebaseDatabase.getInstance().reference.child("Data_item")
        ref.addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }
            override fun onDataChange(p0: DataSnapshot) {
                items.clear()
                if(p0!!.exists()){
                    items.clear()
                    var i = 1
                    for (e in p0.children){
                      //  val rec = e.getValue(Model::class.java)
                       // items.add(rec!!)
                        items.add(Model(i.toString(),e.child("names").value.toString(), "SCORE : "+e.child("score").value.toString()))
                        i+=1
                    }
                    val adapter = Adapter(this@Rank,R.layout.activity_main11 ,items)
                    listView.adapter = adapter
                }
            }
        })

        /*
        students.add(Model("1","Mas ", "SCORE : "+m))
        students.add(Model("2","Mark ", "SCORE : "))
        students.add(Model("3","Kas ", "SCORE : "))

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
        */


    }


}
