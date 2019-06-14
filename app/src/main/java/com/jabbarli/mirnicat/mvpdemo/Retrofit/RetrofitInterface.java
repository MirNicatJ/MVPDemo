package com.jabbarli.mirnicat.mvpdemo.Retrofit;

import com.jabbarli.mirnicat.mvpdemo.POJO.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {

    @GET("posts")
    Call<List<Post>> getPosts();

}
