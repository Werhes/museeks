package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۢٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13580e implements InterfaceC12111e {
    public InterfaceC12111e[] ad;

    @Override // defpackage.InterfaceC12111e
    public final C14702e ad(Class cls) {
        for (InterfaceC12111e interfaceC12111e : this.ad) {
            if (interfaceC12111e.vip(cls)) {
                return interfaceC12111e.ad(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC12111e
    public final boolean vip(Class cls) {
        for (InterfaceC12111e interfaceC12111e : this.ad) {
            if (interfaceC12111e.vip(cls)) {
                return true;
            }
        }
        return false;
    }
}
