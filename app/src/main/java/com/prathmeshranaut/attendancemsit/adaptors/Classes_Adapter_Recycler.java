package com.prathmeshranaut.attendancemsit.adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.general.Classes;

import java.util.ArrayList;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Classes_Adapter_Recycler extends RecyclerView.Adapter<Classes_Adapter_Recycler.ViewHolder>  {
    Context mContext;
    ArrayList<Classes> classes= new ArrayList<>();
    public Classes_Adapter_Recycler(ArrayList<Classes> classes)
    {
        this.classes=classes;
    }
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.classes_single_view, parent, false);

        // Return a new holder instance
        RecyclerView.ViewHolder viewHolder = new ViewHolder(contactView);
        return (ViewHolder) viewHolder;
    }



    public Classes_Adapter_Recycler(Context context,ArrayList<Classes> classes)
    {
        this.mContext=context;
        this.classes=classes;
    }
    @Override
    public int getItemCount() {
        return classes.size();
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.coursename.setText(classes.get(position).getName());
        holder.subjectname.setText(classes.get(position).getSubject());
        holder.number.setText(classes.get(position).getNumber_of_students());


    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
          TextView coursename;
           TextView subjectname;
        TextView number;


        public ViewHolder(View itemView) {
            super(itemView);
            coursename=(TextView)itemView.findViewById(R.id.course_name_textView);
            subjectname=(TextView)itemView.findViewById(R.id.subject_nametextView);
            number=(TextView)itemView.findViewById(R.id.number_of_st_textView);

        }
    }
}
