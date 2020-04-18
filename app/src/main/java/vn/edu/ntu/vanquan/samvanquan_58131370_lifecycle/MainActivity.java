package vn.edu.ntu.vanquan.samvanquan_58131370_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate duoc goi");
        Toast.makeText(getApplicationContext(),"onCreate duoc goi",Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.txtTG);
        SimpleDateFormat spf  = new SimpleDateFormat("hh:mm:ss");
        String strDate = spf.format(new Date());
        txtTG.setText(strDate);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart duoc goi");
        Toast.makeText(getApplicationContext(),"onStart duoc goi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume duoc goi");
        Toast.makeText(getApplicationContext(),"onResum duoc goi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop duoc goi");
        Toast.makeText(getApplicationContext(),"onStop duoc goi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart duoc goi");
        Toast.makeText(getApplicationContext(),"onRestart duoc goi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause duoc goi");
        Toast.makeText(getApplicationContext(),"onPause duoc goi",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy duoc goi");
        Toast.makeText(getApplicationContext(),"onDestroy duoc goi",Toast.LENGTH_SHORT).show();
    }
}
