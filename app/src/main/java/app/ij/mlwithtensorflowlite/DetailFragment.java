package app.ij.mlwithtensorflowlite;

import android.content.Intent;
import android.os.Bundle;
import android.annotation.SuppressLint;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends AppCompatActivity {
    @SuppressLint("MissingInflatedId")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fruit_detail);

        Button btnBack = findViewById(R.id.btnBack);
        TextView txtT = findViewById(R.id.txtTitle);
        ImageView imgT = findViewById(R.id.imgTitle);
        TextView txtS = findViewById(R.id.txtStory);

        Bundle extras = getIntent().getExtras();
        String story  = "Default Story Text";

        if(extras != null){
            story = extras.getString("keyStory");
            if(story.equals("storyA")){
                txtT.setText("Durian : D101");
                imgT.setImageResource(R.drawable.durian2);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyB")){
                txtT.setText("Durian: D197");
                imgT.setImageResource(R.drawable.durian2);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyC")){
                txtT.setText("Durian: D24");
                imgT.setImageResource(R.drawable.durian2);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyD")){
                txtT.setText("Durian: D2");
                imgT.setImageResource(R.drawable.durian2);
                txtS.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed hendrerit nisi nec quam condimentum, sit amet consequat lorem fermentum. Integer dictum");
            }
            else if (story.equals("storyE")){
                txtT.setText("Durian: D175");
                imgT.setImageResource(R.drawable.durian2);
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