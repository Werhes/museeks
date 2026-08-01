package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0543e implements PointerInputEventHandler {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC11944e f2711e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2712e;

    public /* synthetic */ C0543e(InterfaceC11944e interfaceC11944e, int i) {
        this.f2712e = i;
        this.f2711e = interfaceC11944e;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        switch (this.f2712e) {
            case 0:
                Object billing = AbstractC14533e.billing(interfaceC13742e, this.f2711e, interfaceC5083e);
                return billing == EnumC2821e.f6782e ? billing : Unit.INSTANCE;
            default:
                Object billing2 = AbstractC14533e.billing(interfaceC13742e, this.f2711e, interfaceC5083e);
                return billing2 == EnumC2821e.f6782e ? billing2 : Unit.INSTANCE;
        }
    }
}
