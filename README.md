# Super Simple HTTP Server inside of RICOH THETA

Bare minimum to run an HTTP server inside of RICOH THETA.

## `AndroidManifest.xml`

    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />

## `build.gradle` app

    implementation 'org.nanohttpd:nanohttpd:2.3.1'

## `WebServer.java`

see file

## `MainActivity.java`

    public class MainActivity extends PluginActivity {
        private Context context;
        private WebServer webServer;


...

    @Override
    protected void onResume() {
        super.onResume();

        try {
            webServer = new WebServer();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (isApConnected()) {

        }
    }

    @Override
    protected void onPause() {
        // Do end processing
        //close();

        super.onPause();

        if (webServer != null) {
            webServer.stop();
        }
    }