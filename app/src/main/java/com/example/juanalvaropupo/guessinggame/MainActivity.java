package com.example.juanalvaropupo.guessinggame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.hello_textView)
    protected TextView helloTextview;

    private boolean isTapped = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
    @OnClick(R.id.change_text_button)
    protected void changeText () {

        if(isTapped) {
            helloTextview.setText("Welcome to Android");
            isTapped = !isTapped;
        }else {
        helloTextview.setText("Hello again");
        isTapped = !isTapped;
    }
    }
}
