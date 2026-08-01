package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16702e implements InterfaceC18169e {
    public InterfaceC18169e[] ad;

    @Override // defpackage.InterfaceC18169e
    public final C8678e ad(Class cls) {
        for (InterfaceC18169e interfaceC18169e : this.ad) {
            if (interfaceC18169e.vip(cls)) {
                return interfaceC18169e.ad(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // defpackage.InterfaceC18169e
    public final boolean vip(Class cls) {
        for (InterfaceC18169e interfaceC18169e : this.ad) {
            if (interfaceC18169e.vip(cls)) {
                return true;
            }
        }
        return false;
    }
}
