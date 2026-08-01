package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؓؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14464e implements InterfaceC1108e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function2 f28595e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Function1 f28596e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC1108e f28597e;

    public C14464e(InterfaceC1108e interfaceC1108e, Function1 function1, Function2 function2) {
        this.f28597e = interfaceC1108e;
        this.f28596e = function1;
        this.f28595e = function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّؖٝ, java.lang.Object] */
    @Override // defpackage.InterfaceC1108e
    public final Object ad(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        ?? obj = new Object();
        obj.f9318e = AbstractC18467e.ad;
        Object ad = this.f28597e.ad(new C15312e(this, (C4246e) obj, interfaceC6034e), interfaceC5083e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }
}
