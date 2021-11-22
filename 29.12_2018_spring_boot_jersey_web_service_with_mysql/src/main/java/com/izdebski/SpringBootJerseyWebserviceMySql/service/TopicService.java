package com.izdebski.SpringBootJerseyWebserviceMySql.service;

import com.izdebski.SpringBootJerseyWebserviceMySql.entity.Topic;

import java.util.List;


public interface TopicService {
    public abstract List<Topic> getAllTopices();
    public abstract Topic getTopicById(int topicId);
    public abstract boolean addTopic(Topic topic);
    public abstract void updateTopic(Topic topic);
    public abstract void deleteTopic(int topicId);
}