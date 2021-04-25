package com.smality.roundedcornerdesign;

import androidx.appcompat.app.*;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button uploadFBtn=findViewById(R.id.uploadBtn);
        uploadFBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogBuilder= new AlertDialog.Builder(MainActivity.this);
                //Hazırladığımız Alert dialog tasarımını tanımlıyoruz.
                dialogBuilder.setView(R.layout.temp);
                final AlertDialog alertDialog= dialogBuilder.create();
                alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                alertDialog.show();
            }
        });
    }
}