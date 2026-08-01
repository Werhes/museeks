package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٝۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9614e implements PointerInputEventHandler, InterfaceC10212e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f19061e;

    public C9614e(Function2 function2) {
        this.f19061e = function2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PointerInputEventHandler) || !(obj instanceof InterfaceC10212e)) {
            return false;
        }
        return AbstractC7890e.billing(this.f19061e, ((InterfaceC10212e) obj).vip());
    }

    public final int hashCode() {
        return this.f19061e.hashCode();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final /* synthetic */ Object invoke(InterfaceC13742e interfaceC13742e, InterfaceC5083e interfaceC5083e) {
        return this.f19061e.invoke(interfaceC13742e, interfaceC5083e);
    }

    @Override // defpackage.InterfaceC10212e
    public final InterfaceC12561e vip() {
        return this.f19061e;
    }
}
