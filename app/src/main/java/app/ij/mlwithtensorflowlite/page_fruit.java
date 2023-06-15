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


public class page_fruit extends AppCompatActivity {
    Button interestingButton;
    ImageView BtnFruit1,BtnFruit2,BtnFruit3,BtnFruit4,BtnFruit5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_list);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        interestingButton = findViewById(R.id.interestingButton);
//        interestingButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Perform your desired action when the button is clicked
//                // For example, you can display a toast message
//                Toast.makeText(page_fruit.this, "Button Clicked!", Toast.LENGTH_SHORT).show();
//            }
//        });

        BtnFruit1 = findViewById(R.id.BtnFruit1);
        BtnFruit2 = findViewById(R.id.BtnFruit2);
        BtnFruit3 = findViewById(R.id.BtnFruit3);
        BtnFruit4 = findViewById(R.id.BtnFruit4);
        BtnFruit5 = findViewById(R.id.BtnFruit5);

        BtnFruit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFruits.class);
                ca.putExtra("keyStory", "storyA");
                startActivity(ca);
            }
        });

        BtnFruit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFruits.class);
                ca.putExtra("keyStory", "storyB");
                startActivity(ca);
            }
        });

        BtnFruit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFruits.class);
                ca.putExtra("keyStory", "storyC");
                startActivity(ca);
            }
        });

        BtnFruit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFruits.class);
                ca.putExtra("keyStory", "storyD");
                startActivity(ca);
            }
        });

        BtnFruit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFruits.class);
                ca.putExtra("keyStory", "storyE");
                startActivity(ca);
            }
        });

    }

}
