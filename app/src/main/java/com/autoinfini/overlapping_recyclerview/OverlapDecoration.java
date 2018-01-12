package com.autoinfini.overlapping_recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by naveendewangan on 12/01/18.
 */

public class OverlapDecoration extends RecyclerView.ItemDecoration {

    private final static int vertOverlap = -20;

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        final int itemPosition = parent.getChildAdapterPosition(view);


//        if (itemPosition == 0) {
//            outRect.set(vertOverlap, 0, 0, 0);
//            return;
//        }
//        outRect.set(0, vertOverlap, 0, 0);
        outRect.set(0, 0, vertOverlap, 0);

    }
}