package com.flashcards.cards;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class CardBack extends AppCompatActivity {

    private final View.OnClickListener ratingButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(CardBack.this, MainActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_back_activity);

        ImageView imageView = (ImageView) findViewById(R.id.card_back_image);
        TextView imageLabel = (TextView) findViewById(R.id.card_back_image_label);
        Button spinButton = (Button) findViewById(R.id.card_back_spin_card_button);
        ImageButton lowMarkButton = (ImageButton) findViewById(R.id.card_back_mark_low_button);
        ImageButton middleMarkButton = (ImageButton) findViewById(R.id.card_back_mark_middle_button);
        ImageButton highMarkButton = (ImageButton) findViewById(R.id.card_back_mark_high_button);
        lowMarkButton.setOnClickListener(ratingButtonListener);
        middleMarkButton.setOnClickListener(ratingButtonListener);
        highMarkButton.setOnClickListener(ratingButtonListener);

        final int position = getIntent().getIntExtra(RecyclerViewAdapter.EXTRA_POSITION, 0);

        switch (position) {
            case 0: imageView.setImageDrawable(getDrawable(R.drawable.image_9));
                imageLabel.setText("Тут текст для второй стороны карточки из первого набора." +
                        " Может быть ответ, а может и нет, кто знает?");
                break;
            case 1: imageView.setImageDrawable(getDrawable(R.drawable.image_10));
                imageLabel.setText("Тут текст для второй стороны карточки из второго набора." +
                        " Может быть ответ, а может и нет, кто знает?");
                break;
            case 2: imageView.setImageDrawable(getDrawable(R.drawable.image_11));
                imageLabel.setText("Тут текст для второй стороны карточки из третьего набора." +
                        " Может быть ответ, а может и нет, кто знает?");
                break;
            case 3: imageView.setImageDrawable(getDrawable(R.drawable.image_12));
                imageLabel.setText("Тут текст для второй стороны карточки из четвертого набора." +
                        " Может быть ответ, а может и нет, кто знает?");
                break;
        }

        spinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CardBack.this, CardFace.class);
                intent.putExtra(RecyclerViewAdapter.EXTRA_POSITION, position);
                startActivity(intent);
            }
        });



    }
}
