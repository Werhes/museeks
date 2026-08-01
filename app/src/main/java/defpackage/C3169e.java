package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3169e implements PointerInputEventHandler {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f7274e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7275e;

    public /* synthetic */ C3169e(int i, Object obj) {
        this.f7275e = i;
        this.f7274e = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        switch (this.f7275e) {
            case 0:
                Object metrica = AbstractC13406e.metrica(interfaceC13742e, new C4836e((C11644e) this.f7274e, null, 0), interfaceC5083e);
                return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
            case 1:
                Object appmetrica = AbstractC9743e.appmetrica(new C6626e(interfaceC13742e, (AbstractC16904e) this.f7274e, null, 25), interfaceC5083e);
                return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
            case 2:
                C12339e c12339e = (C12339e) this.f7274e;
                Object appmetrica2 = AbstractC9939e.appmetrica(interfaceC13742e, new C4058e(c12339e, null), new C2148e(c12339e, 1), interfaceC5083e, 3);
                return appmetrica2 == EnumC2821e.f6782e ? appmetrica2 : Unit.INSTANCE;
            case 3:
                Object appmetrica3 = AbstractC9939e.appmetrica(interfaceC13742e, null, new C17897e(10, (Function0) this.f7274e), interfaceC5083e, 7);
                return appmetrica3 == EnumC2821e.f6782e ? appmetrica3 : Unit.INSTANCE;
            case 4:
                Object m1364e = ((C3427e) interfaceC13742e).m1364e(new C7294e((Function1) this.f7274e, null, 3), interfaceC5083e);
                return m1364e == EnumC2821e.f6782e ? m1364e : Unit.INSTANCE;
            case 5:
                Object metrica2 = AbstractC13406e.metrica(interfaceC13742e, new C18042e((C2629e) this.f7274e, null, 5), interfaceC5083e);
                return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
            case 6:
                Object metrica3 = AbstractC13406e.metrica(interfaceC13742e, new C7294e(new C10981e(1, (C8050e) this.f7274e, C8050e.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 9), null, 2), interfaceC5083e);
                EnumC2821e enumC2821e = EnumC2821e.f6782e;
                if (metrica3 != enumC2821e) {
                    metrica3 = Unit.INSTANCE;
                }
                return metrica3 == enumC2821e ? metrica3 : Unit.INSTANCE;
            case 7:
                Object appmetrica4 = AbstractC9743e.appmetrica(new C5176e((C1902e) this.f7274e, interfaceC13742e, null, 10), interfaceC5083e);
                return appmetrica4 == EnumC2821e.f6782e ? appmetrica4 : Unit.INSTANCE;
            default:
                C15860e c15860e = (C15860e) this.f7274e;
                Object metrica4 = AbstractC18039e.metrica(interfaceC13742e, c15860e.applovin, c15860e.isPro, interfaceC5083e);
                return metrica4 == EnumC2821e.f6782e ? metrica4 : Unit.INSTANCE;
        }
    }
}
