package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15183e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C8874e f30040e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f30041e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30042e;

    public /* synthetic */ C15183e(InterfaceC18435e interfaceC18435e, C8874e c8874e, int i) {
        this.f30042e = i;
        this.f30041e = interfaceC18435e;
        this.f30040e = c8874e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f30042e) {
            case 0:
                AbstractC5336e.purchase(this.f30041e, null, 0, new C10785e(this.f30040e, ((Boolean) obj).booleanValue(), null, 0), 3);
                return Unit.INSTANCE;
            default:
                AbstractC5336e.purchase(this.f30041e, null, 0, new C10785e(this.f30040e, ((Boolean) obj).booleanValue(), null, 1), 3);
                return Unit.INSTANCE;
        }
    }
}
