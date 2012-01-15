package pl.wszechwiedzacy.android;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class OptionsActivity extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.optionsActivityTitle);
        addPreferencesFromResource(R.xml.options);
    }

}
