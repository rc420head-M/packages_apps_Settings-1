package com.android.settings.candy;

import android.content.ContentResolver;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceScreen;
import android.provider.Settings;
import android.widget.Toast;
import com.android.internal.logging.MetricsLogger;
import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;
import com.android.settings.util.Helpers;


public class Team extends SettingsPreferenceFragment implements 

        Preference.OnPreferenceChangeListener {

		private static final String TAG = "CandyRomsTeam";
	Preference mMatthew0776;
	Preference mMar5hal;
	Preference mCyberScopes;
	Preference mGimmeitorilltell;
	Preference mRc420head;
	Preference mFlashalot;
	Preference mVenomtester;
	Preference mCuzz1369;
	Preference mjavelinanddart;
	Preference mcalebcabob;
	Preference mp70shooter;
	Preference mNoSpamDan;
	Preference mYoshi_Guy;
	Preference mSHM;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ContentResolver resolver = getActivity().getContentResolver();

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.candyteam);

        PreferenceScreen prefSet = getPreferenceScreen();

	mMatthew0776 = prefSet.findPreference("candy_matthew0776");
	mMar5hal = prefSet.findPreference("candy_mar5hal");
	mCyberScopes = prefSet.findPreference("candy_CyberScopes");
	mGimmeitorilltell = prefSet.findPreference("candy_gimmeitorilltell");
	mRc420head = prefSet.findPreference("candy_rc420head");
	mFlashalot = prefSet.findPreference("candy_flashalot");
	mVenomtester = prefSet.findPreference("candy_venomtester");
	mCuzz1369 = prefSet.findPreference("candy_cuzz1369");
	mjavelinanddart = prefSet.findPreference("candy_javelinanddart");
	mcalebcabob = prefSet.findPreference("candy_calebcabob");
	mp70shooter = prefSet.findPreference("candy_p70shooter");
	mNoSpamDan = prefSet.findPreference("candy_NoSpamDan");
	mYoshi_Guy = prefSet.findPreference("candy_Yoshi_Guy");
	mSHM = prefSet.findPreference("candy_SHM");

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        ContentResolver resolver = getActivity().getContentResolver();
        boolean value;
	if (preference == mMatthew0776) {
	Toast.makeText(getActivity(), "Co-Owner Of CandyRoms , Gimme all yo candy b*tches, Asian with a white boy name",
	Toast.LENGTH_LONG).show();
	} else if (preference == mMar5hal) {
	Toast.makeText(getActivity(), "Co-Owner Of CandyRoms , Much cool such dev wow :)",
	Toast.LENGTH_LONG).show();
	} else if (preference == mCyberScopes) {
	Toast.makeText(getActivity(), "Themer , Part Time Slave To School",
	Toast.LENGTH_LONG).show();
	} else if (preference == mGimmeitorilltell) {
	Toast.makeText(getActivity(), "ROM Maintainer , Keywords: Dammit Bobby",
	Toast.LENGTH_LONG).show();
	} else if (preference == mRc420head) {
	Toast.makeText(getActivity(), "ROM Maintainer , Did Someone Say Pot?!?!",
	Toast.LENGTH_LONG).show();
	} else if (preference == mFlashalot) {
	Toast.makeText(getActivity(), "ROM Maintainer , Dank Memes Can't Melt Steel Beams",
	Toast.LENGTH_LONG).show();
	} else if (preference == mVenomtester) {
	Toast.makeText(getActivity(), "Themer / Tester , Loves To Break Clocks with his themes",
	Toast.LENGTH_LONG).show();
	} else if (preference == mCuzz1369) {
	Toast.makeText(getActivity(), "ROM Maintainer , NOT Batman",
	Toast.LENGTH_LONG).show();
        } else if (preference == mjavelinanddart) {
	Toast.makeText(getActivity(), "Device Maintainer Leader , I'm too cool to add something to my name so @flashalot did it for me ",
	Toast.LENGTH_LONG).show();
	} else if (preference == mcalebcabob) {
	Toast.makeText(getActivity(), "Device Maintainer , Aka git search engine aka DJ",
	Toast.LENGTH_LONG).show();
        } else if (preference == mp70shooter) {
	Toast.makeText(getActivity(), "Tester , Deals with the noobs so we don't have to",
	Toast.LENGTH_LONG).show();
	} else if (preference == mNoSpamDan) {
	Toast.makeText(getActivity(), "ROM Maintainer , MANTRA: Release the meteor!",
	Toast.LENGTH_LONG).show();
	} else if (preference == mYoshi_Guy) {
	Toast.makeText(getActivity(), "ROM Maintainer , People who think they know everything are a great annoyance to those of us who do (TL;DR I'm Smart)",
	Toast.LENGTH_LONG).show();
	} else if (preference == mSHM) {
	Toast.makeText(getActivity(), "ROM Maintainer , If you build it they will come!",
	Toast.LENGTH_LONG).show();
        } else {
            return super.onPreferenceTreeClick(preferenceScreen, preference);
        }

        return true;
    }

    @Override
    public boolean onPreferenceChange(Preference preference, Object objValue) {
        ContentResolver resolver = getActivity().getContentResolver();
        final String key = preference.getKey();

        return true;
    }
    
    @Override
    protected int getMetricsCategory() {
        return MetricsLogger.APPLICATION;
    }
}
