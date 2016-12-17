package com.example.user.myfifthapplication;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity implements View.OnClickListener {

    RelativeLayout contentView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        contentView = new RelativeLayout(this);

        // CREATE OUR CUSTOM STATE LIST DRAWABLE
        StateListDrawable drawable = new StateListDrawable();


        // ON PRESS/CLICK BACKGROUND
        drawable.addState(new int[]{android.R.attr.state_pressed},new ColorDrawable(Color.RED));

        // DEFAULT BACKGROUND
        drawable.addState(new int[]{}, new ColorDrawable(Color.GREEN));

        // CREATE OUR PARAM
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
        params.addRule(RelativeLayout.CENTER_IN_PARENT);

        // CREATE OUR TEXTVIEW
        textView = new TextView(this);
        textView.setText("Click Me");
        textView.setLayoutParams(params);

        // SET STATELISTDRAWABLE AS BACKGROUND
        textView.setBackgroundDrawable(drawable);


        textView.setPadding(50, 50, 50, 50);

        // SET CLICK LISTENER
        textView.setOnClickListener(this);

        contentView.addView(textView);

        setContentView(contentView);
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();


    }
}