package app.ij.mlwithtensorflowlite;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class DetailFruits extends AppCompatActivity {
    Button interestingButton;
    ImageView BtnFruit1,BtnFruit2,BtnFruit3,BtnFruit4,BtnFruit5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_detail);
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
        Button btnBack = findViewById(R.id.btnBack);
        TextView txtT = findViewById(R.id.txtTitle);
        ImageView imgT = findViewById(R.id.imgTitle);
        TextView txtS = findViewById(R.id.txtStory);

        Bundle extras = getIntent().getExtras();
        String story  = "Default Story Text";

        if(extras != null){
            story = extras.getString("keyStory");
            if(story.equals("storyA")){
                txtT.setText("Durian: D101");
                imgT.setImageResource(R.drawable.d101);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyB")){
                txtT.setText("Durian: D197");
                imgT.setImageResource(R.drawable.d197);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyC")){
                txtT.setText("Durian: D24");
                imgT.setImageResource(R.drawable.d24);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyD")){
                txtT.setText("Durian: D2");
                imgT.setImageResource(R.drawable.d2);
                txtS.setText("Durian D2 known as Durian sultan");
            }
            else if (story.equals("storyE")){
                txtT.setText("Durian: D175");
                imgT.setImageResource(R.drawable.d175);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
        }
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ca = new Intent(getApplicationContext(), ListFruit.class);
                startActivity(ca);
            }
        });


    }

}
