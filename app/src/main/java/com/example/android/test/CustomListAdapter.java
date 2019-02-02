package com.example.android.test;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context; //context for the CustomListAdapter
    private final String[] itemname;

    public CustomListAdapter(Activity context, String[] itemname) {
        super(context, R.layout.mylist, itemname); //Telling the adapter which layout it should look for - in this case, mylist
        this.context = context;
        this.itemname=itemname;

    }
    @NonNull
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);

        txtTitle.setText(itemname[position]);
        extratxt.setText("Start "+itemname[position] + " challenge");
        return rowView;

    };
}
