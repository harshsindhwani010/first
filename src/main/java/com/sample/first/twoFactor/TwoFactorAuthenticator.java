package com.sample.first.twoFactor;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import com.warrenstrange.googleauth.GoogleAuthenticatorKey;

public class TwoFactorAuthenticator {

    public static void main(String[] args) {
        GoogleAuthenticator gAuth = new GoogleAuthenticator();
        GoogleAuthenticatorKey key = gAuth.createCredentials();

        String secretKey = key.getKey();

        String accountName = "YourAccountName";

        String qrCodeData = getGoogleAuthenticatorQRCodeData(accountName, secretKey);

        System.out.println("Secret key: " + secretKey);
        System.out.println("Scan this QR code with Google Authenticator:");
        System.out.println(qrCodeData);
    }

    public static String getGoogleAuthenticatorQRCodeData(String accountName, String secretKey) {
        return "otpauth://totp/" + accountName + "?secret=" + secretKey;
    }
}

