package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12417e implements InterfaceC2784e {
    public final AtomicBoolean ad = new AtomicBoolean(false);
    public final InterfaceC2784e vip;

    public C12417e(InterfaceC2784e interfaceC2784e) {
        this.vip = interfaceC2784e;
    }

    @Override // defpackage.InterfaceC2784e
    public final void ad(C11469e c11469e) {
        if (this.ad.get()) {
            return;
        }
        this.vip.ad(c11469e);
    }

    public final void vip() {
        this.ad.set(true);
    }
}
