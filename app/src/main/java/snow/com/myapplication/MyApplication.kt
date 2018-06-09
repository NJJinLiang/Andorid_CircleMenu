package snow.com.myapplication

import android.app.Application

open class MyApplication : Application(){
    var menuArray = arrayOf("item0", "item1", "item2", "item3", "item4")

    var staticwidth = 0f //屏幕宽度
    companion object {
        var mInstance: MyApplication? = null
        fun getInstance(): MyApplication? {
            if (mInstance == null) {
                mInstance = MyApplication()
            }
            return mInstance
        }
    }

    override fun onCreate() {
        super.onCreate()
        mInstance = this
    }
}