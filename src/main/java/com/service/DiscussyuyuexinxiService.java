package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyuyuexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyuyuexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyuyuexinxiView;


/**
 * 预约信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface DiscussyuyuexinxiService extends IService<DiscussyuyuexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyuyuexinxiVO> selectListVO(Wrapper<DiscussyuyuexinxiEntity> wrapper);
   	
   	DiscussyuyuexinxiVO selectVO(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
   	
   	List<DiscussyuyuexinxiView> selectListView(Wrapper<DiscussyuyuexinxiEntity> wrapper);
   	
   	DiscussyuyuexinxiView selectView(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyuyuexinxiEntity> wrapper);
   	
}

