package in.ineuron.test;

import java.io.IOException;
import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.model.CompositeID;
import in.ineuron.model.Employee;
import in.ineuron.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) throws IOException {

		Session session = null;
		boolean flag = false;
		CompositeID row = null;
		Transaction transaction = null;
		Employee employee = null;

		try {

			session = HibernateUtil.getSession();
			if (session != null) {
				transaction = session.beginTransaction();
				
				CompositeID id = new CompositeID();
				id.setEid("EMP-22");
				id.setDepartmentID("SDE-2034");
				
				employee = new Employee();
				employee.setId(id);
				employee.setEname("Punith");
				employee.setEcompany("Godrej");
				employee.setEcity("Blr");

				 row = (CompositeID) session.save(employee);
				flag = true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}

		finally {
			if (flag) {
				transaction.commit();
				System.out.println("Seccess");
			} else {
				transaction.rollback();
				System.out.println("Failed");
			}

		}

	}

}
