package com.example.upload2.Controller;

import com.example.upload2.Dto.UploadDto;
import com.example.upload2.Mappers.UploadMapper;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UploadController {

    @Autowired
    private UploadMapper uploadMapper;

    @GetMapping("/main")
    public String getMain(){
        return "main";
    }

    @GetMapping("/upload")
    public String getUpload(){
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String fileUpload(MultipartFile uploadFile){

        try {
            String UPLOAD_DIR = "C:\\temp\\upload";
            String oName = uploadFile.getOriginalFilename();
            Long fileSize = uploadFile.getSize();

            //폴더 이름은 2023 - 06 - 27
            String folderName = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
            File f = new File(UPLOAD_DIR + "\\"+ folderName);

            if(!f.exists()){
                f.mkdir();
                System.out.println("폴더가 생성 되었습니다.");
            } else {
                System.out.println("폴더가 존재합니다.");
            }

//            if(!folder.exists()){
//                folder.mkdir();
//                System.out.println("폴더가 생성 되었습니다.");
//            } else {
//                System.out.println("폴더가 존재합니다.");
//            }

            String ext =  oName.substring(oName.lastIndexOf("."));

            String changedName = System.currentTimeMillis() + ext;

            Path path = Paths.get(f.toString(), changedName);
            Files.write(path, uploadFile.getBytes());

            Map<String, Object> map = new HashMap<>();
            map.put("msg", "success");
            map.put("oName", oName);
            map.put("size", ((double) fileSize / (double) 1000));

        } catch (Exception e) {
           e.printStackTrace();
        }
        return "";
    }

    @GetMapping("/list")
    public String getList(){
        return "list";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String checkLogin(@ModelAttribute UploadDto uploadDto, HttpServletRequest httpServletRequest){
        UploadDto emp = uploadMapper.getEmp(uploadDto);

        Map<String, Object> map = new HashMap<>();

        if(emp != null) {
            HttpSession httpSession = httpServletRequest.getSession(); // 세션 객체 만든 후
            httpSession.setAttribute("sessInfo", emp); // 세션 객체에 개인 정보 삽입
            httpSession.setMaxInactiveInterval(60 * 30); // 세션 유효 시간
            map.put("msg", "success ");
        } else {
            map.put("msg", "failure");
        }
        return "";
    }

    @GetMapping("/logout")
    public String getLogout(HttpSession httpSession){
        httpSession.invalidate();
        return "redirect:/login";
    }

}
