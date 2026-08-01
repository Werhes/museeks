package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15391e {
    public final InterfaceC13033e ad;
    public final InterfaceC17430e appmetrica;
    public final C12402e billing;
    public final long license;
    public final InterfaceC1618e metrica;
    public final int[] purchase;
    public int startapp;
    public final C17713e vip;
    public long yandex;

    /* JADX WARN: Type inference failed for: r3v5, types: [eَّۙ, java.lang.Object] */
    public C15391e(InterfaceC13033e interfaceC13033e, C17713e c17713e, InterfaceC1618e interfaceC1618e, long j) {
        this.ad = interfaceC13033e;
        this.vip = c17713e;
        this.metrica = interfaceC1618e;
        this.license = j;
        byte[] bArr = c17713e.f34722e;
        if (bArr.length <= 0) {
            throw new IllegalArgumentException("Empty match string not permitted for scanning");
        }
        this.appmetrica = interfaceC13033e.billing();
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2++) {
            while (i > 0 && c17713e.ad(i2) != c17713e.ad(i)) {
                i = iArr[i - 1];
            }
            if (c17713e.ad(i2) == c17713e.ad(i)) {
                i++;
            }
            iArr[i2] = i;
        }
        this.purchase = iArr;
        this.billing = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (defpackage.AbstractC15710e.billing(r1, r0) == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        if (r12 == r6) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
    
        if (defpackage.AbstractC15710e.billing(r1, r0) == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008f -> B:26:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.C4060e
            if (r0 == 0) goto L13
            r0 = r12
            eًّؖ r0 = (defpackage.C4060e) r0
            int r1 = r0.f9018e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9018e = r1
            goto L18
        L13:
            eًّؖ r0 = new eًّؖ
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f9017e
            int r1 = r0.f9018e
            r2 = 3
            r3 = 2
            r4 = 1
            eٜٗۧ r5 = r11.appmetrica
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L30
            defpackage.AbstractC2003e.purchase(r12)
            goto Lab
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L38:
            defpackage.AbstractC2003e.purchase(r12)
            goto L52
        L3c:
            defpackage.AbstractC2003e.purchase(r12)
        L3f:
            boolean r12 = r5.yandex()
            if (r12 == 0) goto L5e
            r0.f9018e = r4
            int r12 = defpackage.AbstractC4912e.ad
            eْٕؕ r12 = r11.ad
            java.lang.Object r12 = r12.license(r4, r0)
            if (r12 != r6) goto L52
            goto Laa
        L52:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L5b
            goto L5e
        L5b:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L5e:
            eْ٘ؒ r12 = r11.vip
            r1 = 0
            byte r12 = r12.ad(r1)
            r7 = 0
            r1 = 6
            long r7 = defpackage.AbstractC12731e.vip(r5, r12, r7, r1)
            r9 = -1
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            eًؓؗ r1 = r11.metrica
            if (r12 != 0) goto L92
            r12 = r5
            eَّۙ r12 = (defpackage.C12402e) r12
            long r7 = r12.f24832e
            r11.vip(r7)
            long r7 = r11.yandex
            eَّۙ r9 = r1.appmetrica()
            long r9 = r12.ads(r9)
            long r9 = r9 + r7
            r11.yandex = r9
            r0.f9018e = r3
            java.lang.Object r12 = defpackage.AbstractC15710e.billing(r1, r0)
            if (r12 != r6) goto L3f
            goto Laa
        L92:
            r11.vip(r7)
            long r3 = r11.yandex
            eَّۙ r12 = r1.appmetrica()
            long r7 = r5.mo805this(r12, r7)
            long r7 = r7 + r3
            r11.yandex = r7
            r0.f9018e = r2
            java.lang.Object r12 = defpackage.AbstractC15710e.billing(r1, r0)
            if (r12 != r6) goto Lab
        Laa:
            return r6
        Lab:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15391e.ad(eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r11 == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r1.metrica(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        if (ad(r0) == r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        if (r11 == r6) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00d6 -> B:19:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(boolean r10, defpackage.AbstractC10731e r11) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15391e.license(boolean, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (defpackage.AbstractC12534e.billing(r1, r14, r0) != r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00af, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x004c, code lost:
    
        if (r14 == r5) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0040 -> B:21:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.C3152e
            if (r0 == 0) goto L13
            r0 = r14
            eٕؕؗ r0 = (defpackage.C3152e) r0
            int r1 = r0.f7248e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7248e = r1
            goto L18
        L13:
            eٕؕؗ r0 = new eٕؕؗ
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f7247e
            int r1 = r0.f7248e
            eٜٗۧ r2 = r13.appmetrica
            r3 = 2
            r4 = 1
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L39
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2d
            defpackage.AbstractC2003e.purchase(r14)
            goto Lb0
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            defpackage.AbstractC2003e.purchase(r14)
            goto L4f
        L39:
            defpackage.AbstractC2003e.purchase(r14)
        L3c:
            boolean r14 = r2.yandex()
            if (r14 == 0) goto L5b
            r0.f7248e = r4
            int r14 = defpackage.AbstractC4912e.ad
            eْٕؕ r14 = r13.ad
            java.lang.Object r14 = r14.license(r4, r0)
            if (r14 != r5) goto L4f
            goto Laf
        L4f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L58
            goto L5b
        L58:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L5b:
            byte r14 = r2.readByte()
            int r1 = r13.startapp
            eَّۙ r6 = r13.billing
            eْ٘ؒ r7 = r13.vip
            if (r1 <= 0) goto Lba
            byte r1 = r7.ad(r1)
            if (r14 == r1) goto Lba
            int r1 = r13.startapp
        L6f:
            int r8 = r13.startapp
            if (r8 <= 0) goto L83
            byte r8 = r7.ad(r8)
            if (r14 == r8) goto L83
            int r8 = r13.startapp
            int r8 = r8 - r4
            int[] r9 = r13.purchase
            r8 = r9[r8]
            r13.startapp = r8
            goto L6f
        L83:
            int r8 = r13.startapp
            int r1 = r1 - r8
            long r8 = (long) r1
            r13.vip(r8)
            long r10 = r13.yandex
            eًؓؗ r1 = r13.metrica
            eَّۙ r12 = r1.appmetrica()
            long r8 = r6.mo805this(r12, r8)
            long r8 = r8 + r10
            r13.yandex = r8
            int r8 = r13.startapp
            if (r8 != 0) goto Lba
            byte r8 = r7.ad(r8)
            if (r14 == r8) goto Lba
            byte r14 = (byte) r14
            r0.getClass()
            r0.f7248e = r3
            java.lang.Object r14 = defpackage.AbstractC12534e.billing(r1, r14, r0)
            if (r14 != r5) goto Lb0
        Laf:
            return r5
        Lb0:
            long r0 = r13.yandex
            r2 = 1
            long r0 = r0 + r2
            r13.yandex = r0
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        Lba:
            int r1 = r13.startapp
            int r1 = r1 + r4
            r13.startapp = r1
            byte[] r7 = r7.f34722e
            int r7 = r7.length
            if (r1 != r7) goto Lc7
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            return r14
        Lc7:
            byte r14 = (byte) r14
            r6.m3339goto(r14)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15391e.metrica(eُؑ۠):java.lang.Object");
    }

    public final void vip(long j) {
        long j2 = this.yandex + j;
        long j3 = this.license;
        if (j2 <= j3) {
            return;
        }
        StringBuilder inmobi = AbstractC1786e.inmobi(j3, "Limit of ", " bytes exceeded while searching for \"");
        inmobi.append(AbstractC6507e.subscription(AbstractC6507e.mopub(this.vip.f34722e), "\n", "\\n", false));
        inmobi.append('\"');
        throw new IOException(inmobi.toString());
    }
}
