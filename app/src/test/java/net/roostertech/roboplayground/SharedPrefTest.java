package net.roostertech.roboplayground;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

@RunWith(RobolectricTestRunner.class)
public class SharedPrefTest {
    @Test
    public void testDefaultSharedPref () {
        final String KEY = "app_language_selection_pref_key";
        final String DATA = "us-en";

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(RuntimeEnvironment.application);
        sharedPreferences.edit().putString(KEY, DATA).commit();

        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(RuntimeEnvironment.application);
        String restoredData = sharedPreferences.getString(KEY, null);
        Assert.assertEquals(DATA, restoredData);
    }
}
