package com.example.srs6_lyapynova;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder>{
    private final LayoutInflater inflater;
    private final List<Weather> weather;
    private final Context context;

        public WeatherAdapter(Context context, List<Weather>weather)
        {
            this.inflater= LayoutInflater.from(context);
            this.weather= weather;
            this.context= context;
        }
        @NonNull
        @Override
        public WeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull WeatherAdapter.ViewHolder holder, int position) {
            Weather w = weather.get(position);
            Picasso.get().load(w.GetUrl()).fit().centerInside().into(holder.flagView);
            holder.dateView.setText(w.GetDate());
            holder.degreeView.setText(w.GetTemp());
        }

        @Override
        public int getItemCount() {
            return weather.size();
        }
        public static class ViewHolder extends RecyclerView.ViewHolder{
            final ImageView flagView;
            final TextView dateView, degreeView;

            ViewHolder(View view){
                super(view);
                flagView= view.findViewById(R.id.flag);
                dateView= view.findViewById(R.id.date);
                degreeView= view.findViewById(R.id.degree);
            }
        }





}



