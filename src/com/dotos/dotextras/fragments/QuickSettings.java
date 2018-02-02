package com.dotos.dotextras.fragments;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.dotos.dotextras.R;

public class QuickSettings extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

    public QuickSettings() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.quick_settings);

    }
    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }

}
