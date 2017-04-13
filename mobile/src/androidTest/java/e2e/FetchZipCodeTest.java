package e2e;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.agur.zipmeup.FindMeZip;
import com.example.agur.zipmeup.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by agur on 4/12/17.
 */

@RunWith(AndroidJUnit4.class)
@LargeTest
public class FetchZipCodeTest {

    @Rule
    public ActivityTestRule<FindMeZip> mActivityRule = new ActivityTestRule<>(FindMeZip.class);

    @Test
    public void shouldPresentZipCodeAfterClick() {
        onView(withId(R.id.zipMeUpBtn)).perform(click());
        onView(withId(R.id.zipMeUpTxtView)).check(matches(withText("90210")));
    }

}
