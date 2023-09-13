package com.example.springprepare;
import lombok.*;

import java.util.Scanner;

@Getter
@Setter
//@AllArgsConstructor
public class Memo {
        private String username;
        private String contents;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        Memo memo = new Memo();
        memo.setUsername(a);
        System.out.println(memo.getUsername());
    }
}
