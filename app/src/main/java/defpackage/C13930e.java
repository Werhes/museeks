package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13930e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3324e f27633e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27634e;

    public /* synthetic */ C13930e(C3324e c3324e, int i) {
        this.f27634e = i;
        this.f27633e = c3324e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27634e) {
            case 0:
                InterfaceC1966e interfaceC1966e = this.f27633e.f7502e;
                if (interfaceC1966e == null) {
                    throw AbstractC5087e.m1749interface("Font resolution state is not set.");
                }
                interfaceC1966e.getValue();
                return Unit.INSTANCE;
            default:
                InterfaceC1966e interfaceC1966e2 = this.f27633e.f7502e;
                if (interfaceC1966e2 == null) {
                    throw AbstractC5087e.m1749interface("Font resolution state is not set.");
                }
                interfaceC1966e2.getValue();
                return Unit.INSTANCE;
        }
    }
}
