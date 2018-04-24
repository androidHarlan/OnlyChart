package com.tentcoo.onlychart.chart.interfaces;

import android.view.View;
import android.view.ViewGroup;

import com.tentcoo.onlychart.chart.mode.PageEntity;


public interface PageViewInstantiateListener<T extends PageEntity> {

    View instantiateItem(ViewGroup container, int position, T pageEntity);
}
