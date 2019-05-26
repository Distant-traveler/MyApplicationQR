package com.example.a11238.myapplicationqr;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.xys.libzxing.zxing.encoding.EncodingUtils;

public class makenewcode extends AppCompatActivity {
     private EditText mInput;
     private ImageView mResult;
     private CheckBox mLogo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makenewcode);
        mInput=(EditText)findViewById(R.id.text_link);
        mResult=(ImageView) findViewById(R.id.view_made_code);
        mLogo=(CheckBox) findViewById(R.id.cb_logo);
    }
    public void make(View view){
        String input =mInput.getText().toString();
        if(input.equals("")){
            Toast.makeText(makenewcode.this,"输入不能为空",Toast.LENGTH_LONG).show();
        }else {
            Bitmap bitmap= EncodingUtils.createQRCode(input,500,500,
                    mLogo.isChecked()?
                            BitmapFactory.decodeResource(getResources(),R.drawable.logo):null);
            mResult.setImageBitmap(bitmap);
        }
    }


}
