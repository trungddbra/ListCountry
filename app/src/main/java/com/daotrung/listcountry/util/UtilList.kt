package com.daotrung.listcountry.util

import com.daotrung.listcountry.model.Country

object UtilList {
    fun getListCountry(): MutableList<Country>{
        val listCountry = mutableListOf<Country>()
        listCountry.addAll(listOf(Country(0,"Country","Population\n" +
                "(2020)","Land Area\n" +
                "(Km²)","Density\n" +
                "(P/Km²)"),
            Country(1,"Afghanistan","38,928,346","652,860","60"),
            Country(2,"Albania","2,877,797","27,400","105"),
            Country(3,"Algeria","43,851,044","2,381,740","18"),
            Country(4,"Andorra","77,265","470","164"),
            Country(5,"Angola","32,866,272","1,246,700","26"),
            Country(6,"Antigua and \n"+"Barbuda","97,929","440","223"),
            Country(7,"Argentina","45,195,774","2,736,690","17"),
            Country(8,"Armenia","2,963,243","28,470","104"),
            Country(9,"Australia","25,499,884","7,682,300","3"),
            Country(10,"Austria","9,006,398","82,409","109"),
            Country(11,"Azerbaijan","10,139,177","82,658","123"),
            Country(12,"Bahamas","393,244","10,010","39"),
            Country(13,"Bahrain","1,701,575","760","2,239"),
            Country(14,"Bangladesh","164,689,383","130,170","1,265"),
            Country(15,"Barbados","287,375","430","668"),
            Country(16,"Belarus","9,449,323","202,910","47"),
            Country(17,"Belgium","11,589,623","30,280","383"),
            Country(18,"Belize","397,628","22,810","17"),
            Country(19,"Benin","12,123,200","112,760","108"),
            Country(20,"Bhutan","771,608","38,117","20"),
            Country(21,"Bolivia","11,673,021","1,083,300","11"),
            Country(22,"Bosnia and \n"+"Herzegovina","3,280,819","51,000","64"),
            Country(23,"Botswana","2,351,627","566,730","4"),
            Country(24,"Brazil","212,559,417","8,358,140","25"),
            Country(25,"Brunei","437,479","5,270","83"),
            Country(26,"Bulgaria","6,948,445","108,560","64"),
            Country(27,"Burkina Faso","20,903,273","273,600","76"),
            Country(28,"Burundi","11,890,784","25,680","463"),
            Country(29,"Côte d'Ivoire","26,378,274","318,000","83"),
            Country(30,"Cabo Verde","555,987","4,030","138"),
            Country(31,"Cambodia","16,718,965","176,520","95"),
            Country(32,"Cameroon","26,545,863","472,710","56"),
            Country(33,"Canada","37,742,154","9,093,510","4"),
            Country(34,"Central \n"+"African Republic","4,829,767","622,980","8"),
            Country(35,"Chad","16,425,864","1,259,200","13"),
            Country(36,"Chile","19,116,201","743,532","26"),
            Country(37,"China","1,439,323,776","9,388,211","153"),
            Country(38,"Colombia","50,882,891","1,109,500","46"),
            Country(39,"Comoros","869,601","1,861","467"),
            Country(40,"Congo \n"+"(Congo-Brazzaville)","5,518,087","341,500","16"),
            Country(41,"Costa Rica","5,094,118","51,060","100"),
            Country(42,"Croatia","4,105,267","55,960","73"),
            Country(43,"Cuba","11,326,616","106,440","106"),
            Country(44,"Cyprus","1,207,359","9,240","131"),
            Country(45,"Czechia \n+"+"(Czech Republic)","26,378,274","318,000","83"),
            Country(46,"Democratic Republic\n"+" of the Congo","89,561,403","2,267,050","40"),
            Country(47,"Denmark","5,792,202","42,430","137"),
            Country(48,"Djibouti","988,000","23,180","43"),
            Country(49,"Dominica","71,986","750","96"),
            Country(50,"Dominican Republic","10,847,910","48,320","225"),
            Country(51,"Ecuador","17,643,054","248,360","71"),
            Country(52,"Egypt","102,334,404","995,450","103"),
            Country(53,"El Salvador","6,486,205","20,720","313"),
            Country(54,"Equatorial Guinea","1,402,985","28,050","50"),
            Country(55,"Eritrea","3,546,421","101,000","35"),
            Country(56,"Estonia","1,326,535","42,390","31"),
            Country(57,"Eswatini \n"+"(fmr. \"Swaziland\")","102,334,404","995,450","103"),
            Country(58,"Ethiopia","114,963,588","1,000,000","115"),
            Country(59,"Fiji","896,445","18,270","49"),
            Country(60,"Finland","5,540,720","303,890","18"),
            Country(61,"France","65,273,511","547,557","119"),
            Country(62,"Gabon","2,225,734","257,670","9"),
            Country(63,"Gambia","2,416,668","10,120","239"),
            Country(64,"Georgia","3,989,167","69,490","57"),
            Country(65,"Germany","83,783,942","348,560","240"),
            Country(66,"Ghana","31,072,940","227,540","137"),
            Country(67,"Greece","10,423,054","128,900","81"),
            Country(68,"Grenada","112,523","340","331"),
            Country(69,"Guatemala","17,915,568","107,160","167"),
            Country(70,"Guinea","13,132,795","245,720","53"),
            Country(71,"Guinea-Bissau","1,968,001","28,120","70"),
            Country(72,"Guyana","786,552","196,850","4"),
            Country(73,"Haiti","11,402,528","27,560","414"),
            Country(74,"Holy See","801","0","2,003"),
            Country(75,"Honduras","9,904,607","111,890","89"),

        ))



        return listCountry
    }
}