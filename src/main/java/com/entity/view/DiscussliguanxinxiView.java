package com.entity.view;

import com.entity.DiscussliguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离馆信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
@TableName("discussliguanxinxi")
public class DiscussliguanxinxiView  extends DiscussliguanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussliguanxinxiView(){
	}
 
 	public DiscussliguanxinxiView(DiscussliguanxinxiEntity discussliguanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussliguanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
