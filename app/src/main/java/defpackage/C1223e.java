package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1223e {
    public final AbstractC16858e ad;
    public final InterfaceC6512e vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C1223e(Function1 function1, InterfaceC6512e interfaceC6512e) {
        this.ad = (AbstractC16858e) function1;
        this.vip = interfaceC6512e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1223e)) {
            return false;
        }
        C1223e c1223e = (C1223e) obj;
        return this.ad.equals(c1223e.ad) && this.vip.equals(c1223e.vip);
    }

    public final int hashCode() {
        return this.vip.hashCode() + (this.ad.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.ad + ", animationSpec=" + this.vip + ')';
    }
}
