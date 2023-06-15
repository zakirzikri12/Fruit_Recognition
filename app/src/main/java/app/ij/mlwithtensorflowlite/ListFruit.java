package app.ij.mlwithtensorflowlite;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ListFruit extends AppCompatActivity {
    ImageView BtnFruit1,BtnFruit2,BtnFruit3,BtnFruit4,BtnFruit5;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_list);

        BtnFruit1 = findViewById(R.id.BtnFruit1);
        BtnFruit2 = findViewById(R.id.BtnFruit2);
        BtnFruit3 = findViewById(R.id.BtnFruit3);
        BtnFruit4 = findViewById(R.id.BtnFruit4);
        BtnFruit5 = findViewById(R.id.BtnFruit5);

        BtnFruit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), MainActivity.class);
                ca.putExtra("keyStory", "storyA");
                startActivity(ca);
            }
        });

        BtnFruit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFragment.class);
                ca.putExtra("keyStory", "storyB");
                startActivity(ca);
            }
        });

        BtnFruit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFragment.class);
                ca.putExtra("keyStory", "storyC");
                startActivity(ca);
            }
        });

        BtnFruit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFragment.class);
                ca.putExtra("keyStory", "storyD");
                startActivity(ca);
            }
        });

        BtnFruit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), DetailFragment.class);
                ca.putExtra("keyStory", "storyE");
                startActivity(ca);
            }
        });

    }
}
