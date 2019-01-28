package com.ppm.retrofit2demo.block;


import com.ppm.retrofit2demo.model.JavaBean;
import com.ppm.retrofit2demo.net.NetworkManager;
import com.ppm.retrofit2demo.net.response.Response;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Zaifeng on 2018/3/1.
 */

public class Model implements Contract.Model {

    @Override
    public Observable<Response<List<JavaBean>>> getCarList(String userId) {
        return NetworkManager.getInstance().getRequest().getHisList(userId);
    }
}
