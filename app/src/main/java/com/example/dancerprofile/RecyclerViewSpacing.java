package com.example.dancerprofile;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewSpacing extends RecyclerView.ItemDecoration {

    private int spacingRight;
    private int spacingBottom;

    public RecyclerViewSpacing(int spacingRight, int spacingBottom) {
        this.spacingRight = spacingRight;
        this.spacingBottom = spacingBottom;
    }

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        outRect.right = spacingRight;
        outRect.bottom = spacingBottom;
    }
}