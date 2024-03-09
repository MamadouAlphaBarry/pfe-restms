package it.cws.cwsjobservice.config;

import it.cws.cwsjobservice.dtos.JobDtoRequest;
import it.cws.cwsjobservice.entities.Job;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

   @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper= new ModelMapper();
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        modelMapper.addMappings(jobMapping);

        return  modelMapper;
    }
    PropertyMap<Job,JobDtoRequest> jobMapping= new PropertyMap<Job, JobDtoRequest>() {
        @Override
        protected void configure() {

        }
    };
}
