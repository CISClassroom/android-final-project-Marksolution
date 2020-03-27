package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main10.*
import kotlinx.android.synthetic.main.activity_name.*
import kotlinx.android.synthetic.main.activity_rank.*

class DatItem{
    companion object Factory{ // สร้างเมดทอนแบบย่อ ๆ
        fun create():DatItem = DatItem()
    }
    var objID:String? = null
    var data:String = ""
}

class Name : AppCompatActivity() {
    lateinit var mDB: DatabaseReference // **
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        if (supportActionBar != null)
            supportActionBar?.hide()

        tv.text =  intent.getIntExtra("EXTRA_SESSION_ID",0).toString()

        mDB = FirebaseDatabase.getInstance().reference
        bt88.setOnClickListener {
            AddData(ed1.text.toString())
            tv.text
            val tv = Intent(this@Name, Rank::class.java)
            tv.putExtra("EXTRA_SESSION_ID", tv)
            startActivity(tv)
            }
    }
    fun AddData(data:String){
        var newData:DatItem = DatItem.create()
        val obj = mDB.child("Data_item").push()
        newData.data = data
        newData.objID = obj.key
        obj.setValue(newData)
    }
}
