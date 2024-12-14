package com.example.revify;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ViewHolder> {
    private String[] places; // The places (15 items)
    private Integer[] img; // The image resources
    private Context context;

    public LocationAdapter(Context context, String[] places, Integer[] img) {
        this.context = context;
        this.places = places;
        this.img = img;
    }

    // ViewHolder class for RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.location_view, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(places[position]);
        holder.imageView.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return places.length;
    }
}
