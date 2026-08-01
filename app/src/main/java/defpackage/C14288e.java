package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14288e implements InterfaceC12067e {
    public static final C14288e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eٓ۠ۖ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksLegalNoticeDto", obj, 2);
        c4707e.advert("title", true);
        c4707e.advert("text", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C18243e c18243e = (C18243e) obj;
        String str = c18243e.vip;
        String str2 = c18243e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || str2 != null) {
            metrica.Signature(interfaceC9998e, 0, C9582e.ad, str2);
        }
        if (metrica.subscription() || str != null) {
            metrica.Signature(interfaceC9998e, 1, C9582e.ad, str);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C9582e c9582e = C9582e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c9582e), AbstractC6069e.purchase(c9582e)};
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
                str = (String) metrica.inmobi(interfaceC9998e, 0, C9582e.ad, str);
                i |= 1;
            } else {
                if (yandex != 1) {
                    throw new C0413e(yandex);
                }
                str2 = (String) metrica.inmobi(interfaceC9998e, 1, C9582e.ad, str2);
                i |= 2;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C18243e(str, i, str2);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
