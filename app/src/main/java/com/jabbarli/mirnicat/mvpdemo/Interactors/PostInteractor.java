package com.jabbarli.mirnicat.mvpdemo.Interactors;

import android.util.Log;

import com.jabbarli.mirnicat.mvpdemo.POJO.Post;
import com.jabbarli.mirnicat.mvpdemo.Retrofit.HttpsServiceSingleton;
import com.jabbarli.mirnicat.mvpdemo.Retrofit.RetrofitInterface;
import com.jabbarli.mirnicat.mvpdemo.UI.Activities.ListActivity.ListActivity;
import com.jabbarli.mirnicat.mvpdemo.UI.Activities.ListActivity.ListPresenter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PostInteractor {

    private String TAG = "PostInteractor";
    private RetrofitInterface userService = HttpsServiceSingleton.getInstance().getRetrofitInterface();


    public void setPost(final com.jabbarli.mirnicat.mvpdemo.UI.Callbacks.Callback<Post> postCallback){
        Call<List<Post>> call = userService.getPosts();

        call.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                if (response.isSuccessful()){
                    if (response.code() == 200){
                        if (response.body() != null){
                            postCallback.sendDataToPresenter(response.body());
                            Log.i("Check", String.valueOf(response.body().size()));
                            Log.i("Check", String.valueOf(response.body().get(0).getmBody()));
                        }
                    }
                }
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });
    }
}
