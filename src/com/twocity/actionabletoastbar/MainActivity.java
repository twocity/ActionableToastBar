/*
 * Copyright (C) 2012 twocity
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package com.twocity.actionabletoastbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.twocity.actionabletoastbar.widget.ActionableToastBar;

public class MainActivity extends Activity {
	private ActionableToastBar mUndoBar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mUndoBar = (ActionableToastBar) findViewById(R.id.undo_bar);
//		mUndoBar.setConversationMode(false);
	}

	
	public void delete(View v){
        mUndoBar.show(new ActionableToastBar.ActionClickedListener() {
            @Override
            public void onActionClicked() {
            	Toast.makeText(getApplicationContext(), "undo", Toast.LENGTH_SHORT).show();
            }
        }, R.drawable.ic_launcher, getResources().getString(R.string.deleted), true, R.string.undo, true);
	}
}
