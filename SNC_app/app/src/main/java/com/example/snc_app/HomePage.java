package com.example.snc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HomePage extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        listView = findViewById(R.id.videoList);

        String[] values = new String[]{
                "video1","video2","video3","video4","video5","video6","video7","video8","video9","video10",
                "video11","video12","video13","video14","video15","video16","video17","video18","video19","video20"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                if (position >= 0 && position<20){
                    Intent playVideo = new Intent(view.getContext(), videoPlayer.class);
                    startActivity(playVideo);
                }
            }
        });
    }


}
