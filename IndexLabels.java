AmazonDynamoDBClient dynamoDB = new AmazonDynamoDBClient();
public myCreateTable(){
	String tableName = "IndexLabels";
	// Create a table with a primary hash key named 'name', which holds a string
	CreateTableRequest createTableRequest = new CreateTableRequest();
	// Set table AttributeDefinations
	List<AttributeDefinition> attrDefinitions = new List<AttributeDefinition>();
	AttributeDefination attrDef = new AttributeDefination("emailAddress_LabelID", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("messageUUID", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	attrDef = new AttributeDefination("UUID", ScalarAttributeType.S);
	attrDefinitions.put(attrDef);
	createTableRequest.setAttributeDefinitions(attrDefinitions);
	// Set table KeySchema
	List<KeySchemaElement> keySchema = new List<KeySchemaElement>();
	KeySchemaElement hashKey = KeySchemaElement("emailAddress_LabelID", KeyType.HASH);
	keySchema.put(hashKey);
	KeySchemaElement rangeKey = KeySchemaElement("messageUUID", KeyType.RANGE);
	keySchema.put(rangeKey);
	createTableRequest.setKeySchema(keySchema);
	// Set table ProvisionedThroughput
	ProvisionedThroughput provisionedThroughput = new ProvisionedThroughput();
	provisionedThroughput.setReadCapacityUnits(1L);
	provisionedThroughput.setWriteCapacityUnits(1L);
	createTableRequest.setProvisionedThroughput(provisionedThroughput);
	dynamoDB.createTable(createTableRequest);
}
