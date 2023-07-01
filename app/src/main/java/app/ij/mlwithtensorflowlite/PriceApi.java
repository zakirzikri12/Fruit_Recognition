package app.ij.mlwithtensorflowlite;

import java.lang.reflect.Array;
import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PriceApi {
    @GET("api_fruit_price.php")
    Call<ArrayList<Model>>callModel();
}
