package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4676e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC3060e f10022e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC5133e f10023e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C11691e f10024e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4676e(AbstractC5133e abstractC5133e, ViewOnAttachStateChangeListenerC3060e viewOnAttachStateChangeListenerC3060e, C11691e c11691e) {
        super(0);
        this.f10023e = abstractC5133e;
        this.f10022e = viewOnAttachStateChangeListenerC3060e;
        this.f10024e = c11691e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewOnAttachStateChangeListenerC3060e viewOnAttachStateChangeListenerC3060e = this.f10022e;
        AbstractC5133e abstractC5133e = this.f10023e;
        abstractC5133e.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC3060e);
        AbstractC6069e.billing(abstractC5133e).ad.remove(this.f10024e);
        return Unit.INSTANCE;
    }
}
