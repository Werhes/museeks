package defpackage;

import java.security.AccessControlException;
import java.security.AccessController;
import java.util.Map;

/* renamed from: eؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0361e {
    public static final ThreadLocal ad = new ThreadLocal();

    public static int ad(int i, String str) {
        String vip = vip(str);
        return vip != null ? Integer.parseInt(vip) : i;
    }

    public static boolean appmetrica(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        return (str.charAt(0) == 't' || str.charAt(0) == 'T') && (str.charAt(1) == 'r' || str.charAt(1) == 'R') && ((str.charAt(2) == 'u' || str.charAt(2) == 'U') && (str.charAt(3) == 'e' || str.charAt(3) == 'E'));
    }

    public static boolean license(String str, boolean z) {
        String vip;
        try {
            vip = vip(str);
        } catch (AccessControlException unused) {
        }
        return z ? appmetrica(vip) : vip != null && vip.length() == 5 && (vip.charAt(0) == 'f' || vip.charAt(0) == 'F') && ((vip.charAt(1) == 'a' || vip.charAt(1) == 'A') && ((vip.charAt(2) == 'l' || vip.charAt(2) == 'L') && ((vip.charAt(3) == 's' || vip.charAt(3) == 'S') && (vip.charAt(4) == 'e' || vip.charAt(4) == 'E'))));
    }

    public static boolean metrica(String str) {
        try {
            return appmetrica(vip(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static String vip(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new C5253e(str, 0));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) ad.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new C5253e(str, 1)) : str2;
    }
}
