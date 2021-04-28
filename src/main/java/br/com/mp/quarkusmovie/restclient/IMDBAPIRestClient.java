package br.com.mp.quarkusmovie.restclient;

import br.com.mp.quarkusmovie.restclient.model.MovieIMDB;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "restclient-imbd-api")
@Produces(MediaType.APPLICATION_JSON)
public interface IMDBAPIRestClient {
    MovieIMDB search(@HeaderParam("x-rapidapi-key") String xRapidapiKey,
                     @HeaderParam("x-rapidapi-host") String xRapidapiHost,
                     @QueryParam("") String query);

}
