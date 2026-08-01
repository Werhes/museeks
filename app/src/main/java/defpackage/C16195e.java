package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16195e extends AbstractC1600e {
    public final /* synthetic */ AbstractC6785e billing;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16195e(AbstractC6785e abstractC6785e, int i, Bundle bundle) {
        super(abstractC6785e, i, bundle);
        this.billing = abstractC6785e;
    }

    @Override // defpackage.AbstractC1600e
    public final boolean ad() {
        this.billing.mopub.Signature(C14758e.f29187e);
        return true;
    }

    @Override // defpackage.AbstractC1600e
    public final void vip(C14758e c14758e) {
        AbstractC6785e abstractC6785e = this.billing;
        abstractC6785e.getClass();
        abstractC6785e.mopub.Signature(c14758e);
        abstractC6785e.tapsense(c14758e);
    }
}
