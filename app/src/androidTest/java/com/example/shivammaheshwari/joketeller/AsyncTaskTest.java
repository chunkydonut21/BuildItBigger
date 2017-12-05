package com.example.shivammaheshwari.joketeller;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.widget.ProgressBar;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    private ProgressBar progressBar;
    @Test
    public void testAsyncResponse() {
        JokeAsyncTask asyncTask = new JokeAsyncTask(InstrumentationRegistry.getTargetContext() , progressBar);
        asyncTask.execute();
        String result;
        try {
            result = asyncTask.get(15, TimeUnit.SECONDS);

            assertNotNull(result);
            assertTrue(result.length() > 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}