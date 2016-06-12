package com.flashcards.cards;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        RecyclerView imageRecyclerView = (RecyclerView) findViewById(R.id.main_activity_image_list);
        List<String> imageLabelList = new ArrayList<>();
        imageLabelList.add("Название первого набора");
        imageLabelList.add("Название второго набора");
        imageLabelList.add("Название третьего набора");
        imageLabelList.add("Название четвёртого набора");

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(imageLabelList);
        imageRecyclerView.setAdapter(adapter);
        imageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
