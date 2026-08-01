package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۚؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15700e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13642e f30909e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f30910e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30911e;

    public /* synthetic */ C15700e(InterfaceC18435e interfaceC18435e, C13642e c13642e, int i) {
        this.f30911e = i;
        this.f30910e = interfaceC18435e;
        this.f30909e = c13642e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f30911e) {
            case 0:
                AbstractC5336e.purchase(this.f30910e, null, 0, new C1723e(this.f30909e, null, 2), 3);
                return Unit.INSTANCE;
            case 1:
                AbstractC5336e.purchase(this.f30910e, null, 0, new C1723e(this.f30909e, null, 3), 3);
                return Unit.INSTANCE;
            default:
                AbstractC5336e.purchase(this.f30910e, null, 0, new C1723e(this.f30909e, null, 1), 3);
                return Unit.INSTANCE;
        }
    }
}
