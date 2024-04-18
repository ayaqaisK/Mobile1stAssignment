package edu.sc.bzu.assignment1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    private ListView todoListView;
    private ArrayList<String> todoItems;
    private ArrayAdapter<String> adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);


            // Initialize the ListView and the ArrayList
            todoListView = findViewById(R.id.todoButton);
            todoItems = new ArrayList<>();

            // Adding some items to the list
            todoItems.add("Finish homework");
            todoItems.add("Read chapter 4");
            todoItems.add("Workout at 6 PM");

            // Initialize the ArrayAdapter
            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todoItems);

            // Set the adapter to the ListView
            todoListView.setAdapter(adapter);
    }
}