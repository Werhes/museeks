package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15836e implements InterfaceC14906e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f31260e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11950e f31261e;

    public C15836e(C11950e c11950e, boolean z) {
        this.f31261e = c11950e;
        this.f31260e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.InterfaceC14906e
    /* renamed from: class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo615class(long r4, long r6, defpackage.InterfaceC5083e r8) {
        /*
            r3 = this;
            boolean r4 = r8 instanceof defpackage.C1671e
            if (r4 == 0) goto L13
            r4 = r8
            eؚؓٞ r4 = (defpackage.C1671e) r4
            int r5 = r4.f4604e
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r5 & r0
            if (r1 == 0) goto L13
            int r5 = r5 - r0
            r4.f4604e = r5
            goto L1a
        L13:
            eؚؓٞ r4 = new eؚؓٞ
            eُؑ۠ r8 = (defpackage.AbstractC10731e) r8
            r4.<init>(r3, r8)
        L1a:
            java.lang.Object r5 = r4.f4602e
            int r8 = r4.f4604e
            r0 = 1
            if (r8 == 0) goto L31
            if (r8 != r0) goto L29
            long r6 = r4.f4603e
            defpackage.AbstractC2003e.purchase(r5)
            goto L4e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r5)
            boolean r5 = r3.f31260e
            r1 = 0
            if (r5 == 0) goto L56
            eِۙ r5 = r3.f31261e
            boolean r8 = r5.startapp
            if (r8 == 0) goto L41
            goto L52
        L41:
            r4.f4603e = r6
            r4.f4604e = r0
            java.lang.Object r5 = r5.ad(r6, r4)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r5 != r4) goto L4e
            return r4
        L4e:
            eُۨۚ r5 = (defpackage.C11422e) r5
            long r1 = r5.ad
        L52:
            long r1 = defpackage.C11422e.license(r6, r1)
        L56:
            eُۨۚ r4 = new eُۨۚ
            r4.<init>(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15836e.mo615class(long, long, eًؗۖ):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: eُٓؓ */
    public final Object mo617e(long j, InterfaceC5083e interfaceC5083e) {
        return new C11422e(0L);
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: eؙٟ٘ */
    public final long mo619e(int i, long j, long j2) {
        if (!this.f31260e) {
            return 0L;
        }
        C11950e c11950e = this.f31261e;
        if (c11950e.ad.ad()) {
            return 0L;
        }
        return c11950e.yandex(c11950e.license(c11950e.ad.appmetrica(c11950e.license(c11950e.billing(j2)))));
    }

    @Override // defpackage.InterfaceC14906e
    /* renamed from: implements */
    public final /* synthetic */ long mo620implements(int i, long j) {
        return 0L;
    }
}
