package com.rarnu.devlib.demo.fragment.activity;

import android.app.Fragment;

import com.anjuke.devlib.base.BaseActivity;
import com.rarnu.devlib.demo.Fragments;
import com.rarnu.devlib.demo.R;

public class NotificationActivity extends BaseActivity {

	@Override
	public Fragment replaceFragment() {
		return Fragments.fNotification;
	}

	@Override
	public int getIcon() {
		return R.drawable.ic_launcher;
	}
}
