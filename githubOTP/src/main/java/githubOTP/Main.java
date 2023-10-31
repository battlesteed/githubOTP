package githubOTP;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

import com.amdelamar.jotp.OTP;
import com.amdelamar.jotp.type.Type;

public class Main {

	public static void main(String[] args) throws IOException, InvalidKeyException, IllegalArgumentException, NoSuchAlgorithmException {
		String hexTime = OTP.timeInHex(System.currentTimeMillis(), 30);
        String code = OTP.create(getUserInput("请输入two-factor secret"), hexTime, 6, Type.TOTP);
        
        copy2Clipboard(code);
        
        System.out.println("authentication code:");
        System.out.println(code);
        System.out.println("已经复制到剪切板,直接粘贴即可");
        System.out.println("two-factor secret和github-recovery-codes非常重要,一定要妥善保管!");
	}
	
	private static void copy2Clipboard(String code) {
		Clipboard cp= Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection text1 = new StringSelection(code);
        cp.setContents(text1, null);
	}
	
	static Scanner scanner = new Scanner(System.in);
	public static String getUserInput(String message) {
		try {
			System.out.println(message);
			@SuppressWarnings("resource")
			String nextLine = scanner.nextLine();
			return nextLine;
		}finally {
			scanner.close();
		}
	}
}
