package com.tentcoo.onlychart.chart.interfaces;


public interface SelectedHistoryFileListener {
    void onSelected(int msgId, int position);

    void onUnselected(int msgId, int position);
}
