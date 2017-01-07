package com.shendrikov.alex.colorbuttons.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.shendrikov.alex.colorbuttons.R;
import com.shendrikov.alex.colorbuttons.model.ColorButton;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Alex on 06.01.2017.
 */

public class ButtonsAdapter extends RecyclerView.Adapter<ButtonsAdapter.ViewHolder> {

    public static final String LOG_TAG = "myLogs";

    // Store a member variable for the colorButtons list
    private List<ColorButton> mColorButtonsList;

    // Pass in the colorButtons list into the constructor
    public ButtonsAdapter(List<ColorButton> colorButtonsList) {
        this.mColorButtonsList = colorButtonsList;
    }

    // Involves inflating a layout from XML and returning the holder
    @Override
    public ButtonsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflate the custom layout
        View colorButtonView = inflater.inflate(R.layout.item_button_list, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(colorButtonView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ButtonsAdapter.ViewHolder holder, int position) {

        // Get the data model based on position
        ColorButton colorButton = mColorButtonsList.get(position);

        // Set item views based on your views and data model
        Button button = holder.colorButton;
        button.setText(colorButton.getTitle());
    }

    @Override
    public int getItemCount() {
        return mColorButtonsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id_button)
        Button colorButton;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
        }
    }
}
