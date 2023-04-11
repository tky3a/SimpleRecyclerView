package japanese.endo.simplerecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView: View) :RecyclerView.ViewHolder(itemView){
    // Viewの中からIDを検索
    val itemName: TextView = itemView.findViewById(R.id.tv)
}