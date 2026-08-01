package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16633e implements PointerInputEventHandler {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6540e f32660e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32661e;

    public /* synthetic */ C16633e(C6540e c6540e, int i) {
        this.f32661e = i;
        this.f32660e = c6540e;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        switch (this.f32661e) {
            case 0:
                Object appmetrica = AbstractC9743e.appmetrica(new C4163e(interfaceC13742e, this.f32660e, null, 0), interfaceC5083e);
                return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
            default:
                Object appmetrica2 = AbstractC9743e.appmetrica(new C4163e(interfaceC13742e, this.f32660e, null, 1), interfaceC5083e);
                return appmetrica2 == EnumC2821e.f6782e ? appmetrica2 : Unit.INSTANCE;
        }
    }
}
