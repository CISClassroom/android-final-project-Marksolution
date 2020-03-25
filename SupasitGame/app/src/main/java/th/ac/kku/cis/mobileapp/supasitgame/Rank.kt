package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_rank.*

// Model
class DataItem{
    companion object Factory{ // สร้างเมดทอนแบบย่อ ๆ
        fun create():DataItem = DataItem()
    }
    var objID:String? = null
    var data:String = ""
}
class Rank : AppCompatActivity() {
    lateinit var mDB: DatabaseReference // **

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rank)
        if (supportActionBar != null)
            supportActionBar?.hide()
        mDB = FirebaseDatabase.getInstance().reference



        vv.setOnClickListener {
            AddData(tx1.text.toString())
/*
            var i = Intent(this, MainActivity::class.java)
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(i)*/
        }



    }
    fun AddData(data:String){
        var newData:DataItem = DataItem.create()
        val obj = mDB.child("Data_item").push()
        newData.data = data
        newData.objID = obj.key
        obj.setValue(newData)
    }

}
