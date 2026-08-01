package defpackage;

import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7204e implements InterfaceC12067e {
    public static final C7204e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٗؓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("ua.itaysonlab.vkapi2.objects.music.AudioChartInfo", obj, 3);
        c4707e.advert("position", false);
        c4707e.advert("state", true);
        c4707e.advert("stateEnum", true);
        descriptor = c4707e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r3 != r5) goto L22;
     */
    @Override // defpackage.InterfaceC5372e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad(defpackage.InterfaceC5757e r8, java.lang.Object r9) {
        /*
            r7 = this;
            ua.itaysonlab.vkapi2.objects.music.AudioChartInfo r9 = (ua.itaysonlab.vkapi2.objects.music.AudioChartInfo) r9
            eًَؒ r0 = defpackage.C7204e.descriptor
            eِٛٓ r8 = r8.metrica(r0)
            eؕٛؓ[] r1 = ua.itaysonlab.vkapi2.objects.music.AudioChartInfo.license
            int r2 = r9.ad
            eًِۗ r3 = r9.metrica
            int r9 = r9.vip
            r4 = r8
            eٖؑ٘ r4 = (defpackage.AbstractC15920e) r4
            r5 = 0
            r4.inmobi(r5, r2, r0)
            boolean r2 = r4.subscription()
            if (r2 == 0) goto L1e
            goto L21
        L1e:
            r2 = -1
            if (r9 == r2) goto L25
        L21:
            r2 = 1
            r4.inmobi(r2, r9, r0)
        L25:
            boolean r2 = r4.subscription()
            if (r2 == 0) goto L2c
            goto L4d
        L2c:
            eٖؒ۠ r2 = defpackage.EnumC11609e.f23321e
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r5 = r2.next()
            r6 = r5
            eًِۗ r6 = (defpackage.EnumC11609e) r6
            int r6 = r6.f23324e
            if (r6 != r9) goto L32
            goto L45
        L44:
            r5 = 0
        L45:
            eًِۗ r5 = (defpackage.EnumC11609e) r5
            if (r5 != 0) goto L4b
            eًِۗ r5 = defpackage.EnumC11609e.f23320e
        L4b:
            if (r3 == r5) goto L59
        L4d:
            r9 = 2
            r1 = r1[r9]
            java.lang.Object r1 = r1.getValue()
            eؘؒٙ r1 = (defpackage.InterfaceC5372e) r1
            r4.applovin(r0, r9, r1, r3)
        L59:
            r8.vip(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7204e.ad(eؘٜٜ, java.lang.Object):void");
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = AudioChartInfo.license;
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c13257e, c13257e, interfaceC3477eArr[2].getValue()};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = AudioChartInfo.license;
        EnumC11609e enumC11609e = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                i2 = metrica.remoteconfig(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                i3 = metrica.remoteconfig(interfaceC9998e, 1);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                enumC11609e = (EnumC11609e) metrica.subscription(interfaceC9998e, 2, (InterfaceC5372e) interfaceC3477eArr[2].getValue(), enumC11609e);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new AudioChartInfo(i, i2, i3, enumC11609e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
