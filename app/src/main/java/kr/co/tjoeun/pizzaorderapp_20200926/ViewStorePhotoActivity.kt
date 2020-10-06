package kr.co.tjoeun.pizzaorderapp_20200926

import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_view_store_photo.storeFullImg
import kr.co.tjoeun.pizzaorderapp_20200926.datas.Store

class ViewStorePhotoActivity : BaseActivity() {

    lateinit var mStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_photo)
        Log.d("확인1","확인1")
        setupEvents()
        Log.d("확인2","확인2")
        setValues()
        Log.d("확인3","확인3")
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mStore = intent.getSerializableExtra("storeData1") as Store
        Log.d("확인","?????")
        Glide.with(mContext).load(mStore.logoUrl).into(storeFullImg)
        Log.d("확인","?????")
//        storeNameTxt.text = mStore.brandName
//        phoneNumTxt.text = mStore.phoneNum
    }
}