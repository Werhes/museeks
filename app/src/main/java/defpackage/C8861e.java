package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8861e implements InterfaceC6034e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5372e f17783e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C14786e f17784e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1618e f17785e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15808e f17786e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f17787e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Charset f17788e;

    public C8861e(InterfaceC1618e interfaceC1618e, C14786e c14786e, C15808e c15808e, InterfaceC5372e interfaceC5372e, Charset charset) {
        this.f17785e = interfaceC1618e;
        this.f17784e = c14786e;
        this.f17786e = c15808e;
        this.f17783e = interfaceC5372e;
        this.f17788e = charset;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r2.metrica(r0) != r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (defpackage.AbstractC12534e.yandex(r2, r12, 0, r12.length, r0) == r8) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.InterfaceC6034e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(java.lang.Object r11, defpackage.InterfaceC5083e r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.C17439e
            if (r0 == 0) goto L13
            r0 = r12
            eٗۨؔ r0 = (defpackage.C17439e) r0
            int r1 = r0.f34159e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34159e = r1
            goto L18
        L13:
            eٗۨؔ r0 = new eٗۨؔ
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f34161e
            int r1 = r0.f34159e
            eًؓؗ r2 = r10.f17785e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L4e
            if (r1 == r6) goto L42
            if (r1 == r5) goto L3a
            if (r1 != r4) goto L32
            defpackage.AbstractC2003e.purchase(r12)
            goto La2
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            int r11 = r0.f34162e
            int r1 = r0.f34160e
            defpackage.AbstractC2003e.purchase(r12)
            goto L93
        L42:
            int r11 = r0.f34162e
            int r1 = r0.f34160e
            java.lang.Object r6 = r0.f34163e
            defpackage.AbstractC2003e.purchase(r12)
            r12 = r11
            r11 = r6
            goto L70
        L4e:
            defpackage.AbstractC2003e.purchase(r12)
            int r1 = r10.f17787e
            int r12 = r1 + 1
            r10.f17787e = r12
            if (r1 < 0) goto La5
            if (r1 <= 0) goto L6f
            eٔ٘ۛ r12 = r10.f17784e
            byte[] r12 = r12.metrica
            r0.f34163e = r11
            r0.f34160e = r1
            r0.f34162e = r3
            r0.f34159e = r6
            int r6 = r12.length
            java.lang.Object r12 = defpackage.AbstractC12534e.yandex(r2, r12, r3, r6, r0)
            if (r12 != r8) goto L6f
            goto La1
        L6f:
            r12 = r3
        L70:
            eٕۣؐ r6 = r10.f17786e
            eَؑۥ r6 = r6.ad
            eؘؒٙ r9 = r10.f17783e
            eؘؒٙ r9 = (defpackage.InterfaceC5372e) r9
            java.lang.String r11 = r6.purchase(r9, r11)
            java.nio.charset.Charset r6 = r10.f17788e
            byte[] r11 = defpackage.AbstractC1266e.appmetrica(r11, r6)
            r0.f34163e = r7
            r0.f34160e = r1
            r0.f34162e = r12
            r0.f34159e = r5
            int r5 = r11.length
            java.lang.Object r11 = defpackage.AbstractC12534e.yandex(r2, r11, r3, r5, r0)
            if (r11 != r8) goto L92
            goto La1
        L92:
            r11 = r12
        L93:
            r0.f34163e = r7
            r0.f34160e = r1
            r0.f34162e = r11
            r0.f34159e = r4
            java.lang.Object r11 = r2.metrica(r0)
            if (r11 != r8) goto La2
        La1:
            return r8
        La2:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        La5:
            java.lang.ArithmeticException r11 = new java.lang.ArithmeticException
            java.lang.String r12 = "Index overflow has happened"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8861e.startapp(java.lang.Object, eًؗۖ):java.lang.Object");
    }
}
