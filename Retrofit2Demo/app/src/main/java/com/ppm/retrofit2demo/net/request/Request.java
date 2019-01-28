package com.ppm.retrofit2demo.net.request;

import com.ppm.retrofit2demo.model.JavaBean;
import com.ppm.retrofit2demo.net.response.Response;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Request {

    public static final String BASE_HOST = "http://api.juheapi.com/";


    @POST("japi/toh")
    Observable<Response<List<JavaBean>>> getHisList(@Query("key") String key);
}
