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

class DataItem{
    companion object Factory{ // สร้างเมดทอนแบบย่อ ๆ
        fun create():DataItem = DataItem()
    }
    var Score:Float? = null
    var Names:String? = ""
    var objID:String? = ""

}

class Name : AppCompatActivity() {
    lateinit var mDB: DatabaseReference // **

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        if (supportActionBar != null)
            supportActionBar?.hide()
        var m:Int = 0
        m= intent.getIntExtra("EXTRA_SESSION_ID",0)

        tv.text =  intent.getIntExtra("EXTRA_SESSION_ID",0).toString()

        mDB = FirebaseDatabase.getInstance().reference
        bt88.setOnClickListener {
            AddData(tv.text.toString(),ed1.text.toString())
            tv.text
            val tv = Intent(this@Name, Rank::class.java)
            tv.putExtra("EXTRA_SESSION_ID", m)
            startActivity(tv)
            }
    }
    fun AddData(Score:String,name:String){
        var newData:DataItem = DataItem.create()
        val obj = mDB.child("Data_item").push()
        newData.Score = Score.toFloat()
        newData.Names = name
        newData.objID = obj.key
        obj.setValue(newData)
    }
}
