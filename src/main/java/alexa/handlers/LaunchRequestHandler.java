package main.java.alexa.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class LaunchRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {

        String speechText = "Welcome! Let's find a place to eat. To start, say Where are we eating";
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("Welcome", speechText)
                .withReprompt(speechText)
                .build();
    }

}

