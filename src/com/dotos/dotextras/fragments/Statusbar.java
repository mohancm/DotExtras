package com.dotos.dotextras.fragments;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;

import com.dotos.dotextras.R;

public class Statusbar extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

    public Statusbar() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.statusbar);
    }
    @Override
    public boolean onPreferenceChange(Preference preference, Object newValue) {
        return false;
    }
}
