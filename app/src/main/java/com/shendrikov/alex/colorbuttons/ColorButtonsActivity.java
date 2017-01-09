package com.shendrikov.alex.colorbuttons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

    private int[] colorsArray;
    private List<ColorButton> list;
    ColorButton colorButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // use a linear layout manager (vertical)
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, mRecyclerView.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);

        //initialize color array from color.xml
        colorsArray = getResources().getIntArray(R.array.colors);

        //create and initialize list of buttons
        list = new ArrayList<>();
        for (int i = 0; i < colorsArray.length; i++) {
            colorButton = new ColorButton(getApplicationContext());
            colorButton.setTitle(colorButton.getColorName(colorsArray[i]));

            list.add(colorButton);
        }

        // specify an adapter (see also next example)
        ButtonsAdapter buttonsAdapter = new ButtonsAdapter(getBaseContext(), list);
        mRecyclerView.setAdapter(buttonsAdapter);
    }
}
