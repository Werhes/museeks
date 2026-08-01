package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16345e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5016e f32115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32116e;

    public /* synthetic */ C16345e(C5016e c5016e, int i) {
        this.f32116e = i;
        this.f32115e = c5016e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32116e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f32115e.f10700e.setValue(bool);
                return Unit.INSTANCE;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                this.f32115e.f10700e.setValue(bool2);
                return Unit.INSTANCE;
            default:
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-261775230, true, new C18499e(this.f32115e, 1)), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC3265e.metrica, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC3265e.license, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC3265e.appmetrica, 3);
                return Unit.INSTANCE;
        }
    }
}
