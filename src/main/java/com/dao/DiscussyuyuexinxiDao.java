package com.dao;

import com.entity.DiscussyuyuexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyuyuexinxiVO;
import com.entity.view.DiscussyuyuexinxiView;


/**
 * 预约信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface DiscussyuyuexinxiDao extends BaseMapper<DiscussyuyuexinxiEntity> {
	
	List<DiscussyuyuexinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
	
	DiscussyuyuexinxiVO selectVO(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
	
	List<DiscussyuyuexinxiView> selectListView(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);

	List<DiscussyuyuexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
	
	DiscussyuyuexinxiView selectView(@Param("ew") Wrapper<DiscussyuyuexinxiEntity> wrapper);
	
}
