package com.shendrikov.alex.colorbuttons.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
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

    public static final String LOG_TAG = ButtonsAdapter.class.getSimpleName();

    private ColorButton mColorButton;

    // Store a member variable for the colorButtons list
    private List<ColorButton> mColorButtonsList;
    // Store the context for easy access
    private Context mContext;

    // Pass in the colorButtons list into the constructor
    public ButtonsAdapter(Context context, List<ColorButton> colorButtonsList) {
        this.mColorButtonsList = colorButtonsList;
        mContext = context;
        notifyDataSetChanged();
    }
    private int defaultButtonHeight;

    @Override
    public ButtonsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        // Inflate the custom layout
        View colorButtonView = inflater.inflate(R.layout.item_button_list, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(colorButtonView);
        defaultButtonHeight = colorButtonView.getHeight();
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ButtonsAdapter.ViewHolder holder, final int position) {

        final int defaultColorId = mContext.getResources().getColor(R.color.colorGrey600);
        // Get the data model based on position
        mColorButton = mColorButtonsList.get(position);

        // Set item views based on your views and data model
        final Button button = holder.buttonView;
        button.setText(mColorButton.getTitle());

        final GradientDrawable gradientDrawable = (GradientDrawable) button.getBackground();

        if (!mColorButton.isSelected()) {
            rollUpButton(button, gradientDrawable, defaultColorId);

        } else {expandButton(button, gradientDrawable, defaultColorId);}

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mColorButton = mColorButtonsList.get(position);

                if (mColorButton.isSelected()) {
                    mColorButton.setSelected(false);
                    rollUpButton(button, gradientDrawable, defaultColorId);
                } else {
                    mColorButton.setSelected(true);
                    expandButton(button, gradientDrawable, defaultColorId);
                }
            }
        });
    }

    private void expandButton(Button button,
                              GradientDrawable gradientDrawable,
                              int defaultColorId) {
        button.setTextColor(defaultColorId);
        button.setHeight(800);
        gradientDrawable.setColor(mColorButton.getColorId());
    }

    private void rollUpButton(Button button,
                              GradientDrawable gradientDrawable,
                              int defaultColorId) {
        button.setTextColor(mColorButton.getColorId());
        button.setHeight(defaultButtonHeight);
        gradientDrawable.setColor(defaultColorId);
    }

    @Override
    public int getItemCount() {
        return mColorButtonsList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.id_button)
        Button buttonView;

        ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
