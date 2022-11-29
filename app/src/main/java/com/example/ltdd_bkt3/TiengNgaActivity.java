package com.example.ltdd_bkt3;

import static java.lang.Math.log;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class TiengNgaActivity extends AppCompatActivity {

    private EditText a;
    private Button save;
    private TextView list,b;
    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiengnga);

        a = findViewById(R.id.Edt1);
        b = findViewById(R.id.Edt2);
        save = findViewById(R.id.saveBtn);
        list = findViewById(R.id.listKq);

        b.setText("Tiếng Nga:Привет друзья");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    mList.add(a.getText().toString() +"\n");
                    String res = "";
                    for(String a : mList){
                        res += a;
                    }
                    list.setText(res);
                } catch(NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(),"a is correct"+nfe,Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}