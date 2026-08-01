package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16727e implements InterfaceC12067e {
    public static final C16727e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؙٗؓ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("cps_manual_library", obj, 2);
        c4707e.advert("displayName", true);
        c4707e.advert("id", true);
        descriptor = c4707e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0020, code lost:
    
        if (defpackage.AbstractC7890e.billing(r6, defpackage.C14027e.license()) == false) goto L7;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r5, java.lang.Object r6) {
        /*
            r4 = this;
            eُؓٛ r6 = (defpackage.C10757e) r6
            java.lang.String r0 = r6.vip
            java.lang.String r6 = r6.ad
            eًَؒ r1 = defpackage.C16727e.descriptor
            eِٛٓ r5 = r5.metrica(r1)
            boolean r2 = r5.subscription()
            if (r2 == 0) goto L13
            goto L22
        L13:
            eٖٓٗ r2 = defpackage.C14027e.ad
            r2.getClass()
            java.lang.String r2 = defpackage.C14027e.license()
            boolean r2 = defpackage.AbstractC7890e.billing(r6, r2)
            if (r2 != 0) goto L29
        L22:
            r2 = r5
            eٖؑ٘ r2 = (defpackage.AbstractC15920e) r2
            r3 = 0
            r2.ads(r1, r3, r6)
        L29:
            boolean r6 = r5.subscription()
            if (r6 == 0) goto L30
            goto L38
        L30:
            java.lang.String r6 = "cps_manual_library"
            boolean r6 = defpackage.AbstractC7890e.billing(r0, r6)
            if (r6 != 0) goto L3f
        L38:
            r6 = r5
            eٖؑ٘ r6 = (defpackage.AbstractC15920e) r6
            r2 = 1
            r6.ads(r1, r2, r0)
        L3f:
            r5.vip(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16727e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                str = metrica.smaato(interfaceC9998e, 0);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                str2 = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C10757e(str, i, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
