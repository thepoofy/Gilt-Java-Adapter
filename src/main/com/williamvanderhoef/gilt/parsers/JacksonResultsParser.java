package com.williamvanderhoef.gilt.parsers;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
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

		TypeFactory tf = TypeFactory.defaultInstance();

		JavaType jt = tf.constructType(adapter.defineType());

		return mapper.readValue(fileContents, jt);
	}

}
