package com.example.primaryschoolapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Dashboard extends AppCompatActivity
{
    TextView txtUserInfo;
    Button btnNotes;
    Button btnQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtUserInfo = findViewById(R.id.txtUserInfo);
        btnNotes = findViewById(R.id.btnNotes);
        btnQuiz = findViewById(R.id.btnQuiz);

        btnNotes.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {

            }
        });
    }
}