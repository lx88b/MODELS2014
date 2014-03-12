AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public void myPutItem(){
    String tableName = "MessageMetadata";
    PutItemRequest putItemRequest = new PutItemRequest();
    putItemRequest.setTanleName(tableName);
    Map<String, AttributeValue> item = new Map<String, AttributeValue>();
    // Set predefined attributes
    item.put("emailAddress",new AttributeValue.setS(emailAddress));
    item.put("timeUUID",new AttributeValue(timeUUID));
    item.put("from",new AttributeVale.setS(from));
    item.put("to",new AttributeVale.setS(to));
    item.put("subject",new AttributeVale.setS(subject));
    item.put("date",new AttributeVale.setS(date));
    item.put("location",new AttributeVale.setS(location));
    item.put("l_1",new AttributeVale.setN(l_1));
    item.put("m_1",new AttributeVale.setN(m_1));
    item.put("l_2",new AttributeVale.setN(l_2));
    item.put("m_2",new AttributeVale.setN(m_2));
    item.put("l_3",new AttributeVale.setN(l_3));
    item.put("m_3",new AttributeVale.setN(m_3));
    item.put("l_4",new AttributeVale.setN(l_4));
    item.put("l_5",new AttributeVale.setN(l_5));
    item.put("l_6",new AttributeVale.setN(l_6));
    item.put("l_7",new AttributeVale.setN(l_7));
    item.put("l_8",new AttributeVale.setN(l_8));
    item.put("l_9",new AttributeVale.setN(l_9));
    item.put("l_10",new AttributeVale.setN(l_10));
    // Set custom attributes
    Iterator<Entry<String, Boolean>> iter = customLabels.entrySet().iterator();
    Entry<String, Boolean> customAttr;
    while(iter.hashNext()) {
        customAttr = iter.next();
        item.put(customAttr.getKey(),new AttributeValue.setN(customAttr.getValue()));
    }
    dynamoDB.putItem(putItemRequest);
}
