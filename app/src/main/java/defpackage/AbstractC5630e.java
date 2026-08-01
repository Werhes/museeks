package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5630e {
    public static final Class ad;
    public static final C16333e metrica;
    public static final C16333e vip;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eٖٛۖ] */
    static {
        Class<?> cls;
        Class<?> cls2;
        Class cls3 = AbstractC2037e.ad;
        C16333e c16333e = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        ad = cls;
        try {
            Class cls4 = AbstractC2037e.ad;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c16333e = (C16333e) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        vip = c16333e;
        metrica = new Object();
    }

    public static void Signature(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.isVip(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 4;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.inmobi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int ad(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C15997e.loadAd(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static Object adcel(Object obj, int i, InterfaceC17042e interfaceC17042e, Object obj2, C16333e c16333e) {
        return obj2;
    }

    public static void admob(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.isPro(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 8;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.applovin(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean advert(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void amazon(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                c15997e.getClass();
                c15997e.isPro(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 8;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.applovin(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void applovin(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.m4098goto(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C15997e.loadAd(((Long) list.get(i4)).longValue());
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.m4100this(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int appmetrica(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C15997e.loadAd(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int billing(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += C15997e.loadAd((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static void inmobi(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                c15997e.m4098goto(i, (longValue >> 63) ^ (longValue << 1));
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += C15997e.loadAd((longValue2 >> 63) ^ (longValue2 << 1));
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            c15997e.m4100this((longValue3 >> 63) ^ (longValue3 << 1));
            i2++;
        }
    }

    public static void isPro(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.m4097class(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C15997e.amazon(((Integer) list.get(i4)).intValue());
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.m4099interface(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void isVip(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int intValue = ((Integer) list.get(i2)).intValue();
                c15997e.m4097class(i, (intValue >> 31) ^ (intValue << 1));
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += C15997e.amazon((intValue2 >> 31) ^ (intValue2 << 1));
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            int intValue3 = ((Integer) list.get(i2)).intValue();
            c15997e.m4099interface((intValue3 >> 31) ^ (intValue3 << 1));
            i2++;
        }
    }

    public static int license(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C15997e.loadAd(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static void loadAd(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.ads(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C15997e.loadAd(((Integer) list.get(i4)).intValue());
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.premium(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int metrica(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C15997e.smaato(i) + 8) * size;
    }

    public static void mopub(C16333e c16333e, Object obj, Object obj2) {
        c16333e.getClass();
        AbstractC18270e abstractC18270e = (AbstractC18270e) obj;
        C16724e c16724e = abstractC18270e.unknownFields;
        C16724e c16724e2 = ((AbstractC18270e) obj2).unknownFields;
        C16724e c16724e3 = C16724e.purchase;
        if (!c16724e3.equals(c16724e2)) {
            if (c16724e3.equals(c16724e)) {
                int i = c16724e.ad + c16724e2.ad;
                int[] copyOf = Arrays.copyOf(c16724e.vip, i);
                System.arraycopy(c16724e2.vip, 0, copyOf, c16724e.ad, c16724e2.ad);
                Object[] copyOf2 = Arrays.copyOf(c16724e.metrica, i);
                System.arraycopy(c16724e2.metrica, 0, copyOf2, c16724e.ad, c16724e2.ad);
                c16724e = new C16724e(i, copyOf, copyOf2, true);
            } else {
                c16724e.getClass();
                if (!c16724e2.equals(c16724e3)) {
                    if (!c16724e.appmetrica) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c16724e.ad + c16724e2.ad;
                    c16724e.ad(i2);
                    System.arraycopy(c16724e2.vip, 0, c16724e.vip, c16724e.ad, c16724e2.ad);
                    System.arraycopy(c16724e2.metrica, 0, c16724e.metrica, c16724e.ad, c16724e2.ad);
                    c16724e.ad = i2;
                }
            }
        }
        abstractC18270e.unknownFields = c16724e;
    }

    public static void pro(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.m4098goto(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C15997e.loadAd(((Long) list.get(i4)).longValue());
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.m4100this(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += C15997e.amazon((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static void remoteconfig(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.ads(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C15997e.loadAd(((Integer) list.get(i4)).intValue());
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.premium(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void signatures(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.isVip(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 4;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.inmobi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void smaato(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.pro(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3++;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.subscription(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int startapp(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C15997e.loadAd(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void subscription(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                c15997e.getClass();
                c15997e.isVip(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 4;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.inmobi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C6594e c6594e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C15997e c15997e = (C15997e) c6594e.f13613e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c15997e.isPro(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c15997e.firebase(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = C15997e.billing;
            i3 += 8;
        }
        c15997e.m4099interface(i3);
        while (i2 < list.size()) {
            c15997e.applovin(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int vip(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C15997e.smaato(i) + 4) * size;
    }

    public static int yandex(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C15997e.amazon(((Integer) list.get(i2)).intValue());
        }
        return i;
    }
}
