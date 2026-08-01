package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15261e implements InterfaceC12067e {
    public static final C15261e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eِٕؗ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.spark.objects.updates.SparkAppUpdate", obj, 7);
        c4707e.advert("version_code", false);
        c4707e.advert("version_name", false);
        c4707e.advert("is_beta", true);
        c4707e.advert("changelog", false);
        c4707e.advert("download_source", false);
        c4707e.advert("release_date", false);
        c4707e.advert("is_forced", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C5789e c5789e = (C5789e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C5789e.yandex;
        int i = c5789e.ad;
        boolean z = c5789e.billing;
        boolean z2 = c5789e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, i, interfaceC9998e);
        abstractC15920e.ads(interfaceC9998e, 1, c5789e.vip);
        if (abstractC15920e.subscription() || z2) {
            abstractC15920e.signatures(interfaceC9998e, 2, z2);
        }
        abstractC15920e.ads(interfaceC9998e, 3, c5789e.license);
        abstractC15920e.applovin(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), c5789e.appmetrica);
        abstractC15920e.applovin(interfaceC9998e, 5, C10168e.ad, c5789e.purchase);
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 6, z);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C5789e.yandex;
        C9582e c9582e = C9582e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{C13257e.ad, c9582e, c6266e, c9582e, interfaceC3477eArr[4].getValue(), C10168e.ad, c6266e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C5789e.yandex;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        InterfaceC5615e interfaceC5615e = null;
        C5471e c5471e = null;
        boolean z3 = true;
        while (z3) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z3 = false;
                    break;
                case 0:
                    i2 = metrica.remoteconfig(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    str = metrica.smaato(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    z = metrica.applovin(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = metrica.smaato(interfaceC9998e, 3);
                    i |= 8;
                    break;
                case 4:
                    interfaceC5615e = (InterfaceC5615e) metrica.subscription(interfaceC9998e, 4, (InterfaceC5372e) interfaceC3477eArr[4].getValue(), interfaceC5615e);
                    i |= 16;
                    break;
                case 5:
                    c5471e = (C5471e) metrica.subscription(interfaceC9998e, 5, C10168e.ad, c5471e);
                    i |= 32;
                    break;
                case 6:
                    z2 = metrica.applovin(interfaceC9998e, 6);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C5789e(i, i2, str, z, str2, interfaceC5615e, c5471e, z2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
