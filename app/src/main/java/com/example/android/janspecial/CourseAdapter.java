package com.example.android.janspecial;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseAdapterViewHolder>{
    private String[] mCourses;

    @NonNull
    @Override
    public CourseAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();///////
        int courseXML = R.layout.courses_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
       View view = inflater.inflate(courseXML, parent,false);
        return new CourseAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseAdapterViewHolder holder, int position) {
        String currentCourse = mCourses[position];
        holder.tex.setText(currentCourse);

    }
    void setmCourses(String[] coursesAvail){
        mCourses=coursesAvail;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if (mCourses==null){
            return 0;
        }else {return mCourses.length;}

    }

    class CourseAdapterViewHolder extends RecyclerView.ViewHolder{
        public CardView mCoursesAvailable;
        public TextView tex;

        public CourseAdapterViewHolder(View itemView) {
            super(itemView);
            mCoursesAvailable = (CardView) itemView.findViewById(R.id.cv_available_courses);
            tex = (TextView) itemView.findViewById(R.id.tv_av);


        }

    }

}
