
package com.usecase.http.exceptions;

import com.usecase.http.StatusCode;

public class ServerException extends ResponseException {

	private static final long serialVersionUID = 1L;

	private final StatusCode status;

	public ServerException(String message, StatusCode status) {
		super(message, status);
		this.status = status;
	}

	public ServerException(String message, StatusCode status, Throwable cause) {
		super(message, status, cause);
		this.status = status;
	}

	public ServerException(String message, StatusCode status, String body) {
		super(message, status, body);
		this.status = status;
	}

	public StatusCode getStatusCode() {
		return status;
	}

	public String getBody(){
		return body;
	}

	@Override
	public String toString() {
		return "ServerException{" +
				"status=" + status +
				", body='" + body + '\'' +
				'}';
	}
}