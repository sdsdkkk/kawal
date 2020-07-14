package com.github.sdsdkkk.kawal.responses;

public class StatusResponse {
    public String status;
    public String message;

    public StatusResponse(String responseStatus, String statusMsg) {
        status = responseStatus;
        message = statusMsg;
    }
}
