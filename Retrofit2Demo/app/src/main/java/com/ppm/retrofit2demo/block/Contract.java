package com.ppm.retrofit2demo.block;

import com.ppm.retrofit2demo.model.JavaBean;
import com.ppm.retrofit2demo.net.response.Response;

import java.util.List;

import io.reactivex.Observable;


/**
 * Created by Zaifeng on 2018/3/1.
 */

public class Contract {

    public interface Persenter {
        public void getCarList(String userId);
    }

    public interface View {
        void getDataSuccess();
        void getDataFail();
    }

    public interface Model {
        public Observable<Response<List<JavaBean>>> getCarList(String userId);
    }

}
