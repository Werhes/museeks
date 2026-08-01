package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0248e {
    public static final C9616e ad;

    static {
        int i = AbstractC3433e.ad;
        ad = new C9616e(16);
    }

    public static void Signature(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.signatures(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13874e.remoteconfig(((Integer) list.get(i4)).intValue());
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1199interface(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                abstractC13874e.signatures(i, c5407e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            i5 += AbstractC13874e.remoteconfig(c5407e.yandex(i6));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            abstractC13874e.mo1199interface(c5407e.yandex(i2));
            i2++;
        }
    }

    public static boolean ad(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void adcel(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C0878e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.isPro(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1197extends(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0878e c0878e = (C0878e) list;
        if (!z) {
            while (i2 < c0878e.f3274e) {
                abstractC13874e.isPro(i, c0878e.billing(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0878e.f3274e; i6++) {
            c0878e.billing(i6);
            i5 += 8;
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c0878e.f3274e) {
            abstractC13874e.mo1197extends(c0878e.billing(i2));
            i2++;
        }
    }

    public static void admob(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC13874e.applovin(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        abstractC13874e.mo1198goto(i3);
        while (i2 < list.size()) {
            abstractC13874e.mo1196class(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void advert(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.tapsense(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13874e.subscription(((Integer) list.get(i4)).intValue());
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1198goto(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                abstractC13874e.tapsense(i, c5407e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            i5 += AbstractC13874e.subscription(c5407e.yandex(i6));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            abstractC13874e.mo1198goto(c5407e.yandex(i2));
            i2++;
        }
    }

    public static void amazon(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.isVip(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1201this(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                abstractC13874e.isVip(i, c5407e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            c5407e.yandex(i6);
            i5 += 4;
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            abstractC13874e.mo1201this(c5407e.yandex(i2));
            i2++;
        }
    }

    public static int applovin(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC13874e.subscription(i << 3) + 8) * size;
    }

    public static void appmetrica(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC13874e.isVip(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        abstractC13874e.mo1198goto(i3);
        while (i2 < list.size()) {
            abstractC13874e.mo1201this(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void billing(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C0878e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.inmobi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13874e.remoteconfig(((Long) list.get(i4)).longValue());
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1200native(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0878e c0878e = (C0878e) list;
        if (!z) {
            while (i2 < c0878e.f3274e) {
                abstractC13874e.inmobi(i, c0878e.billing(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0878e.f3274e; i6++) {
            i5 += AbstractC13874e.remoteconfig(c0878e.billing(i6));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c0878e.f3274e) {
            abstractC13874e.mo1200native(c0878e.billing(i2));
            i2++;
        }
    }

    public static int inmobi(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5407e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += AbstractC13874e.subscription((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        C5407e c5407e = (C5407e) list;
        int i3 = 0;
        while (i < size) {
            int yandex = c5407e.yandex(i);
            i3 += AbstractC13874e.subscription((yandex >> 31) ^ (yandex + yandex));
            i++;
        }
        return i3;
    }

    public static int isPro(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC13874e.subscription(i << 3) + 4) * size;
    }

    public static int isVip(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5407e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13874e.subscription(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C5407e c5407e = (C5407e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13874e.subscription(c5407e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void license(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                abstractC13874e.isPro(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        abstractC13874e.mo1198goto(i3);
        while (i2 < list.size()) {
            abstractC13874e.mo1197extends(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void loadAd(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.isVip(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1201this(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                abstractC13874e.isVip(i, c5407e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            c5407e.yandex(i6);
            i5 += 4;
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            abstractC13874e.mo1201this(c5407e.yandex(i2));
            i2++;
        }
    }

    public static Object metrica(Object obj, int i, InterfaceC13229e interfaceC13229e, InterfaceC3043e interfaceC3043e, Object obj2, C9616e c9616e) {
        if (interfaceC3043e == null) {
            return obj2;
        }
        if (!AbstractC0869e.premium(interfaceC13229e)) {
            Iterator it = interfaceC13229e.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!interfaceC3043e.ad(intValue)) {
                    if (obj2 == null) {
                        c9616e.getClass();
                        obj2 = C9616e.subscription(obj);
                    }
                    c9616e.getClass();
                    ((C2370e) obj2).license(i << 3, Long.valueOf(intValue));
                    it.remove();
                }
            }
            return obj2;
        }
        int size = interfaceC13229e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) interfaceC13229e.get(i3);
            int intValue2 = num.intValue();
            if (interfaceC3043e.ad(intValue2)) {
                if (i3 != i2) {
                    interfaceC13229e.set(i2, num);
                }
                i2++;
            } else {
                if (obj2 == null) {
                    c9616e.getClass();
                    obj2 = C9616e.subscription(obj);
                }
                c9616e.getClass();
                ((C2370e) obj2).license(i << 3, Long.valueOf(intValue2));
            }
        }
        if (i2 != size) {
            interfaceC13229e.subList(i2, size).clear();
        }
        return obj2;
    }

    public static void mopub(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.signatures(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13874e.remoteconfig(((Integer) list.get(i4)).intValue());
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1199interface(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                abstractC13874e.signatures(i, c5407e.yandex(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            i5 += AbstractC13874e.remoteconfig(c5407e.yandex(i6));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            abstractC13874e.mo1199interface(c5407e.yandex(i2));
            i2++;
        }
    }

    public static int pro(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0878e)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += AbstractC13874e.remoteconfig((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        C0878e c0878e = (C0878e) list;
        int i3 = 0;
        while (i < size) {
            long billing = c0878e.billing(i);
            i3 += AbstractC13874e.remoteconfig((billing >> 63) ^ (billing + billing));
            i++;
        }
        return i3;
    }

    public static void purchase(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C0878e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.inmobi(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += AbstractC13874e.remoteconfig(((Long) list.get(i4)).longValue());
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1200native(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0878e c0878e = (C0878e) list;
        if (!z) {
            while (i2 < c0878e.f3274e) {
                abstractC13874e.inmobi(i, c0878e.billing(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0878e.f3274e; i6++) {
            i5 += AbstractC13874e.remoteconfig(c0878e.billing(i6));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c0878e.f3274e) {
            abstractC13874e.mo1200native(c0878e.billing(i2));
            i2++;
        }
    }

    public static int remoteconfig(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0878e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13874e.remoteconfig(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        C0878e c0878e = (C0878e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13874e.remoteconfig(c0878e.billing(i));
            i++;
        }
        return i3;
    }

    public static int signatures(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5407e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13874e.remoteconfig(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C5407e c5407e = (C5407e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13874e.remoteconfig(c5407e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void smaato(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C5407e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    abstractC13874e.tapsense(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += AbstractC13874e.subscription((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                abstractC13874e.mo1198goto((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        C5407e c5407e = (C5407e) list;
        if (!z) {
            while (i2 < c5407e.f11594e) {
                int yandex = c5407e.yandex(i2);
                abstractC13874e.tapsense(i, (yandex >> 31) ^ (yandex + yandex));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5407e.f11594e; i6++) {
            int yandex2 = c5407e.yandex(i6);
            i5 += AbstractC13874e.subscription((yandex2 >> 31) ^ (yandex2 + yandex2));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c5407e.f11594e) {
            int yandex3 = c5407e.yandex(i2);
            abstractC13874e.mo1198goto((yandex3 >> 31) ^ (yandex3 + yandex3));
            i2++;
        }
    }

    public static void startapp(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C0878e)) {
            if (!z) {
                while (i2 < list.size()) {
                    abstractC13874e.isPro(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                abstractC13874e.mo1197extends(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C0878e c0878e = (C0878e) list;
        if (!z) {
            while (i2 < c0878e.f3274e) {
                abstractC13874e.isPro(i, c0878e.billing(i2));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0878e.f3274e; i6++) {
            c0878e.billing(i6);
            i5 += 8;
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c0878e.f3274e) {
            abstractC13874e.mo1197extends(c0878e.billing(i2));
            i2++;
        }
    }

    public static int subscription(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0878e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13874e.remoteconfig(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        C0878e c0878e = (C0878e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13874e.remoteconfig(c0878e.billing(i));
            i++;
        }
        return i3;
    }

    public static int tapsense(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5407e)) {
            int i2 = 0;
            while (i < size) {
                i2 += AbstractC13874e.remoteconfig(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C5407e c5407e = (C5407e) list;
        int i3 = 0;
        while (i < size) {
            i3 += AbstractC13874e.remoteconfig(c5407e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void vip(Object obj, Object obj2) {
        AbstractC15319e abstractC15319e = (AbstractC15319e) obj;
        C2370e c2370e = abstractC15319e.zzc;
        C2370e c2370e2 = ((AbstractC15319e) obj2).zzc;
        C2370e c2370e3 = C2370e.purchase;
        if (!c2370e3.equals(c2370e2)) {
            if (c2370e3.equals(c2370e)) {
                int i = c2370e.ad + c2370e2.ad;
                int[] copyOf = Arrays.copyOf(c2370e.vip, i);
                System.arraycopy(c2370e2.vip, 0, copyOf, c2370e.ad, c2370e2.ad);
                Object[] copyOf2 = Arrays.copyOf(c2370e.metrica, i);
                System.arraycopy(c2370e2.metrica, 0, copyOf2, c2370e.ad, c2370e2.ad);
                c2370e = new C2370e(i, copyOf, copyOf2, true);
            } else {
                c2370e.getClass();
                if (!c2370e2.equals(c2370e3)) {
                    if (!c2370e.appmetrica) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c2370e.ad + c2370e2.ad;
                    c2370e.appmetrica(i2);
                    System.arraycopy(c2370e2.vip, 0, c2370e.vip, c2370e.ad, c2370e2.ad);
                    System.arraycopy(c2370e2.metrica, 0, c2370e.metrica, c2370e.ad, c2370e2.ad);
                    c2370e.ad = i2;
                }
            }
        }
        abstractC15319e.zzc = c2370e;
    }

    public static void yandex(int i, List list, C16089e c16089e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        AbstractC13874e abstractC13874e = (AbstractC13874e) c16089e.f31681e;
        int i2 = 0;
        if (!(list instanceof C0878e)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    abstractC13874e.inmobi(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            abstractC13874e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += AbstractC13874e.remoteconfig((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            abstractC13874e.mo1198goto(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                abstractC13874e.mo1200native((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        C0878e c0878e = (C0878e) list;
        if (!z) {
            while (i2 < c0878e.f3274e) {
                long billing = c0878e.billing(i2);
                abstractC13874e.inmobi(i, (billing >> 63) ^ (billing + billing));
                i2++;
            }
            return;
        }
        abstractC13874e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c0878e.f3274e; i6++) {
            long billing2 = c0878e.billing(i6);
            i5 += AbstractC13874e.remoteconfig((billing2 >> 63) ^ (billing2 + billing2));
        }
        abstractC13874e.mo1198goto(i5);
        while (i2 < c0878e.f3274e) {
            long billing3 = c0878e.billing(i2);
            abstractC13874e.mo1200native((billing3 >> 63) ^ (billing3 + billing3));
            i2++;
        }
    }
}
