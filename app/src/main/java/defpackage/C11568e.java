package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11568e implements InterfaceC6034e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f23234e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23235e;

    public /* synthetic */ C11568e(C7765e c7765e, int i) {
        this.f23235e = i;
        this.f23234e = c7765e;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        C8419e c8419e;
        switch (this.f23235e) {
            case 0:
                C7765e c7765e = this.f23234e;
                c7765e.isVip(false);
                c7765e.inmobi(EnumC5022e.f10707e);
                return Unit.INSTANCE;
            default:
                C0763e c0763e = (C0763e) obj;
                C7765e c7765e2 = this.f23234e;
                if (c0763e != null) {
                    c7765e2.purchase.ad();
                    return Unit.INSTANCE;
                }
                C16679e c16679e = c7765e2.purchase.ad;
                if (c16679e != null && (c8419e = c16679e.f32722e) != null) {
                    c8419e.Signature(null);
                    c16679e.f32722e = null;
                }
                return Unit.INSTANCE;
        }
    }
}
