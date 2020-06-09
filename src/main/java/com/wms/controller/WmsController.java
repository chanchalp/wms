package com.wms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.wms.bean.Response;
import com.wms.bean.WmsOrder;


@CrossOrigin
@RestController
@RequestMapping(value="/wms/api")
public class WmsController {
	
	public static final Logger LOGGER = Logger.getLogger(WmsController.class);
	
	@RequestMapping(value="/receiveOrder", method=RequestMethod.POST, headers ="Accept=application/json")
	public ResponseEntity<Response> receiveOrder(@RequestBody List<WmsOrder> listWmsOrder, HttpServletRequest request) throws Exception{
		LOGGER.info("receiveOrder start... " );
		Response response =new Response();
		try {
			LOGGER.info("Order received from Integrator with order data : ");
			ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(listWmsOrder);
			//System.out.println(json);
			LOGGER.info(json);
			response.setResponseCode(200);
			response.setMessage("Order received to wms successfully.");
			
		} catch (Exception e) {
			LOGGER.error("Exception occred while receiving order :: "+e.getMessage());
			throw new Exception();
		}
		return new ResponseEntity<Response>(response,HttpStatus.OK);
		
	}
	
	
}
