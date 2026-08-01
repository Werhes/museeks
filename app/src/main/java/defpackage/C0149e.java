package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0149e extends AbstractC11750e {
    public final AbstractC3743e Signature;
    public final C5363e admob;
    public final C17424e amazon;
    public final C5981e loadAd = AbstractC6959e.metrica(0, 2, 2);
    public final C4199e smaato;
    public final C5363e subscription;

    public C0149e(C4199e c4199e, C17424e c17424e) {
        this.smaato = c4199e;
        this.amazon = c17424e;
        this.Signature = ((InterfaceC15288e) c17424e.f34142e).smaato();
        C5363e c5363e = new C5363e(new C5671e(10, this));
        this.admob = c5363e;
        this.subscription = c5363e;
    }

    public final InterfaceC3477e adcel() {
        return this.admob;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mopub(defpackage.AbstractC10731e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C0814e
            if (r0 == 0) goto L13
            r0 = r5
            eَؒؔ r0 = (defpackage.C0814e) r0
            int r1 = r0.f3203e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3203e = r1
            goto L18
        L13:
            eَؒؔ r0 = new eَؒؔ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f3202e
            int r1 = r0.f3203e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)
            goto L4d
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            eؘؒؐ r5 = r4.admob
            boolean r5 = r5.ad()
            if (r5 != 0) goto L4d
            eؚ٘ۥ r5 = new eؚ٘ۥ
            r1 = 0
            r3 = 22
            r5.<init>(r4, r1, r3)
            r0.f3203e = r2
            eؕۥٙ r1 = r4.Signature
            java.lang.Object r5 = defpackage.AbstractC5336e.advert(r1, r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L4d
            return r0
        L4d:
            eٍؖ٘ r5 = new eٍؖ٘
            eؘۢؕ r0 = r4.loadAd
            r5.<init>(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0149e.mopub(eُؑ۠):java.lang.Object");
    }

    public final AbstractC14297e startapp() {
        return (AbstractC14297e) this.subscription.getValue();
    }
}
