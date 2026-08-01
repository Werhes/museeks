package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14941e extends AbstractC16946e implements InterfaceC9646e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f29617e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C12816e f29618e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC14941e(defpackage.InterfaceC5334e r4, defpackage.C12816e r5) {
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
            eؘؑٝ r2 = defpackage.InterfaceC3054e.f7112e
            r3.<init>(r4, r0, r1, r2)
            r3.f29618e = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "package "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " of "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.f29617e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC14941e.<init>(eؘؙؐ, eّۡۜ):void");
    }

    @Override // defpackage.AbstractC16946e, defpackage.InterfaceC7573e
    public InterfaceC3054e adcel() {
        return InterfaceC3054e.f7112e;
    }

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final InterfaceC5334e m3889e() {
        return (InterfaceC5334e) super.mo1351switch();
    }

    @Override // defpackage.InterfaceC15498e
    /* renamed from: eؘٟ٘ */
    public final Object mo758e(InterfaceC5369e interfaceC5369e, Object obj) {
        return interfaceC5369e.subs(this, obj);
    }

    @Override // defpackage.AbstractC16946e, defpackage.InterfaceC15498e
    /* renamed from: switch */
    public final InterfaceC15498e mo1351switch() {
        return (InterfaceC5334e) super.mo1351switch();
    }

    @Override // defpackage.AbstractC2214e
    public String toString() {
        return this.f29617e;
    }
}
