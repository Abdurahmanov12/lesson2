package com.example.lesson1;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView id, label, description, date;
    private ConstraintLayout constraintLayout;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.tv_id);
        label = itemView.findViewById(R.id.tv_label);
        description = itemView.findViewById(R.id.tv_description);
        date = itemView.findViewById(R.id.tv_date);
        constraintLayout = itemView.findViewById(R.id.text_v);
    }

    public void onBind(Model s) {
        id.setText(String.valueOf(getAdapterPosition()+1));
        label.setText(s.getTitle());
        description.setText(s.getDescription());
        date.setText(s.getDate());
    }
}
