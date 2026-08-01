package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5664e implements InterfaceC5372e {
    public static final C5664e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("kotlinx.datetime.FixedOffsetTimeZone");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C18302e) obj).ad.getId());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C9663e c9663e = C7969e.Companion;
        String pro = interfaceC11754e.pro();
        c9663e.getClass();
        C7969e ad2 = C9663e.ad(pro);
        if (ad2 instanceof C18302e) {
            return (C18302e) ad2;
        }
        throw new IllegalArgumentException("Timezone identifier '" + ad2 + "' does not correspond to a fixed-offset timezone");
    }
}
