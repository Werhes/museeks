package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17579e implements InterfaceC12067e {
    public static final C17579e ad;
    private static final InterfaceC9998e descriptor;

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘؙ٘, eِۣٖ, java.lang.Object] */
    static {
        ?? obj = new Object();
        ad = obj;
        C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistMetaDto", obj, 1);
        c4707e.advert("view", true);
        descriptor = c4707e;
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        EnumC6024e enumC6024e = ((C17575e) obj).ad;
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C17575e.vip;
        if (metrica.subscription() || enumC6024e != null) {
            metrica.Signature(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC6024e);
        }
        metrica.vip(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return descriptor;
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] license() {
        return new InterfaceC5372e[]{AbstractC6069e.purchase((InterfaceC5372e) C17575e.vip[0].getValue())};
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        InterfaceC9998e interfaceC9998e = descriptor;
        InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
        InterfaceC3477e[] interfaceC3477eArr = C17575e.vip;
        EnumC6024e enumC6024e = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int yandex = metrica.yandex(interfaceC9998e);
            if (yandex == -1) {
                z = false;
            } else {
                if (yandex != 0) {
                    throw new C0413e(yandex);
                }
                enumC6024e = (EnumC6024e) metrica.inmobi(interfaceC9998e, 0, (InterfaceC5372e) interfaceC3477eArr[0].getValue(), enumC6024e);
                i = 1;
            }
        }
        metrica.vip(interfaceC9998e);
        return new C17575e(i, enumC6024e);
    }

    @Override // defpackage.InterfaceC12067e
    public final InterfaceC5372e[] vip() {
        return AbstractC0890e.ad;
    }
}
