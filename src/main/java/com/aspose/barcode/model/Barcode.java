package com.aspose.barcode.model;

import java.util.ArrayList;
import java.util.List;

public class Barcode {

private String BarcodeValue;
private String BarcodeType;
private List<String> Region = new ArrayList<String>();
private Object Checksum;

/**
* 
* @return
* The BarcodeValue
*/
public String getBarcodeValue() {
return BarcodeValue;
}

/**
* 
* @param BarcodeValue
* The BarcodeValue
*/
public void setBarcodeValue(String BarcodeValue) {
this.BarcodeValue = BarcodeValue;
}

/**
* 
* @return
* The BarcodeType
*/
public String getBarcodeType() {
return BarcodeType;
}

/**
* 
* @param BarcodeType
* The BarcodeType
*/
public void setBarcodeType(String BarcodeType) {
this.BarcodeType = BarcodeType;
}

/**
* 
* @return
* The Region
*/
public List<String> getRegion() {
return Region;
}

/**
* 
* @param Region
* The Region
*/
public void setRegion(List<String> Region) {
this.Region = Region;
}

/**
* 
* @return
* The Checksum
*/
public Object getChecksum() {
return Checksum;
}

/**
* 
* @param Checksum
* The Checksum
*/
public void setChecksum(Object Checksum) {
this.Checksum = Checksum;
}
}