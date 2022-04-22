package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussliguanxinxiDao;
import com.entity.DiscussliguanxinxiEntity;
import com.service.DiscussliguanxinxiService;
import com.entity.vo.DiscussliguanxinxiVO;
import com.entity.view.DiscussliguanxinxiView;

@Service("discussliguanxinxiService")
public class DiscussliguanxinxiServiceImpl extends ServiceImpl<DiscussliguanxinxiDao, DiscussliguanxinxiEntity> implements DiscussliguanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussliguanxinxiEntity> page = this.selectPage(
                new Query<DiscussliguanxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussliguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussliguanxinxiEntity> wrapper) {
		  Page<DiscussliguanxinxiView> page =new Query<DiscussliguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussliguanxinxiVO> selectListVO(Wrapper<DiscussliguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussliguanxinxiVO selectVO(Wrapper<DiscussliguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussliguanxinxiView> selectListView(Wrapper<DiscussliguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussliguanxinxiView selectView(Wrapper<DiscussliguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
