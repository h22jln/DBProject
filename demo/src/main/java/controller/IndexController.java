package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.ApiDao;
import model.Result;



@Controller
public class IndexController {
	
	@Autowired
	private ApiDao apiDao;

	@RequestMapping(value="/search")
	public String search(Model model,
			@RequestParam(value="subject")String subject) {
		
		//model.addAttribute("search",apiDao.selectName(subject));

		List<Map<String, Object>> result = apiDao.selectName(subject);
		int num = apiDao.selectNum(subject);

		
		Result myResult = new Result(result,num);
		
		model.addAttribute("search",myResult);
		return "WEB-INF/views/search.jsp";
	}
	
	@RequestMapping(value="/link")
	public String link() {
		return "WEB-INF/views/link.jsp";
		
	}

}
