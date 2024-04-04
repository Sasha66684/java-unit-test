@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
 
    //assertEquals( isAdult, true, 21;// Напиши код здесь
    assertEquals( "Пользователь совершеннолетний", true, isAdult);
}
