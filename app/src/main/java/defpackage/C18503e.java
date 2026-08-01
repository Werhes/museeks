package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۦۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18503e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C11796e f36268e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f36269e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17220e f36270e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f36271e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36272e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12561e f36273e;

    public /* synthetic */ C18503e(InterfaceC17220e interfaceC17220e, boolean z, boolean z2, C11796e c11796e, InterfaceC12561e interfaceC12561e, int i) {
        this.f36272e = i;
        this.f36270e = interfaceC17220e;
        this.f36269e = z;
        this.f36271e = z2;
        this.f36268e = c11796e;
        this.f36273e = interfaceC12561e;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f36272e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                ((Number) obj3).intValue();
                c13770e.m3676strictfp(-1525724089);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                C15274e c15274e = (C15274e) m3681throw;
                InterfaceC12864e premium = AbstractC10746e.ad(C0115e.f1276e, c15274e, this.f36270e).premium(new C9206e(this.f36269e, c15274e, null, this.f36271e, this.f36268e, (Function0) this.f36273e));
                c13770e.Signature(false);
                return premium;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                ((Number) obj3).intValue();
                c13770e2.m3676strictfp(-1525724089);
                Object m3681throw2 = c13770e2.m3681throw();
                if (m3681throw2 == C2987e.ad) {
                    m3681throw2 = AbstractC17861e.adcel(c13770e2);
                }
                C15274e c15274e2 = (C15274e) m3681throw2;
                InterfaceC12864e premium2 = AbstractC10746e.ad(C0115e.f1276e, c15274e2, this.f36270e).premium(new C4185e(this.f36269e, c15274e2, null, this.f36271e, this.f36268e, (Function1) this.f36273e));
                c13770e2.Signature(false);
                return premium2;
        }
    }
}
