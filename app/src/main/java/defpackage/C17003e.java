package defpackage;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٗٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17003e implements InterfaceC1373e {
    public static final boolean metrica;
    public final InterfaceC16964e ad;
    public final C5363e vip;

    static {
        metrica = AbstractC16338e.ad(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public C17003e(C13825e c13825e, InterfaceC16964e interfaceC16964e, C8591e c8591e, C17425e c17425e) {
        this.ad = interfaceC16964e;
        new C5363e(new C9282e(c13825e, 1));
        this.vip = new C5363e(new C14515e(28, this));
    }

    @Override // defpackage.InterfaceC1373e
    public final void ad(int i) {
        ((C3499e) this.vip.getValue()).getClass();
    }
}
