package com.tentcoo.onlychart.chart.interfaces;

import android.view.ViewGroup;

import com.tentcoo.onlychart.chart.adapter.EmoticonsAdapter;


public interface EmoticonDisplayListener<T> {

    void onBindView(int position, ViewGroup parent, EmoticonsAdapter.ViewHolder viewHolder, T t, boolean isDelBtn);
}
