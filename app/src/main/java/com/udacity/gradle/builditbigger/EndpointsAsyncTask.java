package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Pair;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.sampleapp.backend.myApi.MyApi;
import com.udacity.gradle.jokes.Joker;

import shahen.mahmoud.showjoke.JokeActivity;

/**
 * Created by harty on 6/29/2017.
 */

public class EndpointsAsyncTask extends AsyncTask<com.udacity.gradle.builditbigger.Pair, Void, String> {
    private MyApi myApiService = null;
    private Context context;

    @Override
    public String doInBackground(com.udacity.gradle.builditbigger.Pair... params) {
        if(myApiService == null) {  // Only do this once
        MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
        .setRootUrl("https://build-it-bigger-172121.appspot.com/_ah/api/");
        // end options for devappserver

        myApiService = builder.build();
        }
        context = params[0].context;
        Joker joker = params[0].joker;

        // try {
        return joker.getJoke();
        //return myApiService.sayHi(name).execute().getData();
        //} catch (IOException e) {
        //    return e.getMessage();
        //}
        }
    @Override
    public void onPostExecute(String result) {
        Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra("joke", result);
        context.startActivity(intent);
        //Toast.makeText(context, result, Toast.LENGTH_LONG).show();
        }
}
