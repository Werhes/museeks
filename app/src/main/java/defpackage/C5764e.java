package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5764e implements InterfaceC5007e {
    public InterfaceC5007e[] ad;

    @Override // defpackage.InterfaceC5007e
    public final C15610e ad(Class cls) {
        for (InterfaceC5007e interfaceC5007e : this.ad) {
            if (interfaceC5007e.vip(cls)) {
                return interfaceC5007e.ad(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC5007e
    public final boolean vip(Class cls) {
        for (InterfaceC5007e interfaceC5007e : this.ad) {
            if (interfaceC5007e.vip(cls)) {
                return true;
            }
        }
        return false;
    }
}
