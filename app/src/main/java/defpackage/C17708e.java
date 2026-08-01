package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17708e implements InterfaceC0684e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0576e f34708e;

    public C17708e(boolean z) {
        this.f34708e = AbstractC14533e.startapp(Boolean.valueOf(z));
    }

    @Override // defpackage.InterfaceC12864e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC0684e
    public final Object metrica(InterfaceC14388e interfaceC14388e, Object obj) {
        return this;
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
