package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۛؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2852e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C16546e f6817e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        C16546e c16546e = (C16546e) AbstractC14114e.license(this, "StyleOuterNode");
        c16546e.f32447e = this;
        this.f6817e = c16546e;
        c16546e.m4164e(true);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        C8005e m4162e = C16546e.m4162e(this.f6817e, 1);
        float f = m4162e.f16216e;
        float f2 = m4162e.f16212e;
        final float f3 = f + f2;
        float f4 = m4162e.f16234e + f2;
        final float f5 = m4162e.f16196e + f2;
        float f6 = m4162e.f16220e + f2;
        int round = Math.round(f4 + f3);
        int round2 = Math.round(f6 + f5);
        final AbstractC2832e admob = interfaceC16719e.admob(AbstractC2278e.startapp(-round, j, -round2));
        return interfaceC13158e.ads(AbstractC2278e.billing(admob.f6806e + round, j), AbstractC2278e.purchase(admob.f6804e + round2, j), C9139e.f18290e, new Function1() { // from class: eؚّؖ
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((AbstractC3698e) obj).billing(AbstractC2832e.this, Math.round(f3), Math.round(f5), 0.0f);
                return Unit.INSTANCE;
            }
        });
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
