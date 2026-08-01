package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5855e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f12330e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f12331e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC17220e f12332e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Function0 f12333e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12334e = 0;

    public C5855e(InterfaceC17220e interfaceC17220e, boolean z, C11796e c11796e, Function0 function0) {
        this.f12332e = interfaceC17220e;
        this.f12331e = z;
        this.f12330e = c11796e;
        this.f12333e = function0;
    }

    public C5855e(InterfaceC17220e interfaceC17220e, boolean z, Function0 function0, Function0 function02) {
        this.f12332e = interfaceC17220e;
        this.f12331e = z;
        this.f12333e = function0;
        this.f12330e = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12334e) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                ((Number) obj3).intValue();
                c13770e.m3676strictfp(-1525724089);
                Object m3681throw = c13770e.m3681throw();
                if (m3681throw == C2987e.ad) {
                    m3681throw = AbstractC17861e.adcel(c13770e);
                }
                C15274e c15274e = (C15274e) m3681throw;
                InterfaceC12864e premium = AbstractC10746e.ad(C0115e.f1276e, c15274e, this.f12332e).premium(new C7152e(c15274e, null, false, this.f12331e, null, (C11796e) this.f12330e, this.f12333e));
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
                InterfaceC12864e premium2 = AbstractC10746e.ad(C0115e.f1276e, c15274e2, this.f12332e).premium(new C14269e(null, c15274e2, this.f12333e, (Function0) this.f12330e, false, this.f12331e));
                c13770e2.Signature(false);
                return premium2;
        }
    }
}
