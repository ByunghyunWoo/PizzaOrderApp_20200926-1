package kr.co.tjoeun.pizzaorderapp_20200926.adapters

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kr.co.tjoeun.pizzaorderapp_20200926.R
import kr.co.tjoeun.pizzaorderapp_20200926.ViewStoreDetailActivity
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store

class RecyclerViewStoreAdapter(
    val mContext: Context,
    val resId: Int,
    val mStore: ArrayList<Store>
) : RecyclerView.Adapter<RecyclerViewStoreAdapter.RecyclerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(mContext)
            .inflate(R.layout.store_recycler_item, parent, false)  // 너였냐?
        return RecyclerViewHolder(view)
//            .apply {
//                itemView.setOnClickListener {
//
//                    val clickedStore: Int = adapterPosition
//                    val myIntent = Intent(mContext, ViewStoreDetailActivity::class.java)
//                    myIntent.putExtra("storeData", clickedStore)
//
//                    startActivity(myIntent)
//                }
//            }

                    //???


    }

    override fun getItemCount(): Int {
        return mStore.size   //
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(mStore[position], mContext)
    }


    inner class RecyclerViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {

        val logoImg = itemView?.findViewById<ImageView>(R.id.logoImg)
        val brandNameTxt = itemView?.findViewById<TextView>(R.id.brandNameTxt)


        fun bind(storeData: Store, mcontext: Context) {
            brandNameTxt?.text = storeData.brandName
            Glide.with(mContext).load(storeData.logoUrl).into(logoImg!!)
//            itemView.setOnClickListener { itemClick(storeData) }
        }
    }
}
