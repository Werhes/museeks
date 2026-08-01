package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٜٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9596e implements InterfaceC16897e {
    public final Function1 ad;
    public final String vip;

    public AbstractC9596e(String str, Function1 function1) {
        this.ad = function1;
        this.vip = "must return ".concat(str);
    }

    @Override // defpackage.InterfaceC16897e
    public final /* bridge */ String license(C0782e c0782e) {
        return AbstractC10681e.vip(this, c0782e);
    }

    @Override // defpackage.InterfaceC16897e
    public final boolean metrica(C0782e c0782e) {
        return AbstractC7890e.billing(c0782e.f29665e, this.ad.invoke(AbstractC2876e.appmetrica(c0782e)));
    }

    @Override // defpackage.InterfaceC16897e
    public final String vip() {
        return this.vip;
    }
}
