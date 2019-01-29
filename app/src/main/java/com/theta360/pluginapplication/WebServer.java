package com.theta360.pluginapplication;

import java.io.IOException;

import fi.iki.elonen.NanoHTTPD;

public class WebServer extends NanoHTTPD {
    private final static int PORT = 8888;

    public WebServer() throws IOException {
        super(PORT);
        start();
        System.out.println( "\nRunning! Point your browser to http://localhost:8888/ \n" );
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>Hello server</h1>\n";
        msg += "<p>We serve " + session.getUri() + " !</p>";
        return newFixedLengthResponse( msg + "</body></html>\n" );
    }
}

