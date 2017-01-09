package com.shendrikov.alex.colorbuttons.adapter;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

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
    public ColorButton mColorButton;
    private static String mNameId = null;
    private static GradientDrawable gradientDrawable;

    // Store a member variable for the colorButtons list
    private List<ColorButton> mColorButtonsList;
    // Store the context for easy access
    private Context mContext;

    // Pass in the colorButtons list into the constructor
    public ButtonsAdapter(Context context, List<ColorButton> colorButtonsList) {
        this.mColorButtonsList = colorButtonsList;
        mContext = context;
    }

    // Easy access to the context object in the recyclerView
    private Context getContext() {
        return mContext;
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
        mColorButton = mColorButtonsList.get(position);

        // Set item views based on your views and data model
        Button button = holder.buttonView;
        button.setText(mColorButton.getTitle());
        button.setTextColor(ContextCompat.getColor(getContext(),
                ColorButton.getColorId(mColorButton.getTitle())));

        Log.d(LOG_TAG, "Button ID = " + button.getText() + ", color = " +
                ColorButton.getColorId(mColorButton.getTitle()));
    }

    @Override
    public int getItemCount() {
        return mColorButtonsList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        @BindView(R.id.id_button)
        Button buttonView;

        public ViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
            buttonView.setOnClickListener(this);
        }

        private int defaultButtonHeight;

        @Override
        public void onClick(View view) {

            gradientDrawable = (GradientDrawable) buttonView.getBackground();

            if ( mNameId == null) {
                setNewButton(view);
                return;
            }

            if (buttonView.getText().equals(mNameId)) {
                setDefaultButton(view);
            } else {
                Toast.makeText(view.getContext(), "Press the button " + mNameId + " again",
                        Toast.LENGTH_LONG).show();
            }
        }

        private void setNewButton(View view) {
                mNameId = String.valueOf(buttonView.getText());
                Log.d(LOG_TAG, "buttonView.getText() = " + buttonView.getText() +
                        " is changed, nameId set to " + mNameId);

            //get default height of button
            defaultButtonHeight = view.getHeight();

            //extend buttonView height size
            buttonView.setHeight(defaultButtonHeight*8);

            //change color of the buttonView
            gradientDrawable.setColor(ContextCompat.getColor(view.getContext(),
                                ColorButton.getColorId(String.valueOf(buttonView.getText()))));


            //change text color of the buttonView
            buttonView.setTextColor(ContextCompat.getColor(view.getContext(),
                    R.color.colorGrey900));
        }

        private void setDefaultButton(View view) {
            mNameId = null;
            Log.d(LOG_TAG, "buttonView.getText() = " + buttonView.getText() +
                    " changed to default, nameId set to " + mNameId);

            buttonView.setHeight(defaultButtonHeight);

          //change color of the buttonView to default
            gradientDrawable.setColor(ContextCompat.getColor(view.getContext(),
                    R.color.colorGrey600));

            //change text color of the buttonView to default
            buttonView.setTextColor(ContextCompat.getColor(view.getContext(),
                                ColorButton.getColorId(String.valueOf(buttonView.getText()))));
        }
    }
}
