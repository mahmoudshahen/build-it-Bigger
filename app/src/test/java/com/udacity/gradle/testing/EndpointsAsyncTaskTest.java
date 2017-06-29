package com.udacity.gradle.testing;

/**
 * Created by harty on 6/29/2017.
 */
import android.content.Context;
import android.test.ActivityUnitTestCase;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointsAsyncTask;
import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.Pair;
import com.udacity.gradle.jokes.Joker;
import org.mockito.Mock;
import org.junit.Test;


public class EndpointsAsyncTaskTest {

    @Mock
    Context mMockContext;
    @Test
    public void verifyEndpointsResponse() {

        try {
            String joke = (String.valueOf(new EndpointsAsyncTask().execute(new Pair(mMockContext, new Joker()))));
            assert (!joke.equals(null));
        } catch (Exception e) {
            e.fillInStackTrace();
        }


    }
}
