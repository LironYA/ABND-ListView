package com.example.android.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] values = new String[]{"Option 1", "Option 2"}; // Set an array for the main values (this is not mandatory)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Set Content to the main activity (XML)
        CustomListAdapter adapter = new CustomListAdapter(this, values); //Defining a custom list adapter to handle the listview items
        list = (ListView) findViewById(R.id.list); //Define the list
        list.setAdapter(adapter); //Set the adapter we wrote earlier - now referring to the CustomArrayAdapter class.
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() { //Setting up what will happen on click.
        /*In this case, just opening a new activity
            Handeling touch events on a ListView - we would like to open a new activity once clicked, we are using the
            set onItemClickListener, which is an interface like the onClickListener. an interface contains one or more abstract
            methods that we can use to interact with an object but we need to define the methods ourselfs.
            */
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                //On click opening a new activity
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), FirstActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), SecondActivity.class);
                    startActivityForResult(myIntent, 1);
                }
            }});}}