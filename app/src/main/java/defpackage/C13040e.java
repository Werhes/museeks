package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13040e implements PointerInputEventHandler {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C7765e f25966e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25967e;

    public /* synthetic */ C13040e(C7765e c7765e, int i) {
        this.f25967e = i;
        this.f25966e = c7765e;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        switch (this.f25967e) {
            case 0:
                C7765e c7765e = this.f25966e;
                c7765e.getClass();
                Object appmetrica = AbstractC9743e.appmetrica(new C5176e(c7765e, interfaceC13742e, null, 11), interfaceC5083e);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (appmetrica != enumC2821e) {
                    appmetrica = Unit.INSTANCE;
                }
                return appmetrica == enumC2821e ? appmetrica : Unit.INSTANCE;
            case 1:
                C7765e c7765e2 = this.f25966e;
                c7765e2.getClass();
                Object appmetrica2 = AbstractC9743e.appmetrica(new C13721e(c7765e2, interfaceC13742e, true, null), interfaceC5083e);
                EnumC2821e enumC2821e2 = EnumC2821e.f6782e;
                if (appmetrica2 != enumC2821e2) {
                    appmetrica2 = Unit.INSTANCE;
                }
                return appmetrica2 == enumC2821e2 ? appmetrica2 : Unit.INSTANCE;
            default:
                C7765e c7765e3 = this.f25966e;
                c7765e3.getClass();
                Object appmetrica3 = AbstractC9743e.appmetrica(new C13721e(c7765e3, interfaceC13742e, false, null), interfaceC5083e);
                EnumC2821e enumC2821e3 = EnumC2821e.f6782e;
                if (appmetrica3 != enumC2821e3) {
                    appmetrica3 = Unit.INSTANCE;
                }
                return appmetrica3 == enumC2821e3 ? appmetrica3 : Unit.INSTANCE;
        }
    }
}
