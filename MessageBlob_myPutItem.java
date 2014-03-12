AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public void myPutItem(){
    String tableName = "MessageBlob";
    PutItemRequest putItemRequest = new PutItemRequest();
    putItemRequest.setTanleName(tableName);
    Map<String, AttributeValue> item = new Map<String, AttributeValue>();
    // Set predefined attributes
    item.put("messageUUID",new AttributeValue.setS(messageUUID));
    item.put("blockID",new AttributeValue(blockID));
    // Set custom attributes
    Iterator<Entry<String, Byte[]>> iter = subID2Data.entrySet().iterator();
    Entry<String, Byte[]> customAttr;
    while(iter.hashNext()) {
        customAttr = iter.next();
        item.put(customAttr.getKey(),new AttributeValue.setB(customAttr.getValue()));
    }
    dynamoDB.putItem(putItemRequest);
}