package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11698e implements Closeable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0743e f23528e = new C0743e(0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f23527e = new ArrayList();
    private volatile /* synthetic */ long oldestCookie = 0;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C17651e f23526e = AbstractC12751e.ad();

    public static Long advert(C15566e c15566e, long j) {
        if (c15566e.f30732e != null) {
            return Long.valueOf((r0.intValue() * 1000) + j);
        }
        C17476e c17476e = c15566e.f30727e;
        if (c17476e != null) {
            return Long.valueOf(c17476e.f34230e);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:12:0x0057, B:14:0x0076, B:17:0x008f, B:19:0x0093, B:21:0x00a1, B:23:0x00ad, B:25:0x00b7, B:26:0x00bc, B:31:0x0099, B:32:0x0081), top: B:11:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.C6399e r10, defpackage.C15566e r11, defpackage.AbstractC10731e r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.C0270e
            if (r0 == 0) goto L13
            r0 = r12
            eّؑۚ r0 = (defpackage.C0270e) r0
            int r1 = r0.f2270e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2270e = r1
            goto L18
        L13:
            eّؑۚ r0 = new eّؑۚ
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f2271e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f2270e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            eٍٖ٘ r10 = r0.f2272e
            eّٕٚ r11 = r0.f2267e
            eٌؙٔ r0 = r0.f2269e
            defpackage.AbstractC2003e.purchase(r12)
            r12 = r10
            r10 = r0
            goto L56
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            defpackage.AbstractC2003e.purchase(r12)
            java.lang.String r12 = r11.f30734e
            boolean r12 = defpackage.AbstractC5304e.m1866native(r12)
            if (r12 == 0) goto L45
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        L45:
            eٍٖ٘ r12 = r9.f23526e
            r0.f2269e = r10
            r0.f2267e = r11
            r0.f2272e = r12
            r0.f2270e = r3
            java.lang.Object r0 = r12.appmetrica(r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = 0
            java.util.ArrayList r1 = r9.f23527e     // Catch: java.lang.Throwable -> Lba
            eّّۚ r2 = new eّّۚ     // Catch: java.lang.Throwable -> Lba
            r4 = 4
            r2.<init>(r11, r10, r4)     // Catch: java.lang.Throwable -> Lba
            defpackage.AbstractC13480e.m3593new(r1, r2)     // Catch: java.lang.Throwable -> Lba
            eٟؑۨ r1 = r9.f23528e     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> Lba
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lba
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Lba
            java.util.ArrayList r4 = r9.f23527e     // Catch: java.lang.Throwable -> Lba
            eٕؒ۠ r5 = new eٕؒ۠     // Catch: java.lang.Throwable -> Lba
            java.lang.String r6 = r11.f30735e     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto L81
            java.lang.String r7 = "/"
            r8 = 0
            boolean r6 = defpackage.AbstractC6507e.pro(r6, r7, r8)     // Catch: java.lang.Throwable -> Lba
            if (r6 != r3) goto L81
            r3 = r11
            goto L8f
        L81:
            eؘؒؐ r3 = r10.f13262e     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> Lba
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lba
            r6 = 959(0x3bf, float:1.344E-42)
            eّٕٚ r3 = defpackage.C15566e.ad(r11, r0, r3, r6)     // Catch: java.lang.Throwable -> Lba
        L8f:
            java.lang.String r6 = r3.f30736e     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto L99
            boolean r6 = defpackage.AbstractC5304e.m1866native(r6)     // Catch: java.lang.Throwable -> Lba
            if (r6 == 0) goto La1
        L99:
            java.lang.String r10 = r10.f13273e     // Catch: java.lang.Throwable -> Lba
            r6 = 991(0x3df, float:1.389E-42)
            eّٕٚ r3 = defpackage.C15566e.ad(r3, r10, r0, r6)     // Catch: java.lang.Throwable -> Lba
        La1:
            r5.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lba
            r4.add(r5)     // Catch: java.lang.Throwable -> Lba
            java.lang.Long r10 = advert(r11, r1)     // Catch: java.lang.Throwable -> Lba
            if (r10 == 0) goto Lbe
            long r10 = r10.longValue()     // Catch: java.lang.Throwable -> Lba
            long r1 = r9.oldestCookie     // Catch: java.lang.Throwable -> Lba
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto Lbc
            r9.oldestCookie = r10     // Catch: java.lang.Throwable -> Lba
            goto Lbc
        Lba:
            r10 = move-exception
            goto Lc4
        Lbc:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lba
        Lbe:
            r12.billing(r0)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        Lc4:
            r12.billing(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11698e.ad(eٌؙٔ, eّٕٚ, eُؑ۠):java.lang.Object");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void license(long j) {
        AbstractC13480e.m3593new(this.f23527e, new C14134e(this, j));
        Iterator it = this.f23527e.iterator();
        long j2 = Long.MAX_VALUE;
        while (it.hasNext()) {
            C1372e c1372e = (C1372e) it.next();
            Long advert = advert(c1372e.ad, c1372e.vip);
            if (advert != null) {
                j2 = Math.min(j2, advert.longValue());
            }
        }
        this.oldestCookie = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x005a, B:15:0x0060, B:16:0x006b, B:18:0x0071, B:21:0x0080, B:26:0x0084, B:27:0x0093, B:29:0x0099), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071 A[Catch: all -> 0x005e, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x005a, B:15:0x0060, B:16:0x006b, B:18:0x0071, B:21:0x0080, B:26:0x0084, B:27:0x0093, B:29:0x0099), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: all -> 0x005e, LOOP:1: B:27:0x0093->B:29:0x0099, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x005e, blocks: (B:12:0x0048, B:14:0x005a, B:15:0x0060, B:16:0x006b, B:18:0x0071, B:21:0x0080, B:26:0x0084, B:27:0x0093, B:29:0x0099), top: B:11:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable purchase(defpackage.C6399e r6, defpackage.AbstractC10731e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.C3065e
            if (r0 == 0) goto L13
            r0 = r7
            eؕؑٝ r0 = (defpackage.C3065e) r0
            int r1 = r0.f7129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7129e = r1
            goto L18
        L13:
            eؕؑٝ r0 = new eؕؑٝ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7132e
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            int r2 = r0.f7129e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eٍٖ٘ r6 = r0.f7128e
            eٌؙٔ r0 = r0.f7130e
            defpackage.AbstractC2003e.purchase(r7)
            r7 = r6
            r6 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.AbstractC2003e.purchase(r7)
            eٍٖ٘ r7 = r5.f23526e
            r0.f7130e = r6
            r0.f7128e = r7
            r0.f7129e = r3
            java.lang.Object r0 = r7.appmetrica(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            eٟؑۨ r1 = r5.f23528e     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L5e
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L5e
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L5e
            long r3 = r5.oldestCookie     // Catch: java.lang.Throwable -> L5e
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L60
            r5.license(r1)     // Catch: java.lang.Throwable -> L5e
            goto L60
        L5e:
            r6 = move-exception
            goto La9
        L60:
            java.util.ArrayList r1 = r5.f23527e     // Catch: java.lang.Throwable -> L5e
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r2.<init>()     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5e
        L6b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r3 == 0) goto L84
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L5e
            r4 = r3
            eٕؒ۠ r4 = (defpackage.C1372e) r4     // Catch: java.lang.Throwable -> L5e
            eّٕٚ r4 = r4.ad     // Catch: java.lang.Throwable -> L5e
            boolean r4 = defpackage.AbstractC17181e.admob(r4, r6)     // Catch: java.lang.Throwable -> L5e
            if (r4 == 0) goto L6b
            r2.add(r3)     // Catch: java.lang.Throwable -> L5e
            goto L6b
        L84:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5e
            r1 = 10
            int r1 = defpackage.AbstractC0746e.subscription(r2, r1)     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L5e
        L93:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5e
            if (r2 == 0) goto La5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5e
            eٕؒ۠ r2 = (defpackage.C1372e) r2     // Catch: java.lang.Throwable -> L5e
            eّٕٚ r2 = r2.ad     // Catch: java.lang.Throwable -> L5e
            r6.add(r2)     // Catch: java.lang.Throwable -> L5e
            goto L93
        La5:
            r7.billing(r0)
            return r6
        La9:
            r7.billing(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11698e.purchase(eٌؙٔ, eُؑ۠):java.io.Serializable");
    }
}
