package defpackage;

import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15685e extends AbstractC13616e implements InterfaceC6505e {
    @Override // defpackage.InterfaceC6505e
    /* renamed from: this */
    public final void mo578this(InterfaceC12296e interfaceC12296e) {
        View purchase = AbstractC1660e.purchase(this);
        interfaceC12296e.license(this.f27022e.f27016e && AbstractC1660e.purchase(this).hasFocusable());
        View findFocus = purchase.findFocus();
        if (findFocus != null) {
            interfaceC12296e.appmetrica(AbstractC12410e.ad(findFocus, purchase));
        }
    }
}
