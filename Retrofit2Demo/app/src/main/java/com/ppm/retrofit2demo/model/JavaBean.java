package com.ppm.retrofit2demo.model;

import android.os.Parcel;
import android.os.Parcelable;

public class JavaBean implements Parcelable {

    protected JavaBean(Parcel in) {
    }

    public static final Creator<JavaBean> CREATOR = new Creator<JavaBean>() {
        @Override
        public JavaBean createFromParcel(Parcel in) {
            return new JavaBean(in);
        }

        @Override
        public JavaBean[] newArray(int size) {
            return new JavaBean[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
