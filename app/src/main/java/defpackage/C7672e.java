package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7672e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public long[] f15600e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f15601e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public long[] f15602e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static Serializable m2302e(int i, C1292e c1292e) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c1292e.signatures()));
        }
        if (i == 1) {
            return Boolean.valueOf(c1292e.ads() == 1);
        }
        if (i == 2) {
            return m2304e(c1292e);
        }
        if (i != 3) {
            if (i == 8) {
                return m2303e(c1292e);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c1292e.signatures()));
                c1292e.m568protected(2);
                return date;
            }
            int firebase = c1292e.firebase();
            ArrayList arrayList = new ArrayList(firebase);
            for (int i2 = 0; i2 < firebase; i2++) {
                Serializable m2302e = m2302e(c1292e.ads(), c1292e);
                if (m2302e != null) {
                    arrayList.add(m2302e);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String m2304e = m2304e(c1292e);
            int ads = c1292e.ads();
            if (ads == 9) {
                return hashMap;
            }
            Serializable m2302e2 = m2302e(ads, c1292e);
            if (m2302e2 != null) {
                hashMap.put(m2304e, m2302e2);
            }
        }
    }

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static HashMap m2303e(C1292e c1292e) {
        int firebase = c1292e.firebase();
        HashMap hashMap = new HashMap(firebase);
        for (int i = 0; i < firebase; i++) {
            String m2304e = m2304e(c1292e);
            Serializable m2302e = m2302e(c1292e.ads(), c1292e);
            if (m2302e != null) {
                hashMap.put(m2304e, m2302e);
            }
        }
        return hashMap;
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static String m2304e(C1292e c1292e) {
        int m565goto = c1292e.m565goto();
        int i = c1292e.vip;
        c1292e.m568protected(m565goto);
        return new String(c1292e.ad, i, m565goto);
    }
}
