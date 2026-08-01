package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٞ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8863e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C5421e f17792e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f17793e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17794e;

    public /* synthetic */ C8863e(InterfaceC18435e interfaceC18435e, C5421e c5421e, int i) {
        this.f17794e = i;
        this.f17793e = interfaceC18435e;
        this.f17792e = c5421e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17794e) {
            case 0:
                AbstractC5336e.purchase(this.f17793e, null, 0, new C12887e(this.f17792e, null, 2), 3);
                return Unit.INSTANCE;
            case 1:
                AbstractC5336e.purchase(this.f17793e, null, 0, new C12887e(this.f17792e, null, 3), 3);
                return Unit.INSTANCE;
            default:
                AbstractC5336e.purchase(this.f17793e, null, 0, new C12887e(this.f17792e, null, 1), 3);
                return Unit.INSTANCE;
        }
    }
}
