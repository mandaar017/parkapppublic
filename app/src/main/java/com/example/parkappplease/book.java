package com.example.parkappplease;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class book extends AppCompatActivity {

    private TextView text;
    private ImageView img;
    private ImageView img1;
    private ImageView clk;
    private ImageView clk1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_book);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Intent intent = getIntent();


        img = findViewById(R.id.imageView26);
        img1 = findViewById(R.id.imageView29);
        clk = findViewById(R.id.imageView28);
        clk1 = findViewById(R.id.imageView30);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.textView27);
                opendialog();

            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = findViewById(R.id.textView30);
                opendialog();

            }
        });

        clk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=findViewById(R.id.textView29);
                opendialog1();

            }
        });

        clk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text=findViewById(R.id.textView31);
                opendialog1();

            }
        });


    }
    private void opendialog() {
        DatePickerDialog d= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                text.setText(String.valueOf(year)+"/"+String.valueOf(month+1)+"/"+String.valueOf(dayOfMonth));
            }
        }, 2024, 6, 13);

        d.show();
    }

    private void opendialog1() {
        TimePickerDialog t= new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                text.setText(String.valueOf(hourOfDay)+":"+String.valueOf(minute));
            }
        }, 14, 53, true);

        t.show();

    }




}