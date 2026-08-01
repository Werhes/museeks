package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8652e extends AbstractC6273e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C7460e f17471e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f17472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8652e(Function1 function1) {
        super(AbstractC12534e.ad);
        this.f17471e = (C7460e) function1;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f17472e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f17472e = 2;
            AbstractC2003e.purchase(obj);
            return obj;
        }
        this.f17472e = 1;
        AbstractC2003e.purchase(obj);
        InterfaceC5261e interfaceC5261e = this.f17471e;
        AbstractC9476e.purchase(1, interfaceC5261e);
        return ((Function1) interfaceC5261e).invoke(this);
    }
}
