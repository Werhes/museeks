package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15559e implements InterfaceC5372e {
    public static final C15559e ad = new Object();
    public static final C3859e vip = AbstractC10003e.ad("BsonDocumentKey");

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        String str = (String) obj;
        if (AbstractC5304e.isPro(str, (char) 0)) {
            throw new C6301e(1, "Contains null byte", null);
        }
        C9582e c9582e = C9582e.ad;
        interfaceC5757e.remoteconfig(str);
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        C9582e c9582e = C9582e.ad;
        return interfaceC11754e.pro();
    }
}
