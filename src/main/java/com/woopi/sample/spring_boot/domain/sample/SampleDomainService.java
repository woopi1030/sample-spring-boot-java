package com.woopi.sample.spring_boot.domain.sample;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;


import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SampleDomainService {
    
    /* REPOSITORY */ 
    private final SampleRepository sampleRepository;

    /* GET METHODS */

    /**
     * Sample 전체 조회
     * @return 
     */
    public List<SampleEntity> getSamples() throws NotFoundException {
        // TODO: 요청 파라미터가 없는 경우에  Not Found Exception을 어떻게 표현할지 고민해야함
        // TODO: Sample.class가 아니고, List<Sample>.class인데, 그렇게 들어가진 않는다....어떻게 할까
        return Optional.of(sampleRepository.findAll()).orElseThrow(() -> new NotFoundException());
    }

    /**
     * id로 Sample 조회
     * @param id
     * @return
     * @throws NotFoundException 
     */
    public SampleEntity getSample (Long id) throws NotFoundException {
        return sampleRepository.findById(id).orElseThrow(() -> new NotFoundException());
    }

    /* CREATE METHODS */

    /* UPDATE METHODS */

    /* DELETE METHODS */

}
