package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17693e implements PointerInputEventHandler {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C15274e f34680e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f34681e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f34682e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC18435e f34683e;

    public C17693e(InterfaceC18435e interfaceC18435e, InterfaceC3314e interfaceC3314e, C15274e c15274e, InterfaceC3314e interfaceC3314e2) {
        this.f34683e = interfaceC18435e;
        this.f34681e = interfaceC3314e;
        this.f34680e = c15274e;
        this.f34682e = interfaceC3314e2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        C7238e c7238e = new C7238e(this.f34683e, this.f34681e, this.f34680e, null);
        C13676e c13676e = new C13676e(this.f34682e, 3);
        C15256e c15256e = AbstractC9939e.ad;
        Object appmetrica = AbstractC9743e.appmetrica(new C14164e(interfaceC13742e, c7238e, c13676e, new C14307e(interfaceC13742e), (InterfaceC5083e) null), interfaceC5083e);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        if (appmetrica != enumC2821e) {
            appmetrica = Unit.INSTANCE;
        }
        return appmetrica == enumC2821e ? appmetrica : Unit.INSTANCE;
    }
}
