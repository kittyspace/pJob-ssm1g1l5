package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LiguanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LiguanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LiguanxinxiView;


/**
 * 离馆信息
 *
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface LiguanxinxiService extends IService<LiguanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LiguanxinxiVO> selectListVO(Wrapper<LiguanxinxiEntity> wrapper);
   	
   	LiguanxinxiVO selectVO(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
   	
   	List<LiguanxinxiView> selectListView(Wrapper<LiguanxinxiEntity> wrapper);
   	
   	LiguanxinxiView selectView(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LiguanxinxiEntity> wrapper);
   	
}

