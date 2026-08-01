package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14339e extends AbstractC14601e {
    public final AbstractC7185e ad;
    public final Long metrica;
    public final C1622e vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C14339e(Function2 function2, C1622e c1622e, Long l, int i) {
        l = (i & 8) != 0 ? null : l;
        this.ad = (AbstractC7185e) function2;
        this.vip = c1622e;
        this.metrica = l;
    }

    @Override // defpackage.AbstractC14601e
    public final Long ad() {
        return this.metrica;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    public final Object appmetrica(InterfaceC1618e interfaceC1618e, AbstractC7185e abstractC7185e) {
        Object invoke = this.ad.invoke(interfaceC1618e, abstractC7185e);
        return invoke == EnumC2821e.f6782e ? invoke : Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC14601e
    public final C2394e license() {
        return null;
    }

    @Override // defpackage.AbstractC14601e
    public final C1622e vip() {
        return this.vip;
    }
}
