package com.example.tarea02.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tarea02.R;

public class ComentFragment extends Fragment {

	EditText editComment;
	TextView txtComment;
	Button buttonComment;
	String Comment = "";
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_comment, container, false);
		editComment = (EditText)view.findViewById(R.id.editComment);
		txtComment = (TextView)view.findViewById(R.id.txtComment);
		buttonComment = (Button)view.findViewById(R.id.buttonComment);
		return view;
	}
	
	@Override
    public void onActivityCreated(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		buttonComment.setOnClickListener(new OnClickListener() {	
    		public void onClick(View v) {
    			String comm = "- " + editComment.getText().toString();
    			Comment = Comment + comm + "\n\n";
    			txtComment.setText(Comment);
    			editComment.setText("");
    		}
    	});
    }
	
}
