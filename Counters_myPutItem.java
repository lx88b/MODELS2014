AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public void myPutItem(){
    String tableName = "Counters";
    PutItemRequest putItemRequest = new PutItemRequest();
    putItemRequest.setTanleName(tableName);
    Map<String, AttributeValue> item = new Map<String, AttributeValue>();
    // Set predefined attributes
    item.put("emailAddress",new AttributeValue.setS(emailAddress));
    // Set custom attributes
    Iterator<Entry<String, int>> iter = labelID2Stats.entrySet().iterator();
    Entry<String, int> customAttr;
    while(iter.hashNext()) {
        customAttr = iter.next();
        item.put(customAttr.getKey(),new AttributeValue.setN(customAttr.getValue()));
    }
    dynamoDB.putItem(putItemRequest);
}