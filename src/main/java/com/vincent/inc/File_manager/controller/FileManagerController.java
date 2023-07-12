package com.vincent.inc.File_manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vincent.inc.File_manager.model.FileBrowserItem;
import com.vincent.inc.File_manager.service.FileBrowserService;

@RestController
@RequestMapping("manager")
public class FileManagerController {
    public static final String LOGIN_PATH = "/api/login";
    public static final String RESOURCES_PATH = "/api/resources";
    public static final String DOWNLOAD_PATH = "/api/raw";

    @Autowired
    private FileBrowserService fileBrowserService;

    @GetMapping("/all")
    public List<FileBrowserItem> getAllFile() {
        return this.fileBrowserService.getAllItem();
    }
}
