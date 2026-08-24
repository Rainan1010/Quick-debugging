package com.rainan.quickdebugging

import android.content.Intent
import android.provider.Settings
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.assertNotNull

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun developerOptionsIntent_isResolved() {
        val context = InstrumentationRegistry.getInstrumentation().targetContext
        val intent = Intent(Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS)

        assertNotNull(intent.resolveActivity(context.packageManager))
    }
}
