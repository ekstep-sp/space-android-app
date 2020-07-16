package ekstep.societal.space;

import android.app.Application;

import ekstep.societal.space.services.ConnectivityReceiver;

/**
 * Created by akansha.goyal on 3/27/2018.
 */

public class LexApplication extends Application {

    private static LexApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }

    public static synchronized LexApplication getInstance() {
        return mInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }

}
