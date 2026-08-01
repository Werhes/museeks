package defpackage;

import android.view.View;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0815e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static C1400e f3204e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C2892e f3208e = new C2892e(181905016, false, new C2131e(2));

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C2892e f3206e = new C2892e(-637395504, false, new C2131e(3));

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2892e f3205e = new C2892e(565634833, false, new C2131e(4));

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2892e f3207e = new C2892e(2133755037, false, new C2131e(5));

    public static void Signature(String str, Object obj, C4052e c4052e, HashMap hashMap, String str2) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int indexOf = str.indexOf(":") + 1;
        boolean z = false;
        boolean z2 = false;
        for (int i = indexOf; i < str.length(); i++) {
            if (!z) {
                char charAt = str.charAt(i);
                if (charAt == ',') {
                    arrayList2.add(Integer.valueOf(i));
                } else if (charAt == '\"') {
                    z = true;
                }
            } else if (z2) {
                z2 = false;
            } else {
                char charAt2 = str.charAt(i);
                if (charAt2 == '\\') {
                    z2 = true;
                } else if (charAt2 == '\"') {
                    z = false;
                }
            }
        }
        if (z) {
            throw new C15608e(35, str2);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList3.add(str.substring(indexOf, num.intValue()));
            indexOf = num.intValue() + 1;
        }
        arrayList3.add(str.substring(indexOf));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            int indexOf2 = str3.indexOf("=");
            int indexOf3 = str3.indexOf("\"");
            if (indexOf2 == -1 || (indexOf3 != -1 && indexOf3 < indexOf2)) {
                throw C15608e.ad(str2, 25, arrayList.toString());
            }
            String trim = str3.substring(0, indexOf2).trim();
            String substring = str3.substring(indexOf2 + 1);
            if (trim.isEmpty()) {
                throw C15608e.ad(str2, 23, arrayList.toString());
            }
            if (substring.isEmpty()) {
                throw C15608e.ad(str2, 24, arrayList.toString());
            }
            if (!hashSet.add(trim)) {
                throw C15608e.ad(str2, 29, arrayList.toString());
            }
            arrayList.add(new C0700e(trim, substring));
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0700e c0700e = (C0700e) it3.next();
            if (hashMap.containsKey(c0700e.ad)) {
                ((InterfaceC1624e) hashMap.get(c0700e.ad)).ad(c0700e, obj, c4052e);
            } else if (f3204e != null) {
                throw C15608e.ad(str2, 9, str);
            }
        }
    }

    public static final boolean adcel(C16063e c16063e) {
        String str = c16063e.f31630e;
        return AbstractC7890e.billing(str, "https") || AbstractC7890e.billing(str, "wss");
    }

    public static int admob(String str, String str2) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw C15608e.ad(str2, 31, str);
        }
    }

    public static Matcher advert(Pattern pattern, String str, String str2) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return matcher;
        }
        throw C15608e.ad(str2, 2, str);
    }

    public static final void license(boolean z, Function0 function0, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1339183247);
        if ((i & 6) == 0) {
            i2 = (c13770e.billing(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC9186e.ad(z, function0, c13770e, i2 & 126);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C5230e(z, function0, i, 1);
        }
    }

    public static boolean mopub(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n';
    }

    public static final void purchase(boolean z, Function2 function2, C13770e c13770e, int i) {
        c13770e.m3671package(-1437916225);
        int i2 = (c13770e.billing(z) ? 4 : 2) | i | (c13770e.yandex(function2) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            AbstractC16275e.ad(z, function2, c13770e, i2 & 126);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C14674e(z, function2, i);
        }
    }

    public static boolean remoteconfig(C0700e c0700e, String str) {
        String str2 = c0700e.vip;
        if (str2.equals("YES")) {
            return true;
        }
        if (str2.equals("NO")) {
            return false;
        }
        throw C15608e.ad(str, 34, c0700e.toString());
    }

    public static C5564e smaato(Matcher matcher) {
        return new C5564e(Long.parseLong(matcher.group(1)), matcher.group(2) != null ? Long.valueOf(Long.parseLong(matcher.group(2))) : null);
    }

    public static String startapp(String str, EnumC11433e enumC11433e) {
        try {
            return URLDecoder.decode(str.replace("+", "%2B"), enumC11433e.f22986e);
        } catch (UnsupportedEncodingException unused) {
            throw new C15608e(8, null);
        }
    }

    public static String subscription(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (i2 == 0 && charAt != '\"') {
                if (mopub(charAt)) {
                    throw new C15608e(7, str2);
                }
                throw new C15608e(18, str2);
            }
            if (i == 2) {
                if (mopub(charAt)) {
                    throw new C15608e(7, str2);
                }
                throw new C15608e(18, str2);
            }
            if (i2 == str.length() - 1) {
                if (charAt != '\"' || z) {
                    throw new C15608e(35, str2);
                }
            } else if (z) {
                sb.append(charAt);
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else if (charAt == '\"') {
                i++;
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public abstract View amazon(int i);

    public abstract boolean loadAd();
}
