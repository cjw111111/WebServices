/**
 * WeatherWebService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Weather.Client;

public interface WeatherWebService extends javax.xml.rpc.Service {
    public java.lang.String getWeatherWebServiceSoap12Address();

    public Weather.Client.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap12() throws javax.xml.rpc.ServiceException;

    public Weather.Client.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getWeatherWebServiceSoapAddress();

    public Weather.Client.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap() throws javax.xml.rpc.ServiceException;

    public Weather.Client.WeatherWebServiceSoap_PortType getWeatherWebServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
