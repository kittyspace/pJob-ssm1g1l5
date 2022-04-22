package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussliguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussliguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussliguanxinxiView;


/**
 * 离馆信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface DiscussliguanxinxiService extends IService<DiscussliguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussliguanxinxiVO> selectListVO(Wrapper<DiscussliguanxinxiEntity> wrapper);
   	
   	DiscussliguanxinxiVO selectVO(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
   	
   	List<DiscussliguanxinxiView> selectListView(Wrapper<DiscussliguanxinxiEntity> wrapper);
   	
   	DiscussliguanxinxiView selectView(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussliguanxinxiEntity> wrapper);
   	
}

