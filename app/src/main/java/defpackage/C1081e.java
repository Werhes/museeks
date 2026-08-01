package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1081e implements InterfaceC5372e {
    public static final C1081e ad = new Object();
    public static final C17709e vip = AbstractC10003e.appmetrica("kotlinx.serialization.json.JsonPrimitive", C13337e.smaato, new InterfaceC9998e[0]);

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        AbstractC16920e abstractC16920e = (AbstractC16920e) obj;
        AbstractC5542e.ad(interfaceC5757e);
        if (abstractC16920e instanceof C11549e) {
            interfaceC5757e.appmetrica(C16461e.ad, C11549e.INSTANCE);
        } else {
            interfaceC5757e.appmetrica(C7973e.ad, (C3093e) abstractC16920e);
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        AbstractC1948e mopub = AbstractC5542e.vip(interfaceC11754e).mopub();
        if (mopub instanceof AbstractC16920e) {
            return (AbstractC16920e) mopub;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw AbstractC3421e.appmetrica(AbstractC1786e.subscription(AbstractC3820e.ad, mopub.getClass(), sb), mopub.toString(), -1);
    }
}
