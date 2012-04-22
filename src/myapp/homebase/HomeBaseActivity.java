package myapp.homebase;

//import myapp.youtubeviewer.TabUtils;
import android.app.Activity;
import android.app.TabActivity;
import android.os.Bundle;

public class HomeBaseActivity extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // create tabs
        TabUtils.createTabsN(this, 3);
    }
}