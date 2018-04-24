package com.tentcoo.onlychart.chart.interfaces;


import com.tentcoo.onlychart.chart.mode.FileType;

public interface UpdateSelectedStateListener {
    public void onSelected(String path, long fileSize, FileType type);
    public void onUnselected(String path, long fileSize, FileType type);
}
