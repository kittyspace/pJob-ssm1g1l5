package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LiguanxinxiEntity;
import com.entity.view.LiguanxinxiView;

import com.service.LiguanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 离馆信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
@RestController
@RequestMapping("/liguanxinxi")
public class LiguanxinxiController {
    @Autowired
    private LiguanxinxiService liguanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LiguanxinxiEntity liguanxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			liguanxinxi.setGerenzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LiguanxinxiEntity> ew = new EntityWrapper<LiguanxinxiEntity>();
		PageUtils page = liguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liguanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LiguanxinxiEntity liguanxinxi, HttpServletRequest request){
        EntityWrapper<LiguanxinxiEntity> ew = new EntityWrapper<LiguanxinxiEntity>();
		PageUtils page = liguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liguanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LiguanxinxiEntity liguanxinxi){
       	EntityWrapper<LiguanxinxiEntity> ew = new EntityWrapper<LiguanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( liguanxinxi, "liguanxinxi")); 
        return R.ok().put("data", liguanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LiguanxinxiEntity liguanxinxi){
        EntityWrapper< LiguanxinxiEntity> ew = new EntityWrapper< LiguanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( liguanxinxi, "liguanxinxi")); 
		LiguanxinxiView liguanxinxiView =  liguanxinxiService.selectView(ew);
		return R.ok("查询离馆信息成功").put("data", liguanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LiguanxinxiEntity liguanxinxi = liguanxinxiService.selectById(id);
        return R.ok().put("data", liguanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LiguanxinxiEntity liguanxinxi = liguanxinxiService.selectById(id);
        return R.ok().put("data", liguanxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        LiguanxinxiEntity liguanxinxi = liguanxinxiService.selectById(id);
        if(type.equals("1")) {
        	liguanxinxi.setThumbsupnum(liguanxinxi.getThumbsupnum()+1);
        } else {
        	liguanxinxi.setCrazilynum(liguanxinxi.getCrazilynum()+1);
        }
        liguanxinxiService.updateById(liguanxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LiguanxinxiEntity liguanxinxi, HttpServletRequest request){
    	liguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liguanxinxi);

        liguanxinxiService.insert(liguanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody LiguanxinxiEntity liguanxinxi, HttpServletRequest request){
    	liguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liguanxinxi);

        liguanxinxiService.insert(liguanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LiguanxinxiEntity liguanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(liguanxinxi);
        liguanxinxiService.updateById(liguanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        liguanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LiguanxinxiEntity> wrapper = new EntityWrapper<LiguanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("gerenzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = liguanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
