package defpackage;

import java.util.HashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۡۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18431e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap();
        ad = hashMap;
        hashMap.put("0", "0000");
        hashMap.put("1", "0001");
        hashMap.put("2", "0010");
        hashMap.put("3", "0011");
        hashMap.put("4", "0100");
        hashMap.put("5", "0101");
        hashMap.put("6", "0110");
        hashMap.put("7", "0111");
        hashMap.put("8", "1000");
        hashMap.put("9", "1001");
        hashMap.put("a", "1010");
        hashMap.put("b", "1011");
        hashMap.put("c", "1100");
        hashMap.put("d", "1101");
        hashMap.put("e", "1110");
        hashMap.put("f", "1111");
    }

    public static String ad(byte b) {
        String str;
        String str2;
        String substring;
        String hexString = Integer.toHexString(b);
        String str3 = BuildConfig.FLAVOR;
        try {
            if (hexString.length() == 8) {
                str2 = hexString.substring(6, 7);
                substring = hexString.substring(7, 8);
            } else if (hexString.length() == 2) {
                str2 = hexString.substring(0, 1);
                substring = hexString.substring(1, 2);
            } else {
                if (hexString.length() != 1) {
                    str = BuildConfig.FLAVOR;
                    StringBuilder sb = new StringBuilder();
                    HashMap hashMap = ad;
                    sb.append((String) hashMap.get(str3));
                    sb.append((String) hashMap.get(str));
                    return sb.toString();
                }
                str2 = "0";
                substring = hexString.substring(0, 1);
            }
            str = substring;
            str3 = str2;
            StringBuilder sb2 = new StringBuilder();
            HashMap hashMap2 = ad;
            sb2.append((String) hashMap2.get(str3));
            sb2.append((String) hashMap2.get(str));
            return sb2.toString();
        } catch (StringIndexOutOfBoundsException unused) {
            return BuildConfig.FLAVOR;
        }
    }
}
