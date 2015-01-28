package com.booble.operacional;

import java.net.*;
import java.io.*;

public class FolhadePagamento {
	public static void main(String[] args) {
		int y;
		for(int x = 0; x<10;x++){
			y = x % 5 +2;
		}
		// JVM não tem certeaza se Y foi iniciado, por isso não copila
		System.out.println(y);
	}
	
	}
