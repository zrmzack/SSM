package cn.itcast.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

/**
 * @author zack
 * @create 2020-01-06-3:53
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/fileupload1")
    public String fileupload1(HttpServletRequest request) throws Exception {
        System.out.println("文件上穿");
        //使用fileupload
        String path = request.getSession().getServletContext().getRealPath("/uploads");
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        }

        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            if (item.isFormField()) {

            } else {
                String name = item.getName();
                item.write(new File(path, name));
                item.delete();
            }
        }
        return "success";
    }
}
