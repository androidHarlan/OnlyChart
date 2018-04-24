package com.tentcoo.onlychart.chart.view;


import com.tentcoo.onlychart.chart.mode.FileItem;

import java.util.Comparator;

public class YMComparator implements Comparator<FileItem> {

	@Override
	public int compare(FileItem o1, FileItem o2) {
		return o1.getDate().compareTo(o2.getDate());
	}

}
