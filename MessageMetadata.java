AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public myCreateTable(){
	String tableName = "MessageMetadata";
	// Create a table with a primary hash key named 'name', which holds a string
	CreateTableRequest createTableRequest = new CreateTableRequest();
	// Set table AttributeDefinations
	List<AttributeDefinition> attrDefinitions = new List<AttributeDefinition>();
	AttributeDefination attrDef = new AttributeDefination("emailAddress", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("timeUUID", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("from", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("to", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("subject", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("date", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_1", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("m_1", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_2", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("m_2", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_3", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("m_3", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_4", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_5", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_6", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_7", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_8", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_9", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("l_10", ScalarAttributeType.N);
	attrDefinitions.put(attrDef);
	createTableRequest.setAttributeDefinitions(attrDefinitions);
	// Set table KeySchema
	List<KeySchemaElement> keySchema = new List<KeySchemaElement>();
	KeySchemaElement hashKey = KeySchemaElement("emailAddress", KeyType.HASH);
	keySchema.put(hashKey);
	KeySchemaElement rangeKey = KeySchemaElement("timeUUID", KeyType.RANGE);
	keySchema.put(rangeKey);
	createTableRequest.setKeySchema(keySchema);
	// Set table ProvisionedThroughput
	ProvisionedThroughput provisionedThroughput = new ProvisionedThroughput();
	provisionedThroughput.setReadCapacityUnits(1L);
	provisionedThroughput.setWriteCapacityUnits(1L);
	createTableRequest.setProvisionedThroughput(provisionedThroughput);
	dynamoDB.createTable(createTableRequest);
}