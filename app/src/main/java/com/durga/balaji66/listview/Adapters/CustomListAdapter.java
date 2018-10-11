package com.durga.balaji66.listview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.durga.balaji66.listview.ModelClass.StudentModelClass;
import com.durga.balaji66.listview.R;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {

    Context context;
    List<StudentModelClass> list;
    LayoutInflater layoutInflater;

    public CustomListAdapter(Context context, List<StudentModelClass> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null) view = View.inflate(context,R.layout.student_list, null);
        //view = View.inflate(R.layout.student_list,null);
        TextView name = view.findViewById(R.id.textViewName);
        TextView phone =view.findViewById(R.id.textViewPhone);
        TextView password = view.findViewById(R.id.textViewPassword);
        StudentModelClass student =list.get(i);
        name.setText(student.getName());
        phone.setText(student.getPhone());
        password.setText(student.getPassword());
        return view;
    }
}
