package app.ij.mlwithtensorflowlite;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class PriceFruit extends AppCompatActivity {
    private PriceApi priceapi;
    private ListView listView;
    private ArrayList<Model>modelArrayList;
    private String BaseUrl= "https://durian-price.000webhostapp.com/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.price_main);

        listView=findViewById(R.id.lv);
        //creae and array
        modelArrayList =new ArrayList<>();
        viewJsonData();

        Button refresh = (Button) findViewById(R.id.btn_reload);

        //Listening to button event
        refresh.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {
                //Starting a new Intent
                Intent reload = new Intent(getApplicationContext(),PriceFruit.class);
                startActivity(reload);


            }
        });
    }

    private void viewJsonData(){
        Retrofit retrofit=new  Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        priceapi=retrofit.create(PriceApi.class);

        Call<ArrayList<Model>> arrayListCall = priceapi.callModel();
        arrayListCall.enqueue(new Callback<ArrayList<Model>>() {
            @Override
            public void onResponse(Call<ArrayList<Model>> call, Response<ArrayList<Model>> response) {
                modelArrayList=response.body();

//                int i=0;
                for (int i=0; i<modelArrayList.size(); i++){

                    MyAdapter myAdapter = new MyAdapter (modelArrayList, PriceFruit.this,R.layout.singleview);

                    listView.setAdapter(myAdapter);
                }
            }

            @Override
            public void onFailure(Call<ArrayList<Model>> call, Throwable t) {
                Toast.makeText(PriceFruit.this, "Failed to load data", Toast.LENGTH_SHORT);

            }
        });
    }
}