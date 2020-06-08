package com.example.quizzinga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

public class EventAdapter extends FirebaseRecyclerAdapter<Event, EventAdapter.EventViewHolder>{
        private Context context;

    public EventAdapter(@NonNull FirebaseRecyclerOptions<Event> options, Context context) {
        super(options);
        this.context = context;
    }

    public EventAdapter(@NonNull FirebaseRecyclerOptions<Event> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull EventViewHolder holder, int position, @NonNull Event model) {
        holder.event_name.setText(model.getEvent_name());
        holder.theme.setText(model.getTheme());
        holder.venue.setText(model.getVenue());
        holder.date.setText(model.getDate());
        holder.time.setText(model.getTime());
       try {
           Picasso.with(context).load(model.getImage_url()).into(holder.event_img);
       }
       catch (Exception e){
       }
    }

    @NonNull
    @Override
    public EventViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        return new EventViewHolder(view);
    }

    class EventViewHolder extends RecyclerView.ViewHolder{

        TextView event_name,theme,venue,time,date;
        ImageView event_img;

        public EventViewHolder(@NonNull View itemView) {
            super(itemView);

            event_name = itemView.findViewById(R.id.event_name);
            theme = itemView.findViewById(R.id.theme);
            venue = itemView.findViewById(R.id.venue);
            date = itemView.findViewById(R.id.date);
            time = itemView.findViewById(R.id.time_event);
            event_img = itemView.findViewById(R.id.event_img);
        }
    }

}