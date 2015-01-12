package com.shail.ws;

public class HelloWorldProxy implements com.shail.ws.HelloWorld {
  private String _endpoint = null;
  private com.shail.ws.HelloWorld helloWorld = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld = (new com.shail.ws.HelloWorldServiceLocator()).getHelloWorld();
      if (helloWorld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld != null)
      ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.shail.ws.HelloWorld getHelloWorld() {
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld;
  }
  
  public java.lang.String sayAbhi() throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.sayAbhi();
  }
  
  public java.lang.String getRingTone() throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.getRingTone();
  }
  
  public java.lang.String sayHelloWorld() throws java.rmi.RemoteException{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.sayHelloWorld();
  }
  
  
}