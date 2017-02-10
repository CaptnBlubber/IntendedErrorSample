package com.example.android.testing.espresso.BasicSample;

import android.app.Activity;
import android.support.test.espresso.intent.rule.IntentsTestRule;

import org.junit.Rule;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
public abstract class BaseInstrumentationTest<T extends Activity> {

    @Rule
    public IntentsTestRule<T> mIntentsTestRule;

    public BaseInstrumentationTest(Class<T> activityClazz) {
        mIntentsTestRule = new IntentsTestRule<T>(activityClazz, true, false);
    }
}
