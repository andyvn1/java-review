package gov.irs;

import com.hr.personnel.Department;
import com.hr.personnel.SalariedEmployee;
import com.hr.personnel.client.HourlyEmployee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class IRSTest {

    private IRS irs;
    private SalariedEmployee employee1;
    private HourlyEmployee employee2;

    @Before
    public void setUp() throws Exception {
        irs = new IRS();
        employee1 = new SalariedEmployee("maria", LocalDate.of(2010, 1, 1), 5000);
        employee2 = new HourlyEmployee("Juan", LocalDate.of(2022,5,16), 180, 40.00);

    }

    @Test
    public void register_should_add_a_tax_payer() {
        irs.getCurrentIndex();
         irs.register(employee1);
         irs.register(employee2);
        int index = irs.getCurrentIndex();
         Assert.assertEquals(2, index);
    }

    @Test
    public void computeTotalMonthlyTaxToCollect_should_return_all_the_tax_collect_it() {
        irs.register(employee1);
        irs.register(employee2);
        double totalMontlyTax = irs.computeTotalMonthlyTaxToCollect();
        Assert.assertEquals(3300, totalMontlyTax, .001);
    }
}