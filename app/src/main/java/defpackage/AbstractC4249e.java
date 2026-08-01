package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٝٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4249e {
    public static final Class ad;
    public static final C3493e metrica;
    public static final C3493e vip;

    /* JADX WARN: Type inference failed for: r0v3, types: [eؕٛۧ, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        C10051e c10051e = C10051e.metrica;
        C3493e c3493e = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        ad = cls;
        try {
            C10051e c10051e2 = C10051e.metrica;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c3493e = (C3493e) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        vip = c3493e;
        metrica = new Object();
    }

    public static void Signature(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.Signature(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 4;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.admob(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.Signature(i, abstractC14936e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC14936e.yandex(i6);
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 4;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.admob(abstractC14936e.yandex(i2));
            i2++;
        }
    }

    public static int ad(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC14936e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.mopub(abstractC14936e.yandex(i));
            i++;
        }
        return i3;
    }

    public static Object adcel(Object obj, int i, InterfaceC16489e interfaceC16489e, Object obj2, C3493e c3493e) {
        return obj2;
    }

    public static void admob(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC11266e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.subscription(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 8;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.remoteconfig(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.subscription(i, abstractC11266e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC11266e.yandex(i6);
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 8;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.remoteconfig(abstractC11266e.yandex(i2));
            i2++;
        }
    }

    public static boolean advert(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void amazon(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC6125e)) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    abstractC13258e.getClass();
                    abstractC13258e.subscription(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 8;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.remoteconfig(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        AbstractC6125e abstractC6125e = (AbstractC6125e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC6125e.yandex(i2);
                double d = abstractC6125e.f12871e[i2];
                abstractC13258e.getClass();
                abstractC13258e.subscription(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC6125e.yandex(i6);
            double d2 = abstractC6125e.f12871e[i6];
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 8;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC6125e.yandex(i2);
            abstractC13258e.remoteconfig(Double.doubleToRawLongBits(abstractC6125e.f12871e[i2]));
            i2++;
        }
    }

    public static void applovin(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC11266e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.applovin(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.mopub(((Long) list.get(i4)).longValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.ads(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.applovin(i, abstractC11266e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.mopub(abstractC11266e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.ads(abstractC11266e.yandex(i2));
            i2++;
        }
    }

    public static int appmetrica(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC11266e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.mopub(abstractC11266e.yandex(i));
            i++;
        }
        return i3;
    }

    public static int billing(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC11266e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.billing(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.billing(abstractC11266e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void inmobi(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC11266e)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    abstractC13258e.applovin(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.billing(((Long) list.get(i4)).longValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC13258e.ads((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        if (!z) {
            while (i2 < 0) {
                long yandex = abstractC11266e.yandex(i2);
                abstractC13258e.applovin(i, (yandex >> 63) ^ (yandex << 1));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.billing(abstractC11266e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            long yandex2 = abstractC11266e.yandex(i2);
            abstractC13258e.ads((yandex2 >> 63) ^ (yandex2 << 1));
            i2++;
        }
    }

    public static void isPro(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.inmobi(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.adcel(((Integer) list.get(i4)).intValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.isPro(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.inmobi(i, abstractC14936e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.adcel(abstractC14936e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.isPro(abstractC14936e.yandex(i2));
            i2++;
        }
    }

    public static void isVip(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    abstractC13258e.inmobi(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.purchase(((Integer) list.get(i4)).intValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC13258e.isPro((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                int yandex = abstractC14936e.yandex(i2);
                abstractC13258e.inmobi(i, (yandex >> 31) ^ (yandex << 1));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.purchase(abstractC14936e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            int yandex2 = abstractC14936e.yandex(i2);
            abstractC13258e.isPro((yandex2 >> 31) ^ (yandex2 << 1));
            i2++;
        }
    }

    public static int license(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC14936e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.mopub(abstractC14936e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void loadAd(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.pro(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.mopub(((Integer) list.get(i4)).intValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.signatures(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.pro(i, abstractC14936e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.mopub(abstractC14936e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.signatures(abstractC14936e.yandex(i2));
            i2++;
        }
    }

    public static int metrica(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC13258e.startapp(i) + 8) * size;
    }

    public static void mopub(C3493e c3493e, Object obj, Object obj2) {
        c3493e.getClass();
        AbstractC3405e abstractC3405e = (AbstractC3405e) obj;
        C1434e c1434e = abstractC3405e.unknownFields;
        C1434e c1434e2 = ((AbstractC3405e) obj2).unknownFields;
        C1434e c1434e3 = C1434e.purchase;
        if (!c1434e3.equals(c1434e2)) {
            if (c1434e3.equals(c1434e)) {
                int i = c1434e.ad + c1434e2.ad;
                int[] copyOf = Arrays.copyOf(c1434e.vip, i);
                System.arraycopy(c1434e2.vip, 0, copyOf, c1434e.ad, c1434e2.ad);
                Object[] copyOf2 = Arrays.copyOf(c1434e.metrica, i);
                System.arraycopy(c1434e2.metrica, 0, copyOf2, c1434e.ad, c1434e2.ad);
                c1434e = new C1434e(i, copyOf, copyOf2, true);
            } else {
                c1434e.getClass();
                if (!c1434e2.equals(c1434e3)) {
                    if (!c1434e.appmetrica) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c1434e.ad + c1434e2.ad;
                    c1434e.ad(i2);
                    System.arraycopy(c1434e2.vip, 0, c1434e.vip, c1434e.ad, c1434e2.ad);
                    System.arraycopy(c1434e2.metrica, 0, c1434e.metrica, c1434e.ad, c1434e2.ad);
                    c1434e.ad = i2;
                }
            }
        }
        abstractC3405e.unknownFields = c1434e;
    }

    public static void pro(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC11266e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.applovin(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.mopub(((Long) list.get(i4)).longValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.ads(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.applovin(i, abstractC11266e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.mopub(abstractC11266e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.ads(abstractC11266e.yandex(i2));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC14936e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.purchase(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.purchase(abstractC14936e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void remoteconfig(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.pro(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13258e.mopub(((Integer) list.get(i4)).intValue());
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.signatures(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.pro(i, abstractC14936e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC13258e.mopub(abstractC14936e.yandex(i6));
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.signatures(abstractC14936e.yandex(i2));
            i2++;
        }
    }

    public static void signatures(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC14936e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.Signature(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 4;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.admob(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.Signature(i, abstractC14936e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC14936e.yandex(i6);
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 4;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.admob(abstractC14936e.yandex(i2));
            i2++;
        }
    }

    public static void smaato(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (list instanceof AbstractC1654e) {
            if (z) {
                abstractC13258e.isVip(i, 2);
                abstractC13258e.isPro(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                abstractC13258e.amazon(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC13258e.yandex;
            i3++;
        }
        abstractC13258e.isPro(i3);
        while (i2 < list.size()) {
            abstractC13258e.smaato(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int startapp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC11266e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.mopub(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.mopub(abstractC11266e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void subscription(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC8435e)) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    abstractC13258e.getClass();
                    abstractC13258e.Signature(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 4;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.admob(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        AbstractC8435e abstractC8435e = (AbstractC8435e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC8435e.yandex(i2);
                float f = abstractC8435e.f17199e[i2];
                abstractC13258e.getClass();
                abstractC13258e.Signature(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC8435e.yandex(i6);
            float f2 = abstractC8435e.f17199e[i6];
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 4;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC8435e.yandex(i2);
            abstractC13258e.admob(Float.floatToRawIntBits(abstractC8435e.f17199e[i2]));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C7850e c7850e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13258e abstractC13258e = (AbstractC13258e) c7850e.f15896e;
        int i2 = 0;
        if (!(list instanceof AbstractC11266e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13258e.subscription(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13258e.isVip(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC13258e.yandex;
                i3 += 8;
            }
            abstractC13258e.isPro(i3);
            while (i2 < list.size()) {
                abstractC13258e.remoteconfig(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC11266e abstractC11266e = (AbstractC11266e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC13258e.subscription(i, abstractC11266e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13258e.isVip(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC11266e.yandex(i6);
            Logger logger2 = AbstractC13258e.yandex;
            i5 += 8;
        }
        abstractC13258e.isPro(i5);
        while (i2 < 0) {
            abstractC13258e.remoteconfig(abstractC11266e.yandex(i2));
            i2++;
        }
    }

    public static int vip(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC13258e.startapp(i) + 4) * size;
    }

    public static int yandex(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC14936e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13258e.adcel(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        AbstractC14936e abstractC14936e = (AbstractC14936e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13258e.adcel(abstractC14936e.yandex(i));
            i++;
        }
        return i3;
    }
}
