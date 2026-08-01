package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6348e implements PointerInputEventHandler {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f13188e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13189e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13190e;

    public /* synthetic */ C6348e(Object obj, Object obj2, int i) {
        this.f13190e = i;
        this.f13189e = obj;
        this.f13188e = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        switch (this.f13190e) {
            case 0:
                Object appmetrica = AbstractC9743e.appmetrica(new C12203e(interfaceC13742e, (InterfaceC11944e) this.f13189e, (C15860e) this.f13188e, null), interfaceC5083e);
                return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
            case 1:
                Object metrica = AbstractC18039e.metrica(interfaceC13742e, (C18524e) this.f13189e, (C15102e) this.f13188e, interfaceC5083e);
                return metrica == EnumC2821e.f6782e ? metrica : Unit.INSTANCE;
            default:
                Object metrica2 = AbstractC13406e.metrica(interfaceC13742e, new license((C4034e) this.f13189e, (C18408e) this.f13188e, null, 4), interfaceC5083e);
                return metrica2 == EnumC2821e.f6782e ? metrica2 : Unit.INSTANCE;
        }
    }
}
