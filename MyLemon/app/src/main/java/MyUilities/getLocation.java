package MyUilities;

import android.location.Location;
import android.location.LocationManager;

import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;

import java.util.Timer;

/**
 * Created by Administrator on 2015/8/9.
 */
// Todo Finish this class
// ²Î¿¼ http://stackoverflow.com/questions/3145089/what-is-the-simplest-and-most-robust-way-to-get-the-users-current-location-in-a
public class getLocation {
    Timer timer1;
    LocationManager lm;
    LocationResult locationResult;
    boolean gps_enabled=false;
    boolean network_enabled=false;
    LatLng myLocaton;

    public LatLng getMyLocaton ( ) {
        //exceptions will be thrown if provider is not permitted.
        try {
            gps_enabled = lm.isProviderEnabled(LocationManager.GPS_PROVIDER);
        } catch (Exception ex) {
        }
        try {
            network_enabled = lm.isProviderEnabled(LocationManager.NETWORK_PROVIDER);
        } catch (Exception ex) {
        }

        if (gps_enabled)
        {
            Location MyLocation = lm .getLastKnownLocation(LocationManager.GPS_PROVIDER);
            LatLng MyGPSLocation = new LatLng(MyLocation.getLatitude(),MyLocation.getLongitude() );
        }

        return myLocaton;
    }

}
