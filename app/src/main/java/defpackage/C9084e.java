package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9084e implements InterfaceC12067e {
    public static final C9084e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, eٌۣۛ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("vpps_episode", obj, 4);
        c4707e.advert("trackId", false);
        c4707e.advert("ownerId", false);
        c4707e.advert("displayName", false);
        c4707e.advert("id", true);
        descriptor = c4707e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x003e, code lost:
    
        if (defpackage.AbstractC7890e.billing(r2, r9.toString()) == false) goto L7;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r8, java.lang.Object r9) {
        /*
            r7 = this;
            eُۣؖ r9 = (defpackage.C4464e) r9
            eًَؒ r0 = defpackage.C9084e.descriptor
            eِٛٓ r8 = r8.metrica(r0)
            int r1 = r9.ad
            java.lang.String r2 = r9.license
            r3 = r8
            eٖؑ٘ r3 = (defpackage.AbstractC15920e) r3
            r4 = 0
            r3.inmobi(r4, r1, r0)
            long r4 = r9.vip
            r6 = 1
            r3.isPro(r0, r6, r4)
            r6 = 2
            java.lang.String r9 = r9.metrica
            r3.ads(r0, r6, r9)
            boolean r9 = r3.subscription()
            if (r9 == 0) goto L26
            goto L40
        L26:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            r4 = 95
            r9.append(r4)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            boolean r9 = defpackage.AbstractC7890e.billing(r2, r9)
            if (r9 != 0) goto L44
        L40:
            r9 = 3
            r3.ads(r0, r9, r2)
        L44:
            r8.vip(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9084e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C13257e.ad, C13058e.ad, c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        int i2 = 0;
        long j = 0;
        String str = null;
        String str2 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                j = metrica.firebase(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                str = metrica.smaato(interfaceC9998e, 2);
                i |= 4;
            } else {
                if (yandex != 3) {
                    throw new C0413e(yandex);
                }
                str2 = metrica.smaato(interfaceC9998e, 3);
                i |= 8;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C4464e(i, i2, j, str, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
