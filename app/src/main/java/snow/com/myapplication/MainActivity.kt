package snow.com.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dm = DisplayMetrics()
        // 取得窗口属性
        getWindowManager().getDefaultDisplay().getMetrics(dm)
        MyApplication.getInstance()!!.staticwidth = dm.widthPixels.toFloat()

        id_menulayout.setMenuItemIconsAndTexts(MyApplication.getInstance()!!.menuArray);
        id_menulayout.setOnMenuItemClickListener(object : CircleMenuLayout.OnMenuItemClickListener {
            override fun itemSelChange(pos: Int) {
                Toast.makeText(this@MainActivity , "当前选中${pos}" ,Toast.LENGTH_SHORT).show()
            }

            override fun itemClick(view: View?, pos: Int) {
            }

            override fun itemCenterClick(view: View?) {
            }
        })
    }
}
