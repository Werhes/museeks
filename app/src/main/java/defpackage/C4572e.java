package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؗؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C4572e implements InterfaceC12067e {
    public static final C4572e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِؗؑ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("vps_track_ids", obj, 3);
        c4707e.advert("ids", false);
        c4707e.advert("displayName", true);
        c4707e.advert("id", true);
        descriptor = c4707e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        if (defpackage.AbstractC7890e.billing(r4, "vk_" + r3.hashCode()) == false) goto L13;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r7, java.lang.Object r8) {
        /*
            r6 = this;
            eٜٞ r8 = (defpackage.C18231e) r8
            eًَؒ r0 = defpackage.C4572e.descriptor
            eِٛٓ r7 = r7.metrica(r0)
            eؕٛؓ[] r1 = defpackage.C18231e.license
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r1 = r1.getValue()
            eؘؒٙ r1 = (defpackage.InterfaceC5372e) r1
            java.util.List r3 = r8.ad
            java.lang.String r4 = r8.metrica
            java.lang.String r8 = r8.vip
            r5 = r7
            eٖؑ٘ r5 = (defpackage.AbstractC15920e) r5
            r5.applovin(r0, r2, r1, r3)
            boolean r1 = r5.subscription()
            if (r1 == 0) goto L26
            goto L2e
        L26:
            java.lang.String r1 = ""
            boolean r1 = defpackage.AbstractC7890e.billing(r8, r1)
            if (r1 != 0) goto L32
        L2e:
            r1 = 1
            r5.ads(r0, r1, r8)
        L32:
            boolean r8 = r5.subscription()
            if (r8 == 0) goto L39
            goto L51
        L39:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "vk_"
            r8.<init>(r1)
            int r1 = r3.hashCode()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            boolean r8 = defpackage.AbstractC7890e.billing(r4, r8)
            if (r8 != 0) goto L55
        L51:
            r8 = 2
            r5.ads(r0, r8, r4)
        L55:
            r7.vip(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4572e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{C18231e.license[0].getValue(), c9582e, c9582e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C18231e.license;
        List list = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                list = (List) metrica.subscription(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), list);
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
        return new C18231e(i, str, str2, list);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
