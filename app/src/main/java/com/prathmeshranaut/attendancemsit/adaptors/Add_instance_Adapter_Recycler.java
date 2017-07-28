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

import java.util.ArrayList;

/**
 * Created by Jatin on 6/28/2017.
 */

public class Add_instance_Adapter_Recycler extends RecyclerView.Adapter<Add_instance_Adapter_Recycler.ViewHolder>   {
    Context mContext;
    ArrayList<Add_Instance> add_instances= new ArrayList<>();
    public Add_instance_Adapter_Recycler(ArrayList<Add_Instance> add_instances)
    {
        this.add_instances=add_instances;
    }
//    public Add_instance_Adapter_Recycler.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        Context context = parent.getContext();
//        LayoutInflater inflater = LayoutInflater.from(context);
//
//        // Inflate the custom layout
//        View contactView = inflater.inflate(R.layout.add_instance_single_view, parent, false);
//
//        // Return a new holder instance
//        RecyclerView.ViewHolder viewHolder = new Classes_Adapter_Recycler.ViewHolder(contactView);
//        return (Add_instance_Adapter_Recycler.ViewHolder) viewHolder;
//    }
@Override
public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    Context context = parent.getContext();
    LayoutInflater inflater = LayoutInflater.from(context);

    // Inflate the custom layout
    View contactView = inflater.inflate(R.layout.add_instance_single_view, parent, false);

    // Return a new holder instance
    ViewHolder viewHolder = new ViewHolder(contactView);
    return viewHolder;
}


    public Add_instance_Adapter_Recycler(Context context,ArrayList<Add_Instance> add_instances)
    {
        this.mContext=context;
        this.add_instances=add_instances;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.date.setText(add_instances.get(position).getCurrent_date());
        holder.time.setText(add_instances.get(position).getCurrent_time());
        holder.number_of_present.setText(add_instances.get(position).getNo_of_present());
        holder.number_of_absent.setText(add_instances.get(position).getNo_of_absent());



    }
    @Override
    public int getItemCount() {
        return add_instances.size();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView date;
        TextView time;
        TextView number_of_present;
        TextView number_of_absent;

        public ViewHolder(View itemView) {
            super(itemView);
            date=(TextView)itemView.findViewById(R.id.current_date_textView1);
            time=(TextView)itemView.findViewById(R.id.curremt_time_textView);
            number_of_present=(TextView)itemView.findViewById(R.id.no_of_presents_textView);
            number_of_absent=(TextView)itemView.findViewById(R.id.no_of_absent_textView);

        }
    }
}
