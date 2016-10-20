package com.lukedeighton.wheelview.adapter;

import android.view.View;

import com.lukedeighton.wheelview.WheelView;

/**
 * <p>
 * Provide drawables for the {@link WheelView} to draw on the wheel.
 * </p>
 * <p>
 * <p>
 * Note that {@link WheelAdapter} doesn't behave exactly like a typical Adapter from Android source.
 * There are some limitations to using drawables rather than views, but it also means you do not
 * need to worry about recycling drawables as it is not as expensive as view inflation.
 * </p>
 * <p>
 * <p>
 * It may be possible to properly implement an Adapter with recycling Views but for now this will do.
 * </p>
 */
public interface WheelAdapter {

    /**
     * @param position the adapter position, between 0 and {@link #getCount()}.
     * @return the view to be drawn on the wheel at this adapter position.
     */
    View getView(int position);

    /**
     * @return the number of items in the adapter.
     */
    int getCount();
}
