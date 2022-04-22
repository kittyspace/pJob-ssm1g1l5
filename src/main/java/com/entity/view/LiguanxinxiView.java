package com.entity.view;

import com.entity.LiguanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 离馆信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
@TableName("liguanxinxi")
public class LiguanxinxiView  extends LiguanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiguanxinxiView(){
	}
 
 	public LiguanxinxiView(LiguanxinxiEntity liguanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, liguanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
