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


import com.dao.LiguanxinxiDao;
import com.entity.LiguanxinxiEntity;
import com.service.LiguanxinxiService;
import com.entity.vo.LiguanxinxiVO;
import com.entity.view.LiguanxinxiView;

@Service("liguanxinxiService")
public class LiguanxinxiServiceImpl extends ServiceImpl<LiguanxinxiDao, LiguanxinxiEntity> implements LiguanxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LiguanxinxiEntity> page = this.selectPage(
                new Query<LiguanxinxiEntity>(params).getPage(),
                new EntityWrapper<LiguanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LiguanxinxiEntity> wrapper) {
		  Page<LiguanxinxiView> page =new Query<LiguanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LiguanxinxiVO> selectListVO(Wrapper<LiguanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LiguanxinxiVO selectVO(Wrapper<LiguanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LiguanxinxiView> selectListView(Wrapper<LiguanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LiguanxinxiView selectView(Wrapper<LiguanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
