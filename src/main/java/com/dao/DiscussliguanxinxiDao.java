package com.dao;

import com.entity.DiscussliguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussliguanxinxiVO;
import com.entity.view.DiscussliguanxinxiView;


/**
 * 离馆信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface DiscussliguanxinxiDao extends BaseMapper<DiscussliguanxinxiEntity> {
	
	List<DiscussliguanxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
	
	DiscussliguanxinxiVO selectVO(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
	
	List<DiscussliguanxinxiView> selectListView(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);

	List<DiscussliguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
	
	DiscussliguanxinxiView selectView(@Param("ew") Wrapper<DiscussliguanxinxiEntity> wrapper);
	
}
