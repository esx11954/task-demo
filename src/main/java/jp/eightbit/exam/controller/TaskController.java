package jp.eightbit.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import jp.eightbit.exam.entity.Task;
import jp.eightbit.exam.service.TaskService;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("tasks", taskService.findAll());
//		taskService.findAll().forEach(e -> {
//			System.out.println(e.toString());
//		});
		
		return "taskIndex";
	}
	  
	  @GetMapping("/taskAdd")
	  public String add(Model model) {
	    model.addAttribute("task", new Task());
	    return "taskAdd";
	  }
	  
	  @PostMapping("/taskPost")
	  public String addTask(@ModelAttribute Task task) {
//		  System.out.println(task.toString());
		  taskService.save(task);
		  return "redirect:/";
	  }
	  
	  @PostMapping("/taskUpdate")
	  public String updateTask(Model model, @RequestParam("id") Long taskId) {
		  taskService.update(taskId);
		  
		  return "redirect:/";
	  }
}
