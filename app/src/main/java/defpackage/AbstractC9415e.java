package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9415e {
    public static final C11672e ad;

    static {
        C17792e c17792e = C17792e.metrica;
        ad = new C11672e(22);
    }

    public static void Signature(Object obj, Object obj2) {
        C6496e c6496e = ((AbstractC15267e) obj2).zzb;
        if (c6496e.ad.isEmpty()) {
            return;
        }
        AbstractC15267e abstractC15267e = (AbstractC15267e) obj;
        C6496e c6496e2 = abstractC15267e.zzb;
        if (c6496e2.vip) {
            abstractC15267e.zzb = c6496e2.clone();
        }
        C6496e c6496e3 = abstractC15267e.zzb;
        c6496e3.getClass();
        C15620e c15620e = c6496e.ad;
        int i = c15620e.f30806e;
        for (int i2 = 0; i2 < i; i2++) {
            c6496e3.billing(c15620e.metrica(i2));
        }
        Iterator it = c15620e.ad().iterator();
        while (it.hasNext()) {
            c6496e3.billing((Map.Entry) it.next());
        }
    }

    public static void ad(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    c5633e.signatures(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += C5633e.yandex((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                c5633e.tapsense((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                int billing = c10506e.billing(i2);
                c5633e.signatures(i, (billing >> 31) ^ (billing + billing));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            int billing2 = c10506e.billing(i6);
            i5 += C5633e.yandex((billing2 >> 31) ^ (billing2 + billing2));
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            int billing3 = c10506e.billing(i2);
            c5633e.tapsense((billing3 >> 31) ^ (billing3 + billing3));
            i2++;
        }
    }

    public static int adcel(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C5633e.startapp(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void admob(Object obj, Object obj2) {
        AbstractC17076e abstractC17076e = (AbstractC17076e) obj;
        C10308e c10308e = abstractC17076e.zzc;
        C10308e c10308e2 = ((AbstractC17076e) obj2).zzc;
        C10308e c10308e3 = C10308e.purchase;
        if (!c10308e3.equals(c10308e2)) {
            if (c10308e3.equals(c10308e)) {
                int i = c10308e.ad + c10308e2.ad;
                int[] copyOf = Arrays.copyOf(c10308e.vip, i);
                System.arraycopy(c10308e2.vip, 0, copyOf, c10308e.ad, c10308e2.ad);
                Object[] copyOf2 = Arrays.copyOf(c10308e.metrica, i);
                System.arraycopy(c10308e2.metrica, 0, copyOf2, c10308e.ad, c10308e2.ad);
                c10308e = new C10308e(i, copyOf, copyOf2, true);
            } else {
                c10308e.getClass();
                if (!c10308e2.equals(c10308e3)) {
                    if (!c10308e.appmetrica) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = c10308e.ad + c10308e2.ad;
                    c10308e.appmetrica(i2);
                    System.arraycopy(c10308e2.vip, 0, c10308e.vip, c10308e.ad, c10308e2.ad);
                    System.arraycopy(c10308e2.metrica, 0, c10308e.metrica, c10308e.ad, c10308e2.ad);
                    c10308e.ad = i2;
                }
            }
        }
        abstractC17076e.zzc = c10308e;
    }

    public static void ads(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5633e.loadAd(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.Signature(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int advert(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += C5633e.startapp((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int amazon(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += C5633e.startapp(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void applovin(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.amazon(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                c5633e.smaato(i, c10506e.billing(i2));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            c10506e.billing(i6);
            i5 += 4;
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            c5633e.amazon(c10506e.billing(i2));
            i2++;
        }
    }

    public static boolean appmetrica(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int billing(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C5633e.yandex(i << 3) + 4) * size;
    }

    public static void inmobi(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.admob(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5633e.startapp(((Integer) list.get(i4)).intValue());
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                c5633e.admob(i, c10506e.billing(i2));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            i5 += C5633e.startapp(c10506e.billing(i6));
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            c5633e.subscription(c10506e.billing(i2));
            i2++;
        }
    }

    public static void isPro(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5633e.isVip(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C5633e.startapp(((Long) list.get(i4)).longValue());
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.inmobi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void isVip(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C5405e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.smaato(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.amazon(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C5405e c5405e = (C5405e) list;
        if (!z) {
            while (i2 < c5405e.f11590e) {
                c5405e.yandex(i2);
                c5633e.smaato(i, Float.floatToRawIntBits(c5405e.f11591e[i2]));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c5405e.f11590e; i6++) {
            c5405e.yandex(i6);
            float f = c5405e.f11591e[i6];
            i5 += 4;
        }
        c5633e.tapsense(i5);
        while (i2 < c5405e.f11590e) {
            c5405e.yandex(i2);
            c5633e.amazon(Float.floatToRawIntBits(c5405e.f11591e[i2]));
            i2++;
        }
    }

    public static void license(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5633e.isVip(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += C5633e.startapp(((Long) list.get(i4)).longValue());
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.inmobi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r4 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object loadAd(int r2, java.lang.Object r3, java.lang.Object r4, int r5) {
        /*
            if (r4 != 0) goto L10
            eٗ٘ۚ r3 = (defpackage.AbstractC17076e) r3
            eَْٗ r4 = r3.zzc
            eَْٗ r0 = defpackage.C10308e.purchase
            if (r4 != r0) goto L10
            eَْٗ r4 = defpackage.C10308e.vip()
            r3.zzc = r4
        L10:
            long r0 = (long) r5
            int r2 = r2 << 3
            r3 = r4
            eَْٗ r3 = (defpackage.C10308e) r3
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r3.metrica(r2, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9415e.loadAd(int, java.lang.Object, java.lang.Object, int):java.lang.Object");
    }

    public static void metrica(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.signatures(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5633e.yandex(((Integer) list.get(i4)).intValue());
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.tapsense(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                c5633e.signatures(i, c10506e.billing(i2));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            i5 += C5633e.yandex(c10506e.billing(i6));
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            c5633e.tapsense(c10506e.billing(i2));
            i2++;
        }
    }

    public static int mopub(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10506e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += C5633e.yandex((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        C10506e c10506e = (C10506e) list;
        int i3 = 0;
        while (i < size) {
            int billing = c10506e.billing(i);
            i3 += C5633e.yandex((billing >> 31) ^ (billing + billing));
            i++;
        }
        return i3;
    }

    public static void pro(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.admob(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C5633e.startapp(((Integer) list.get(i4)).intValue());
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                c5633e.admob(i, c10506e.billing(i2));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            i5 += C5633e.startapp(c10506e.billing(i6));
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            c5633e.subscription(c10506e.billing(i2));
            i2++;
        }
    }

    public static int purchase(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10506e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C5633e.startapp(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C10506e c10506e = (C10506e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C5633e.startapp(c10506e.billing(i));
            i++;
        }
        return i3;
    }

    public static void remoteconfig(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5633e.loadAd(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.Signature(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void signatures(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!(list instanceof C10506e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c5633e.smaato(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c5633e.pro(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c5633e.tapsense(i3);
            while (i2 < list.size()) {
                c5633e.amazon(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C10506e c10506e = (C10506e) list;
        if (!z) {
            while (i2 < c10506e.f20730e) {
                c5633e.smaato(i, c10506e.billing(i2));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c10506e.f20730e; i6++) {
            c10506e.billing(i6);
            i5 += 4;
        }
        c5633e.tapsense(i5);
        while (i2 < c10506e.f20730e) {
            c5633e.amazon(c10506e.billing(i2));
            i2++;
        }
    }

    public static int smaato(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10506e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C5633e.yandex(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C10506e c10506e = (C10506e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C5633e.yandex(c10506e.billing(i));
            i++;
        }
        return i3;
    }

    public static int startapp(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10506e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C5633e.startapp(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C10506e c10506e = (C10506e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C5633e.startapp(c10506e.billing(i));
            i++;
        }
        return i3;
    }

    public static void subscription(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(i2)).booleanValue();
                c5633e.tapsense(i << 3);
                c5633e.adcel(booleanValue ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.adcel(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void tapsense(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c5633e.loadAd(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            c5633e.Signature(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void vip(int i, List list, C17698e c17698e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5633e c5633e = c17698e.ad;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                c5633e.isVip(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        c5633e.pro(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += C5633e.startapp((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        c5633e.tapsense(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            c5633e.inmobi((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static int yandex(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C5633e.yandex(i << 3) + 8) * size;
    }
}
