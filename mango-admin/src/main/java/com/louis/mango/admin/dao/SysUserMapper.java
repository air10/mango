package com.louis.mango.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.louis.mango.admin.model.SysUser;

public interface SysUserMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	int insert(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	int insertSelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	SysUser selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	int updateByPrimaryKeySelective(SysUser record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table mango..sys_user
	 * @mbg.generated  Tue Nov 30 16:18:32 CST 2021
	 */
	int updateByPrimaryKey(SysUser record);

	/**
     * 查询全部
     * @return
     */
    List<SysUser> findAll();
    
    List<SysUser> findPage();
    
    SysUser findByName(@Param(value="name") String name);
    
   	List<SysUser> findPageByName(@Param(value="name") String name);
   	
   	List<SysUser> findPageByNameAndEmail(@Param(value="name") String name, @Param(value="email") String email);
}