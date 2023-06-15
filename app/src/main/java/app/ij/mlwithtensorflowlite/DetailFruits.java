package app.ij.mlwithtensorflowlite;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DetailFruits extends AppCompatActivity {
    Button interestingButton;
    ImageView BtnFruit1,BtnFruit2,BtnFruit3,BtnFruit4,BtnFruit5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_page);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        interestingButton = findViewById(R.id.interestingButton);
//        interestingButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Perform your desired action when the button is clicked
//                // For example, you can display a toast message
//                Toast.makeText(DetailFruits.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });


    }

}
