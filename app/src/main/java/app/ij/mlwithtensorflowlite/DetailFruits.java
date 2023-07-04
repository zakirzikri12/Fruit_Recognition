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
        TextView txtS1 = findViewById(R.id.txtStory1);
        TextView txtS2 = findViewById(R.id.txtStory2);


        Bundle extras = getIntent().getExtras();
        String story  = "Default Story Text";

        if(extras != null){
            story = extras.getString("keyStory");
            if(story.equals("storyA")){
                txtT.setText("Durian: D101");
                imgT.setImageResource(R.drawable.d101);
                txtS.setText("Known as Durian IOI");
                txtS1.setText("Characteristics: dull yellow and slightly sweet and creamy. The texture of this type of durian is very soft.Fruits from old trees carry a mild astringent aftertaste");
                txtS2.setText("Others: the price is also not too expensive when compared to other premium types of durian");
            }
            else if (story.equals("storyB")){
                txtT.setText("Durian: D197");
                imgT.setImageResource(R.drawable.d197);
                txtS.setText("Known as Durian Musang king (king of fruit)");
                txtS1.setText("Characteristics: The king is known for its thick flesh, small core and melts-in-your-mouth goodness. its long finish has layered complexity, bittersweet in a savoury aftertaste");
                txtS2.setText("Other: Musang King is often considered one of the best varieties in terms of taste and texture");
            }
            else if (story.equals("storyC")){
                txtT.setText("Durian: D24");
                imgT.setImageResource(R.drawable.d24);
                txtS.setText("Also known as Durian Sultan or Durian Bukit Merah");
                txtS1.setText("Characteristics: Its creamy texture has wholesome yeasty sweetness with a pleasant astringent pull on tongue (strong bitter-sweet). A connoisseur's favorite");
                txtS2.setText("Others: one of the ways to identify durian D24 is that there is an imperfect space in the middle of the D24 square ");
            }
            else if (story.equals("storyD")){
                txtT.setText("Durian: D2");
                imgT.setImageResource(R.drawable.d2);
                txtS.setText("Durian D2 known as Dato Nina");
                txtS1.setText("Characteristics: The fruit is medium in size, slightly oval and the skin is bronze green. The spines of the fruit are short, the skin is thin but difficult to open if the new fruit falls. Fruit stalks are short and large");
                txtS2.setText("Others: Its golden finish features a mild astringent note complimented by a layer of delicate sweetness");
            }
            else if (story.equals("storyE")){
                txtT.setText("Durian: D175");
                imgT.setImageResource(R.drawable.d175);
                txtS.setText("Known as Red Prawn");
                txtS1.setText("Characteristics: Usually brown skinned, this durian is oval-shaped, short-thorned, and quite difficult to peel because of its thick and hard skin. Tips: The brownish-green skin of Red Shrimp is said to be grown outside of Penang");
                txtS2.setText("Others:  Dense and concenteres, the Red Prawn has bloom of rich, pungent flavors that leads into a mild astringent aftertaste.");
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
