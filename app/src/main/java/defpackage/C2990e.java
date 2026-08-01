package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۥۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2990e implements InterfaceC12067e {
    public static final C2990e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eِۣٖ, java.lang.Object, eؔۥۤ] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("com.google.firebase.sessions.Time", obj, 3);
        c4707e.advert("ms", false);
        c4707e.advert("us", true);
        c4707e.advert("seconds", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C16971e c16971e = (C16971e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        long j = c16971e.ad;
        long j2 = c16971e.metrica;
        long j3 = c16971e.vip;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.isPro(interfaceC9998e, 0, j);
        if (abstractC15920e.subscription() || j3 != 1000 * j) {
            abstractC15920e.isPro(interfaceC9998e, 1, j3);
        }
        if (abstractC15920e.subscription() || j2 != j / 1000) {
            abstractC15920e.isPro(interfaceC9998e, 2, j2);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C13058e c13058e = C13058e.ad;
        return new InterfaceC5372e[]{c13058e, c13058e, c13058e};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else if (yandex == 0) {
                j = metrica.firebase(interfaceC9998e, 0);
                i |= 1;
            } else if (yandex == 1) {
                j2 = metrica.firebase(interfaceC9998e, 1);
                i |= 2;
            } else {
                if (yandex != 2) {
                    throw new C0413e(yandex);
                }
                j3 = metrica.firebase(interfaceC9998e, 2);
                i |= 4;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C16971e(i, j, j2, j3);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
