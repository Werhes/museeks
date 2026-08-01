package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1339e extends AbstractC6273e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Function2 f4129e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f4130e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5083e f4131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339e(InterfaceC5083e interfaceC5083e, InterfaceC5083e interfaceC5083e2, Function2 function2) {
        super(interfaceC5083e);
        this.f4129e = function2;
        this.f4131e = interfaceC5083e2;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f4130e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f4130e = 2;
            AbstractC2003e.purchase(obj);
            return obj;
        }
        this.f4130e = 1;
        AbstractC2003e.purchase(obj);
        Function2 function2 = this.f4129e;
        AbstractC9476e.purchase(2, function2);
        return function2.invoke(this.f4131e, this);
    }
}
