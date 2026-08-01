package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٝؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11866e {
    public static final int[] ad = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] vip = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] metrica = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static Parcelable ad(Parcelable parcelable, Parcelable.Creator creator) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } finally {
            obtain.recycle();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.InterfaceC5372e adcel(defpackage.C10068e r5, defpackage.InterfaceC13984e r6, boolean r7) {
        /*
            eؚ٘ٚ r0 = defpackage.AbstractC14161e.appmetrica(r6)
            boolean r1 = r6.startapp()
            java.util.List r6 = r6.signatures()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.AbstractC0746e.subscription(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L1b:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r6.next()
            eٍؘٔ r3 = (defpackage.C5538e) r3
            eٓٔۖ r3 = r3.vip
            if (r3 == 0) goto L2f
            r2.add(r3)
            goto L1b
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Star projections in type arguments are not allowed, but had "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L47:
            boolean r6 = r2.isEmpty()
            r3 = 0
            if (r6 == 0) goto L72
            r6 = r0
            eُ٘ۧ r6 = (defpackage.InterfaceC18155e) r6
            java.lang.Class r6 = r6.subs()
            boolean r6 = r6.isInterface()
            if (r6 == 0) goto L5e
            r5.getClass()
        L5e:
            if (r1 != 0) goto L6b
            eُِؒ r6 = defpackage.AbstractC4745e.ad
            eؘؒٙ r6 = r6.metrica(r0)
            if (r6 == 0) goto L69
            goto L8b
        L69:
            r6 = r3
            goto L8b
        L6b:
            eُِؒ r6 = defpackage.AbstractC4745e.vip
            eؘؒٙ r6 = r6.metrica(r0)
            goto L8b
        L72:
            r5.getClass()
            if (r1 != 0) goto L7e
            eؚؖ۟ r6 = defpackage.AbstractC4745e.metrica
            java.lang.Object r6 = r6.vip(r0, r2)
            goto L84
        L7e:
            eؚؖ۟ r6 = defpackage.AbstractC4745e.license
            java.lang.Object r6 = r6.vip(r0, r2)
        L84:
            boolean r4 = r6 instanceof defpackage.C12763e
            if (r4 == 0) goto L89
            r6 = r3
        L89:
            eؘؒٙ r6 = (defpackage.InterfaceC5372e) r6
        L8b:
            if (r6 == 0) goto L8e
            return r6
        L8e:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto Lb3
            eؘؒٙ r6 = defpackage.AbstractC17808e.mopub(r0)
            if (r6 != 0) goto Ldc
            r5.getClass()
            r5 = r0
            eُ٘ۧ r5 = (defpackage.InterfaceC18155e) r5
            java.lang.Class r5 = r5.subs()
            boolean r5 = r5.isInterface()
            if (r5 == 0) goto Lb1
            eۜۥ r5 = new eۜۥ
            r5.<init>(r0)
        Laf:
            r6 = r5
            goto Ldc
        Lb1:
            r6 = r3
            goto Ldc
        Lb3:
            java.util.ArrayList r6 = defpackage.AbstractC17808e.advert(r5, r2, r7)
            if (r6 != 0) goto Lba
            goto Le6
        Lba:
            eؖ٘ۚ r7 = new eؖ٘ۚ
            r4 = 0
            r7.<init>(r4, r2)
            eؘؒٙ r6 = defpackage.AbstractC17808e.purchase(r0, r6, r7)
            if (r6 != 0) goto Ldc
            r5.getClass()
            r5 = r0
            eُ٘ۧ r5 = (defpackage.InterfaceC18155e) r5
            java.lang.Class r5 = r5.subs()
            boolean r5 = r5.isInterface()
            if (r5 == 0) goto Lb1
            eۜۥ r5 = new eۜۥ
            r5.<init>(r0)
            goto Laf
        Ldc:
            if (r6 == 0) goto Le6
            if (r1 == 0) goto Le5
            eؘؒٙ r5 = defpackage.AbstractC6069e.purchase(r6)
            return r5
        Le5:
            return r6
        Le6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11866e.adcel(eَؗؑ, eٓٔۖ, boolean):eؘؒٙ");
    }

    public static void advert(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC10077e.crashlytics(iArr, iArr2, iArr3) != 0) {
            AbstractC12797e.m3400interface(8, 977, iArr3);
        }
    }

    public static void amazon(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? loadAd(i, i3, "start index") : (i2 < 0 || i2 > i3) ? loadAd(i2, i3, "end index") : AbstractC1206e.amazon("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void appmetrica(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        AbstractC10077e.isPro(iArr, iArr2, iArr4);
        yandex(iArr4, iArr3);
    }

    public static double billing(double d, double d2) {
        double max = Math.max(d, d2);
        if (max != d2) {
            d = d2;
        }
        return (max + 5.0d) / (d + 5.0d);
    }

    public static double license(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double adcel = AbstractC8210e.adcel(d);
        double d3 = ((adcel + 5.0d) * d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double billing = billing(d3, adcel);
        double abs = Math.abs(billing - d2);
        if (billing < d2 && abs > 0.04d) {
            return -1.0d;
        }
        double appmetrica = ((AbstractC8210e.appmetrica(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
        if (appmetrica < 0.0d || appmetrica > 100.0d) {
            return -1.0d;
        }
        return appmetrica;
    }

    public static String loadAd(int i, int i2, String str) {
        if (i < 0) {
            return AbstractC1206e.amazon("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return AbstractC1206e.amazon("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
    }

    public static double metrica(double d, double d2) {
        if (d < 0.0d || d > 100.0d) {
            return -1.0d;
        }
        double adcel = AbstractC8210e.adcel(d);
        double d3 = ((adcel + 5.0d) / d2) - 5.0d;
        if (d3 < 0.0d || d3 > 100.0d) {
            return -1.0d;
        }
        double billing = billing(adcel, d3);
        double abs = Math.abs(billing - d2);
        if (billing < d2 && abs > 0.04d) {
            return -1.0d;
        }
        double appmetrica = ((AbstractC8210e.appmetrica(d3 / 100.0d) * 116.0d) - 16.0d) - 0.4d;
        if (appmetrica < 0.0d || appmetrica > 100.0d) {
            return -1.0d;
        }
        return appmetrica;
    }

    public static void mopub(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC10077e.premium(iArr, iArr3);
        while (true) {
            yandex(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            } else {
                AbstractC10077e.premium(iArr2, iArr3);
            }
        }
    }

    public static double purchase(double d, double d2) {
        return billing(AbstractC8210e.adcel(d), AbstractC8210e.adcel(d2));
    }

    public static void smaato(int i, int i2) {
        String amazon;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                amazon = AbstractC1206e.amazon("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(i2, "negative size: "));
                }
                amazon = AbstractC1206e.amazon("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(amazon);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (((r2 >>> 32) != 0 ? defpackage.AbstractC12797e.isVip(8, 3, r12) : 0) == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void startapp(int[] r12, int r13) {
        /*
            r0 = 8
            r1 = 977(0x3d1, float:1.369E-42)
            if (r13 == 0) goto L40
            long r2 = (long) r1
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r6 = (long) r13
            long r6 = r6 & r4
            long r2 = r2 * r6
            r13 = 0
            r8 = r12[r13]
            long r8 = (long) r8
            long r8 = r8 & r4
            long r2 = r2 + r8
            int r8 = (int) r2
            r12[r13] = r8
            r8 = 32
            long r2 = r2 >>> r8
            r9 = 1
            r10 = r12[r9]
            long r10 = (long) r10
            long r10 = r10 & r4
            long r6 = r6 + r10
            long r6 = r6 + r2
            int r2 = (int) r6
            r12[r9] = r2
            long r2 = r6 >>> r8
            r6 = 2
            r7 = r12[r6]
            long r9 = (long) r7
            long r4 = r4 & r9
            long r2 = r2 + r4
            int r4 = (int) r2
            r12[r6] = r4
            long r2 = r2 >>> r8
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L3e
        L39:
            r13 = 3
            int r13 = defpackage.AbstractC12797e.isVip(r0, r13, r12)
        L3e:
            if (r13 != 0) goto L4e
        L40:
            r13 = 7
            r13 = r12[r13]
            r2 = -1
            if (r13 != r2) goto L51
            int[] r13 = defpackage.AbstractC11866e.ad
            boolean r13 = defpackage.AbstractC10077e.pro(r12, r13)
            if (r13 == 0) goto L51
        L4e:
            defpackage.AbstractC12797e.vip(r0, r1, r12)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11866e.startapp(int[], int):void");
    }

    public static ArrayList vip(List list, Parcelable.Creator creator) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(ad((Parcelable) list.get(i), creator));
        }
        return arrayList;
    }

    public static void yandex(int[] iArr, int[] iArr2) {
        long j = 977 & 4294967295L;
        long j2 = iArr[8] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L);
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[9] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[10] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[11] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[12] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[13] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[14] & 4294967295L;
        long j15 = (j * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = iArr[15] & 4294967295L;
        long j17 = (j * j16) + j14 + (iArr[7] & 4294967295L) + (j15 >>> 32);
        iArr2[7] = (int) j17;
        long j18 = (j17 >>> 32) + j16;
        long j19 = j18 & 4294967295L;
        long j20 = (j * j19) + (i & 4294967295L);
        iArr2[0] = (int) j20;
        long j21 = j18 >>> 32;
        long j22 = (j * j21) + j19 + (i2 & 4294967295L) + (j20 >>> 32);
        iArr2[1] = (int) j22;
        long j23 = j21 + (i3 & 4294967295L) + (j22 >>> 32);
        iArr2[2] = (int) j23;
        long j24 = (j23 >>> 32) + (i4 & 4294967295L);
        iArr2[3] = (int) j24;
        if (((j24 >>> 32) == 0 ? 0 : AbstractC12797e.isVip(8, 4, iArr2)) != 0 || (iArr2[7] == -1 && AbstractC10077e.pro(iArr2, ad))) {
            AbstractC12797e.vip(8, 977, iArr2);
        }
    }
}
