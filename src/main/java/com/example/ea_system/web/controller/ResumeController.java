package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Loginer;
import com.example.ea_system.bean.Resume;
import com.example.ea_system.service.IGraduateService;
import com.example.ea_system.service.ILoginerService;
import com.example.ea_system.service.IResumeService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/Resume")
@Api(description = "简历信息")
public class ResumeController {

    @Autowired
    private IResumeService resumeService;

    @Autowired
    private ILoginerService loginerService;




    @RequestMapping("/changeResume")
    @ResponseBody
    public UIMessage changeResume(String title,String adjunct,String content) throws Exception{
//        System.out.println("提交成功"+title+" "+adjunct+" "+content);
        boolean hasexit = false;
        Resume resume = null;
        List<Resume> resumes = resumeService.selectAll();
        for(int i=0;i<resumes.size();i++){
            if(resumes.get(i).getTitle().equals(title)){
                resume = resumes.get(i);
                hasexit=true;
                break;
            }
        }

        if(!hasexit){
            resume =new Resume();
            resume.setTitle(title);
            resume.setAdjunct(adjunct);
            resume.setContent(content);
            resume.setGraduateid(loginerService.getLoginer().get(0).getGraduaterid());
        }
        else{
            resume.setAdjunct(adjunct);
            resume.setContent(content);
        }



        resumeService.addAndUpdate(resume);
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;

    }


    @RequestMapping("/deleteOne")
    @ResponseBody
    public UIMessage deleteOne(int id){
        resumeService.deleteByid(id);
//        System.out.println("删除成功");
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;

    }

    @RequestMapping("/deleteMany")
    @ResponseBody
    public UIMessage deleteMany(int[] ids){
//        System.out.println("kkkk"+ids[0]);
        resumeService.deleteByids(ids);
//        System.out.println("批量删除成功");
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;
    }

    @RequestMapping("/selectAll")
    @ApiOperation("查询所有信息")
    @ResponseBody
    public UIMessage<Resume> select()
    {
        List<Resume> list=resumeService.selectAll();
        UIMessage<Resume> resumeUIMessage = new UIMessage<Resume>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println(111);
       return resumeUIMessage;
    }

    @GetMapping("/selectByID")
    @ApiOperation("根据ID查询对应简历")
    @ResponseBody
    public UIMessage<Resume> selectByID() throws Exception {
        int id = loginerService.getLoginer().get(0).getGraduaterid();
        List<Resume> list=resumeService.selectByGraId(id);

        UIMessage<Resume> resumeUIMessage = new UIMessage<Resume>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println("查询成功");
        return resumeUIMessage;
    }

    @GetMapping("/selectByTitle")
    @ApiOperation("通过标题进行模糊查询")
    @ResponseBody
    public UIMessage<Resume> selectByTitle(String search)
    {
//        System.out.println("查询"+search);
        List<Resume> list=resumeService.selectName(search);
        UIMessage<Resume> resumeUIMessage = new UIMessage<Resume>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println(resumeUIMessage.getData());
        return resumeUIMessage;
    }


}
