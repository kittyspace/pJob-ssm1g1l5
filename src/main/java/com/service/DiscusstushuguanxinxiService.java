package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstushuguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstushuguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstushuguanxinxiView;


/**
 * 图书馆信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface DiscusstushuguanxinxiService extends IService<DiscusstushuguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstushuguanxinxiVO> selectListVO(Wrapper<DiscusstushuguanxinxiEntity> wrapper);
   	
   	DiscusstushuguanxinxiVO selectVO(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
   	
   	List<DiscusstushuguanxinxiView> selectListView(Wrapper<DiscusstushuguanxinxiEntity> wrapper);
   	
   	DiscusstushuguanxinxiView selectView(@Param("ew") Wrapper<DiscusstushuguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstushuguanxinxiEntity> wrapper);
   	
}

