package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1505e {
    public static final Class ad;
    public static final C3756e metrica;
    public static final C3756e vip;

    /* JADX WARN: Type inference failed for: r0v3, types: [eؕۦؗ, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        C5623e c5623e = C5623e.metrica;
        C3756e c3756e = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        ad = cls;
        try {
            C5623e c5623e2 = C5623e.metrica;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                c3756e = (C3756e) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        vip = c3756e;
        metrica = new Object();
    }

    public static void Signature(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.admob(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC16754e.metrica;
                i3 += 4;
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                abstractC16754e.admob(i, c4178e.startapp(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            c4178e.startapp(i6);
            Logger logger2 = AbstractC16754e.metrica;
            i5 += 4;
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            abstractC16754e.subscription(c4178e.startapp(i2));
            i2++;
        }
    }

    public static int ad(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4178e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.advert(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C4178e c4178e = (C4178e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.advert(c4178e.startapp(i));
            i++;
        }
        return i3;
    }

    public static Object adcel(Object obj, int i, InterfaceC4115e interfaceC4115e, Object obj2, C3756e c3756e) {
        return obj2;
    }

    public static void admob(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof AbstractC8400e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.remoteconfig(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC16754e.metrica;
                i3 += 8;
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC16754e.remoteconfig(i, abstractC8400e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC8400e.yandex(i6);
            Logger logger2 = AbstractC16754e.metrica;
            i5 += 8;
        }
        abstractC16754e.ads(i5);
        while (i2 < 0) {
            abstractC16754e.pro(abstractC8400e.yandex(i2));
            i2++;
        }
    }

    public static boolean advert(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void amazon(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (list instanceof AbstractC7986e) {
            if (z) {
                abstractC16754e.isPro(i, 2);
                abstractC16754e.ads(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                abstractC16754e.getClass();
                abstractC16754e.remoteconfig(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = AbstractC16754e.metrica;
            i3 += 8;
        }
        abstractC16754e.ads(i3);
        while (i2 < list.size()) {
            abstractC16754e.pro(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void applovin(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof AbstractC8400e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.premium(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.advert(((Long) list.get(i4)).longValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.subs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC16754e.premium(i, abstractC8400e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC16754e.advert(abstractC8400e.yandex(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < 0) {
            abstractC16754e.subs(abstractC8400e.yandex(i2));
            i2++;
        }
    }

    public static int appmetrica(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC8400e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.advert(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.advert(abstractC8400e.yandex(i));
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
        if (!(list instanceof AbstractC8400e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.yandex(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.yandex(abstractC8400e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void inmobi(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof AbstractC8400e)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    abstractC16754e.premium(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.yandex(((Long) list.get(i4)).longValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                abstractC16754e.subs((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        if (!z) {
            while (i2 < 0) {
                long yandex = abstractC8400e.yandex(i2);
                abstractC16754e.premium(i, (yandex >> 63) ^ (yandex << 1));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC16754e.yandex(abstractC8400e.yandex(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < 0) {
            long yandex2 = abstractC8400e.yandex(i2);
            abstractC16754e.subs((yandex2 >> 63) ^ (yandex2 << 1));
            i2++;
        }
    }

    public static void isPro(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.applovin(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.mopub(((Integer) list.get(i4)).intValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.ads(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                abstractC16754e.applovin(i, c4178e.startapp(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            i5 += AbstractC16754e.mopub(c4178e.startapp(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            abstractC16754e.ads(c4178e.startapp(i2));
            i2++;
        }
    }

    public static void isVip(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    abstractC16754e.applovin(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.billing(((Integer) list.get(i4)).intValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                abstractC16754e.ads((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                int startapp = c4178e.startapp(i2);
                abstractC16754e.applovin(i, (startapp >> 31) ^ (startapp << 1));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            i5 += AbstractC16754e.billing(c4178e.startapp(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            int startapp2 = c4178e.startapp(i2);
            abstractC16754e.ads((startapp2 >> 31) ^ (startapp2 << 1));
            i2++;
        }
    }

    public static int license(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4178e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.advert(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C4178e c4178e = (C4178e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.advert(c4178e.startapp(i));
            i++;
        }
        return i3;
    }

    public static void loadAd(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.signatures(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.advert(((Integer) list.get(i4)).intValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.tapsense(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                abstractC16754e.signatures(i, c4178e.startapp(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            i5 += AbstractC16754e.advert(c4178e.startapp(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            abstractC16754e.tapsense(c4178e.startapp(i2));
            i2++;
        }
    }

    public static int metrica(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC16754e.adcel(i) + 8) * size;
    }

    public static void mopub(C3756e c3756e, Object obj, Object obj2) {
        c3756e.getClass();
        AbstractC4994e abstractC4994e = (AbstractC4994e) obj;
        C16137e c16137e = abstractC4994e.unknownFields;
        C16137e c16137e2 = ((AbstractC4994e) obj2).unknownFields;
        C16137e c16137e3 = C16137e.purchase;
        if (!c16137e3.equals(c16137e2)) {
            if (c16137e3.equals(c16137e)) {
                int i = c16137e.ad + c16137e2.ad;
                int[] copyOf = Arrays.copyOf(c16137e.vip, i);
                System.arraycopy(c16137e2.vip, 0, copyOf, c16137e.ad, c16137e2.ad);
                Object[] copyOf2 = Arrays.copyOf(c16137e.metrica, i);
                System.arraycopy(c16137e2.metrica, 0, copyOf2, c16137e.ad, c16137e2.ad);
                c16137e = new C16137e(i, copyOf, copyOf2, true);
            } else {
                c16137e.getClass();
                if (!c16137e2.equals(c16137e3)) {
                    if (!c16137e.appmetrica) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c16137e.ad + c16137e2.ad;
                    c16137e.ad(i2);
                    System.arraycopy(c16137e2.vip, 0, c16137e.vip, c16137e.ad, c16137e2.ad);
                    System.arraycopy(c16137e2.metrica, 0, c16137e.metrica, c16137e.ad, c16137e2.ad);
                    c16137e.ad = i2;
                }
            }
        }
        abstractC4994e.unknownFields = c16137e;
    }

    public static void pro(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof AbstractC8400e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.premium(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.advert(((Long) list.get(i4)).longValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.subs(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC16754e.premium(i, abstractC8400e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            i5 += AbstractC16754e.advert(abstractC8400e.yandex(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < 0) {
            abstractC16754e.subs(abstractC8400e.yandex(i2));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4178e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.billing(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C4178e c4178e = (C4178e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.billing(c4178e.startapp(i));
            i++;
        }
        return i3;
    }

    public static void remoteconfig(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.signatures(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC16754e.advert(((Integer) list.get(i4)).intValue());
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.tapsense(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                abstractC16754e.signatures(i, c4178e.startapp(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            i5 += AbstractC16754e.advert(c4178e.startapp(i6));
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            abstractC16754e.tapsense(c4178e.startapp(i2));
            i2++;
        }
    }

    public static void signatures(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof C4178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.admob(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = AbstractC16754e.metrica;
                i3 += 4;
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C4178e c4178e = (C4178e) list;
        if (!z) {
            while (i2 < c4178e.f9214e) {
                abstractC16754e.admob(i, c4178e.startapp(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c4178e.f9214e; i6++) {
            c4178e.startapp(i6);
            Logger logger2 = AbstractC16754e.metrica;
            i5 += 4;
        }
        abstractC16754e.ads(i5);
        while (i2 < c4178e.f9214e) {
            abstractC16754e.subscription(c4178e.startapp(i2));
            i2++;
        }
    }

    public static void smaato(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (list instanceof AbstractC4963e) {
            if (z) {
                abstractC16754e.isPro(i, 2);
                abstractC16754e.ads(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                abstractC16754e.loadAd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = AbstractC16754e.metrica;
            i3++;
        }
        abstractC16754e.ads(i3);
        while (i2 < list.size()) {
            abstractC16754e.amazon(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static int startapp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC8400e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.advert(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.advert(abstractC8400e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void subscription(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (list instanceof AbstractC12293e) {
            if (z) {
                abstractC16754e.isPro(i, 2);
                abstractC16754e.ads(0);
                return;
            }
            return;
        }
        if (!z) {
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                abstractC16754e.getClass();
                abstractC16754e.admob(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = AbstractC16754e.metrica;
            i3 += 4;
        }
        abstractC16754e.ads(i3);
        while (i2 < list.size()) {
            abstractC16754e.subscription(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void tapsense(int i, List list, C13935e c13935e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC16754e abstractC16754e = (AbstractC16754e) c13935e.f27641e;
        int i2 = 0;
        if (!(list instanceof AbstractC8400e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC16754e.remoteconfig(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC16754e.isPro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = AbstractC16754e.metrica;
                i3 += 8;
            }
            abstractC16754e.ads(i3);
            while (i2 < list.size()) {
                abstractC16754e.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        AbstractC8400e abstractC8400e = (AbstractC8400e) list;
        if (!z) {
            while (i2 < 0) {
                abstractC16754e.remoteconfig(i, abstractC8400e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC16754e.isPro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < 0; i6++) {
            abstractC8400e.yandex(i6);
            Logger logger2 = AbstractC16754e.metrica;
            i5 += 8;
        }
        abstractC16754e.ads(i5);
        while (i2 < 0) {
            abstractC16754e.pro(abstractC8400e.yandex(i2));
            i2++;
        }
    }

    public static int vip(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC16754e.adcel(i) + 4) * size;
    }

    public static int yandex(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C4178e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC16754e.mopub(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C4178e c4178e = (C4178e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC16754e.mopub(c4178e.startapp(i));
            i++;
        }
        return i3;
    }
}
