package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16974e implements InterfaceC12163e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f33237e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f33238e;

    public C16974e(Function1 function1, Function2 function2) {
        this.f33238e = function2;
        this.f33237e = function1;
    }

    @Override // defpackage.InterfaceC12163e
    public final Object Signature(C13840e c13840e, Object obj) {
        return this.f33238e.invoke(c13840e, obj);
    }

    @Override // defpackage.InterfaceC12163e
    public final Object startapp(Object obj) {
        return this.f33237e.invoke(obj);
    }
}
