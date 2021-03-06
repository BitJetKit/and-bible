/*
 * Copyright (c) 2018 Martin Denham, Tuomas Airaksinen and the And Bible contributors.
 *
 * This file is part of And Bible (http://github.com/AndBible/and-bible).
 *
 * And Bible is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 *
 * And Bible is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with And Bible.
 * If not, see http://www.gnu.org/licenses/.
 *
 */

package net.bible.android.view.activity.base;

import org.jetbrains.annotations.NotNull;

/**
 * Base class for List activities.  Copied from Android source.  
 * A copy of ListActivity from Android source which also extends ActionBarActivity and the And Bible Activity base class.
 *
 * ListActivity does not extend ActionBarActivity so when implementing ActionBar functionality I created this, which does.
 * 
 * @author Martin Denham [mjdenham at gmail dot com]
 */

public class SharedActivityState {
	private static String currentWorkspaceName = "";
	// show title bar state is shared by all Activity windows
	private boolean mFullScreen = false;

	private static SharedActivityState singleton = new SharedActivityState();
	
	public static SharedActivityState getInstance() {
		return singleton;
	}

	public static String getCurrentWorkspaceName() {
		return currentWorkspaceName;
	}

	public void toggleFullScreen() {
    	mFullScreen = !mFullScreen;
    }
	
	public boolean isFullScreen() {
		return mFullScreen;
	}

	public static void setCurrentWorkspaceName(@NotNull String text) {
		currentWorkspaceName = text;
	}
}
