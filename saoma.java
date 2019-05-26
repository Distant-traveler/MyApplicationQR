package com.example.a11238.myapplicationqr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class saoma extends AppCompatActivity {

    private TextView mTVResult;
    protected void onCreat(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTVResult=(TextView) findViewById(R.id.string_of_code);
    }
    public void scan(View view){
    startActivityForResult(new intent(saoma.this.CaptureActivity.calss),0);
    }
   @Override
    protected void onActivityResult(int requestCode,int resultCode ,Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        if(resultCode==RESULT_OK){
            Bundle bundle=data.getExtras();
            String result=bundle.getString("result");
            mTVResult.setText(result);
        }
    }
}
