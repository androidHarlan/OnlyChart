package com.tentcoo.onlychart.chart.utlis.pickerimage;

import android.app.Activity;
import android.widget.ImageView;

import java.io.Serializable;


public interface ImageLoader extends Serializable {

    void displayImages(Activity activity, String path, ImageView imageView, int width, int height);

    void clearMemoryCache();
}
