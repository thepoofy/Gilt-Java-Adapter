package com.williamvanderhoef.gilt.parsers;



public interface ResultsParser<T> {

	public T parse(String fileContents) throws Exception;
}
