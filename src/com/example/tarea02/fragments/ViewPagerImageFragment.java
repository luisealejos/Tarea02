package com.example.tarea02.fragments;

import com.example.tarea02.data.ImagePagerAdapter;
import com.example.tarea02.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewPagerImageFragment extends Fragment {

	ViewPager viewPager;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		ImagePagerAdapter adapter = new ImagePagerAdapter(getChildFragmentManager());
		viewPager.setAdapter(adapter);
	}



	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_view_pager_image, container, false);
		viewPager = (ViewPager)view.findViewById(R.id.pager);
		return view;
	}
	
}
