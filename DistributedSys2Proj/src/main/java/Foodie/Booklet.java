package Foodie;

import java.util.ArrayList;
import java.util.List;

public class Booklet {
    private List<Request> addressList = new ArrayList<>();


    public void addRequest(Request req) {
        addressList.add(req);
    }
    public Request getRequest(String s){
        Request r;
        for (int i = 0;i<addressList.size();i++) {
            if(s.compareToIgnoreCase(addressList.get(i).getId())==0){
                return addressList.get(i);
            }
            
        }
        return null;
    }

}
