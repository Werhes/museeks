package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4916e implements InterfaceC12067e {
    public static final C4916e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٕؗۧ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("vk_audiobook", obj, 3);
        c4707e.advert("audioBook", false);
        c4707e.advert("id", true);
        c4707e.advert("displayName", true);
        descriptor = c4707e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003f, code lost:
    
        if (defpackage.AbstractC7890e.billing(r3, r8) == false) goto L16;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r7, java.lang.Object r8) {
        /*
            r6 = this;
            eِؚٕ r8 = (defpackage.C11757e) r8
            eًَؒ r0 = defpackage.C4916e.descriptor
            eِٛٓ r7 = r7.metrica(r0)
            eؖٔؔ r1 = defpackage.C4105e.ad
            eؚؗؑ r2 = r8.ad
            java.lang.String r3 = r8.metrica
            java.lang.String r8 = r8.vip
            r4 = r7
            eٖؑ٘ r4 = (defpackage.AbstractC15920e) r4
            r5 = 0
            r4.applovin(r0, r5, r1, r2)
            boolean r1 = r4.subscription()
            if (r1 == 0) goto L1e
            goto L2a
        L1e:
            int r1 = r2.mopub
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = defpackage.AbstractC7890e.billing(r8, r1)
            if (r1 != 0) goto L2e
        L2a:
            r1 = 1
            r4.ads(r0, r1, r8)
        L2e:
            boolean r8 = r4.subscription()
            if (r8 == 0) goto L35
            goto L41
        L35:
            java.lang.String r8 = r2.pro
            if (r8 != 0) goto L3b
            java.lang.String r8 = ""
        L3b:
            boolean r8 = defpackage.AbstractC7890e.billing(r3, r8)
            if (r8 != 0) goto L45
        L41:
            r8 = 2
            r4.ads(r0, r8, r3)
        L45:
            r7.vip(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4916e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C4105e.ad, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        C6943e c6943e = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                c6943e = (C6943e) metrica.subscription(interfaceC9998e, 0, C4105e.ad, c6943e);
                i |= 1;
            } else if (yandex == 1) {
                str = metrica.smaato(interfaceC9998e, 1);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                str2 = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C11757e(i, c6943e, str, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
