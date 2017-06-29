package com.udacity.gradle.builditbigger;

import android.content.Context;

import com.udacity.gradle.jokes.Joker;

/**
 * Created by harty on 6/29/2017.
 */

public class Pair {
    Context context;
    Joker joker;

    public Pair(Context context, Joker joker) {
        this.context = context;
        this.joker = joker;
    }
}
