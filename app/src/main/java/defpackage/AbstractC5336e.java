package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِؐ */
/* loaded from: classes3.dex */
public abstract class AbstractC5336e {
    public static final C2892e ad = new C2892e(-1097978549, false, new C11789e(0));
    public static final C2892e vip = new C2892e(1338262167, false, new C11789e(1));
    public static final C2892e metrica = new C2892e(-141951758, false, new C11789e(2));
    public static final C2892e license = new C2892e(370833536, false, new C11789e(3));
    public static final C2892e appmetrica = new C2892e(-480573413, false, new C11789e(4));
    public static final C2892e purchase = new C2892e(-342812257, false, new C11789e(5));
    public static final C2892e billing = new C2892e(-1194219206, false, new C11789e(6));
    public static final C2892e yandex = new C2892e(317878071, false, new C15480e(24));
    public static final C2892e startapp = new C2892e(-57782880, false, new C15480e(25));
    public static final C2892e adcel = new C2892e(-144146955, false, new C11789e(7));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [e٘ۚۧ, eٌ٘ٚ] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final C8763e ad(int i, InterfaceC8850e interfaceC8850e, InterfaceC18435e interfaceC18435e, Function2 function2) {
        InterfaceC8850e loadAd = AbstractC6494e.loadAd(interfaceC18435e, interfaceC8850e);
        ?? c10557e = i == 2 ? new C10557e(loadAd, function2) : new AbstractC18001e(loadAd, true);
        c10557e.m4472e(i, c10557e, function2);
        return c10557e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean adcel(defpackage.C14446e r12, boolean r13) {
        /*
            eؒۙۚ r0 = new eؒۙۚ
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.m564extends(r4)
            byte[] r5 = r0.ad
            r6 = 0
            boolean r5 = r12.billing(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L65
        L18:
            long r7 = r0.subs()
            int r5 = r0.smaato()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L35
            byte[] r7 = r0.ad
            boolean r7 = r12.billing(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L65
        L2f:
            long r7 = r0.m566interface()
            r9 = r1
            goto L36
        L35:
            r9 = r4
        L36:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3c
            goto L65
        L3c:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L66
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L65
            if (r7 >= r4) goto L48
            goto L65
        L48:
            r3 = 4
            r0.m564extends(r3)
            byte[] r4 = r0.ad
            r12.billing(r4, r6, r3, r6)
            int r3 = r0.smaato()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5b
            goto L65
        L5b:
            if (r13 != 0) goto L5e
            goto L6b
        L5e:
            int r7 = r7 + (-4)
            r12.mopub(r7, r6)
            r3 = r6
            goto L9
        L65:
            return r6
        L66:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6c
        L6b:
            return r2
        L6c:
            if (r7 == 0) goto L9
            r12.mopub(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5336e.adcel(eٟٔؑ, boolean):boolean");
    }

    public static final Object advert(InterfaceC8850e interfaceC8850e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        InterfaceC8850e admob = interfaceC5083e.admob();
        InterfaceC8850e mo394const = !((Boolean) interfaceC8850e.mo395e(Boolean.FALSE, new C8436e((byte) 0, 5))).booleanValue() ? admob.mo394const(interfaceC8850e) : AbstractC6494e.yandex(admob, interfaceC8850e, false);
        AbstractC6629e.yandex(mo394const);
        if (mo394const == admob) {
            C1613e c1613e = new C1613e(interfaceC5083e, mo394const);
            return AbstractC18491e.amazon(c1613e, true, c1613e, function2);
        }
        C12575e c12575e = C12575e.f25235e;
        if (AbstractC7890e.billing(mo394const.mo397public(c12575e), admob.mo397public(c12575e))) {
            C13514e c13514e = new C13514e(interfaceC5083e, mo394const);
            InterfaceC8850e interfaceC8850e2 = c13514e.f35291e;
            Object purchase2 = AbstractC2745e.purchase(interfaceC8850e2, null);
            try {
                return AbstractC18491e.amazon(c13514e, true, c13514e, function2);
            } finally {
                AbstractC2745e.appmetrica(interfaceC8850e2, purchase2);
            }
        }
        C1613e c1613e2 = new C1613e(interfaceC5083e, mo394const);
        try {
            AbstractC7214e.advert(AbstractC10558e.startapp(AbstractC10558e.yandex(c1613e2, c1613e2, function2)), Unit.INSTANCE);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C7773e.f15757e;
            do {
                int i = atomicIntegerFieldUpdater.get(c1613e2);
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object startapp2 = AbstractC15211e.startapp(C6467e.f13374e.get(c1613e2));
                    if (startapp2 instanceof C1427e) {
                        throw ((C1427e) startapp2).ad;
                    }
                    return startapp2;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c1613e2, 0, 1));
            return EnumC2821e.f6782e;
        } catch (Throwable th) {
            AbstractC17673e.license(c1613e2, th);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [eٌُؑ, e٘ۚۧ] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final C8419e appmetrica(int i, InterfaceC8850e interfaceC8850e, InterfaceC18435e interfaceC18435e, Function2 function2) {
        InterfaceC8850e loadAd = AbstractC6494e.loadAd(interfaceC18435e, interfaceC8850e);
        ?? c16069e = i == 2 ? new C16069e(loadAd, function2) : new AbstractC18001e(loadAd, true);
        c16069e.m4472e(i, c16069e, function2);
        return c16069e;
    }

    public static long billing(int i, byte[] bArr) {
        return (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16)) & 4294967295L;
    }

    public static C14911e license(InterfaceC0293e interfaceC0293e) {
        interfaceC0293e.getDigestSize();
        return new C14911e(interfaceC0293e.getAlgorithmName(), 4);
    }

    public static byte[] metrica(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long billing2 = billing(0, bArr) & 67108863;
        int i = 3;
        long billing3 = (billing(3, bArr) >> 2) & 67108611;
        long billing4 = (billing(6, bArr) >> 4) & 67092735;
        long billing5 = (billing(9, bArr) >> 6) & 66076671;
        long billing6 = (billing(12, bArr) >> 8) & 1048575;
        long j = billing3 * 5;
        long j2 = billing4 * 5;
        long j3 = billing5 * 5;
        long j4 = billing6 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i2 = 0;
        while (i2 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i2);
            System.arraycopy(bArr2, i2, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, 17, (byte) 0);
            }
            long billing7 = j9 + (billing(0, bArr3) & 67108863);
            long billing8 = j5 + ((billing(i, bArr3) >> 2) & 67108863);
            long billing9 = j6 + ((billing(6, bArr3) >> 4) & 67108863);
            long billing10 = j7 + ((billing(9, bArr3) >> 6) & 67108863);
            long j10 = billing3;
            long billing11 = j8 + (((billing(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j11 = (billing11 * j) + (billing10 * j2) + (billing9 * j3) + (billing8 * j4) + (billing7 * billing2);
            long j12 = (billing11 * j2) + (billing10 * j3) + (billing9 * j4) + (billing8 * billing2) + (billing7 * j10);
            long j13 = (billing11 * j3) + (billing10 * j4) + (billing9 * billing2) + (billing8 * j10) + (billing7 * billing4);
            long j14 = (billing11 * j4) + (billing10 * billing2) + (billing9 * j10) + (billing8 * billing4) + (billing7 * billing5);
            long j15 = billing10 * j10;
            long j16 = billing11 * billing2;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (billing9 * billing4) + (billing8 * billing5) + (billing7 * billing6) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i2 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            billing3 = j10;
            i = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long billing12 = billing(16, bArr) + j50;
        long j54 = billing12 & 4294967295L;
        long billing13 = billing(20, bArr) + j51 + (billing12 >> 32);
        long billing14 = billing(24, bArr) + j52 + (billing13 >> 32);
        long billing15 = (billing(28, bArr) + j53 + (billing14 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        mopub(0, j54, bArr4);
        mopub(4, billing13 & 4294967295L, bArr4);
        mopub(8, billing14 & 4294967295L, bArr4);
        mopub(12, billing15, bArr4);
        return bArr4;
    }

    public static void mopub(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) (255 & j);
            i2++;
            j >>= 8;
        }
    }

    public static /* synthetic */ C8419e purchase(InterfaceC18435e interfaceC18435e, InterfaceC8850e interfaceC8850e, int i, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC8850e = C2693e.f6576e;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return appmetrica(i, interfaceC8850e, interfaceC18435e, function2);
    }

    public static /* synthetic */ Object startapp(Function2 function2) {
        return yandex(C2693e.f6576e, function2);
    }

    public static /* synthetic */ C8763e vip(int i, InterfaceC8850e interfaceC8850e, InterfaceC18435e interfaceC18435e, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC8850e = C2693e.f6576e;
        }
        return ad((i & 2) != 0 ? 1 : 4, interfaceC8850e, interfaceC18435e, function2);
    }

    public static final Object yandex(InterfaceC8850e interfaceC8850e, Function2 function2) {
        AbstractC11092e abstractC11092e;
        InterfaceC8850e yandex2;
        long mo370e;
        Thread currentThread = Thread.currentThread();
        InterfaceC1598e interfaceC1598e = C12575e.f25235e;
        InterfaceC5972e interfaceC5972e = (InterfaceC5972e) interfaceC8850e.mo397public(interfaceC1598e);
        C2693e c2693e = C2693e.f6576e;
        if (interfaceC5972e == null) {
            abstractC11092e = AbstractC3858e.ad();
            yandex2 = AbstractC6494e.yandex(c2693e, interfaceC8850e.mo394const(abstractC11092e), true);
            C15420e c15420e = AbstractC6731e.ad;
            if (yandex2 != c15420e && yandex2.mo397public(interfaceC1598e) == null) {
                yandex2 = yandex2.mo394const(c15420e);
            }
        } else {
            if (interfaceC5972e instanceof AbstractC11092e) {
            }
            abstractC11092e = (AbstractC11092e) AbstractC3858e.ad.get();
            yandex2 = AbstractC6494e.yandex(c2693e, interfaceC8850e, true);
            C15420e c15420e2 = AbstractC6731e.ad;
            if (yandex2 != c15420e2 && yandex2.mo397public(interfaceC1598e) == null) {
                yandex2 = yandex2.mo394const(c15420e2);
            }
        }
        C3624e c3624e = new C3624e(yandex2, currentThread, abstractC11092e);
        c3624e.m4472e(1, c3624e, function2);
        AbstractC11092e abstractC11092e2 = c3624e.f8166e;
        if (abstractC11092e2 != null) {
            int i = AbstractC11092e.f21989e;
            abstractC11092e2.m2986e(false);
        }
        while (true) {
            if (abstractC11092e2 != null) {
                try {
                    mo370e = abstractC11092e2.mo370e();
                } catch (Throwable th) {
                    if (abstractC11092e2 != null) {
                        int i2 = AbstractC11092e.f21989e;
                        abstractC11092e2.m2987e(false);
                    }
                    throw th;
                }
            } else {
                mo370e = Long.MAX_VALUE;
            }
            if (c3624e.mo693e()) {
                break;
            }
            LockSupport.parkNanos(c3624e, mo370e);
            if (Thread.interrupted()) {
                c3624e.isPro(new InterruptedException());
            }
        }
        if (abstractC11092e2 != null) {
            int i3 = AbstractC11092e.f21989e;
            abstractC11092e2.m2987e(false);
        }
        Object startapp2 = AbstractC15211e.startapp(C6467e.f13374e.get(c3624e));
        C1427e c1427e = startapp2 instanceof C1427e ? (C1427e) startapp2 : null;
        if (c1427e == null) {
            return startapp2;
        }
        throw c1427e.ad;
    }
}
