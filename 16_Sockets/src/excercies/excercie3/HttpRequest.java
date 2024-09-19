package excercies.excercie3;

import java.io.Serializable;
import java.util.Map;

public class HttpRequest implements Serializable{
	
	private static final long serialVersionUID = -1973146946085175365L;
	
	private Map<String, String> headers;
	private String body;
	
	public HttpRequest(Map<String, String> headers, String body) {
		super();
		this.headers = headers;
		this.body = body;
	}
	
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "HttpRequest [headers=" + headers + ", body=" + body + "]";
	}
	
	
}
