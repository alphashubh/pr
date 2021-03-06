package test.java;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.ApplyHomeLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyHomeLoanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")

public class TestApplyHomeLoan {
	@Autowired
	ApplyHomeLoanService service;

	private List<ApplyHomeLoan> homeLoan;

	private UserDetails userDetails;

	@Before
	public void setup() throws ParseException {

		userDetails = new UserDetails(1254785855236142l, "Curernt", "Phaaadar", 5000654);

	}

	// @Test
	public void testInsertHomeLoanDetails() {

		try {
			ApplyHomeLoan h1 = new ApplyHomeLoan(54534534, 4, "23/03/2013", 265464, "cts", "VP", 4, 3, userDetails);
			ApplyHomeLoan h2 = new ApplyHomeLoan(5345434, 3, "24/03/2014", 87232, "tcs", "Trainer", 4, 3, userDetails);
			homeLoan = new ArrayList<ApplyHomeLoan>();
			homeLoan.add(h1);
			homeLoan.add(h2);
			userDetails.setHomeLoan(homeLoan);
			service.insertHomeLoanDetails(homeLoan, userDetails);

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	 @Test
	public void testUpdateLoanDetails() throws ParseException {
		Long account_number = 1254785855236142l;
		ApplyHomeLoan h2 = new ApplyHomeLoan(5345434, 3, "24/03/2014", 87232, "cts", "associate", 4, 3);
		service.updateLoanDetails(account_number, h2);

	}

}
