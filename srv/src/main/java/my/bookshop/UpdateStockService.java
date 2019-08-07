package my.bookshop;

import java.util.*;

import com.sap.cloud.sdk.service.prov.api.*;
import com.sap.cloud.sdk.service.prov.api.response.*;
import com.sap.cloud.sdk.service.prov.api.annotations.Action;
import com.sap.cloud.sdk.service.prov.api.request.OperationRequest;
import com.sap.cloud.sdk.service.prov.api.response.OperationResponse;
import com.sap.cloud.sdk.service.prov.api.ExtensionHelper;

public class UpdateStockService {
	@Action(Name="updateStock", serviceName="CatalogService")
	public OperationResponse resetStock(OperationRequest actionRequest, ExtensionHelper extensionHelper ) {
	    Map<String, Object> parameters = actionRequest.getParameters();
	    DataSourceHandler handler = extensionHelper.getHandler();
	
	    Map<String, Object> keys = new HashMap<String, Object>();
	    keys.put("ID", String.valueOf(parameters.get("Id")));
	
	    try {
	        EntityData entityData = handler.executeRead("Books", keys, Arrays.asList("ID", "stock"));
	        Integer stock = Integer.parseInt(entityData.getElementValue("stock").toString());
	        stock = stock - 1;
	        entityData = EntityData.getBuilder(entityData).removeElement("stock").addElement("stock", stock).buildEntityData("Books");
	        handler.executeUpdate(entityData, keys, false);
	
	        OperationResponse response = OperationResponse.setSuccess().setEntityData(Arrays.asList(entityData)).response();
	
	        return response;
	    } catch (Exception e) {
	        
	        ErrorResponse errorResponse = ErrorResponse.getBuilder()
	            .setMessage(e.getMessage())
	            .setCause(e)
	            .response();
	        return OperationResponse.setError(errorResponse);
	    }
	}
}
