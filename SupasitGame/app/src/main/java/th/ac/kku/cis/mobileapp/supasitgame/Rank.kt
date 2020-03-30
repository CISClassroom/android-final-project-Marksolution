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
        items = mutableListOf<Model>()
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

                        items.add(Model(i.toString(),e.child("names").value.toString(), "SCORE : "+e.child("score").value.toString()))
                        i+=1
                    }
                    items.sortBy{ it.score }
                    items.reverse()
                    i = 0
                    var j =1
                    while(i<items.size){
                        items[i].num = j.toString()
                        j+=1
                        i+=1
                    }
                    i=items.size-1
                    while(i>9){
                        items.removeAt(i)
                        i-=1
                    }

                    val adapter = Adapter(this@Rank,R.layout.activity_main11 ,items)
                    listView.adapter = adapter
                }
            }
        })

      }


    }



