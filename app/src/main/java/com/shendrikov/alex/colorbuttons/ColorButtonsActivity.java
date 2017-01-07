package com.shendrikov.alex.colorbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.shendrikov.alex.colorbuttons.adapter.ButtonsAdapter;
import com.shendrikov.alex.colorbuttons.model.ColorButton;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ColorButtonsActivity extends AppCompatActivity  {

    public static final String LOG_TAG = "myLogs";

    @BindView(R.id.my_recycler_view)
    protected RecyclerView mRecyclerView;

    private String[] colorsNameArray = {"Red", "Orange", "Indigo", "Green", "Yellow", "Blue",
            "Pink", "Cyan", "Broun", "Amber", "Purple", "Lime", "Light Blue", "Teal",
            "Light Green", "Deep Purple", "Deep Orange", "Blue Grey"};

    private List<ColorButton> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // use a linear layout manager (vertical)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, mRecyclerView.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);


        //create and initialize list of buttons
        list = new ArrayList<>();
        for (int i = 0; i < colorsNameArray.length; i++) {
            ColorButton colorButton = new ColorButton();
            colorButton.setTitle(String.valueOf(colorsNameArray[i]));
            Log.d(LOG_TAG, "Title is " + colorButton.getTitle());
            list.add(colorButton);
        }

        // specify an adapter (see also next example)
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(list);
        mRecyclerView.setAdapter(buttonsAdapter);
    }
}
