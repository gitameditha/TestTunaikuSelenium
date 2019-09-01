package main;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

public class FirstTestCase {

	public WebDriver driver;
	
	@Before
	public void test(){
		
		

		//fail("Not yet implemented");
		System.setProperty("webdriver.gecko.driver", "D:\\Downloads\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		driver = new FirefoxDriver(capabilities);
	}

	    @Test
	    public void navigateToUrl(){
	    	
	    
	    	
	        driver.get("https://test.tunaiku.com/");
	        
	       
	        
	        WebElement slider = driver.findElement(By.xpath("//div[@id='slider_jumlahPinjaman']/mat-slider/div/div[3]/div[2]"));
	        WebElement target = driver.findElement(By.xpath("//div[@id='slider_jumlahPinjaman']/mat-slider"));
	        

	    	
	        Actions action = new Actions(driver);
	        action.dragAndDrop(slider, target).release().build().perform();
	        slider.click();
	     
 
	    	driver.findElement(By.id("homeBtn_ajukanPinjaman")).click();
	    	
	    	driver.findElement(By.id("inp_Ya_PinjamanPertama")).click();
	    	
	    	//-----------https://test.tunaiku.com/loan/create-account---------------------
	    	
	    	driver.findElement(By.id("field_namalengkap")).sendKeys("ababwahagh");
	    	
	    	driver.findElement(By.id("field_nomorhandphone")).sendKeys("89611642413");
	    	
	    	driver.findElement(By.id("field_email")).sendKeys("qywtqwtf@gmail.com");
	    	
	    	
	        WebElement testDropDown = driver.findElement(By.name("emailIsOwn"));  
	        Select dropdown = new Select(testDropDown);  
	        dropdown.selectByValue("Personal");  

	        WebElement tujuanpinjamDropdown = driver.findElement(By.name("loanPurpose"));  
	        Select tujuandropdown = new Select(tujuanpinjamDropdown);  
	        tujuandropdown.selectByValue("Holiday");

	        WebElement sourceDropdown = driver.findElement(By.name("mediasource"));  
	        Select sumber = new Select(sourceDropdown);  
	        sumber.selectByValue("Radio");

	        driver.findElement(By.id("inp_lanjutFormulir")).click();
	     
	        //------------https://test.tunaiku.com/loan/application-form/data-diri---------------
	        
	    		driver.findElement(By.id("inp_noKTP")).sendKeys("1234567890987651");
	    	
	    		WebElement NamaBank = driver.findElement(By.name("bankName"));  
		        Select objBank = new Select(NamaBank);  
		        objBank.selectByValue("AGRIS");

		    	driver.findElement(By.id("inp_noRekening")).sendKeys("1231231233");
		    	
		    	WebElement educationType = driver.findElement(By.name("educationType"));  
		        Select ObjEducation = new Select(educationType);  
		        ObjEducation.selectByValue("JuniorHighSchool");
		        
		        driver.findElement(By.id("inp_yaAreaLayanan")).click();
		        
		        driver.findElement(By.id("inp_formSelanjutnya_DataDiri")).click();
		        
		    //-------------https://test.tunaiku.com/loan/application-form/data-ktp------------------------
		    
		        
		    WebElement birthProvinceId = driver.findElement(By.name("birthProvinceId"));  
		    Select ObjBirthProvince = new Select(birthProvinceId);  
		    ObjBirthProvince.selectByValue("16");
		    
		    WebElement birthCityId = driver.findElement(By.name("birthCityId"));  
		    Select ObjBirthCity = new Select(birthCityId);  
		    ObjBirthCity.selectByValue("263");
		     
		    WebElement inp_tgl_lahir = driver.findElement(By.id("inp_tgl_lahir"));  
		    Select ObjTglLhr = new Select(inp_tgl_lahir);  
		    ObjTglLhr.selectByValue("1");
		    
		    WebElement inp_bln_lahir = driver.findElement(By.id("inp_bln_lahir"));  
		    Select ObjBlnLhr = new Select(inp_bln_lahir);  
		    ObjBlnLhr.selectByValue("1");
		    
		    WebElement inp_thn_lahir = driver.findElement(By.id("inp_thn_lahir"));  
		    Select ObjThnLhr = new Select(inp_thn_lahir);  
		    ObjThnLhr.selectByValue("1993");
		    
	        driver.findElement(By.id("inp_laki")).click();
	        
	        driver.findElement(By.id("inp_formSelanjutnyaKTP_dataKTP")).click();
	        
	        
	        //----------https://test.tunaiku.com/loan/application-form/data-ktp-2---------------------------
	        
    			driver.findElement(By.id("inp_alamatKTP")).sendKeys("jl.klaskdnasjdghvasjdvuykhasvdbjasytfd");

    		    WebElement inp_jenisTinggalKTP = driver.findElement(By.id("inp_jenisTinggalKTP"));  
    		    Select ObjJnstglKtp = new Select(inp_jenisTinggalKTP);  
    		    ObjJnstglKtp.selectByValue("Rumah");
    		    
    			driver.findElement(By.id("inp_noBlokKTP")).sendKeys("12");
    			
    			driver.findElement(By.id("inp_noRumahKTP")).sendKeys("1");
    			
    			driver.findElement(By.id("inp_RTKTP")).sendKeys("1");
    			
    			driver.findElement(By.id("inp_RWKTP")).sendKeys("1");
    			
    			WebElement inp_provinsiKTP = driver.findElement(By.id("inp_provinsiKTP"));  
    		    Select ObjPrnvsi = new Select(inp_provinsiKTP);  
    		    ObjPrnvsi.selectByValue("16");
    		    
    		    WebElement inp_kotaKTP = driver.findElement(By.id("inp_kotaKTP"));  
    		    Select ObjKota = new Select(inp_kotaKTP);  
    		    ObjKota.selectByValue("263");

    		    WebElement inp_kecamatanKTP = driver.findElement(By.id("inp_kecamatanKTP"));  
    		    Select ObjKec = new Select(inp_kecamatanKTP);  
    		    ObjKec.selectByValue("3328");
    		    
    		    WebElement inp_kelurahanKTP = driver.findElement(By.id("inp_kelurahanKTP"));  
    		    Select ObjKel = new Select(inp_kelurahanKTP);  
    		    ObjKel.selectByValue("39678");

    		    WebElement inp_agama = driver.findElement(By.id("inp_agama"));  
    		    Select ObjAgama = new Select(inp_agama);  
    		    ObjAgama.selectByValue("Muslim");
    		    
    		    WebElement inp_kewarganegaraan = driver.findElement(By.id("inp_kewarganegaraan"));  
    		    Select ObjKewarganegaraan = new Select(inp_kewarganegaraan);  
    		    ObjKewarganegaraan.selectByValue("Indonesian");
    		    
    	        driver.findElement(By.id("inp_formSelanjutnyaKTP_dataKTP2")).click();

    	     //--------------https://test.tunaiku.com/loan/application-form/status-tinggal-------------------
    	        
    	    driver.findElement(By.id("inp_domisiliBeda")).click();
    	    
			driver.findElement(By.id("inp_alamatKTPTinggal")).sendKeys("jl.kalshdsgdggv");

			driver.findElement(By.id("inp_noBlokKTPTinggal")).sendKeys("12");
			
			driver.findElement(By.id("inp_noRumahKTPTinggal")).sendKeys("1");
			
			driver.findElement(By.id("inp_RTKTPTinggal")).sendKeys("1");
			
			driver.findElement(By.id("inp_RWKTPTinggal")).sendKeys("1");
			
			WebElement inp_provinsiKTPTinggal = driver.findElement(By.id("inp_provinsiKTPTinggal"));  
  		    Select ObjProvTgl = new Select(inp_provinsiKTPTinggal);  
  		    ObjProvTgl.selectByValue("1");

  		    WebElement inp_kotaKTPTinggal = driver.findElement(By.id("inp_kotaKTPTinggal"));  
		    Select ObjkotTgl = new Select(inp_kotaKTPTinggal);  
		    ObjkotTgl.selectByValue("5");

		    WebElement inp_kecamatanKTPTinggal = driver.findElement(By.id("inp_kecamatanKTPTinggal"));  
		    Select ObjkecTgl = new Select(inp_kecamatanKTPTinggal);  
		    ObjkecTgl.selectByValue("1");

		    WebElement inp_kelurahanKTPTinggal = driver.findElement(By.id("inp_kelurahanKTPTinggal"));  
		    Select ObjkelTgl = new Select(inp_kelurahanKTPTinggal);  
		    ObjkelTgl.selectByValue("1");
		    
    	    driver.findElement(By.id("inp_formSelanjutnyaKTP_StatusTinggal")).click();
    	    
    	    //-------------------------https://test.tunaiku.com/loan/application-form/alamat-tinggal-------------------
    	    
	    	    WebElement inp_jenisTinggal = driver.findElement(By.id("inp_jenisTinggal"));  
			    Select ObjStatTmpt = new Select(inp_jenisTinggal);  
			    ObjStatTmpt.selectByValue("Apartment");
	
			    WebElement inp_statusTinggal = driver.findElement(By.id("inp_statusTinggal"));  
			    Select ObjStatKpemilikan = new Select(inp_statusTinggal);  
			    ObjStatKpemilikan.selectByValue("Family");
	
				driver.findElement(By.id("inp_sewaTinggal")).sendKeys("10000000");
				
				driver.findElement(By.id("inp_biayaTinggal")).sendKeys("1000000");
				
				driver.findElement(By.id("inp_jmlTinggalSerumah")).sendKeys("2");
	
				driver.findElement(By.id("inp_jmlTanggungan")).sendKeys("1");
				
				driver.findElement(By.id("inp_namaIbu")).sendKeys("Tini surtini");
				
	    	    driver.findElement(By.id("inp_formSelanjutnyaKTP_AlamatTinggal")).click();

    	    //----------------https://test.tunaiku.com/loan/application-form/pekerjaan----------------------------------------

	    	WebElement inp_jenisKerja = driver.findElement(By.id("inp_jenisKerja"));  
			Select ObJenisKerja = new Select(inp_jenisKerja);  
			ObJenisKerja.selectByValue("PublicServant");
	
			WebElement inp_statusKerja = driver.findElement(By.id("inp_statusKerja"));  
			Select ObjStatusKerja = new Select(inp_statusKerja);  
			ObjStatusKerja.selectByValue("Permanent");
			    
			driver.findElement(By.id("inp_namaPerusahaan")).sendKeys("pt bakti selamanya");

			WebElement inp_jabatan = driver.findElement(By.id("inp_jabatan"));  
			Select ObjJbtan = new Select(inp_jabatan);  
			ObjJbtan.selectByValue("Staff");
			    
			driver.findElement(By.id("inp_gaji")).sendKeys("10000000");
				
			driver.findElement(By.id("inp_gajiSebelumnya")).sendKeys("10000000");

	    	driver.findElement(By.id("inp_formSelanjutnya_Pekerjaan")).click();

	    	//--------------https://test.tunaiku.com/loan/application-form/pernikahan--------------------------------------------------
	    	
		    	WebElement inp_statusNikah = driver.findElement(By.id("inp_statusNikah"));  
				Select ObjStatusNikah = new Select(inp_statusNikah);  
				ObjStatusNikah.selectByValue("Single");
				
		    	driver.findElement(By.id("inp_formSelanjutnya_Pernikahan")).click();
		    	
		   //----------------https://test.tunaiku.com/loan/application-form/data-kerabat-----------------------------------------------
		    
		   driver.findElement(By.id("inp_namaKerabat")).sendKeys("hartunu");
		   
		   driver.findElement(By.id("inp_HPKerabat")).sendKeys("89677532317");

		   driver.findElement(By.id("inp_alamatKerabat")).sendKeys("jl kalamiaamsdhsbjdhasvdjyastdfashyd");
		   
		   driver.findElement(By.id("inp_formSelanjutnya_dataKerabat")).click();
	    	
	    	//---------------https://test.tunaiku.com/loan/application-form/review-form------------------------------------------------
		   
		   driver.findElement(By.id("inp_agreement")).click();

		   driver.findElement(By.id("inp_kirimFormulir")).click();

		   


	    }
	    
//		   @After
//		    public void endTest() {
//		        driver.quit();
//		        
//		    }

	    
	 
}
