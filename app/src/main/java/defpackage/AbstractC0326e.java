package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؑۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0326e {
    public static final C2892e ad = new C2892e(876538222, false, new C13060e(18));

    public static final long Signature(int i, EnumC15934e enumC15934e) {
        if (enumC15934e.compareTo(EnumC15934e.SECONDS) > 0) {
            return admob(i, enumC15934e);
        }
        return yandex(EnumC15934e.NANOSECONDS.f31392e.convert(i, enumC15934e.f31392e));
    }

    public static final void ad(Logger logger, AbstractC6552e abstractC6552e, C10497e c10497e, String str) {
        logger.fine(c10497e.vip + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC6552e.ad);
    }

    public static final long admob(long j, EnumC15934e enumC15934e) {
        EnumC15934e enumC15934e2 = EnumC15934e.NANOSECONDS;
        TimeUnit timeUnit = enumC15934e.f31392e;
        TimeUnit timeUnit2 = enumC15934e.f31392e;
        long convert = timeUnit.convert(4611686018426999999L, enumC15934e2.f31392e);
        if ((-convert) <= j && j <= convert) {
            return yandex(enumC15934e2.f31392e.convert(j, timeUnit2));
        }
        EnumC15934e enumC15934e3 = EnumC15934e.MILLISECONDS;
        if (enumC15934e.compareTo(enumC15934e3) < 0) {
            return purchase(AbstractC3062e.appmetrica(enumC15934e3.f31392e.convert(j, timeUnit2), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return purchase(AbstractC3697e.license(Math.abs(j), enumC15934e) * signum);
    }

    public static final InterfaceC9089e advert(InterfaceC8850e interfaceC8850e) {
        InterfaceC9089e interfaceC9089e = (InterfaceC9089e) interfaceC8850e.mo397public(C12575e.f25231e);
        if (interfaceC9089e != null) {
            return interfaceC9089e;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final long billing(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? purchase(AbstractC3062e.appmetrica(j, -4611686018427387903L, 4611686018427387903L)) : yandex(j * 1000000);
    }

    public static final long purchase(long j) {
        long j2 = (j << 1) + 1;
        C14157e.f27993e.getClass();
        int i = AbstractC4193e.ad;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b8, code lost:
    
        if (r8 == r23.length()) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c0, code lost:
    
        if (r23.charAt(r8) != 'S') goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c2, code lost:
    
        r2 = (r13 * 1000000000) + r14;
        r4 = r10;
        r13 = defpackage.EnumC15934e.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        switch(r13.ordinal()) {
            case 0: goto L133;
            case 1: goto L132;
            case 2: goto L131;
            case 3: goto L130;
            case 4: goto L129;
            case 5: goto L128;
            case 6: goto L127;
            default: goto L207;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ed, code lost:
    
        r13 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
    
        r13 = defpackage.AbstractC1561e.purchase(r2 * r13) * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01f3, code lost:
    
        r13 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01f9, code lost:
    
        r13 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01ff, code lost:
    
        r13 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0205, code lost:
    
        r13 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x020b, code lost:
    
        r13 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0211, code lost:
    
        r13 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01ec, code lost:
    
        throw new java.lang.IllegalStateException(("Unknown unit: " + r13).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0104, code lost:
    
        throw new java.lang.IllegalArgumentException(org.conscrypt.BuildConfig.FLAVOR);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00f1, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
    
        if (r8 >= r23.length()) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d2, code lost:
    
        r4 = r23.charAt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
    
        if ('0' > r4) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r4 >= ':') goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e5, code lost:
    
        if (r8 == r23.length()) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
    
        if (r3 == '+') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r3 == '-') goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f5, code lost:
    
        if (r8 == (r20 + r3)) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        r6 = r7.ad;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157 A[LOOP:5: B:75:0x0155->B:76:0x0157, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194 A[LOOP:7: B:88:0x0192->B:89:0x0194, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long smaato(java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0326e.smaato(java.lang.String):long");
    }

    public static final String startapp(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? AbstractC5087e.m1750native((j - 500000000) / 1000000000, " s ", new StringBuilder()) : j <= -999500 ? AbstractC5087e.m1750native((j - 500000) / 1000000, " ms", new StringBuilder()) : j <= 0 ? AbstractC5087e.m1750native((j - 500) / 1000, " µs", new StringBuilder()) : j < 999500 ? AbstractC5087e.m1750native((j + 500) / 1000, " µs", new StringBuilder()) : j < 999500000 ? AbstractC5087e.m1750native((j + 500000) / 1000000, " ms", new StringBuilder()) : AbstractC5087e.m1750native((j + 500000000) / 1000000000, " s ", new StringBuilder())}, 1));
    }

    public static final Object subscription(Function1 function1, AbstractC7185e abstractC7185e) {
        return advert(abstractC7185e.f21135e).mo1675catch(new C7267e(2, function1), abstractC7185e);
    }

    public static final long vip(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : AbstractC3062e.appmetrica(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long yandex(long j) {
        C17647e c17647e = C14157e.f27993e;
        long j2 = j << 1;
        int i = AbstractC4193e.ad;
        return j2;
    }

    public abstract C17100e adcel(AbstractC0586e abstractC0586e);

    public abstract void amazon(C2694e c2694e, C2694e c2694e2);

    public abstract boolean appmetrica(AbstractC0586e abstractC0586e, C2694e c2694e, C2694e c2694e2);

    public abstract boolean license(AbstractC0586e abstractC0586e, Object obj, Object obj2);

    public abstract void loadAd(C2694e c2694e, Thread thread);

    public abstract boolean metrica(AbstractC0586e abstractC0586e, C17100e c17100e, C17100e c17100e2);

    public abstract C2694e mopub(AbstractC0586e abstractC0586e);
}
