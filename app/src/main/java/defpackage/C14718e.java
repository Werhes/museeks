package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14718e implements InterfaceC14388e, InterfaceC5083e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C3427e f29124e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C13578e f29125e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13578e f29126e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public EnumC13456e f29127e = EnumC13456e.f26727e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C3427e f29128e;

    public C14718e(C3427e c3427e, C13578e c13578e) {
        this.f29124e = c3427e;
        this.f29128e = c3427e;
        this.f29126e = c13578e;
    }

    @Override // defpackage.InterfaceC5083e
    public final InterfaceC8850e admob() {
        return C2693e.f6576e;
    }

    public final InterfaceC11678e appmetrica() {
        C3427e c3427e = this.f29124e;
        c3427e.getClass();
        return AbstractC5851e.mopub(c3427e).f27601e;
    }

    @Override // defpackage.InterfaceC5083e
    public final void billing(Object obj) {
        C3427e c3427e = this.f29124e;
        synchronized (c3427e.f7669e) {
            c3427e.f7663e.smaato(this);
            Unit unit = Unit.INSTANCE;
        }
        this.f29126e.billing(obj);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: const */
    public final int mo491const(long j) {
        return this.f29128e.mo491const(j);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: default */
    public final long mo492default(float f) {
        return this.f29128e.mo492default(f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘْؖ */
    public final int mo493e(float f) {
        C3427e c3427e = this.f29128e;
        c3427e.getClass();
        return AbstractC4653e.ad(c3427e, f);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eؘؕۥ */
    public final long mo494e(long j) {
        C3427e c3427e = this.f29128e;
        c3427e.getClass();
        return AbstractC4653e.appmetrica(j, c3427e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: eٓٛۢ */
    public final float mo495e(long j) {
        C3427e c3427e = this.f29128e;
        c3427e.getClass();
        return AbstractC4653e.license(j, c3427e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: final */
    public final float mo496final(int i) {
        return this.f29128e.mo496final(i);
    }

    @Override // defpackage.InterfaceC14388e
    public final float firebase(long j) {
        C3427e c3427e = this.f29128e;
        c3427e.getClass();
        return AbstractC4653e.vip(j, c3427e);
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: instanceof */
    public final float mo497instanceof(float f) {
        return this.f29128e.vip() * f;
    }

    public final long license() {
        C3427e c3427e = this.f29124e;
        c3427e.getClass();
        long appmetrica = AbstractC4653e.appmetrica(AbstractC5851e.mopub(c3427e).f27601e.license(), c3427e);
        long j = c3427e.f7668e;
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (appmetrica >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (appmetrica & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public final Object metrica(EnumC13456e enumC13456e, AbstractC9049e abstractC9049e) {
        C13578e c13578e = new C13578e(1, AbstractC10558e.startapp(abstractC9049e));
        c13578e.tapsense();
        this.f29127e = enumC13456e;
        this.f29125e = c13578e;
        return c13578e.signatures();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: new */
    public final float mo498new(float f) {
        return f / this.f29128e.vip();
    }

    @Override // defpackage.InterfaceC14388e
    /* renamed from: package */
    public final float mo499package() {
        return this.f29128e.mo499package();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(long r10, kotlin.jvm.functions.Function2 r12, defpackage.AbstractC9049e r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.C10793e
            if (r0 == 0) goto L13
            r0 = r13
            eُؕۡ r0 = (defpackage.C10793e) r0
            int r1 = r0.f21404e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21404e = r1
            goto L18
        L13:
            eُؕۡ r0 = new eُؕۡ
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f21402e
            int r1 = r0.f21404e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            eٌُؑ r10 = r0.f21403e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Throwable -> L28
            r6 = r9
            goto L70
        L28:
            r0 = move-exception
            r11 = r0
            r6 = r9
            goto L78
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.AbstractC2003e.purchase(r13)
            r3 = 0
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 > 0) goto L4e
            eْۢ٘ r13 = r9.f29125e
            if (r13 == 0) goto L4e
            eؒٛ۠ r1 = new eؒٛ۠
            r1.<init>(r10)
            eّۜۖ r3 = new eّۜۖ
            r3.<init>(r1)
            r13.billing(r3)
        L4e:
            eًؕ٘ r13 = r9.f29124e
            eۡۦ r13 = r13.m3623e()
            eًَٗ r3 = new eًَٗ
            r8 = 4
            r7 = 0
            r6 = r9
            r4 = r10
            r3.<init>(r4, r6, r7, r8)
            r10 = 3
            r11 = 0
            eٌُؑ r10 = defpackage.AbstractC5336e.purchase(r13, r7, r11, r3, r10)
            r0.f21403e = r10     // Catch: java.lang.Throwable -> L76
            r0.f21404e = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r13 = r12.invoke(r9, r0)     // Catch: java.lang.Throwable -> L76
            eٟؔۙ r11 = defpackage.EnumC2821e.f6782e
            if (r13 != r11) goto L70
            return r11
        L70:
            eًؙؖ r11 = defpackage.C6263e.f13076e
            r10.Signature(r11)
            return r13
        L76:
            r0 = move-exception
            r11 = r0
        L78:
            eًؙؖ r12 = defpackage.C6263e.f13076e
            r10.Signature(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14718e.purchase(long, kotlin.jvm.functions.Function2, eٌۡۖ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object startapp(long r5, kotlin.jvm.functions.Function2 r7, defpackage.AbstractC10731e r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.C6218e
            if (r0 == 0) goto L13
            r0 = r8
            eؙؗٚ r0 = (defpackage.C6218e) r0
            int r1 = r0.f12999e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12999e = r1
            goto L18
        L13:
            eؙؗٚ r0 = new eؙؗٚ
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f12998e
            int r1 = r0.f12999e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r8)     // Catch: defpackage.C1180e -> L3c
            return r8
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r8)
            r0.f12999e = r2     // Catch: defpackage.C1180e -> L3c
            java.lang.Object r5 = r4.purchase(r5, r7, r0)     // Catch: defpackage.C1180e -> L3c
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L3b
            return r6
        L3b:
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14718e.startapp(long, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC14388e
    public final long tapsense(long j) {
        C3427e c3427e = this.f29128e;
        c3427e.getClass();
        return AbstractC4653e.metrica(j, c3427e);
    }

    @Override // defpackage.InterfaceC14388e
    public final float vip() {
        return this.f29128e.vip();
    }
}
