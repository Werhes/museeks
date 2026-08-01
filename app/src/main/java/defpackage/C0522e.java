package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۘۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522e implements InterfaceC15276e {
    public static final C0522e ad = new Object();

    @Override // defpackage.InterfaceC7189e
    public final Object appmetrica(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean billing(C17187e c17187e) {
        return ((Boolean) c17187e.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC7189e
    public final /* synthetic */ InterfaceC7189e purchase(InterfaceC7189e interfaceC7189e) {
        return AbstractC0869e.mopub(this, interfaceC7189e);
    }

    @Override // defpackage.InterfaceC7189e
    public final boolean yandex(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }
}
