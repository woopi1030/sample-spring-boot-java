package com.woopi.sample.spring_boot.domain.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.woopi.woopii.core.entity.Sample;
import com.woopi.woopii.core.response.CommonResponse;

import lombok.RequiredArgsConstructor;

//TODO: swagger annotaion 추가

@RequiredArgsConstructor
@RequestMapping("/v1/sample")
@RestController
public class SampleController {

    /* SERVICES */ 
    private final SampleService sampleService;
    
    /* GET ENDPOINT */

    /**
     * Sample 전체 조회
     */
    @GetMapping
    public CommonResponse<List<SampleEntity>> getSamples() {
        return CommonResponse.successWithData(sampleService.getSamples());
    }

        /**
     * Sample 전체 조회
     */
    @GetMapping ("/{id}")
    public CommonResponse<SampleEntity> getSample(@PathVariable Long id) {
        return CommonResponse.successWithData(sampleService.getSample(id));
    }

    /* POST ENDPOINT */

    /* PATCH ENDPOINT */

    /* DELETE ENDPOINT */

}
