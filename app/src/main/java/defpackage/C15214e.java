package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15214e {
    public final C2044e ad;
    public String license;
    public final ArrayList metrica;
    public final HashMap vip;

    public C15214e(C2044e c2044e, String str, Uri uri, int i) {
        this.ad = c2044e;
        HashMap hashMap = new HashMap();
        this.vip = hashMap;
        hashMap.put(str, uri);
        this.license = str;
        ArrayList arrayList = new ArrayList();
        this.metrica = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static AbstractC17475e ad(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C8884e c8884e = (C8884e) list.get(i);
            Uri uri = c8884e.ad;
            try {
                license(c8884e.ad, null, i, arrayList, new C2044e(c8884e.vip, c8884e.license, c8884e.metrica), hashMap, hashMap2);
            } catch (C15125e unused) {
            }
        }
        return AbstractC17475e.remoteconfig(arrayList);
    }

    public static void license(Uri uri, String str, int i, ArrayList arrayList, C2044e c2044e, HashMap hashMap, HashMap hashMap2) {
        int i2;
        String str2;
        Integer num = (Integer) hashMap.get(c2044e);
        int i3 = 1;
        if (num == null) {
            hashMap2.put(c2044e, 0);
            if (str == null) {
                hashMap2.put(c2044e, 1);
                str = ".";
            }
            C15214e c15214e = new C15214e(c2044e, str, uri, i);
            hashMap.put(c2044e, Integer.valueOf(arrayList.size()));
            arrayList.add(c15214e);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(c2044e);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                AbstractC2301e.purchase("invalid count: %s", intValue >= 0, intValue);
                str2 = intValue == 0 ? BuildConfig.FLAVOR : ".";
            } else {
                long j = 1 * intValue;
                int i4 = (int) j;
                if (i4 != j) {
                    throw new ArrayIndexOutOfBoundsException(AbstractC0869e.isVip(j, "Required array size too large: "));
                }
                char[] cArr = new char[i4];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i4 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            hashMap2.put(c2044e, Integer.valueOf(intValue));
            str = str2;
        }
        C15214e c15214e2 = (C15214e) arrayList.get(num.intValue());
        Uri uri2 = (Uri) c15214e2.vip.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw C15125e.vip("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup");
        }
        c15214e2.vip.put(str, uri);
        if (i != -1) {
            c15214e2.metrica.add(Integer.valueOf(i));
        }
    }

    public static AbstractC17475e vip(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            C18371e c18371e = (C18371e) list.get(i);
            license(c18371e.ad, c18371e.billing, i, arrayList, new C2044e(c18371e.vip, c18371e.yandex, null), hashMap, hashMap2);
        }
        return AbstractC17475e.remoteconfig(arrayList);
    }

    public final Uri metrica() {
        Uri uri = (Uri) this.vip.get(this.license);
        uri.getClass();
        return uri;
    }
}
