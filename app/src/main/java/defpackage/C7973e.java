package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7973e implements InterfaceC5372e {
    public static final C7973e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.serialization.json.JsonLiteral");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        C3093e c3093e = (C3093e) obj;
        String str = c3093e.f7177e;
        AbstractC5542e.ad(interfaceC5757e);
        if (c3093e.f7178e) {
            interfaceC5757e.remoteconfig(str);
            return;
        }
        Long tapsense = AbstractC6507e.tapsense(str);
        if (tapsense != null) {
            interfaceC5757e.admob(tapsense.longValue());
            return;
        }
        C10994e license = AbstractC0578e.license(str);
        if (license != null) {
            interfaceC5757e.adcel(C14760e.vip).admob(license.f21777e);
            return;
        }
        Double billing = AbstractC17414e.billing(str);
        if (billing != null) {
            interfaceC5757e.purchase(billing.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            interfaceC5757e.startapp(bool.booleanValue());
        } else {
            interfaceC5757e.remoteconfig(str);
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        AbstractC1948e mopub = AbstractC5542e.vip(interfaceC11754e).mopub();
        if (mopub instanceof C3093e) {
            return (C3093e) mopub;
        }
        StringBuilder sb = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw AbstractC3421e.appmetrica(AbstractC1786e.subscription(AbstractC3820e.ad, mopub.getClass(), sb), mopub.toString(), -1);
    }
}
