package zm.co.creativate.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import zm.co.creativate.entity.User;
import zm.co.creativate.entity.UserRole;

@Controller
public class UserController {
	
	/***********
	 * Action to load the page to add a user to the database
	 * @return
	 */
	@RequestMapping(path = "/user/add", method=RequestMethod.GET)
	public String addUser(Model model){
		User user = new User();
		
		List<UserRole> userRoles = new ArrayList<>();
		userRoles.add(new UserRole("Role 1", "Shut up and", "Rooooooooock"));
		userRoles.add(new UserRole("Role 2", "Shut up and", "Rooooooooock"));
		userRoles.add(new UserRole("Role 3", "Shut up and", "Rooooooooock"));
		
		model.addAttribute("user", user);
		model.addAttribute("user_roles", userRoles);
		
		return "admin/add_user";
	}
	
	/***********
	 * Actually add the user to the database
	 * @return
	 */
	@RequestMapping(path = "/user/add", method=RequestMethod.POST)
	public String addUser_action(){
		
		//System.out.println(user);
		
		return "redirect:/users";
	}
	
	/***********
	 * View Users in the system
	 * @return
	 */
	@RequestMapping(path = "/users", method=RequestMethod.GET)
	public String viewUsers_action(Model model){
		List<User> users = new ArrayList<>();
		
		model.addAttribute("users", users);
		
		return "/admin/view_users";
	}
	
}
