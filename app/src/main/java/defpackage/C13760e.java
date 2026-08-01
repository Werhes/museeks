package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13760e implements InterfaceC8177e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f27257e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14772e f27258e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C9556e f27259e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C8513e f27260e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eٌٍٚ] */
    public C13760e() {
        ?? obj = new Object();
        obj.f18969e = this;
        obj.f18970e = 1;
        this.f27259e = obj;
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC12864e
    public final /* synthetic */ InterfaceC12864e premium(InterfaceC12864e interfaceC12864e) {
        return AbstractC5087e.isVip(this, interfaceC12864e);
    }

    @Override // defpackage.InterfaceC12864e
    /* renamed from: volatile */
    public final boolean mo256volatile(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
