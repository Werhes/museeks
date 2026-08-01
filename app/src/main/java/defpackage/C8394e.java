package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8394e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f17165e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Function1 f17166e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f17167e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17168e;

    public /* synthetic */ C8394e(Function1 function1, int i, InterfaceC3314e interfaceC3314e, int i2) {
        this.f17168e = i2;
        this.f17166e = function1;
        this.f17165e = i;
        this.f17167e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17168e) {
            case 0:
                AbstractC12185e.billing(this.f17167e, false);
                this.f17166e.invoke(Integer.valueOf(this.f17165e));
                return Unit.INSTANCE;
            default:
                AbstractC12185e.billing(this.f17167e, false);
                this.f17166e.invoke(Integer.valueOf(this.f17165e));
                return Unit.INSTANCE;
        }
    }
}
