package com.example.ea_system.web.controller;

import com.example.ea_system.bean.Resume;
import com.example.ea_system.bean.Tutorial;
import com.example.ea_system.service.ILoginerService;
import com.example.ea_system.service.ITutorialService;
import com.example.ea_system.util.Message;
import com.example.ea_system.util.MessageUtil;
import com.example.ea_system.util.UIMessage;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

//@RestController
@Controller
@RequestMapping("/Tutorial")
@Api(description = "就业指导管理")
public class TutorialController {
    @Autowired
    private ITutorialService tutorialService;

    @Autowired
    private ILoginerService loginerService;

    @PostMapping("/add")
    @ApiOperation("添加就业指导")
    @ResponseBody
    public UIMessage add(Tutorial tutorial) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        tutorial.setCompanyid(loginerService.getLoginer().get(0).getCompanyid());
        tutorial.setAddtime(df.parse(df.format(new Date())));
//        System.out.println(tutorial);
        tutorialService.addAndUpdate(tutorial);
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;
    }

    @RequestMapping("/deleteOne")
    @ResponseBody
    public UIMessage deleteOne(int id){
        tutorialService.deleteByid(id);
//        System.out.println("删除成功");
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;

    }

    @RequestMapping("/deleteMany")
    @ResponseBody
    public UIMessage deleteMany(int[] ids){
//        System.out.println("kkkk"+ids[0]);
        tutorialService.deleteByids(ids);
//        System.out.println("批量删除成功");
        UIMessage uiMessage = new UIMessage();
        uiMessage.setMsg("success");
        return uiMessage;
    }

    @RequestMapping("/selectAll")
    @ApiOperation("查询所有信息")
    @ResponseBody
    public UIMessage<Tutorial> select()
    {
        List<Tutorial> list=tutorialService.selectAll();
        UIMessage<Tutorial> resumeUIMessage = new UIMessage<Tutorial>();
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
    public UIMessage<Tutorial> selectByID() throws Exception {
        int id = loginerService.getLoginer().get(0).getCompanyid();
        List<Tutorial> list=tutorialService.selectByComId(id);

        UIMessage<Tutorial> resumeUIMessage = new UIMessage<Tutorial>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println(resumeUIMessage.getData());
//        System.out.println("查询成功");
        return resumeUIMessage;
    }

    @GetMapping("/selectByTitle")
    @ApiOperation("通过标题进行模糊查询")
    @ResponseBody
    public UIMessage<Tutorial> selectByTitle(String search)
    {
        System.out.println("查询"+search);
        List<Tutorial> list=tutorialService.selectName(search);
        UIMessage<Tutorial> resumeUIMessage = new UIMessage<Tutorial>();
        resumeUIMessage.setCode(0);
        resumeUIMessage.setMsg("成功");
        resumeUIMessage.setCount((long)list.size());
        resumeUIMessage.setData(list);
//        System.out.println(resumeUIMessage.getData());
        return resumeUIMessage;
    }


}
