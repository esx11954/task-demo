package jp.eightbit.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.eightbit.exam.entity.Task;
import jp.eightbit.exam.mapper.TaskMapper;

@Service
public class TaskService {
	@Autowired
	private TaskMapper taskMapper;
	
	@Transactional
	public List<Task> findAll(){
		return taskMapper.findAll();
	}
	
	  @Transactional
	  public Task findOne(Long id) {
	    return taskMapper.findOne(id);
	  }
	  
	  @Transactional
	  public void save(Task item) {
		  taskMapper.save(item);
	  }

	  @Transactional
	  public void update(Long id) {
		  Task task = findOne(id);
		  task.setStatus(true);
		  taskMapper.update(task);
	  }

	  @Transactional
	  public void delete(Long id) {
		  taskMapper.delete(id);
	  }
}
