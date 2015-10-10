package com.example.mystackview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class ColorAdapter extends BaseAdapter{
	  private Context mContext;  
      
	    private int [] mColors;  
	      
	    public ColorAdapter(Context context, int [] colors) {  
	        mContext = context;  
	        mColors = colors;  
	    }  
	      
	    public int getCount() {    
	        return mColors == null ? 0 : mColors.length;  
	    }  
	  
	    public Object getItem(int position) {  
	        return mColors == null ? null : mColors[position];  
	    }  
	    
	    public long getItemId(int position) {  
	        return position;  
	    }  
	  
	    public View getView(int position, View cacheView, ViewGroup parent) {  
	        LinearLayout.LayoutParams colorLayoutParams = new LinearLayout.LayoutParams(100, 100);  
	          
	        LinearLayout colorLayout = new LinearLayout(mContext);  
	        colorLayout.setBackgroundColor(mColors[position]);  
	        colorLayout.setLayoutParams(colorLayoutParams);  
	          
	        return colorLayout;  
	    }
}
