package edu.depaul.se.worker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.depaul.se.worker.jpa.WorkerService;

@Controller
public class WorkerController {
	@RequestMapping(value = { "/contractor", "contractorRegistration" })
	public ModelAndView worker() {
		System.out.println("DEBUG: In WorkerController worker ");
		return new ModelAndView("contractorRegistration", "Worker", new Worker());

	}

	@RequestMapping(value = "/addContractor")
	public String addCustomer(@ModelAttribute("worker") Worker worker, ModelMap model) {
		System.out.println("DEBUG: In WorkerController addContractor ");
		System.out.println("DEBUG: Worker " + worker);
		WorkerService ws = new WorkerService();
		ws.saveWorker(worker);
		ws.close();
		return "index";
	}
}
