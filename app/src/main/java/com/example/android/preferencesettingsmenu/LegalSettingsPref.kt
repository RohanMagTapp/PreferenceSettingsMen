package com.example.android.preferencesettingsmenu

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat

class LegalSettingsPref : PreferenceFragmentCompat(){

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.legal_preference, rootKey)
    }

}