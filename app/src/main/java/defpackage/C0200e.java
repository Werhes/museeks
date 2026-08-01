package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200e extends AbstractC4926e {
    public final InterfaceC3958e metrica;

    public C0200e(InterfaceC3958e interfaceC3958e) {
        super(interfaceC3958e);
        this.metrica = interfaceC3958e;
    }

    @Override // defpackage.AbstractC4926e, defpackage.InterfaceC3958e
    public final ListenableFuture adcel(boolean z) {
        return this.metrica.adcel(z);
    }

    @Override // defpackage.AbstractC4926e, defpackage.InterfaceC3958e
    public final ListenableFuture license(float f) {
        return this.metrica.license(f);
    }

    @Override // defpackage.AbstractC4926e, defpackage.InterfaceC3958e
    public final ListenableFuture purchase(float f) {
        return this.metrica.purchase(f);
    }

    @Override // defpackage.AbstractC4926e, defpackage.InterfaceC3958e
    public final ListenableFuture startapp(C16389e c16389e) {
        return this.metrica.startapp(c16389e);
    }
}
