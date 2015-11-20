/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hevaclientws;

import com.hevasoluciones.hsws.Beacon;
import com.hevasoluciones.hsws.BeaconStatus;
import com.hevasoluciones.hsws.Campains;
import com.hevasoluciones.hsws.CenterCloud_Service;
import com.hevasoluciones.hsws.VisitsRegionSpec;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;

/**
 *
 * @author Rafa
 */
public class HevaClientWs {

   private  String wsdlPath;

    public HevaClientWs(String wsdlPath) {
        this.wsdlPath = wsdlPath;
    }

    
    
    public  List<Beacon> getBeacons(String appId,  String appToken) throws MalformedURLException {
         URL urlToWsdl = new URL(wsdlPath);
        com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                      new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
        com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
        return port.getBeacons(appId, appToken);
               
        
    }
    
    
    public VisitsRegionSpec uniqueVisitorsforRegion(String appId,  String appToken,  String uuid) throws MalformedURLException{
        
        
          URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                      new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.uniqueVisitorsforRegion(appId, appToken, uuid);
    
    
    }
    
    
    public VisitsRegionSpec visitsforRegion(String appId, String appToken,  String uuid, String major) throws MalformedURLException {
    
        
        URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                     new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.visitsforRegion(appId, appToken, uuid, major);
    
    }
    
    
    
     public List<Campains> getCampains() throws MalformedURLException {
         
         URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                      new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.getCampains("");
         
     }
     
     
     public String deleteCampain(int idCampain) throws MalformedURLException {
     
     URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                      new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.deleteCampain(idCampain);
     }
      
     
       public String editCampain(int  idCampain,String title, String content, String featuredImage, ArrayList<Beacon> beacons,ArrayList<String> tags) throws MalformedURLException {
           
         URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                    new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.editCampain(idCampain, title, content, featuredImage, beacons, tags);
       
       
       }
       
       
       public String createNewCampain(String title,  String content,  String featuredImage,  ArrayList<Beacon> beaconList,  ArrayList<String> tagList) throws MalformedURLException {
       
       
        URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                      new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.createNewCampain(title, content, featuredImage, beaconList, tagList);
           
       }
       
       
       public BeaconStatus getAllBeaconsStatus( String appId,  String appToken) throws MalformedURLException {
           
            URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                     new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         
         return port.getAllBeaconsStatus(appId, appToken);
           
       }
   
    
       
       public List<String> getAllTags() throws MalformedURLException
       {
           
         URL urlToWsdl = new URL(wsdlPath);
          com.hevasoluciones.hsws.CenterCloud_Service  service = new CenterCloud_Service(urlToWsdl,
                    new QName("http://hsws.hevasoluciones.com/", "CenterCloud"));
         com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
         return port.getAllTags();
       }
       
       
       
       
       
    
    /**
     * @param args the command line arguments
     
     */
    public  static void main(String[] args)  {
        
        
      /*   URL urlToWsdl = new URL("http://rafa-laptop:8080/HevaCloudWebService/CenterCloud?wsdl");
         QName qname = new QName("http://hsws.hevasoluciones.com/", "CenterCloud");
         CenterCloud_Service service = new CenterCloud_Service(urlToWsdl,
               qname  );
       
        com.hevasoluciones.hsws.CenterCloud port= service.getCenterCloudPort();
        
        System.out.println(port.getBeacons("insummins","3457a234283407ef10cbca39cf35a8dc"));
        //return port.getBeacons(appId, appToken);
        
        
	
*/
       
    }
    
}
