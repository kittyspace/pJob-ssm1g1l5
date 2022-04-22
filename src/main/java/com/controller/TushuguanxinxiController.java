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

import com.entity.TushuguanxinxiEntity;
import com.entity.view.TushuguanxinxiView;

import com.service.TushuguanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 图书馆信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
@RestController
@RequestMapping("/tushuguanxinxi")
public class TushuguanxinxiController {
    @Autowired
    private TushuguanxinxiService tushuguanxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request){

        EntityWrapper<TushuguanxinxiEntity> ew = new EntityWrapper<TushuguanxinxiEntity>();
		PageUtils page = tushuguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuguanxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request){
        EntityWrapper<TushuguanxinxiEntity> ew = new EntityWrapper<TushuguanxinxiEntity>();
		PageUtils page = tushuguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuguanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TushuguanxinxiEntity tushuguanxinxi){
       	EntityWrapper<TushuguanxinxiEntity> ew = new EntityWrapper<TushuguanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tushuguanxinxi, "tushuguanxinxi")); 
        return R.ok().put("data", tushuguanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TushuguanxinxiEntity tushuguanxinxi){
        EntityWrapper< TushuguanxinxiEntity> ew = new EntityWrapper< TushuguanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tushuguanxinxi, "tushuguanxinxi")); 
		TushuguanxinxiView tushuguanxinxiView =  tushuguanxinxiService.selectView(ew);
		return R.ok("查询图书馆信息成功").put("data", tushuguanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TushuguanxinxiEntity tushuguanxinxi = tushuguanxinxiService.selectById(id);
		tushuguanxinxi.setClicknum(tushuguanxinxi.getClicknum()+1);
		tushuguanxinxi.setClicktime(new Date());
		tushuguanxinxiService.updateById(tushuguanxinxi);
        return R.ok().put("data", tushuguanxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TushuguanxinxiEntity tushuguanxinxi = tushuguanxinxiService.selectById(id);
		tushuguanxinxi.setClicknum(tushuguanxinxi.getClicknum()+1);
		tushuguanxinxi.setClicktime(new Date());
		tushuguanxinxiService.updateById(tushuguanxinxi);
        return R.ok().put("data", tushuguanxinxi);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        TushuguanxinxiEntity tushuguanxinxi = tushuguanxinxiService.selectById(id);
        if(type.equals("1")) {
        	tushuguanxinxi.setThumbsupnum(tushuguanxinxi.getThumbsupnum()+1);
        } else {
        	tushuguanxinxi.setCrazilynum(tushuguanxinxi.getCrazilynum()+1);
        }
        tushuguanxinxiService.updateById(tushuguanxinxi);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request){
    	tushuguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuguanxinxi);

        tushuguanxinxiService.insert(tushuguanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
	@IgnoreAuth
    @RequestMapping("/add")
    public R add(@RequestBody TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request){
    	tushuguanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tushuguanxinxi);

        tushuguanxinxiService.insert(tushuguanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tushuguanxinxi);
        tushuguanxinxiService.updateById(tushuguanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tushuguanxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<TushuguanxinxiEntity> wrapper = new EntityWrapper<TushuguanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = tushuguanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,TushuguanxinxiEntity tushuguanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<TushuguanxinxiEntity> ew = new EntityWrapper<TushuguanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = tushuguanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tushuguanxinxi), params), params));
        return R.ok().put("data", page);
    }


}
