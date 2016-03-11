package org.codefx.demo.advent;

import org.codefx.demo.advent.surprise.SurpriseFactory;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

public class Main {

	public static void main(String[] args) {
		List<SurpriseFactory> surpriseFactories = new ArrayList<>();
		ServiceLoader.load(SurpriseFactory.class).forEach(surpriseFactories::add);
		if (surpriseFactories.isEmpty())
			throw new IllegalStateException("Advent calendar can not work without at least one surprise factory.");

		ClassLoader classLoader = Main.class.getClassLoader();
		try {
			Class clazz = classLoader.loadClass("org.codefx.demo.advent.calendar.Calendar");

			Method method = clazz.getMethod("createWithSurprises", List.class);
			Object result = method.invoke(null, surpriseFactories);

		} catch (Exception e) {
			throw new  RuntimeException(e);
		}



	}

}
