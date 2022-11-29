package com.example.ltdd_bkt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<ModelEng> mList;
        Adapter adapter;

        listView = findViewById(R.id.listView);
        mList = new ArrayList<>();
        mList.add(new ModelEng("Tiếng Việt"));
        mList.add(new ModelEng("Tiếng Anh"));
        mList.add(new ModelEng("Tiếng Pháp"));
        mList.add(new ModelEng("Tiếng Nga"));
        mList.add(new ModelEng("TIếng Hàn Quốc"));
        mList.add(new ModelEng("TIếng Nhật Bản"));


        adapter = new Adapter(MainActivity.this,R.layout.layout_item,mList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                int key = i;
                switch ( key ) {
                    case  0:
                        intent = new Intent(MainActivity.this,TiengVietActivity.class);
                        startActivity(intent);
                        break;
                    case  1:
                        intent = new Intent(MainActivity.this,TiengAnhActivity.class);
                        startActivity(intent);
                        break;
                    case  2:
                        intent = new Intent(MainActivity.this,TiengPhapActivity.class);
                        startActivity(intent);
                        break;
                    case  3:
                        intent = new Intent(MainActivity.this,TiengNgaActivity.class);
                        startActivity(intent);
                        break;
                    case  4:
                        intent = new Intent(MainActivity.this,TiengHanActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        // Làm gì đó tại đây ...
                }
            }
        });
    }
}