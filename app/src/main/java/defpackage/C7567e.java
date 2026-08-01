package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7567e extends AbstractC3053e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC7185e f15391e;

    /* JADX WARN: Multi-variable type inference failed */
    public C7567e(Function3 function3, InterfaceC1108e interfaceC1108e, InterfaceC8850e interfaceC8850e, int i, int i2) {
        super(i, i2, interfaceC8850e, interfaceC1108e);
        this.f15391e = (AbstractC7185e) function3;
    }

    @Override // defpackage.AbstractC3053e
    public final Object adcel(InterfaceC6034e interfaceC6034e, InterfaceC5083e interfaceC5083e) {
        Object appmetrica = AbstractC9743e.appmetrica(new C4129e(this, interfaceC6034e, null), interfaceC5083e);
        return appmetrica == EnumC2821e.f6782e ? appmetrica : Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.AbstractC9910e
    public final AbstractC9910e billing(InterfaceC8850e interfaceC8850e, int i, int i2) {
        return new C7567e(this.f15391e, this.f7111e, interfaceC8850e, i, i2);
    }
}
