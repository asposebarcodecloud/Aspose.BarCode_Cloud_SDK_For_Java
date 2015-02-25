package com.aspose.barcode.model;

import java.util.ArrayList;
import java.util.List;

public class BarcodeResponseList {

private List<Barcode> Barcodes = new ArrayList<Barcode>();
private Integer Code = 200;
private String Status = "OK";

/**
* 
* @return
* The Barcodes
*/
public List<Barcode> getBarcodes() {
return Barcodes;
}

/**
* 
* @param Barcodes
* The Barcodes
*/
public void setBarcodes(List<Barcode> Barcodes) {
this.Barcodes = Barcodes;
}

/**
* 
* @return
* The Code
*/
public Integer getCode() {
return Code;
}

/**
* 
* @param Code
* The Code
*/
public void setCode(Integer Code) {
this.Code = Code;
}

/**
* 
* @return
* The Status
*/
public String getStatus() {
return Status;
}

/**
* 
* @param Status
* The Status
*/
public void setStatus(String Status) {
this.Status = Status;
}
}

