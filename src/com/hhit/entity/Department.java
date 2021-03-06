package com.hhit.entity;

import java.util.Set;
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Department.java
//  @ Date : 2016/4/23
//  @ Author : 
//
//

public class Department implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String deptName;
	private Integer deptLevel;
	private String deptDescription;

	private Department parent;
	private Set<Department> children;
	private Set<Student> students;
	private Set<Teacher> teachers;
	private Set<Class_> classes;
	private Set<Course> courses;

	/**
	 * 默认构造函数
	 */
	public Department() {

	}

	/**
	 * 默认构造函数
	 */
	public Department(String name, Integer leve, String desc, Department par) {
		deptName = name;
		deptLevel = leve;
		deptDescription = desc;
		parent = par;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getDeptLevel() {
		return deptLevel;
	}

	public void setDeptLevel(Integer deptLevel) {
		this.deptLevel = deptLevel;
	}

	public String getDeptDescription() {
		return deptDescription;
	}

	public void setDeptDescription(String deptDescription) {
		this.deptDescription = deptDescription;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(Department parent) {
		this.parent = parent;
	}

	public Set<Department> getChildren() {
		return children;
	}

	public void setChildren(Set<Department> children) {
		this.children = children;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	public Set<Class_> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class_> classes) {
		this.classes = classes;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}
