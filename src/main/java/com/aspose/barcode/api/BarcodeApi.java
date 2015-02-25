package com.aspose.barcode.api;

import com.aspose.client.ApiException;
import com.aspose.client.ApiInvoker;
import com.aspose.client.ApiInvokerResponse;

import com.aspose.barcode.model.ResponseMessage;
import com.aspose.barcode.model.BarcodeResponseList;
import com.aspose.barcode.model.BarcodeReader;
import com.aspose.barcode.model.SaaSposeResponse;
import com.sun.jersey.multipart.FormDataMultiPart;

import javax.ws.rs.core.MediaType;

import java.io.File;
import java.util.*;

public class BarcodeApi {
  String basePath = "http://api.aspose.com/v1.1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();
  ApiInvokerResponse response = null;

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }
  
  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }
  
  public String getBasePath() {
    return basePath;
  }

  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetBarcodeGenerate
	* Generate barcode.
	* @param text	String	The code text.
	* @param type	String	Barcode type.
	* @param format	String	Result format.
	* @param resolutionX	Float	Horizontal resolution.
	* @param resolutionY	Float	Vertical resolution.
	* @param dimensionX	Float	Smallest width of barcode unit (bar or space).
	* @param dimensionY	Float	Smallest height of barcode unit (for 2D barcodes).
	* @param enableChecksum	String	Sets if checksum will be generated.
	* @return ResponseMessage
	*/

  public ResponseMessage GetBarcodeGenerate (String text, String type, String format, Float resolutionX, Float resolutionY, Float dimensionX, Float dimensionY, String enableChecksum) {
    Object postBody = null;
    // create path and map variables
    String path = "/barcode/generate/?appSid={appSid}&amp;text={text}&amp;type={type}&amp;toFormat={toFormat}&amp;resolutionX={resolutionX}&amp;resolutionY={resolutionY}&amp;dimensionX={dimensionX}&amp;dimensionY={dimensionY}&amp;enableChecksum={enableChecksum}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(text!=null)
      queryParams.put("text", String.valueOf(text));
    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(resolutionX!=null)
      queryParams.put("resolutionX", String.valueOf(resolutionX));
    if(resolutionY!=null)
      queryParams.put("resolutionY", String.valueOf(resolutionY));
    if(dimensionX!=null)
      queryParams.put("dimensionX", String.valueOf(dimensionX));
    if(dimensionY!=null)
      queryParams.put("dimensionY", String.valueOf(dimensionY));
    if(enableChecksum!=null)
      queryParams.put("enableChecksum", String.valueOf(enableChecksum));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (ResponseMessage) ApiInvoker.deserialize(response, "", ResponseMessage.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* GetBarcodeRecognize
	* Recognize barcode from a file on server.
	* @param name	String	The image name.
	* @param type	String	The barcode type.
	* @param checksumValidation	String	Checksum validation parameter.
	* @param stripFnc	Boolean	Allows to strip FNC symbol in recognition results.
	* @param rotationAngle	Integer	Allows to correct angle of barcode.
	* @param barcodesCount	Integer	Count of barcodes to recognize.
	* @param rectX	Integer	Top left point X coordinate of  to recognize barcode inside.
	* @param rectY	Integer	Top left point Y coordinate of  to recognize barcode inside.
	* @param rectWidth	Integer	Width of  to recognize barcode inside.
	* @param rectHeight	Integer	Height of  to recognize barcode inside.
	* @param storage	String	The image storage.
	* @param folder	String	The image folder.
	* @return BarcodeResponseList
	*/

  public BarcodeResponseList GetBarcodeRecognize (String name, String type, String checksumValidation, Boolean stripFnc, Integer rotationAngle, Integer barcodesCount, Integer rectX, Integer rectY, Integer rectWidth, Integer rectHeight, String storage, String folder) {
    Object postBody = null;
    // verify required params are set
    if(name == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/barcode/{name}/recognize/?appSid={appSid}&amp;type={type}&amp;checksumValidation={checksumValidation}&amp;stripFnc={stripFnc}&amp;rotationAngle={rotationAngle}&amp;barcodesCount={barcodesCount}&amp;rectX={rectX}&amp;rectY={rectY}&amp;rectWidth={rectWidth}&amp;rectHeight={rectHeight}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(checksumValidation!=null)
      queryParams.put("checksumValidation", String.valueOf(checksumValidation));
    if(stripFnc!=null)
      queryParams.put("stripFnc", String.valueOf(stripFnc));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(barcodesCount!=null)
      queryParams.put("barcodesCount", String.valueOf(barcodesCount));
    if(rectX!=null)
      queryParams.put("rectX", String.valueOf(rectX));
    if(rectY!=null)
      queryParams.put("rectY", String.valueOf(rectY));
    if(rectWidth!=null)
      queryParams.put("rectWidth", String.valueOf(rectWidth));
    if(rectHeight!=null)
      queryParams.put("rectHeight", String.valueOf(rectHeight));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
		return (BarcodeResponseList) ApiInvoker.deserialize(response, "", BarcodeResponseList.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PostBarcodeRecognizeFromUrlorContent
	* Recognize barcode from an url.
	* @param type	String	Barcode type.
	* @param checksumValidation	String	Checksum validation parameter.
	* @param stripFnc	Boolean	Allows to strip FNC symbol in recognition results.
	* @param rotationAngle	Integer	Recognition of rotated barcode. Possible angles are 90, 180, 270, default is 0
	* @param url	String	The image file url.
	* @param file	File	
	* @return BarcodeResponseList
	*/

  public BarcodeResponseList PostBarcodeRecognizeFromUrlorContent (String type, String checksumValidation, Boolean stripFnc, Integer rotationAngle, String url, File file) {
    Object postBody = null;
    // verify required params are set
    if(file == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/barcode/recognize/?appSid={appSid}&amp;type={type}&amp;checksumValidation={checksumValidation}&amp;stripFnc={stripFnc}&amp;rotationAngle={rotationAngle}&amp;url={url}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(checksumValidation!=null)
      queryParams.put("checksumValidation", String.valueOf(checksumValidation));
    if(stripFnc!=null)
      queryParams.put("stripFnc", String.valueOf(stripFnc));
    if(rotationAngle!=null)
      queryParams.put("rotationAngle", String.valueOf(rotationAngle));
    if(url!=null)
      queryParams.put("url", String.valueOf(url));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
		return (BarcodeResponseList) ApiInvoker.deserialize(response, "", BarcodeResponseList.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutBarcodeGenerateFile
	* Generate barcode and save on server.
	* @param name	String	The image name.
	* @param text	String	Barcode's text.
	* @param type	String	The barcode type.
	* @param format	String	The image format.
	* @param resolutionX	Float	Horizontal resolution.
	* @param resolutionY	Float	Vertical resolution.
	* @param dimensionX	Float	Smallest width of barcode unit (bar or space).
	* @param dimensionY	Float	Smallest height of barcode unit (for 2D barcodes).
	* @param codeLocation	String	property of the barcode.
	* @param grUnit	String	Measurement of barcode properties.
	* @param autoSize	String	Sets if barcode size will be updated automatically.
	* @param barHeight	Float	Height of the bar.
	* @param imageHeight	Float	Height of the image.
	* @param imageWidth	Float	Width of the image.
	* @param imageQuality	String	Detepmines  of the barcode image.
	* @param rotAngle	Float	Angle of barcode orientation.
	* @param topMargin	Float	Top margin.
	* @param bottomMargin	Float	Bottom margin.
	* @param leftMargin	Float	Left margin.
	* @param rightMargin	Float	Right margin.
	* @param enableChecksum	String	Sets if checksum will be generated.
	* @param storage	String	Image's storage.
	* @param folder	String	Image's folder.
	* @param file	File	
	* @return SaaSposeResponse
	*/

  public SaaSposeResponse PutBarcodeGenerateFile (String name, String text, String type, String format, Float resolutionX, Float resolutionY, Float dimensionX, Float dimensionY, String codeLocation, String grUnit, String autoSize, Float barHeight, Float imageHeight, Float imageWidth, String imageQuality, Float rotAngle, Float topMargin, Float bottomMargin, Float leftMargin, Float rightMargin, String enableChecksum, String storage, String folder, File file) {
    Object postBody = null;
    // verify required params are set
    if(name == null || file == null	 ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/barcode/{name}/generate/?appSid={appSid}&amp;text={text}&amp;type={type}&amp;toFormat={toFormat}&amp;resolutionX={resolutionX}&amp;resolutionY={resolutionY}&amp;dimensionX={dimensionX}&amp;dimensionY={dimensionY}&amp;codeLocation={codeLocation}&amp;grUnit={grUnit}&amp;autoSize={autoSize}&amp;barHeight={barHeight}&amp;imageHeight={imageHeight}&amp;imageWidth={imageWidth}&amp;imageQuality={imageQuality}&amp;rotAngle={rotAngle}&amp;topMargin={topMargin}&amp;bottomMargin={bottomMargin}&amp;leftMargin={leftMargin}&amp;rightMargin={rightMargin}&amp;enableChecksum={enableChecksum}&amp;storage={storage}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(text!=null)
      queryParams.put("text", String.valueOf(text));
    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(format!=null)
      queryParams.put("format", String.valueOf(format));
    if(resolutionX!=null)
      queryParams.put("resolutionX", String.valueOf(resolutionX));
    if(resolutionY!=null)
      queryParams.put("resolutionY", String.valueOf(resolutionY));
    if(dimensionX!=null)
      queryParams.put("dimensionX", String.valueOf(dimensionX));
    if(dimensionY!=null)
      queryParams.put("dimensionY", String.valueOf(dimensionY));
    if(codeLocation!=null)
      queryParams.put("codeLocation", String.valueOf(codeLocation));
    if(grUnit!=null)
      queryParams.put("grUnit", String.valueOf(grUnit));
    if(autoSize!=null)
      queryParams.put("autoSize", String.valueOf(autoSize));
    if(barHeight!=null)
      queryParams.put("barHeight", String.valueOf(barHeight));
    if(imageHeight!=null)
      queryParams.put("imageHeight", String.valueOf(imageHeight));
    if(imageWidth!=null)
      queryParams.put("imageWidth", String.valueOf(imageWidth));
    if(imageQuality!=null)
      queryParams.put("imageQuality", String.valueOf(imageQuality));
    if(rotAngle!=null)
      queryParams.put("rotAngle", String.valueOf(rotAngle));
    if(topMargin!=null)
      queryParams.put("topMargin", String.valueOf(topMargin));
    if(bottomMargin!=null)
      queryParams.put("bottomMargin", String.valueOf(bottomMargin));
    if(leftMargin!=null)
      queryParams.put("leftMargin", String.valueOf(leftMargin));
    if(rightMargin!=null)
      queryParams.put("rightMargin", String.valueOf(rightMargin));
    if(enableChecksum!=null)
      queryParams.put("enableChecksum", String.valueOf(enableChecksum));
    if(storage!=null)
      queryParams.put("storage", String.valueOf(storage));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "multipart/form-data"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      hasFields = true;
      mp.field("file", file, MediaType.MULTIPART_FORM_DATA_TYPE);
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (SaaSposeResponse) ApiInvoker.deserialize(response, "", SaaSposeResponse.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  //error info- code: 404 reason: "no project found" model: <none>
  /**
	* PutBarcodeRecognizeFromBody
	* Recognition of a barcode from file on server with parameters in body.
	* @param name	String	The image name.
	* @param type	String	The barcode type.
	* @param folder	String	The image folder.
	* @param body	BarcodeReader	BarcodeReader object with parameters.
	* @return BarcodeResponseList
	*/

  public BarcodeResponseList PutBarcodeRecognizeFromBody (String name, String type, String folder, BarcodeReader body) {
    Object postBody = body;
    // verify required params are set
    if(name == null || body == null ) {
       throw new ApiException(400, "missing required params");
    }
    // create path and map variables
    String path = "/barcode/{name}/recognize/?appSid={appSid}&amp;type={type}&amp;folder={folder}".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();
    Map<String, String> formParams = new HashMap<String, String>();

    if(name!=null)
      queryParams.put("name", String.valueOf(name));
    if(type!=null)
      queryParams.put("type", String.valueOf(type));
    if(folder!=null)
      queryParams.put("folder", String.valueOf(folder));
    String[] contentTypes = {
      "application/json"};

    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if(contentType.startsWith("multipart/form-data")) {
      boolean hasFields = false;
      FormDataMultiPart mp = new FormDataMultiPart();
      if(hasFields)
        postBody = mp;
    }
    try {
		response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
		return (BarcodeResponseList) ApiInvoker.deserialize(response, "", BarcodeResponseList.class);
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	throw new ApiException(404, "");
      }
      else {
        throw ex;
      }
    }
  }
  }

