package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2012e implements InterfaceC2901e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Surface f5294e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final OutputConfiguration f5295e;

    public C2012e(OutputConfiguration outputConfiguration) {
        this.f5295e = outputConfiguration;
        this.f5294e = outputConfiguration.getSurface();
    }

    public final void ad(Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            throw new IllegalStateException(AbstractC1634e.smaato("addSurface is not supported on API ", i, " (requires API 26)").toString());
        }
        if (i >= 26) {
            AbstractC11815e.ad(this.f5295e, surface);
        }
    }

    @Override // defpackage.InterfaceC15070e
    /* renamed from: static, reason: not valid java name */
    public final Object mo754static(InterfaceC7227e interfaceC7227e) {
        if (interfaceC7227e.equals(AbstractC3820e.ad.vip(C12885e.purchase()))) {
            return this.f5295e;
        }
        return null;
    }

    public final String toString() {
        return this.f5295e.toString();
    }
}
