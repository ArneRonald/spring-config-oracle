package com.config.environment;

import com.config.data.entities.ApplicationEntity;
import com.config.data.entities.PropertyEntity;
import com.config.data.repository.ApplicationRepository;
import com.config.data.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.cloud.config.server.environment.EnvironmentRepository;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.*;

@Component
public class OracleEnvironmentRepository implements EnvironmentRepository {

    private static final String DEFAULT_PROFILE = "default";

    private static final String DEFAULT_LABEL = "default";

    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Environment findOne(String application, String profile, String label) {

        String[] profilesArr = StringUtils.commaDelimitedListToStringArray(profile);

        List<String> profiles = new ArrayList<>(Arrays.asList(profilesArr.clone()));

        if (profile.equals("")){
            profiles.add(DEFAULT_PROFILE);
        } else {
            for (int i = 0; i < profiles.size(); i++) {
                profiles.set(i, profiles.get(i).trim());
            }
        }
        profiles = sortedUnique(profiles);

        List<String> labels = Arrays.asList(label, DEFAULT_LABEL); // Default configuration will have 'null' label
        labels = sortedUnique(labels);

        ApplicationEntity applicationEntity = applicationRepository.findOneApplicationNameByApplicationName(application);

        Environment environment = new Environment(application, profilesArr, label, null, null);

        Map m = mapPropertiesToMap(applicationEntity.getPropertyEntities());

        PropertySource source = new PropertySource(application, m);
        environment.add(source);
        return environment;
    }

    private Map mapPropertiesToMap(List<PropertyEntity> entities) {

        Map map = new LinkedHashMap<String, Object>();

        for (PropertyEntity s : entities) {
            map.put(s.getPropertyKey(), s.getPropertyValue());
        }
        return map;
    }


    private ArrayList<String> sortedUnique(List<String> values) {
        return new ArrayList<String>(new LinkedHashSet<String>(values));
    }
}
