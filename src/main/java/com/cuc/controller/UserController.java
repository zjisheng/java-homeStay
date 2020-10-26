package com.cuc.controller;

import com.cuc.domain.User;
import com.cuc.service.IUserService;
import com.cuc.vo.JsonResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Api(value = "userController", tags = "user控制器")
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController {

    @Resource
    @Autowired
    IUserService iUserService;

    @ResponseBody
    @ApiOperation(value = "新增", notes = "新增user")
    @GetMapping("/add")
    public JsonResponse<Integer> addUser(User user){
        return renderSuccess(iUserService.addUser(user));
    }

    @ResponseBody
    @ApiOperation(value = "删除id", notes = "删除userId")
    @GetMapping("/deleteUserId")
    public JsonResponse<Integer> deleteUserId(String userId){ return renderSuccess(iUserService.deleteUserId(userId));}

    @ResponseBody
    @ApiOperation(value = "删除mapId", notes = "删除UserId")
    @GetMapping("/deleteUserMapId")
    public JsonResponse<Integer> deleteUserMapId(String userId){ return renderSuccess(iUserService.deleteUserMapId(userId));}

    @ResponseBody
    @ApiOperation(value = "删除批处理id", notes = "删除UserId")
    @GetMapping("/deleteBatchIds")
    public JsonResponse<Integer> deleteBatchIds(@PathVariable String[] userId){ return renderSuccess(iUserService.deleteBatchIds(userId));}

    @ResponseBody
    @ApiOperation(value = "修改user", notes = "修改user")
    @GetMapping("/updateUser")
    public JsonResponse<Integer> updateUser(User user){ return renderSuccess(iUserService.updateUser(user));}

    @ResponseBody
    @ApiOperation(value = "查询所有", notes = "查询所有user")
    @GetMapping("/findAll")
    public List<User> findAll() {
        return iUserService.findAll();
    }

    @ResponseBody
    @ApiOperation(value = "查询ID", notes = "查询用户user")
    @GetMapping("/findById")
    public User findById( String userId) {return iUserService.findById(userId);}

//    @ResponseBody
//    @ApiOperation(value = "查询所有", notes = "查询所有user")
//    @GetMapping("/findAll")
//    public String findAll(Model model,@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum) {
//        PageHelper.startPage(pageNum,5);
//        List<User> list = iUserService.findAll();
//        PageInfo<User> userList = new PageInfo<User>(list);
//        model.addAttribute("userList",userList);
//        return "/userList";
//    }

//    @ResponseBody
//    @ApiOperation(value = "查询所有", notes = "查询所有user")
//    @GetMapping("/findAll")
//    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") Integer pageNum) {
//        ModelAndView mv = new ModelAndView();
//        List<User> users = iUserService.findAll();
//        PageInfo userList = new PageInfo(users);
//        mv.addObject("userList",userList);
////        mv.setViewName("user-list");
//        return mv;
//    }


}
