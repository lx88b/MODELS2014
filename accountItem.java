AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public void myPutItem(){
    String tableName = "Accounts";
    PutItemRequest putItemRequest = new PutItemRequest();
    putItemRequest.setTanleName(tableName);
    Map<String, AttributeValue> item = new Map<String, AttributeValue>();
    // Set predefined attributes
    item.put("emailAddress",new AttributeVale.setS(emailAddress));
    item.put("label_0",new AttributeValue.setS("all"));
    item.put("label_1",new AttributeValue.setS("inbox"));
    item.put("label_2",new AttributeValue.setS("drafts"));
    item.put("label_3",new AttributeValue.setS("sent"));
    item.put("label_4",new AttributeValue.setS("trash"));
    item.put("label_5",new AttributeValue.setS("spam"));
    item.put("label_6",new AttributeValue.setS("starred"));
    item.put("label_7",new AttributeValue.setS("important"));
    item.put("label_8",new AttributeValue.setS("notifications"));
    item.put("label_9",new AttributeValue.setS("attachments"));
    item.put("label_10",new AttributeValue.setS("pop3"));
    // Set custom attributes
    Iterator<Entry<String, String>> iter = customLabels.entrySet().iterator();
    Entry<String, String> customAttr;
    while(iter.hashNext()) {
        customAttr = iter.next();
        item.put(customAttr.getKey(),new AttributeValue.setS(customAttr.getValue()));
    }
    dynamoDB.putItem(putItemRequest);
}
