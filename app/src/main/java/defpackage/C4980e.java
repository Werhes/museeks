package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٙ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4980e {
    public final InterfaceC8079e ad;
    public final InterfaceC6512e metrica;
    public final Function1 vip;

    public C4980e(InterfaceC8079e interfaceC8079e, InterfaceC6512e interfaceC6512e, Function1 function1) {
        this.ad = interfaceC8079e;
        this.vip = function1;
        this.metrica = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4980e)) {
            return false;
        }
        C4980e c4980e = (C4980e) obj;
        return AbstractC7890e.billing(this.ad, c4980e.ad) && AbstractC7890e.billing(this.vip, c4980e.vip) && AbstractC7890e.billing(this.metrica, c4980e.metrica);
    }

    public final int hashCode() {
        return ((this.metrica.hashCode() + ((this.vip.hashCode() + (this.ad.hashCode() * 31)) * 31)) * 31) + 1231;
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.ad + ", size=" + this.vip + ", animationSpec=" + this.metrica + ", clip=true)";
    }
}
