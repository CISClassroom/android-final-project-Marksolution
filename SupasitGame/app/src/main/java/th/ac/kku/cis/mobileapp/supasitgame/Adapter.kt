package th.ac.kku.cis.mobileapp.supasitgame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

public class Adapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Model>)
    : ArrayAdapter<Model>(mCtx,resource,items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout: LayoutInflater = LayoutInflater.from(mCtx)
        val v: View = layout.inflate(resource, null)

        val name: TextView = v.findViewById(R.id.textView)
        val num: TextView = v.findViewById(R.id.textView4)
        val score: TextView = v.findViewById(R.id.textView2)

        val student: Model = items[position]

        name.text = student.name
        score.text = student.score
        num.text = student.num

        return v
    }
}