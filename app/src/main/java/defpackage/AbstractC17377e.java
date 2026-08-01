package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17377e {
    public static final C10068e ad;

    static {
        int i = AbstractC14050e.ad;
        ad = new C10068e(13);
    }

    public static void Signature(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i2)).booleanValue();
                c11177e.admob(i << 3);
                int i3 = c11177e.appmetrica;
                try {
                    int i4 = i3 + 1;
                    try {
                        c11177e.metrica[i3] = booleanValue;
                        c11177e.appmetrica = i4;
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i4;
                        throw new C13593e(i3, c11177e.license, 1, e, 18);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        c11177e.admob(i5);
        while (i2 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            int i7 = c11177e.appmetrica;
            try {
                int i8 = i7 + 1;
                try {
                    c11177e.metrica[i7] = booleanValue2;
                    c11177e.appmetrica = i8;
                    i2++;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i7 = i8;
                    throw new C13593e(i7, c11177e.license, 1, e, 18);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }
    }

    public static boolean ad(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void adcel(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C11177e.isVip(((Integer) list.get(i4)).intValue());
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.Signature(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                c11177e.startapp(i, c16882e.yandex(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            i5 += C11177e.isVip(c16882e.yandex(i6));
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            c11177e.Signature(c16882e.yandex(i2));
            i2++;
        }
    }

    public static int admob(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1118e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C11177e.isVip(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        C1118e c1118e = (C1118e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C11177e.isVip(c1118e.billing(i));
            i++;
        }
        return i3;
    }

    public static void advert(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    c11177e.adcel(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += C11177e.tapsense((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                c11177e.admob((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                int yandex = c16882e.yandex(i2);
                c11177e.adcel(i, (yandex >> 31) ^ (yandex + yandex));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            int yandex2 = c16882e.yandex(i6);
            i5 += C11177e.tapsense((yandex2 >> 31) ^ (yandex2 + yandex2));
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            int yandex3 = c16882e.yandex(i2);
            c11177e.admob((yandex3 >> 31) ^ (yandex3 + yandex3));
            i2++;
        }
    }

    public static void amazon(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.mopub(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                c11177e.mopub(i, c16882e.yandex(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            c16882e.yandex(i6);
            i5 += 4;
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            c11177e.subscription(c16882e.yandex(i2));
            i2++;
        }
    }

    public static void appmetrica(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C1118e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.advert(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C11177e.isVip(((Long) list.get(i4)).longValue());
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.remoteconfig(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C1118e c1118e = (C1118e) list;
        if (!z) {
            while (i2 < c1118e.f3666e) {
                c11177e.advert(i, c1118e.billing(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1118e.f3666e; i6++) {
            i5 += C11177e.isVip(c1118e.billing(i6));
        }
        c11177e.admob(i5);
        while (i2 < c1118e.f3666e) {
            c11177e.remoteconfig(c1118e.billing(i2));
            i2++;
        }
    }

    public static void billing(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C1118e)) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    c11177e.advert(i, (longValue >> 63) ^ (longValue + longValue));
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue2 = ((Long) list.get(i4)).longValue();
                i3 += C11177e.isVip((longValue2 >> 63) ^ (longValue2 + longValue2));
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                c11177e.remoteconfig((longValue3 >> 63) ^ (longValue3 + longValue3));
                i2++;
            }
            return;
        }
        C1118e c1118e = (C1118e) list;
        if (!z) {
            while (i2 < c1118e.f3666e) {
                long billing = c1118e.billing(i2);
                c11177e.advert(i, (billing >> 63) ^ (billing + billing));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1118e.f3666e; i6++) {
            long billing2 = c1118e.billing(i6);
            i5 += C11177e.isVip((billing2 >> 63) ^ (billing2 + billing2));
        }
        c11177e.admob(i5);
        while (i2 < c1118e.f3666e) {
            long billing3 = c1118e.billing(i2);
            c11177e.remoteconfig((billing3 >> 63) ^ (billing3 + billing3));
            i2++;
        }
    }

    public static int inmobi(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11177e.tapsense(i << 3) + 4) * size;
    }

    public static int isPro(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C11177e.tapsense(i << 3) + 8) * size;
    }

    public static int isVip(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C16882e)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += C11177e.tapsense((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        C16882e c16882e = (C16882e) list;
        int i3 = 0;
        while (i < size) {
            int yandex = c16882e.yandex(i);
            i3 += C11177e.tapsense((yandex >> 31) ^ (yandex + yandex));
            i++;
        }
        return i3;
    }

    public static void license(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16178e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.mopub(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                i3 += 4;
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.subscription(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        C16178e c16178e = (C16178e) list;
        if (!z) {
            while (i2 < c16178e.f31783e) {
                c16178e.billing(i2);
                c11177e.mopub(i, Float.floatToRawIntBits(c16178e.f31784e[i2]));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16178e.f31783e; i6++) {
            c16178e.billing(i6);
            float f = c16178e.f31784e[i6];
            i5 += 4;
        }
        c11177e.admob(i5);
        while (i2 < c16178e.f31783e) {
            c16178e.billing(i2);
            c11177e.subscription(Float.floatToRawIntBits(c16178e.f31784e[i2]));
            i2++;
        }
    }

    public static void loadAd(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.startapp(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C11177e.isVip(((Integer) list.get(i4)).intValue());
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.Signature(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                c11177e.startapp(i, c16882e.yandex(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            i5 += C11177e.isVip(c16882e.yandex(i6));
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            c11177e.Signature(c16882e.yandex(i2));
            i2++;
        }
    }

    public static void metrica(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                c11177e.smaato(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        c11177e.admob(i3);
        while (i2 < list.size()) {
            c11177e.pro(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void mopub(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.adcel(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C11177e.tapsense(((Integer) list.get(i4)).intValue());
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.admob(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                c11177e.adcel(i, c16882e.yandex(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            i5 += C11177e.tapsense(c16882e.yandex(i6));
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            c11177e.admob(c16882e.yandex(i2));
            i2++;
        }
    }

    public static int pro(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C16882e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C11177e.isVip(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C16882e c16882e = (C16882e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C11177e.isVip(c16882e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void purchase(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C1118e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.advert(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C11177e.isVip(((Long) list.get(i4)).longValue());
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.remoteconfig(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C1118e c1118e = (C1118e) list;
        if (!z) {
            while (i2 < c1118e.f3666e) {
                c11177e.advert(i, c1118e.billing(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1118e.f3666e; i6++) {
            i5 += C11177e.isVip(c1118e.billing(i6));
        }
        c11177e.admob(i5);
        while (i2 < c1118e.f3666e) {
            c11177e.remoteconfig(c1118e.billing(i2));
            i2++;
        }
    }

    public static int remoteconfig(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1118e)) {
            int i2 = 0;
            while (i < size) {
                long longValue = ((Long) list.get(i)).longValue();
                i2 += C11177e.isVip((longValue >> 63) ^ (longValue + longValue));
                i++;
            }
            return i2;
        }
        C1118e c1118e = (C1118e) list;
        int i3 = 0;
        while (i < size) {
            long billing = c1118e.billing(i);
            i3 += C11177e.isVip((billing >> 63) ^ (billing + billing));
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
        if (!(list instanceof C16882e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C11177e.isVip(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C16882e c16882e = (C16882e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C11177e.isVip(c16882e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void smaato(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C16882e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.mopub(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.subscription(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        C16882e c16882e = (C16882e) list;
        if (!z) {
            while (i2 < c16882e.f33086e) {
                c11177e.mopub(i, c16882e.yandex(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c16882e.f33086e; i6++) {
            c16882e.yandex(i6);
            i5 += 4;
        }
        c11177e.admob(i5);
        while (i2 < c16882e.f33086e) {
            c11177e.subscription(c16882e.yandex(i2));
            i2++;
        }
    }

    public static void startapp(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C1118e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.smaato(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C1118e c1118e = (C1118e) list;
        if (!z) {
            while (i2 < c1118e.f3666e) {
                c11177e.smaato(i, c1118e.billing(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1118e.f3666e; i6++) {
            c1118e.billing(i6);
            i5 += 8;
        }
        c11177e.admob(i5);
        while (i2 < c1118e.f3666e) {
            c11177e.pro(c1118e.billing(i2));
            i2++;
        }
    }

    public static int subscription(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C1118e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C11177e.isVip(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        C1118e c1118e = (C1118e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C11177e.isVip(c1118e.billing(i));
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
        if (!(list instanceof C16882e)) {
            int i2 = 0;
            while (i < size) {
                i2 += C11177e.tapsense(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        C16882e c16882e = (C16882e) list;
        int i3 = 0;
        while (i < size) {
            i3 += C11177e.tapsense(c16882e.yandex(i));
            i++;
        }
        return i3;
    }

    public static void vip(Object obj, Object obj2) {
        AbstractC11202e abstractC11202e = (AbstractC11202e) obj;
        C7012e c7012e = abstractC11202e.zzc;
        C7012e c7012e2 = ((AbstractC11202e) obj2).zzc;
        C7012e c7012e3 = C7012e.appmetrica;
        if (!c7012e3.equals(c7012e2)) {
            if (c7012e3.equals(c7012e)) {
                c7012e.getClass();
                c7012e2.getClass();
                int[] copyOf = Arrays.copyOf(c7012e.ad, 0);
                System.arraycopy(c7012e2.ad, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(c7012e.vip, 0);
                System.arraycopy(c7012e2.vip, 0, copyOf2, 0, 0);
                c7012e = new C7012e(copyOf, copyOf2, true);
            } else {
                c7012e.getClass();
                if (!c7012e2.equals(c7012e3)) {
                    if (!c7012e.license) {
                        throw new UnsupportedOperationException();
                    }
                    int[] iArr = c7012e.ad;
                    int length = iArr.length;
                    System.arraycopy(c7012e2.ad, 0, iArr, 0, 0);
                    System.arraycopy(c7012e2.vip, 0, c7012e.vip, 0, 0);
                }
            }
        }
        abstractC11202e.zzc = c7012e;
    }

    public static void yandex(int i, List list, C16554e c16554e, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C11177e c11177e = (C11177e) c16554e.f32481e;
        int i2 = 0;
        if (!(list instanceof C1118e)) {
            if (!z) {
                while (i2 < list.size()) {
                    c11177e.smaato(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            c11177e.yandex(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                i3 += 8;
            }
            c11177e.admob(i3);
            while (i2 < list.size()) {
                c11177e.pro(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        C1118e c1118e = (C1118e) list;
        if (!z) {
            while (i2 < c1118e.f3666e) {
                c11177e.smaato(i, c1118e.billing(i2));
                i2++;
            }
            return;
        }
        c11177e.yandex(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < c1118e.f3666e; i6++) {
            c1118e.billing(i6);
            i5 += 8;
        }
        c11177e.admob(i5);
        while (i2 < c1118e.f3666e) {
            c11177e.pro(c1118e.billing(i2));
            i2++;
        }
    }
}
