package edu.sm.cust;

import edu.sm.dto.Cust;
import edu.sm.exception.DuplicatedIdException;
import edu.sm.service.CustService;

public class CustInsert {
    public static void main(String[] args) {
        CustService custService = new CustService();
        Cust cust = Cust.builder().id("id111").pwd("pwd111").name("taesan").build();
        try {
            custService.add(cust);
        }catch (DuplicatedIdException e){
            System.out.println("ID가 중복되었습니다");
        }
        catch (Exception e) {
            System.out.println("시스템 장애");
        }

    }
}