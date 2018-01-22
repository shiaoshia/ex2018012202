package tw.com.shiaoshia.ex2018012202;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //建立資料庫
        MyHelper helper = new MyHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
    }
}
