package com.lby;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * Assume that the total area is never beyond the maximum possible value of int.
 * @author: mingren.lby
 * Date: 15-6-6
 * Time: 下午8:36
 */
public class Rectangle_Area{
	public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		long areaA = (C - A) * (D - B);
		long areaB = (G - E) * (H - F);
		long sumArea = areaA + areaB;
		int[]x = new int[]{A,C,E,G};
		int[]y = new int[]{B,D,F,H};
		long xmin = A,xmax = A;
		long ymin = B,ymax = B;
		for(int i=0;i<4;i++){
			xmin = Math.min(xmin,x[i]);
			xmax = Math.max(xmax,x[i]);
			ymin = Math.min(ymin,y[i]);
			ymax = Math.max(ymax,y[i]);
		}
		long ox = (C - A) + (G - E) -(long)(xmax - xmin);
		ox = ox < 0 ? 0 : ox;
		long oy = (D - B) + (H - F) - (long)(ymax - ymin);
		oy = oy < 0 ? 0 : oy;
		return (int)(sumArea - ox * oy);


	}
    public static void main(String[]args){
       computeArea(-1500000001, 0, -1500000000, 1, 1500000000, 0, 1500000001, 1);
    }
}
