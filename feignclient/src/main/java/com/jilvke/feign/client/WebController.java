
package com.jilvke.feign.client;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


/**
 * @ClassName :  WebController
 * @Description:
 * @Author: JILVKE
 * @CreateDate: 2018/11/07
 * @Version: 1.0
 */

@RestController
public class WebController {
    @Autowired
    ConfigClientService configClientService;
/*    @Autowired
    private UploadService uploadService;*/

    @RequestMapping(value = "", method = RequestMethod.GET )
    public String sayHello() {
        return configClientService.sayHello();
    }
/*    @RequestMapping(value = "/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String testHandleFileUpload( @NonNull  MultipartFile file) {
        if (file == null ){
            System.out.println(".........................");
        }
        return uploadService.handleFileUpload(file);
    }*/

    public String serviceFailure() {
        return "hello world service is not available !";
    }
}

