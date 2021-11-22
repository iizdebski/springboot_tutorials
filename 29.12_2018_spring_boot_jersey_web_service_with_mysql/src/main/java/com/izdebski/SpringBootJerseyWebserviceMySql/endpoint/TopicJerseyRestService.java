package com.izdebski.SpringBootJerseyWebserviceMySql.endpoint;

import com.izdebski.SpringBootJerseyWebserviceMySql.entity.Topic;
import com.izdebski.SpringBootJerseyWebserviceMySql.service.TopicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/topics")
public class TopicJerseyRestService {
    private static final Logger logger = LoggerFactory.getLogger(TopicJerseyRestService.class);

    @Autowired
    private TopicService topicService;

    @POST
    @Path("/create")
    @Consumes(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response createTopic(Topic topic) {
        boolean isAdded = topicService.addTopic(topic);
        if (!isAdded) {
            logger.info("Topic already exits.");
            return Response.status(Response.Status.CONFLICT).build();
        }
        return Response.created(URI.create("/topics/topic/"+ topic.getTopicId())).build();
    }

    @PUT
    @Path("/topic/update")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response updateTopic(Topic topic) {
        topicService.updateTopic(topic);
        return Response.ok(topic).build();
    }

    @GET
    @Path("/topicId/{topicId}")
    @Produces(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response getTopicById(@PathParam("topicId") Integer topicId) {
        Topic topic = (Topic) topicService.getTopicById(topicId);
        return Response.ok(topic).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response getAllTopics() {
        List<Topic> list = topicService.getAllTopices();
        return Response.ok(list).build();
    }

    @DELETE
    @Path("/topicId/{topicId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @CrossOrigin
    public Response deleteTopic(@PathParam("topicId") Integer topicId) {
        topicService.deleteTopic(topicId);
        return Response.noContent().build();
    }
}