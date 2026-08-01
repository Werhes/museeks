package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13149e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f26134e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f26135e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26136e;

    public /* synthetic */ C13149e(Function1 function1, InterfaceC3314e interfaceC3314e, int i) {
        this.f26136e = i;
        this.f26135e = function1;
        this.f26134e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f26136e) {
            case 0:
                this.f26135e.invoke(((C0398e) this.f26134e.getValue()).ad.f20850e);
                return Unit.INSTANCE;
            default:
                this.f26135e.invoke(null);
                this.f26134e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
