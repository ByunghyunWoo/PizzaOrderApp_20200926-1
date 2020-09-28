package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import android.content.Context
import android.content.Intent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_pizza_store_list_view.*
import kr.co.tjoeun.pizzaorderapp_20200926.R
import kr.co.tjoeun.pizzaorderapp_20200926.ViewStoreDetailActivity
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store
import kr.co.tjoeun.pizzaorderapp_20200926.fragments.PizzaStoreRecyclerViewFragment

class RecyclerViewStoreAdapter(
    val mContext: Context,
    val resId:Int,
    val mStore:ArrayList<Store>):RecyclerView.Adapter<RecyclerViewStoreAdapter.RecyclerViewHolder>() {
    val mPizzaStoreList = ArrayList<Store>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.store_recycler_item,parent,false)  // 너였냐?
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 4   // 흠..?
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        holder.bind(mStore[position], mContext)
    }



    inner class RecyclerViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){

        val logoImg = itemView?.findViewById<ImageView>(R.id.logoImg)
        val brandNameTxt = itemView?.findViewById<TextView>(R.id.brandNameTxt)

        fun bind(storeData : Store, mcontext:Context){
            brandNameTxt?.text = storeData.brandName
            Glide.with(mContext).load(storeData.logoUrl).into(logoImg!!)
        }



    }

}