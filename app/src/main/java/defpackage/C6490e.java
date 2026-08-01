package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٚٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6490e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ float f13406e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13407e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13408e;

    public /* synthetic */ C6490e(Object obj, float f, int i) {
        this.f13408e = i;
        this.f13407e = obj;
        this.f13406e = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C4194e isVip;
        C4194e isVip2;
        switch (this.f13408e) {
            case 0:
                C7838e c7838e = (C7838e) this.f13407e;
                C12318e c12318e = c7838e.f15864e;
                if (c12318e == null || (isVip = c12318e.isVip()) == null) {
                    return null;
                }
                C12318e c12318e2 = c7838e.f15864e;
                if (c12318e2 != null) {
                    c12318e2.Signature(new C4194e(this.f13406e, isVip.vip));
                }
                return Unit.INSTANCE;
            case 1:
                C7838e c7838e2 = (C7838e) this.f13407e;
                C12318e c12318e3 = c7838e2.f15864e;
                if (c12318e3 == null || (isVip2 = c12318e3.isVip()) == null) {
                    return null;
                }
                C12318e c12318e4 = c7838e2.f15864e;
                if (c12318e4 != null) {
                    c12318e4.Signature(new C4194e(isVip2.ad, this.f13406e));
                }
                return Unit.INSTANCE;
            default:
                return ((InterfaceC10857e) this.f13407e).ad(this.f13406e, C7695e.startapp);
        }
    }
}
