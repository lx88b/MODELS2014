AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public myCreateTable(){
	String tableName = "Accounts";
	// Create a table with a primary hash key named 'name', which holds a string
	CreateTableRequest createTableRequest = new CreateTableRequest();
	// Set table AttributeDefinations
	List<AttributeDefinition> attrDefinitions = new List<AttributeDefinition>();
	AttributeDefination attrDef = new AttributeDefination("emailAddress", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_0", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_1", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_2", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_3", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_4", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_5", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_6", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_7", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_8", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_9", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("label_10", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	createTableRequest.setAttributeDefinitions(attrDefinitions);
	// Set table KeySchema
	List<KeySchemaElement> keySchema = new List<KeySchemaElement>();
	KeySchemaElement hashKey = KeySchemaElement("emailAddress", KeyType.HASH);
	keySchema.put(hashKey);
	createTableRequest.setKeySchema(keySchema);
	// Set table ProvisionedThroughput
	ProvisionedThroughput provisionedThroughput = new ProvisionedThroughput();
	provisionedThroughput.setReadCapacityUnits(1L);
	provisionedThroughput.setWriteCapacityUnits(1L);
	createTableRequest.setProvisionedThroughput(provisionedThroughput);
	dynamoDB.createTable(createTableRequest);
}
