package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7398e implements InterfaceC12067e {
    public static final C7398e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؙؚۘ, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistPermissionsDto", obj, 7);
        c4707e.advert("play", true);
        c4707e.advert("share", true);
        c4707e.advert("edit", true);
        c4707e.advert("follow", true);
        c4707e.advert("delete", true);
        c4707e.advert("boom_download", true);
        c4707e.advert("save_as_copy", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C4945e c4945e = (C4945e) obj;
        Boolean bool = c4945e.billing;
        Boolean bool2 = c4945e.purchase;
        Boolean bool3 = c4945e.appmetrica;
        Boolean bool4 = c4945e.license;
        Boolean bool5 = c4945e.metrica;
        Boolean bool6 = c4945e.vip;
        Boolean bool7 = c4945e.ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        if (metrica.subscription() || bool7 != null) {
            metrica.Signature(interfaceC9998e, 0, C6266e.ad, bool7);
        }
        if (metrica.subscription() || bool6 != null) {
            metrica.Signature(interfaceC9998e, 1, C6266e.ad, bool6);
        }
        if (metrica.subscription() || bool5 != null) {
            metrica.Signature(interfaceC9998e, 2, C6266e.ad, bool5);
        }
        if (metrica.subscription() || bool4 != null) {
            metrica.Signature(interfaceC9998e, 3, C6266e.ad, bool4);
        }
        if (metrica.subscription() || bool3 != null) {
            metrica.Signature(interfaceC9998e, 4, C6266e.ad, bool3);
        }
        if (metrica.subscription() || bool2 != null) {
            metrica.Signature(interfaceC9998e, 5, C6266e.ad, bool2);
        }
        if (metrica.subscription() || bool != null) {
            metrica.Signature(interfaceC9998e, 6, C6266e.ad, bool);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        C6266e c6266e = C6266e.ad;
        return new InterfaceC5372e[]{AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e), AbstractC6069e.purchase(c6266e)};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        boolean z = true;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            switch (yandex) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bool = (Boolean) metrica.inmobi(interfaceC9998e, 0, C6266e.ad, bool);
                    i |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) metrica.inmobi(interfaceC9998e, 1, C6266e.ad, bool2);
                    i |= 2;
                    break;
                case 2:
                    bool3 = (Boolean) metrica.inmobi(interfaceC9998e, 2, C6266e.ad, bool3);
                    i |= 4;
                    break;
                case 3:
                    bool4 = (Boolean) metrica.inmobi(interfaceC9998e, 3, C6266e.ad, bool4);
                    i |= 8;
                    break;
                case 4:
                    bool5 = (Boolean) metrica.inmobi(interfaceC9998e, 4, C6266e.ad, bool5);
                    i |= 16;
                    break;
                case 5:
                    bool6 = (Boolean) metrica.inmobi(interfaceC9998e, 5, C6266e.ad, bool6);
                    i |= 32;
                    break;
                case 6:
                    bool7 = (Boolean) metrica.inmobi(interfaceC9998e, 6, C6266e.ad, bool7);
                    i |= 64;
                    break;
                default:
                    throw new C0413e(yandex);
            }
        }
        metrica.vip(interfaceC9998e);
        return new C4945e(i, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
