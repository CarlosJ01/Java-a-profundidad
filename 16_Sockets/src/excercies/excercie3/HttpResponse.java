package excercies.excercie3;

import java.io.Serializable;
import java.util.Map;

public class HttpResponse implements Serializable{
	
	private static final long serialVersionUID = 6981551095446280613L;
	
	Map<String, String> headers;
	String body;
	Integer status;
	
	public HttpResponse(Map<String, String> headers, String body, Integer status) {
		super();
		this.headers = headers;
		this.body = body;
		this.status = status;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "HttpResponse [headers=" + headers + ", body=" + body + ", status=" + status + "]";
	}
	
	
}
