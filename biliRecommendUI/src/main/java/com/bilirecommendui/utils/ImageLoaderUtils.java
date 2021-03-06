package com.bilirecommendui.utils;


import android.widget.ImageView;

import com.bilirecommendui.App;
import com.bilirecommendui.R;
import com.bumptech.glide.Glide;

/**
 * by y on 2016/9/13
 */
public class ImageLoaderUtils {


    public static void display(ImageView imageView, String url) {
        if (imageView == null) {
            throw new IllegalArgumentException("argument error");
        }
        Glide.with(App.getContext()).load(url).placeholder(R.drawable.bili_default_image_tv)
                .error(R.drawable.bili_default_image_tv).centerCrop().into(imageView);
    }


}
