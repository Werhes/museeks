package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1730e extends AbstractC3743e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C1730e f4721e = new AbstractC3743e();

    @Override // defpackage.AbstractC3743e
    public final void advert(InterfaceC8850e interfaceC8850e, Runnable runnable) {
        C9052e c9052e = (C9052e) interfaceC8850e.mo397public(C9052e.f18112e);
        if (c9052e == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c9052e.f18113e = true;
    }

    @Override // defpackage.AbstractC3743e
    /* renamed from: static, reason: not valid java name */
    public final AbstractC3743e mo685static(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.AbstractC3743e
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
