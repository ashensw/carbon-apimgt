package org.wso2.carbon.apimgt.rest.api.store;

import javax.ws.rs.core.Response;

public abstract class ApisApiService {
    public abstract Response apisApiIdDocumentsDocumentIdContentGet(String apiId,String documentId,String xWSO2Tenant,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response apisApiIdDocumentsDocumentIdGet(String apiId,String documentId,String xWSO2Tenant,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response apisApiIdDocumentsGet(String apiId,Integer limit,Integer offset,String xWSO2Tenant,String accept,String ifNoneMatch);
    public abstract Response apisApiIdGet(String apiId,String accept,String ifNoneMatch,String ifModifiedSince,String xWSO2Tenant);
    public abstract Response apisApiIdSwaggerGet(String apiId,String accept,String ifNoneMatch,String ifModifiedSince,String xWSO2Tenant);
    public abstract Response apisApiIdThumbnailGet(String apiId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract Response apisGenerateSdkPost(String apiId,String language,String xWSO2Tenant);
    public abstract Response apisGet(Integer limit,Integer offset,String xWSO2Tenant,String query,String accept,String ifNoneMatch);

    public abstract String apisApiIdDocumentsDocumentIdContentGetGetLastUpdatedTime(String apiId,String documentId,String xWSO2Tenant,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract String apisApiIdDocumentsDocumentIdGetGetLastUpdatedTime(String apiId,String documentId,String xWSO2Tenant,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract String apisApiIdDocumentsGetGetLastUpdatedTime(String apiId,Integer limit,Integer offset,String xWSO2Tenant,String accept,String ifNoneMatch);
    public abstract String apisApiIdGetGetLastUpdatedTime(String apiId,String accept,String ifNoneMatch,String ifModifiedSince,String xWSO2Tenant);
    public abstract String apisApiIdSwaggerGetGetLastUpdatedTime(String apiId,String accept,String ifNoneMatch,String ifModifiedSince,String xWSO2Tenant);
    public abstract String apisApiIdThumbnailGetGetLastUpdatedTime(String apiId,String accept,String ifNoneMatch,String ifModifiedSince);
    public abstract String apisGenerateSdkPostGetLastUpdatedTime(String apiId,String language,String xWSO2Tenant);
    public abstract String apisGetGetLastUpdatedTime(Integer limit,Integer offset,String xWSO2Tenant,String query,String accept,String ifNoneMatch);
}

