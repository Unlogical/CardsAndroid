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
        List<Drawable> imageList = new ArrayList<>();
        imageList.add(getDrawable(R.drawable.image_1));
        imageList.add(getDrawable(R.drawable.image_2));
        imageList.add(getDrawable(R.drawable.image_3));
        imageList.add(getDrawable(R.drawable.image_4));
        List<String> imageLabelList = new ArrayList<>();
        imageLabelList.add("Image 1");
        imageLabelList.add("Image 2");
        imageLabelList.add("Image 3");
        imageLabelList.add("Image 4");

        RecyclerView.Adapter adapter = new RecyclerViewAdapter(imageList, imageLabelList);
        imageRecyclerView.setAdapter(adapter);
        imageRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
