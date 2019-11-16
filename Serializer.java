import org.jdom2.*;
import org.jdom2.output.XMLOutputter;
import org.jdom2.output.Format;

import java.io.FileWriter;
import java.lang.reflect.*;
//import java.text.Format;
import java.util.ArrayList;

public class Serializer {

	public org.jdom2.Document serial(ArrayList obj) throws Exception {

		Element rootElement = new Element("serialized");
		Document doc = new Document(rootElement);
		// doc.setRootElement(rootElement);

		return serialHelper(obj, doc);

	}

	public org.jdom2.Document serialHelper(ArrayList obj, Document doc) throws Exception {

		for (int i = 0; i < obj.size(); i++) {

			Element objectElement = new Element("object");
			Object currentObject = obj.get(i);
			Class cls = currentObject.getClass();

			objectElement.setAttribute("class", cls.toString());
			objectElement.setAttribute("id", String.valueOf(i));

			if (!cls.isArray()) {

				Field[] fields = cls.getDeclaredFields();
				for (int j = 0; j < fields.length; j++) {
					if (!Modifier.isPublic(fields[j].getModifiers()))
						fields[j].setAccessible(true);

					Element fieldElement = new Element("field");
					fieldElement.setAttribute("name", fields[j].getName());
					Class declClass = fields[j].getDeclaringClass();
					fieldElement.setAttribute("declaringclass", declClass.getName());

					if (fields[j].getType().isPrimitive()) {
						Object value = fields[j].get(currentObject);
						fieldElement.setAttribute("value", value.toString());
					} else {
						fieldElement.setAttribute("reference", String.valueOf(i + 1));
					}
					objectElement.addContent(fieldElement);
				}

			} else {
				Class componentType = cls.getComponentType();

				int length = Array.getLength(obj);
				objectElement.setAttribute("length", Integer.toString(length));
				// for (int k = 0; k < length; k++) {

			}
			doc.getRootElement().addContent(objectElement);
		}

		new XMLOutputter().output(doc, System.out);
		XMLOutputter xmlOutput = new XMLOutputter();

		// Display in a readable format
		xmlOutput.setFormat(Format.getPrettyFormat());
		xmlOutput.output(doc, new FileWriter("file.xml"));

		// rootElement.addContent(objectElement);
		return doc;

	}
}
