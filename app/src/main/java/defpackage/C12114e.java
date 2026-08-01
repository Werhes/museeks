package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۦٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C12114e implements InterfaceC12067e {
    public static final C12114e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eِۦٔ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.spark.objects.account.SparkAccount", obj, 5);
        c4707e.advert("id", false);
        c4707e.advert("vk_id", false);
        c4707e.advert("plus_active", true);
        c4707e.advert("ultra_expires_at", true);
        c4707e.advert("restricted", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C0029e c0029e = (C0029e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        long j = c0029e.ad;
        boolean z = c0029e.appmetrica;
        C5471e c5471e = c0029e.license;
        boolean z2 = c0029e.metrica;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.isPro(interfaceC9998e, 0, j);
        abstractC15920e.isPro(interfaceC9998e, 1, c0029e.vip);
        if (abstractC15920e.subscription() || z2) {
            abstractC15920e.signatures(interfaceC9998e, 2, z2);
        }
        if (abstractC15920e.subscription() || c5471e != null) {
            abstractC15920e.Signature(interfaceC9998e, 3, C10168e.ad, c5471e);
        }
        if (abstractC15920e.subscription() || z) {
            abstractC15920e.signatures(interfaceC9998e, 4, z);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC5372e purchase = AbstractC6069e.purchase(C10168e.ad);
        C13058e c13058e = C13058e.ad;
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{c13058e, c13058e, c6266e, purchase, c6266e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        long j2 = 0;
        C5471e c5471e = null;
        boolean z3 = true;
        while (z3) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z3 = false;
            } else if (yandex == 0) {
                j = metrica.firebase(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                j2 = metrica.firebase(interfaceC9998e, 1);
                i |= 2;
            } else if (yandex == 2) {
                z = metrica.applovin(interfaceC9998e, 2);
                i |= 4;
            } else if (yandex == 3) {
                c5471e = (C5471e) metrica.inmobi(interfaceC9998e, 3, C10168e.ad, c5471e);
                i |= 8;
            } else {
                if (yandex != 4) {
                    throw new C0413e(yandex);
                }
                z2 = metrica.applovin(interfaceC9998e, 4);
                i |= 16;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C0029e(i, j, j2, z, c5471e, z2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
