package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۧۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12909e {
    public static final C17137e adcel;
    public static long appmetrica;
    public static final Csuper billing;
    public static C11353e license;
    public static final C11936e mopub;
    public static final C6148e purchase;
    public static Object startapp;
    public static Object yandex;
    public static final C7983e ad = new C7983e(26);
    public static final C0912e vip = new C0912e();
    public static final Object metrica = new Object();

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.atomic.AtomicInteger, eِۗۥ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eّٜٗ, eّٔۚ, eٓؒٝ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int[], java.io.Serializable] */
    static {
        C11353e c11353e = C11353e.f22848e;
        license = c11353e;
        long j = 1;
        appmetrica = j + j;
        C6148e c6148e = new C6148e(4);
        c6148e.f12917e = new long[16];
        c6148e.f12914e = new int[16];
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        c6148e.f12919e = iArr;
        purchase = c6148e;
        Csuper csuper = new Csuper((char) 0, 26);
        csuper.f36469e = new int[16];
        csuper.f36471e = new C8485e[16];
        billing = csuper;
        C13664e c13664e = C13664e.f27089e;
        yandex = c13664e;
        startapp = c13664e;
        long j2 = appmetrica;
        appmetrica = j + j2;
        ?? c12478e = new C12478e(j2, c11353e, null, new C14407e(6));
        license = license.adcel(c12478e.vip);
        adcel = c12478e;
        mopub = new AtomicInteger(0);
    }

    public static final AbstractC8618e Signature(AbstractC8618e abstractC8618e, AbstractC6329e abstractC6329e, AbstractC13717e abstractC13717e, AbstractC8618e abstractC8618e2) {
        AbstractC8618e smaato;
        if (abstractC13717e.purchase()) {
            abstractC13717e.amazon(abstractC6329e);
        }
        long billing2 = abstractC13717e.billing();
        if (abstractC8618e2.ad == billing2) {
            return abstractC8618e2;
        }
        synchronized (metrica) {
            smaato = smaato(abstractC8618e, abstractC6329e);
        }
        smaato.ad = billing2;
        if (abstractC8618e2.ad != 1) {
            abstractC13717e.amazon(abstractC6329e);
        }
        return smaato;
    }

    public static final void ad() {
        appmetrica(ad);
    }

    public static final AbstractC13717e adcel() {
        AbstractC13717e abstractC13717e = (AbstractC13717e) vip.get();
        return abstractC13717e == null ? adcel : abstractC13717e;
    }

    public static final boolean admob(InterfaceC17335e interfaceC17335e) {
        AbstractC8618e abstractC8618e;
        long j = appmetrica;
        C6148e c6148e = purchase;
        if (c6148e.f12916e > 0) {
            j = ((long[]) c6148e.f12917e)[0];
        }
        AbstractC8618e abstractC8618e2 = null;
        AbstractC8618e abstractC8618e3 = null;
        int i = 0;
        for (AbstractC8618e appmetrica2 = interfaceC17335e.appmetrica(); appmetrica2 != null; appmetrica2 = appmetrica2.vip) {
            long j2 = appmetrica2.ad;
            if (j2 != 0) {
                if (AbstractC7890e.startapp(j2, j) >= 0) {
                    i++;
                } else if (abstractC8618e2 == null) {
                    i++;
                    abstractC8618e2 = appmetrica2;
                } else {
                    if (AbstractC7890e.startapp(appmetrica2.ad, abstractC8618e2.ad) < 0) {
                        abstractC8618e = abstractC8618e2;
                        abstractC8618e2 = appmetrica2;
                    } else {
                        abstractC8618e = appmetrica2;
                    }
                    if (abstractC8618e3 == null) {
                        abstractC8618e3 = interfaceC17335e.appmetrica();
                        AbstractC8618e abstractC8618e4 = abstractC8618e3;
                        while (true) {
                            if (abstractC8618e3 == null) {
                                abstractC8618e3 = abstractC8618e4;
                                break;
                            }
                            if (AbstractC7890e.startapp(abstractC8618e3.ad, j) >= 0) {
                                break;
                            }
                            if (AbstractC7890e.startapp(abstractC8618e4.ad, abstractC8618e3.ad) < 0) {
                                abstractC8618e4 = abstractC8618e3;
                            }
                            abstractC8618e3 = abstractC8618e3.vip;
                        }
                    }
                    abstractC8618e2.ad = 0L;
                    abstractC8618e2.ad(abstractC8618e3);
                    abstractC8618e2 = abstractC8618e;
                }
            }
        }
        return i > 1;
    }

    public static final Function1 advert(Function1 function1, Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C6056e(function1, function12, 3);
    }

    public static final AbstractC8618e amazon(AbstractC8618e abstractC8618e, C6656e c6656e, AbstractC13717e abstractC13717e) {
        AbstractC8618e smaato;
        synchronized (metrica) {
            smaato = smaato(abstractC8618e, c6656e);
            smaato.ad(abstractC8618e);
            smaato.ad = abstractC13717e.billing();
        }
        return smaato;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final Object appmetrica(Function1 function1) {
        C12618e c12618e;
        Object isVip;
        C17137e c17137e = adcel;
        synchronized (metrica) {
            try {
                c12618e = c17137e.yandex;
                if (c12618e != null) {
                    mopub.addAndGet(1);
                }
                isVip = isVip(c17137e, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c12618e != null) {
            try {
                ?? r4 = yandex;
                C5456e c5456e = new C5456e(c12618e);
                int size = r4.size();
                for (int i = 0; i < size; i++) {
                    ((Function2) r4.get(i)).invoke(c5456e, c17137e);
                }
            } finally {
                mopub.addAndGet(-1);
            }
        }
        synchronized (metrica) {
            try {
                purchase();
                if (c12618e != null) {
                    Object[] objArr = c12618e.vip;
                    long[] jArr = c12618e.ad;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        subscription((InterfaceC17335e) objArr[(i2 << 3) + i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            }
                            i2++;
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return isVip;
    }

    public static final AbstractC13717e billing(AbstractC13717e abstractC13717e, Function1 function1, boolean z) {
        boolean z2 = abstractC13717e instanceof C12478e;
        if (z2 || abstractC13717e == null) {
            return new C15120e(z2 ? (C12478e) abstractC13717e : null, function1, null, false, z);
        }
        return new C13142e(abstractC13717e, function1, false, z);
    }

    public static final AbstractC8618e inmobi(AbstractC8618e abstractC8618e, InterfaceC17335e interfaceC17335e, AbstractC13717e abstractC13717e) {
        AbstractC8618e pro;
        if (abstractC13717e.purchase()) {
            abstractC13717e.amazon(interfaceC17335e);
        }
        long billing2 = abstractC13717e.billing();
        AbstractC8618e pro2 = pro(abstractC8618e, billing2, abstractC13717e.license());
        if (pro2 == null) {
            remoteconfig();
            throw null;
        }
        if (pro2.ad == abstractC13717e.billing()) {
            return pro2;
        }
        synchronized (metrica) {
            pro = pro(interfaceC17335e.appmetrica(), billing2, abstractC13717e.license());
            if (pro == null) {
                remoteconfig();
                throw null;
            }
            if (pro.ad != billing2) {
                AbstractC8618e smaato = smaato(pro, interfaceC17335e);
                smaato.ad(pro);
                smaato.ad = abstractC13717e.billing();
                pro = smaato;
            }
        }
        if (pro2.ad != 1) {
            abstractC13717e.amazon(interfaceC17335e);
        }
        return pro;
    }

    public static final Object isVip(C17137e c17137e, Function1 function1) {
        long j = c17137e.vip;
        Object invoke = function1.invoke(license.billing(j));
        long j2 = appmetrica;
        appmetrica = 1 + j2;
        C11353e billing2 = license.billing(j);
        license = billing2;
        c17137e.vip = j2;
        c17137e.ad = billing2;
        c17137e.billing = 0;
        c17137e.yandex = null;
        c17137e.loadAd();
        license = license.adcel(j2);
        return invoke;
    }

    public static final C11353e license(C11353e c11353e, long j, long j2) {
        while (AbstractC7890e.startapp(j, j2) < 0) {
            c11353e = c11353e.adcel(j);
            j++;
        }
        return c11353e;
    }

    public static final void loadAd(AbstractC13717e abstractC13717e, InterfaceC17335e interfaceC17335e) {
        abstractC13717e.pro(abstractC13717e.yandex() + 1);
        Function1 startapp2 = abstractC13717e.startapp();
        if (startapp2 != null) {
            startapp2.invoke(interfaceC17335e);
        }
    }

    public static final void metrica(AbstractC13717e abstractC13717e) {
        long j;
        if (license.yandex(abstractC13717e.billing())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(abstractC13717e.billing());
        sb.append(", disposed=");
        sb.append(abstractC13717e.metrica);
        sb.append(", applied=");
        C12478e c12478e = abstractC13717e instanceof C12478e ? (C12478e) abstractC13717e : null;
        sb.append(c12478e != null ? Boolean.valueOf(c12478e.smaato) : "read-only");
        sb.append(", lowestPin=");
        synchronized (metrica) {
            C6148e c6148e = purchase;
            j = c6148e.f12916e > 0 ? ((long[]) c6148e.f12917e)[0] : -1L;
        }
        sb.append(j);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final Function1 mopub(Function1 function1, Function1 function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new C6056e(function1, function12, 2);
    }

    public static final AbstractC8618e pro(AbstractC8618e abstractC8618e, long j, C11353e c11353e) {
        AbstractC8618e abstractC8618e2 = null;
        while (abstractC8618e != null) {
            long j2 = abstractC8618e.ad;
            if (j2 != 0 && AbstractC7890e.startapp(j2, j) <= 0 && !c11353e.yandex(j2) && (abstractC8618e2 == null || AbstractC7890e.startapp(abstractC8618e2.ad, abstractC8618e.ad) < 0)) {
                abstractC8618e2 = abstractC8618e;
            }
            abstractC8618e = abstractC8618e.vip;
        }
        if (abstractC8618e2 != null) {
            return abstractC8618e2;
        }
        return null;
    }

    public static final void purchase() {
        Csuper csuper = billing;
        int i = csuper.f36470e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C8485e c8485e = ((C8485e[]) csuper.f36471e)[i2];
            Object obj = c8485e != null ? c8485e.get() : null;
            if (obj != null && admob((InterfaceC17335e) obj)) {
                if (i3 != i2) {
                    ((C8485e[]) csuper.f36471e)[i3] = c8485e;
                    int[] iArr = (int[]) csuper.f36469e;
                    iArr[i3] = iArr[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < i; i4++) {
            ((C8485e[]) csuper.f36471e)[i4] = null;
            ((int[]) csuper.f36469e)[i4] = 0;
        }
        if (i3 != i) {
            csuper.f36470e = i3;
        }
    }

    public static final void remoteconfig() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final AbstractC8618e signatures(AbstractC8618e abstractC8618e, InterfaceC17335e interfaceC17335e) {
        AbstractC8618e pro;
        AbstractC13717e adcel2 = adcel();
        Function1 appmetrica2 = adcel2.appmetrica();
        if (appmetrica2 != null) {
            appmetrica2.invoke(interfaceC17335e);
        }
        AbstractC8618e pro2 = pro(abstractC8618e, adcel2.billing(), adcel2.license());
        if (pro2 != null) {
            return pro2;
        }
        synchronized (metrica) {
            AbstractC13717e adcel3 = adcel();
            pro = pro(interfaceC17335e.appmetrica(), adcel3.billing(), adcel3.license());
            if (pro == null) {
                remoteconfig();
                throw null;
            }
        }
        return pro;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.AbstractC8618e smaato(defpackage.AbstractC8618e r10, defpackage.InterfaceC17335e r11) {
        /*
            eٌٌُ r0 = r11.appmetrica()
            long r1 = defpackage.AbstractC12909e.appmetrica
            eؙؓٞ r3 = defpackage.AbstractC12909e.purchase
            int r4 = r3.f12916e
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.f12917e
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.ad
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.AbstractC7890e.startapp(r5, r1)
            if (r7 > 0) goto L48
            eُۢۡ r7 = defpackage.C11353e.f22848e
            boolean r5 = r7.yandex(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.ad
            long r5 = r4.ad
            int r1 = defpackage.AbstractC7890e.startapp(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            eٌٌُ r0 = r0.vip
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.ad = r0
            return r3
        L55:
            eٌٌُ r10 = r10.metrica(r0)
            eٌٌُ r0 = r11.appmetrica()
            r10.vip = r0
            r11.yandex(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12909e.smaato(eٌٌُ, eٗۡۦ):eٌٌُ");
    }

    public static final AbstractC8618e startapp(AbstractC8618e abstractC8618e, AbstractC13717e abstractC13717e) {
        AbstractC8618e pro;
        AbstractC8618e pro2 = pro(abstractC8618e, abstractC13717e.billing(), abstractC13717e.license());
        if (pro2 != null) {
            return pro2;
        }
        synchronized (metrica) {
            pro = pro(abstractC8618e, abstractC13717e.billing(), abstractC13717e.license());
        }
        if (pro != null) {
            return pro;
        }
        remoteconfig();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void subscription(InterfaceC17335e interfaceC17335e) {
        if (admob(interfaceC17335e)) {
            Csuper csuper = billing;
            int i = csuper.f36470e;
            int identityHashCode = System.identityHashCode(interfaceC17335e);
            int i2 = -1;
            if (i > 0) {
                int i3 = csuper.f36470e - 1;
                int i4 = 0;
                while (true) {
                    if (i4 > i3) {
                        i2 = -(i4 + 1);
                        break;
                    }
                    int i5 = (i4 + i3) >>> 1;
                    int i6 = ((int[]) csuper.f36469e)[i5];
                    if (i6 < identityHashCode) {
                        i4 = i5 + 1;
                    } else if (i6 > identityHashCode) {
                        i3 = i5 - 1;
                    } else {
                        C8485e c8485e = ((C8485e[]) csuper.f36471e)[i5];
                        if (interfaceC17335e != (c8485e != null ? c8485e.get() : null)) {
                            for (int i7 = i5 - 1; -1 < i7 && ((int[]) csuper.f36469e)[i7] == identityHashCode; i7--) {
                                C8485e c8485e2 = ((C8485e[]) csuper.f36471e)[i7];
                                if ((c8485e2 != null ? c8485e2.get() : null) == interfaceC17335e) {
                                    i2 = i7;
                                    break;
                                }
                            }
                            i5++;
                            int i8 = csuper.f36470e;
                            while (true) {
                                if (i5 >= i8) {
                                    i2 = -(csuper.f36470e + 1);
                                    break;
                                } else {
                                    if (((int[]) csuper.f36469e)[i5] != identityHashCode) {
                                        i2 = -(i5 + 1);
                                        break;
                                    }
                                    C8485e c8485e3 = ((C8485e[]) csuper.f36471e)[i5];
                                    if ((c8485e3 != null ? c8485e3.get() : null) == interfaceC17335e) {
                                        break;
                                    } else {
                                        i5++;
                                    }
                                }
                            }
                        }
                        i2 = i5;
                    }
                }
                if (i2 >= 0) {
                    return;
                }
            }
            int i9 = -(i2 + 1);
            C8485e[] c8485eArr = (C8485e[]) csuper.f36471e;
            int length = c8485eArr.length;
            if (i == length) {
                int i10 = length * 2;
                C8485e[] c8485eArr2 = new C8485e[i10];
                int[] iArr = new int[i10];
                int i11 = i9 + 1;
                System.arraycopy(c8485eArr, i9, c8485eArr2, i11, i - i9);
                System.arraycopy((C8485e[]) csuper.f36471e, 0, c8485eArr2, 0, i9);
                AbstractC1660e.advert(i11, i9, (int[]) csuper.f36469e, iArr, i);
                AbstractC1660e.Signature(0, i9, (int[]) csuper.f36469e, iArr, 6);
                csuper.f36471e = c8485eArr2;
                csuper.f36469e = iArr;
            } else {
                int i12 = i9 + 1;
                System.arraycopy(c8485eArr, i9, c8485eArr, i12, i - i9);
                int[] iArr2 = (int[]) csuper.f36469e;
                AbstractC1660e.advert(i12, i9, iArr2, iArr2, i);
            }
            ((C8485e[]) csuper.f36471e)[i9] = new WeakReference(interfaceC17335e);
            ((int[]) csuper.f36469e)[i9] = identityHashCode;
            csuper.f36470e++;
        }
    }

    public static final void tapsense(int i) {
        C6148e c6148e = purchase;
        int i2 = ((int[]) c6148e.f12919e)[i];
        c6148e.loadAd(i2, c6148e.f12916e - 1);
        c6148e.f12916e--;
        long[] jArr = (long[]) c6148e.f12917e;
        long j = jArr[i2];
        int i3 = i2;
        while (i3 > 0) {
            int i4 = ((i3 + 1) >> 1) - 1;
            if (AbstractC7890e.startapp(jArr[i4], j) <= 0) {
                break;
            }
            c6148e.loadAd(i4, i3);
            i3 = i4;
        }
        long[] jArr2 = (long[]) c6148e.f12917e;
        int i5 = c6148e.f12916e >> 1;
        while (i2 < i5) {
            int i6 = (i2 + 1) << 1;
            int i7 = i6 - 1;
            if (i6 < c6148e.f12916e && AbstractC7890e.startapp(jArr2[i6], jArr2[i7]) < 0) {
                if (AbstractC7890e.startapp(jArr2[i6], jArr2[i2]) >= 0) {
                    break;
                }
                c6148e.loadAd(i6, i2);
                i2 = i6;
            } else {
                if (AbstractC7890e.startapp(jArr2[i7], jArr2[i2]) >= 0) {
                    break;
                }
                c6148e.loadAd(i7, i2);
                i2 = i7;
            }
        }
        ((int[]) c6148e.f12919e)[i] = c6148e.f12915e;
        c6148e.f12915e = i;
    }

    public static final HashMap vip(long j, C12478e c12478e, C11353e c11353e) {
        long[] jArr;
        C11353e c11353e2;
        long[] jArr2;
        C11353e c11353e3;
        int i;
        int i2;
        AbstractC8618e pro;
        C12618e inmobi = c12478e.inmobi();
        if (inmobi != null) {
            long billing2 = c12478e.billing();
            C11353e startapp2 = c12478e.license().adcel(billing2).startapp(c12478e.adcel);
            Object[] objArr = inmobi.vip;
            long[] jArr3 = inmobi.ad;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j2 = jArr3[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                InterfaceC17335e interfaceC17335e = (InterfaceC17335e) objArr[(i3 << 3) + i6];
                                AbstractC8618e appmetrica2 = interfaceC17335e.appmetrica();
                                jArr2 = jArr3;
                                i = i4;
                                i2 = i6;
                                AbstractC8618e pro2 = pro(appmetrica2, j, c11353e);
                                if (pro2 == null || (pro = pro(appmetrica2, billing2, startapp2)) == null || pro2.equals(pro)) {
                                    c11353e3 = startapp2;
                                } else {
                                    c11353e3 = startapp2;
                                    AbstractC8618e pro3 = pro(appmetrica2, billing2, c12478e.license());
                                    if (pro3 == null) {
                                        remoteconfig();
                                        throw null;
                                    }
                                    AbstractC8618e billing3 = interfaceC17335e.billing(pro, pro2, pro3);
                                    if (billing3 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(pro2, billing3);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                c11353e3 = startapp2;
                                i = i4;
                                i2 = i6;
                            }
                            j2 >>= i;
                            i6 = i2 + 1;
                            i4 = i;
                            jArr3 = jArr2;
                            startapp2 = c11353e3;
                        }
                        jArr = jArr3;
                        c11353e2 = startapp2;
                        if (i5 != i4) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        c11353e2 = startapp2;
                    }
                    if (i3 == length) {
                        return hashMap;
                    }
                    i3++;
                    jArr3 = jArr;
                    startapp2 = c11353e2;
                }
            }
        }
        return null;
    }

    public static final AbstractC8618e yandex(AbstractC8618e abstractC8618e) {
        AbstractC8618e pro;
        AbstractC13717e adcel2 = adcel();
        AbstractC8618e pro2 = pro(abstractC8618e, adcel2.billing(), adcel2.license());
        if (pro2 != null) {
            return pro2;
        }
        synchronized (metrica) {
            AbstractC13717e adcel3 = adcel();
            pro = pro(abstractC8618e, adcel3.billing(), adcel3.license());
        }
        if (pro != null) {
            return pro;
        }
        remoteconfig();
        throw null;
    }
}
