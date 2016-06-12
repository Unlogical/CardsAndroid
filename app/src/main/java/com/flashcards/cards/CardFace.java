package com.flashcards.cards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CardFace extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_face_activity);

        ImageView imageView = (ImageView) findViewById(R.id.card_face_image);
        TextView imageLabel = (TextView) findViewById(R.id.card_face_image_label);
        Button spinButton = (Button) findViewById(R.id.card_face_spin_card_button);

        final int position = getIntent().getIntExtra(RecyclerViewAdapter.EXTRA_POSITION, 0);

        switch (position) {
            case 0: imageView.setImageDrawable(getDrawable(R.drawable.image_5));
                imageLabel.setText("Тут текст для первой стороны карточки из первого набора." +
                        " Может быть вопрос, а может и нет, кто знает?");
                break;
            case 1: imageView.setImageDrawable(getDrawable(R.drawable.image_6));
                imageLabel.setText("Тут текст для первой стороны карточки из второго набора." +
                        " Может быть вопрос, а может и нет, кто знает?");
                break;
            case 2: imageView.setImageDrawable(getDrawable(R.drawable.image_7));
                imageLabel.setText("Тут текст для первой стороны карточки из третьего набора." +
                        " Может быть вопрос, а может и нет, кто знает?");
                break;
            case 3: imageView.setImageDrawable(getDrawable(R.drawable.image_8));
                imageLabel.setText("Тут текст для первой стороны карточки из четвертого набора." +
                        " Может быть вопрос, а может и нет, кто знает?");
                break;
        }

        spinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardFace.this, CardBack.class);
                intent.putExtra(RecyclerViewAdapter.EXTRA_POSITION, position);
                startActivity(intent);
            }
        });

    }
}
