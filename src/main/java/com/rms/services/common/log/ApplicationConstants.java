package com.rms.services.common.log;

public interface ApplicationConstants {
	
	public static final String RMS_DATASOURCE_NAME = "rmsDs";
//	public static final String PMCHANNEL_DATASOURCE_NAME = "PMCHANNEL-DB-DS";

	public static final String CUSTOMER_CARE = "CUSTOMER_CARE";
	public static final String SYSTEM_NAME = "commonconfig";
    public static final String LOG_NAME_SYSTEM_DEBUG_LOGGER = "com.publicmobile.log.systemDebugLogger";
    
    //general errors
    public static final int ERR_NONE = 0;
    public static final int ERR_SYSTEM = 100;
    public static final int ERR_GENERAL = 110;
    //Moneris specific
//    public static final int ERR_CC_INVALID = 200;
//    public static final int ERR_INSUF_FUNDS = 201;
//    public static final int ERR_CC_AVS_FAILED = 202;
//    public static final int ERR_CC_CVD_FAILED = 203;
    //Rator specific
//    public static final int ERR_REGISTERING_CC_PAYMENT = 300;
//    public static final int ERR_REGISTERING_PACC = 301;
//    public static final int ERR_REACTIVATION_NEEDED = 302;
//    public static final int ERR_INVALID_ACCOUNT = 303;
    
    
    
    public static final int MAXIMUM_EXCEPTION_STACK_TRACE_DEPTH = 20;
    
    public static final String ENGLIGH_CODE = "en"; 
    public static final String FRENCH_CODE = "fr";
   
	
	public static final String REMITONE_USER_NAME = "remitOne.userName";
	public static final String REMITONE_PASSWORD = "remitOne.password";
	public static final String REMITONE_PIN = "remitOne.pin";
	public static final String REMITONE_BASE_WS_URL = "remitOne.base-web-service-url";

	public static final String REMITONE_REMITTER_WEB_SERVICE_URL = "remitOne.web-service.remitter.url";
	public static final String REMITONE_REMITTER_WEB_SERVICE_QNAME = "remitOne.web-service.remitter.qname";
	public static final String REMITONE_REMITTER_WEB_SERVICE_NAME = "remitOne.web-service.remitter.name";

	public static final String REMITONE_BENEFICIARY_WEB_SERVICE_URL = "remitOne.web-service.beneficiary.url";
	public static final String REMITONE_BENEFICIARY_WEB_SERVICE_QNAME = "remitOne.web-service.beneficiary.qname";
	public static final String REMITONE_BENEFICIARY_WEB_SERVICE_NAME = "remitOne.web-service.beneficiary.name";

	public static final String REMITONE_TRANSACTION_WEB_SERVICE_URL = "remitOne.web-service.transaction.url";
	public static final String REMITONE_TRANSACTION_WEB_SERVICE_QNAME = "remitOne.web-service.transaction.qname";
	public static final String REMITONE_TRANSACTION_WEB_SERVICE_NAME = "remitOne.web-service.transaction.name";

	public static final String TRANSACTION_ALLOWED_CUST_STATUS = "transaction.allowed-cust-status";
	public static final String TRANSACTION_SMS_CONFIRMATION = "transaction.sms_confirmation";
	public static final String TRANSACTION_SMS_NOTIFICATION = "transaction.sms_notification";

	public static final String MAIL_SMTP_HOST = "mail.smtp.host";
	public static final String MAIL_SMTP_PORT = "mail.smtp.port";
	public static final String MAIL_SMTP_USER = "mail.smtp.user";
	public static final String MAIL_SMTP_PASSWORD = "mail.smtp.password";

	
	  public static final String CFG_CT_PAYMENT_COMPANY_NUMBER= "ct-payment.CompanyNumber";
	    public static final String CFG_CT_PAYMENT_MERCHANT_NUMBER= "ct-payment.MerchantNumber";
	    public static final String CFG_CT_PAYMENT_CUSTOMER_NUMBER= "ct-payment.CustomerNumber";
	    public static final String CFG_CT_PAYMENT_INPUT_TYPE= "ct-payment.InputType";
	    public static final String CFG_CT_PAYMENT_POS_TERM_NUMBER= "ct-payment.POSTermNumber";
	    public static final String CFG_CT_PAYMENT_OPERATOR_ID= "ct-payment.OperatorID";
	    public static final String CFG_CT_PAYMENT_SUCCESS_URL= "ct-payment.SuccessURL";
	    public static final String CFG_CT_PAYMENT_FAILURE_URL= "ct-payment.FailureURL";
	    public static final String CFG_CT_PAYMENT_IPADDRESS= "ct-payment.IPAddress";
	    public static final String CFG_CT_PAYMENT_KEY_DIRECTORY= "ct-payment.KeyDirectory";
	    public static final String CFG_CT_PAYMENT_DONEW_PURCHASE_SUCCESS_CODE= "ct-payment.doNewPurchaseSession.SuccessCode";

	

	public static final String CFG_RATOR_DS="rator.datasource.name";
	public static final String CFG_RMS_DS="rms.datasource.name";
	public static final int    DEFAULT_MAX_RETURN_ROWS=10;
	
	
	public static final String ORGANISATION_SEARCH_CRITERIA = "organisationSearchCriteriaParm";
	public static final String OCNS_CONFIG = "ocns-config";
	
	public static final String BOOLEAN_TRUE="T";
	public static final String BOOLEAN_FALSE="F";
	
	public static final String PAYMENT_GATEWAY_PARTNER="PG-PRTNR";
	
	public static final String RELEASE_AMOUNT="release.amount";
	
	public static final String SERVICE_ORDER_ACTION_ADD="ADD";
	public static final String SERVICE_ORDER_ACTION_REMOVE="REMOVE";
	public static final String SERVICE_ORDER_ACTION_NOCHANGE="NOCHNG";
//	
//	public static final String REMITONE_ACCOUNT_TYPE="cdrator.accountType";
//	public static final String REMITONE_CAPTURE_STATUS_ID="cdrator.captureStatusId";
//	public static final String REMITONE_CHARGE_ITEM_ID="cdrator.chargeItemId";
//	public static final String REMITONE_PAYMENT_ORIGIN_ID="cdrator.paymentOriginId";
//	public static final String CDRATOR_TAX_ZONE_ID="cdrator.taxZoneId";
//	public static final String CDRATOR_LANGUAGE="cdrator.language";
//	public static final String CDRATOR_PAYMENT_ID="cdrator.paymentId";
//	
//	public static final String OCS_ACCOUNT_TYPE="ocs.accountType";
	

	public static final String ENGLISH = "EN";
	public static final String FRENCH = "FR";
	public static final String VERIFICATION_URL= "security.verification-url";
	public static final String VERIFICATION_CODE_EXPIRY_HOURS= "security.verification-code-expiry-hours";
	
		
	public static final String sanctionsReferences= "SanctionList.sanctions_references";

	
}
