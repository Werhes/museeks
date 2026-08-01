package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15358e extends AbstractC17977e {
    @Override // defpackage.AbstractC17977e
    public final InterfaceC12385e ad(InterfaceC8668e interfaceC8668e) {
        return interfaceC8668e.inmobi();
    }

    @Override // defpackage.AbstractC17977e
    public final void license() {
    }

    @Override // defpackage.AbstractC17977e
    public final void purchase(InterfaceC12385e interfaceC12385e) {
        ListenableFuture vip = vip(interfaceC12385e);
        C13935e c13935e = new C13935e(interfaceC12385e);
        vip.ad(new RunnableC17144e(vip, c13935e, 0), AbstractC3062e.billing());
    }
}
