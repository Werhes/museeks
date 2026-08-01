package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13819e extends AbstractRunnableC4951e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27382e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C17768e f27383e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ String f27384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13819e(C17768e c17768e, String str, int i) {
        super(c17768e, true);
        this.f27382e = i;
        switch (i) {
            case 1:
                this.f27384e = str;
                Objects.requireNonNull(c17768e);
                this.f27383e = c17768e;
                super(c17768e, true);
                return;
            default:
                this.f27384e = str;
                Objects.requireNonNull(c17768e);
                this.f27383e = c17768e;
                return;
        }
    }

    @Override // defpackage.AbstractRunnableC4951e
    public final void ad() {
        switch (this.f27382e) {
            case 0:
                InterfaceC3741e interfaceC3741e = this.f27383e.purchase;
                AbstractC9528e.startapp(interfaceC3741e);
                interfaceC3741e.beginAdUnitExposure(this.f27384e, this.f10472e);
                return;
            default:
                InterfaceC3741e interfaceC3741e2 = this.f27383e.purchase;
                AbstractC9528e.startapp(interfaceC3741e2);
                interfaceC3741e2.endAdUnitExposure(this.f27384e, this.f10472e);
                return;
        }
    }
}
