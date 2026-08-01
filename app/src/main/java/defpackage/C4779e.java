package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4779e implements InterfaceC6502e {
    public final Function1 ad;

    public C4779e(Function1 function1) {
        this.ad = function1;
    }

    @Override // defpackage.InterfaceC6502e
    public final Object ad(InterfaceC3483e interfaceC3483e) {
        return this.ad.invoke(interfaceC3483e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4779e) && AbstractC7890e.billing(this.ad, ((C4779e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.ad + ')';
    }
}
