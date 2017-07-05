package com.prathmeshranaut.attendancemsit.adaptors;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.prathmeshranaut.attendancemsit.R;
import com.prathmeshranaut.attendancemsit.general.Add_Instance;
import com.prathmeshranaut.attendancemsit.general.Classes;
import com.prathmeshranaut.attendancemsit.general.Student_single;

import java.util.ArrayList;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Student_single_Adapter_Recycler extends RecyclerView.Adapter<Student_single_Adapter_Recycler.ViewHolder>   {
    Context mContext;
    ArrayList<Student_single> student_singles= new ArrayList<>();
    public Student_single_Adapter_Recycler(ArrayList<Student_single> student_singles)
    {
        this.student_singles=student_singles;
    }
    public Student_single_Adapter_Recycler.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.student_single_view, parent, false);

        // Return a new holder instance
        RecyclerView.ViewHolder viewHolder = new Classes_Adapter_Recycler.ViewHolder(contactView);
        return (Student_single_Adapter_Recycler.ViewHolder) viewHolder;

    }

    public Student_single_Adapter_Recycler(Context context,ArrayList<Student_single> student_singles)
    {
        this.mContext=context;
        this.student_singles=student_singles;
    }
    @Override
    public int getItemCount() {
        return student_singles.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

       holder.student_name.setText(student_singles.get(position).getName());
       holder.rollno.setText(student_singles.get(position).getRollno());
        holder.present.setText(student_singles.get(position).getPresent());
        holder.present.setText(student_singles.get(position).getPresent());
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView student_name;
        TextView rollno;
        TextView present;
        TextView absent;


        public ViewHolder(View itemView) {
            super(itemView);
            student_name=(TextView)itemView.findViewById(R.id.student_name_textView);
            rollno=(TextView)itemView.findViewById(R.id.rollno_textView);
            present=(TextView)itemView.findViewById(R.id.present_textView);
            absent=(TextView)itemView.findViewById(R.id.absent_textView);

        }
    }
}

