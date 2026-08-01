package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14887e extends AbstractC2214e implements InterfaceC11348e {

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC8614e[] f29497e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C12816e f29498e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C5266e f29499e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C16113e f29500e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0394e f29501e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0394e f29502e;

    static {
        C12156e c12156e = new C12156e(C14887e.class, "fragments", "getFragments()Ljava/util/List;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        f29497e = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C14887e.class, "empty", "getEmpty()Z", 0, c12232e)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r5v4, types: [eٖؑٚ, eٖۥٌ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14887e(defpackage.C16113e r4, defpackage.C12816e r5, defpackage.C6272e r6) {
        /*
            r3 = this;
            eُ٘ۖ r0 = defpackage.C4590e.f9885e
            eْۢٙ r1 = r5.ad
            boolean r2 = r1.metrica()
            if (r2 == 0) goto Ld
            eؑۘٛ r1 = defpackage.C13579e.appmetrica
            goto L11
        Ld:
            eؑۘٛ r1 = r1.billing()
        L11:
            r3.<init>(r0, r1)
            r3.f29500e = r4
            r3.f29498e = r5
            eؙؕٛ r4 = new eؙؕٛ
            r5 = 0
            r4.<init>(r3, r5)
            r6.getClass()
            eٖؑٚ r5 = new eٖؑٚ
            r5.<init>(r6, r4)
            r3.f29502e = r5
            eؙؕٛ r4 = new eؙؕٛ
            r5 = 1
            r4.<init>(r3, r5)
            eٖؑٚ r5 = new eٖؑٚ
            r5.<init>(r6, r4)
            r3.f29501e = r5
            eؗۥِ r4 = new eؗۥِ
            eؙؕٛ r5 = new eؙؕٛ
            r0 = 2
            r5.<init>(r3, r0)
            r4.<init>(r6, r5)
            r3.f29499e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14887e.<init>(eَٖۘ, eّۡۜ, eًؙۡ):void");
    }

    @Override // defpackage.Cpackage
    public final boolean equals(Object obj) {
        InterfaceC11348e interfaceC11348e = obj instanceof InterfaceC11348e ? (InterfaceC11348e) obj : null;
        if (interfaceC11348e == null) {
            return false;
        }
        C14887e c14887e = (C14887e) interfaceC11348e;
        return AbstractC7890e.billing(this.f29498e, c14887e.f29498e) && AbstractC7890e.billing(this.f29500e, c14887e.f29500e);
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.Signature(this, obj);
    }

    public final int hashCode() {
        return this.f29498e.hashCode() + (this.f29500e.hashCode() * 31);
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final InterfaceC15498e mo1351switch() {
        C12816e c12816e = this.f29498e;
        if (c12816e.ad.metrica()) {
            return null;
        }
        return this.f29500e.mo1886e(c12816e.vip());
    }
}
