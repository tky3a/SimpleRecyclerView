package japanese.endo.simplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// <>は型を定義している
class RecyclerAdapter :RecyclerView.Adapter<ViewHolderItem>() {
    // 表示するリストを用意
    private val animalList = listOf(
        "ライオン","クマ", "キリン", "ゾウ", "パンダ", "コアラ", "キリン", "サル", "ヒョウ", "ゴリラ",
        "トラ", "ウサギ", "カバ", "ガメラ", "カメ"
    )

    // 1行分のレイアウトを生成
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout, parent, false)
        // ViewHolderItem　classを返す
        return ViewHolderItem(itemXml)
    }

    // n番目のデータをレイアウト(xml)に表示するようにセット
    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.itemName.text = animalList[position]
    }

    // データが何件あるかをカウント
    override fun getItemCount(): Int {
        return animalList.size
    }
}