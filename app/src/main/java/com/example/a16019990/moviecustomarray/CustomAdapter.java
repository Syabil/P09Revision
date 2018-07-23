package com.example.a16019990.moviecustomarray;

import android.content.Context;
import java.util.ArrayList;
import java.util.Calendar;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contacts> thingList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Contacts> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        thingList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvCountryCode = rowView.findViewById(R.id.textViewCountryCode);
        TextView tvPhoneNum = rowView.findViewById(R.id.textViewPhoneNum);
        Contacts currentItem = thingList.get(position);
        String name = currentItem.getName();
        int countryCode = currentItem.getCountryCode();
        int phoneNum = currentItem.getPhoneNum();
        tvName.setText(name);
        tvCountryCode.setText(String.valueOf(countryCode));
        tvPhoneNum.setText(String.valueOf(phoneNum));
        return rowView;
    }
}

