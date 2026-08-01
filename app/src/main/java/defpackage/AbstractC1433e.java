package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Vector;

/* renamed from: eٕؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1433e {
    public static final String ad;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.security.PrivilegedAction] */
    static {
        try {
            try {
                ad = (String) AccessController.doPrivileged((PrivilegedAction) new Object());
            } catch (Exception unused) {
                ad = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            ad = "\n";
        }
    }

    public static String ad(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        throw new java.lang.IllegalStateException("invalid UTF-16 low surrogate");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void appmetrica(char[] r10, int r11, java.io.ByteArrayOutputStream r12) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1433e.appmetrica(char[], int, java.io.ByteArrayOutputStream):void");
    }

    public static String billing(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String license(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] metrica(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static byte[] purchase(char[] cArr) {
        int length = cArr.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            appmetrica(cArr, length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static String[] vip(String str) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int indexOf = str.indexOf(46);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }
}
