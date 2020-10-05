package kr.co.tjoeun.pizzaorderapp_20200926.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kr.co.tjoeun.pizzaorderapp_20200926.R

class PizzaStoreImg : Fragment() {

//    mStore = intent.getSerializableExtra("storeData") as Store
//
//    Glide.with(mContext).load(mStore.logoUrl).into(storeLogoImg)
//    storeNameTxt.text = mStore.brandName
//    phoneNumTxt.text = mStore.phoneNum

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_img, container, false)
    }

}