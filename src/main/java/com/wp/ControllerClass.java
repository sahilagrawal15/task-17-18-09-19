package com.wp;

import java.util.List;

import javax.persistence.metamodel.StaticMetamodel;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClass {

	@RequestMapping("entry")
	public String showEntryForm() {
		return "entrypage.jsp";
	}

	@RequestMapping("delete")
	public String deleteData() {
		return "delete.jsp";
	}

	@RequestMapping("search")
	public String searchData() {
		return "search.jsp";
	}
	@RequestMapping("update")
	public String updateData() {
		return "update.jsp";
	}
	@RequestMapping("view")
	public String viewData() {
		return "view.jsp";
	}
	
	

	@RequestMapping("EntryController")
	public ModelAndView showEntry(@ModelAttribute("aaa") ModelClass model) {
		Service.insert(model);
		ModelAndView mv = new ModelAndView("result.jsp");
		return mv;

	}

	@RequestMapping("DeleteController")
	public ModelAndView deleteEntry(@ModelAttribute("del") ModelClass model) {
		Service.delete(model);

		ModelAndView mv = new ModelAndView("DeletedPag.jsp");
		return mv;

	}

	@RequestMapping("SearchController")
	public ModelAndView searchEntry(@ModelAttribute("sear") ModelClass model) {
		Service.search(model);

		ModelAndView mv = new ModelAndView("result2.jsp");
		return mv;
	}
	@RequestMapping("UpdateController")
	public ModelAndView updateEntry(@ModelAttribute("up") ModelClass model) {
		Service.update(model);

		ModelAndView mv = new ModelAndView("resultupdate.jsp");
		return mv;
	}
	@RequestMapping("saveuser")
	public ModelAndView saveuser(@ModelAttribute("save") ModelClass model)
	{
		
		Service.insert(model);
		ModelAndView mv = new ModelAndView("result.jsp");
		return mv;
		
		
	}
	
	
	
	public ModelAndView viewAllEntry() {
		List<ModelClass> List=Service.view();
		ModelAndView mv=new ModelAndView("ViewEmpDetails.jsp");
		mv.addObject("output", List);
		return mv;
	}
}
