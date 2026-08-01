package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0795e implements InterfaceC12067e {
    public static final C0795e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؒؓ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("io.ktor.util.date.GMTDate", obj, 9);
        c4707e.advert("seconds", false);
        c4707e.advert("minutes", false);
        c4707e.advert("hours", false);
        c4707e.advert("dayOfWeek", false);
        c4707e.advert("dayOfMonth", false);
        c4707e.advert("dayOfYear", false);
        c4707e.advert("month", false);
        c4707e.advert("year", false);
        c4707e.advert("timestamp", false);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C17476e c17476e = (C17476e) obj;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C17476e.f34224e;
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.inmobi(0, c17476e.f34231e, interfaceC9998e);
        abstractC15920e.inmobi(1, c17476e.f34227e, interfaceC9998e);
        abstractC15920e.inmobi(2, c17476e.f34226e, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), c17476e.f34229e);
        abstractC15920e.inmobi(4, c17476e.f34225e, interfaceC9998e);
        abstractC15920e.inmobi(5, c17476e.f34233e, interfaceC9998e);
        abstractC15920e.applovin(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), c17476e.f34232e);
        abstractC15920e.inmobi(7, c17476e.f34228e, interfaceC9998e);
        abstractC15920e.isPro(interfaceC9998e, 8, c17476e.f34230e);
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        InterfaceC3477e[] interfaceC3477eArr = C17476e.f34224e;
        C13257e c13257e = C13257e.ad;
        return new InterfaceC5372e[]{c13257e, c13257e, c13257e, interfaceC3477eArr[3].getValue(), c13257e, c13257e, interfaceC3477eArr[6].getValue(), c13257e, C13058e.ad};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C17476e.f34224e;
        EnumC15009e enumC15009e = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        EnumC18164e enumC18164e = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    i2 = metrica.remoteconfig(interfaceC9998e, 0);
                    i |= 1;
                    break;
                case 1:
                    i3 = metrica.remoteconfig(interfaceC9998e, 1);
                    i |= 2;
                    break;
                case 2:
                    i4 = metrica.remoteconfig(interfaceC9998e, 2);
                    i |= 4;
                    break;
                case 3:
                    enumC18164e = (EnumC18164e) metrica.subscription(interfaceC9998e, 3, (InterfaceC5372e) interfaceC3477eArr[3].getValue(), enumC18164e);
                    i |= 8;
                    break;
                case 4:
                    i5 = metrica.remoteconfig(interfaceC9998e, 4);
                    i |= 16;
                    break;
                case 5:
                    i6 = metrica.remoteconfig(interfaceC9998e, 5);
                    i |= 32;
                    break;
                case 6:
                    enumC15009e = (EnumC15009e) metrica.subscription(interfaceC9998e, 6, (InterfaceC5372e) interfaceC3477eArr[6].getValue(), enumC15009e);
                    i |= 64;
                    break;
                case 7:
                    i7 = metrica.remoteconfig(interfaceC9998e, 7);
                    i |= 128;
                    break;
                case 8:
                    j = metrica.firebase(interfaceC9998e, 8);
                    i |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C17476e(i, i2, i3, i4, enumC18164e, i5, i6, enumC15009e, i7, j);
    }

    @Override // defpackage.InterfaceC12067e
    public final /* bridge */ InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
