AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public void myPutItem(){
    String tableName = "IndexLabels";
    PutItemRequest putItemRequest = new PutItemRequest();
    putItemRequest.setTanleName(tableName);
    Map<String, AttributeValue> item = new Map<String, AttributeValue>();
    // Set predefined attributes
    item.put("emailAddress_LabelID",new AttributeValue.setS(emailAddress_LabelID));
    item.put("messageUUID",new AttributeValue(messageUUID));
    item.put("UUID",new AttributeValue(UUID));
    dynamoDB.putItem(putItemRequest);
}