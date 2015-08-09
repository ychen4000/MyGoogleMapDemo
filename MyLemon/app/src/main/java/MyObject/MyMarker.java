package MyObject;

/**
 * Created by Administrator on 2015/8/9.
 */
import com.google.android.gms.maps.model.LatLng;

public class MyMarker {
//LatLng MyGPSLocation
    LatLng Location;
    String Head;
    String Body;
  //  Var Pic;
    String UserID;
    String MarkerID;

    public MyMarker(String markerID,String userID){
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + MarkerID);
        MarkerID = markerID;
        UserID = userID;
    }

    public String getUserID( )
    {
        return UserID;
    }
    public String getMakerID( )
    {
        return MarkerID;
    }
    public void setLocation( double latitude,double longitude ){
        Location = new LatLng(latitude,longitude);
    }

    public LatLng getLocation( ){
        return Location;
    }

    public void saveHead (String head)
    {
      Head = head;
    }
    public String getHead ( )
    {
        return Head;
    }
    public void saveBody (String body)
    {
        Body = body;
    }
    public String getBody( )
    {
        return Body;
    }
}
