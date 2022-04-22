package com.dao;

import com.entity.LiguanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LiguanxinxiVO;
import com.entity.view.LiguanxinxiView;


/**
 * 离馆信息
 * 
 * @author 
 * @email 
 * @date 2021-03-08 11:10:23
 */
public interface LiguanxinxiDao extends BaseMapper<LiguanxinxiEntity> {
	
	List<LiguanxinxiVO> selectListVO(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
	
	LiguanxinxiVO selectVO(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
	
	List<LiguanxinxiView> selectListView(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);

	List<LiguanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
	
	LiguanxinxiView selectView(@Param("ew") Wrapper<LiguanxinxiEntity> wrapper);
	
}
