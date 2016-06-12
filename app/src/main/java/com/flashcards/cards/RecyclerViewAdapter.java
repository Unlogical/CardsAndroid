package com.flashcards.cards;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    public static final String EXTRA_POSITION = "extra_position";
    List<String> imageLabelsList;

    public RecyclerViewAdapter(List<String> imageLabelsList) {
        this.imageLabelsList = imageLabelsList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_adapter_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        final Context context = holder.itemView.getContext();
        ImageView image = (ImageView) holder.itemView.findViewById(R.id.recycler_view_list_item_image);
        TextView imageLabel = (TextView) holder.itemView.findViewById(R.id.recycler_view_list_item_label);
        switch (position) {
            case 0:
                image.setImageDrawable(context.getDrawable(R.drawable.image_1));
                break;
            case 1:
                image.setImageDrawable(context.getDrawable(R.drawable.image_2));
                break;
            case 2:
                image.setImageDrawable(context.getDrawable(R.drawable.image_3));
                break;
            case 3:
                image.setImageDrawable(context.getDrawable(R.drawable.image_4));
                break;
        }
        imageLabel.setText(imageLabelsList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CardFace.class);
                intent.putExtra(EXTRA_POSITION, position);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return imageLabelsList.size();
    }

    private static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
