package com.danxx.brisktvlauncher.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Danxx on 2016/4/12.
 */
public class FocusRecyclerView extends RecyclerView {

    /**
     * ViewPager右滑
     */

    private int scrollDy = 160;


    public FocusRecyclerView(Context context) {
        super(context);
    }

    public FocusRecyclerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FocusRecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public View focusSearch(int direction) {
        return super.focusSearch(direction);
    }

    @Override
    public View findFocus() {
        LayoutManager lm = getLayoutManager();
        return super.findFocus();
    }

    @Override
    public boolean requestFocus(int direction, Rect previouslyFocusedRect) {
        return super.requestFocus(direction, previouslyFocusedRect);
    }

    @Override
    public void requestChildFocus(View child, View focused) {
        super.requestChildFocus(child, focused);
    }

    @Override
    public void smoothScrollToPosition(int position) {
        super.smoothScrollToPosition(position);
    }

    @Override
    public void smoothScrollBy(int dx, int dy) {
        if(hasFocus()){
            if(dy>0){
                int mdy = dy + getChildHeight();
                super.smoothScrollBy(dx, mdy);
            }else if(dy<0){
                int mdy= dy - getChildHeight();
                super.smoothScrollBy(dx, mdy);
            }else {
                Log.d("danxx", "FRV dy--->"+dy);
            }
        }
//        super.smoothScrollBy(dx ,dy);
    }

    /**
     * 初始化的时候第一次请求焦点
     * @return
     */
    public boolean firstRequestFocus(){
        return false;
    }

    private int getChildHeight(){
        return scrollDy;
    }

    public void setScrollDy(int height){
        this.scrollDy = height;
    }

}
