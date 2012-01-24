package com.williamvanderhoef.gilt.parsers;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.type.JavaType;

import com.williamvanderhoef.gilt.adapters.DefinedType;

/**
 *
 * @author wvanderhoef
 *
 * @param <T>
 */
public class JacksonResultsParser<T> implements ResultsParser<T> {

	private DefinedType adapter;

	private boolean isStrictValidation = false;

	/**
	 *
	 * @param adapter
	 */
	public JacksonResultsParser(DefinedType adapter) {

		this.adapter = adapter;
	}

	/**
	 *
	 * @param isStrict
	 */
	public void setStrictValidation(boolean isStrict)
	{
		this.isStrictValidation = isStrict;
	}

	public T parse(String fileContents) throws Exception
	{
		ObjectMapper mapper = new ObjectMapper();

		DeserializationConfig cfg = mapper.getDeserializationConfig();
		cfg.set(Feature.FAIL_ON_UNKNOWN_PROPERTIES, isStrictValidation);
		mapper.setDeserializationConfig(cfg);

//		mapper.registerModule(createNotificationModule());

		TypeFactory tf = TypeFactory.defaultInstance();

		JavaType jt = tf.constructType(adapter.defineType());

		return mapper.readValue(fileContents, jt);
	}


//	private Module createNotificationModule()
//	{
//		NotificationDeserializer notificationDeserializer = new NotificationDeserializer();
//		ResponsesDeserializer resDes= new ResponsesDeserializer();
//
//		//specify a unique class attribute and the class that it is unique for
//		for(Notifications.NotificationType type: Notifications.NotificationType.values())
//		{
//			notificationDeserializer.registerType(type.name(),type.getTypeOf());
//		}
//
//		SimpleModule module = new SimpleModule(
//				"PolymorphicNotificationDeserializerModule", new Version(1, 0, 0, null));
//		module.addDeserializer(Notifications.class, notificationDeserializer);
//		module.addDeserializer(Responses.class, resDes);
//
//		return module;
//	}
//
//	class NotificationDeserializer extends StdDeserializer<Notifications>
//	{
//		private Map<String, Class<? extends Notification>> registry = new HashMap<String, Class<? extends Notification>>();
//
//		NotificationDeserializer() {
//			super(Notifications.class);
//		}
//
//		void registerType(String uniqueAttribute, Class<? extends Notification> animalClass) {
//			registry.put(uniqueAttribute, animalClass);
//		}
//
//		@Override
//		public Notifications deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
//		{
//			ObjectMapper mapper = (ObjectMapper) jp.getCodec();
//			ObjectNode fsqObject = (ObjectNode) mapper.readTree(jp);
//
//			if(fsqObject.has("item")
//					&& fsqObject.has("type")
//					&& registry.get(fsqObject.get("type").getValueAsText()) != null)
//			{
//				String type = fsqObject.get("type").getValueAsText();
//
//				Class<? extends Notification> instanceClass = registry.get(type);
//
//				Notification n = mapper.readValue(fsqObject.get("item"), instanceClass);
//
//				Notifications notifications = new Notifications();
//				notifications.setType(type);
//				notifications.setItem(n);
//
//				return notifications;
//			}
//
//			return null;
//		}
//	}
//
//	class ResponsesDeserializer extends StdDeserializer<Responses>
//	{
//		ResponsesDeserializer() {
//			super(Responses.class);
//		}
//
//		@Override
//		public Responses deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException
//		{
//			ObjectMapper mapper = (ObjectMapper) jp.getCodec();
//			ObjectNode fsqObject = (ObjectNode) mapper.readTree(jp);
//
//			if(fsqObject.has("responses")
//					&& fsqObject.get("responses").isArray())
//			{
//				Iterator<JsonNode> responses = fsqObject.get("responses").getElements();
//
//				List<String> res = new ArrayList<String>();
//
//				while(responses.hasNext())
//				{
//					res.add(responses.next().toString());
//				}
//
//				Responses myResponses = new Responses();
//				myResponses.setResponses(res);
//
//				return myResponses;
//			}
//
//			return null;
//		}
//	}
}
