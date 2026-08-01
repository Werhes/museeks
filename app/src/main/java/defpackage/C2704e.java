package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2704e {
    public static final C2704e appmetrica = new C2704e(EnumC10320e.f20365e, 0.0f, C7309e.f14955e, new AbstractC7185e(1, null));
    public final EnumC10320e ad;
    public final AbstractC7185e license;
    public final AbstractC16858e metrica;
    public final float vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C2704e(EnumC10320e enumC10320e, float f, Function0 function0, Function1 function1) {
        this.ad = enumC10320e;
        this.vip = f;
        this.metrica = (AbstractC16858e) function0;
        this.license = (AbstractC7185e) function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2704e)) {
            return false;
        }
        C2704e c2704e = (C2704e) obj;
        return this.ad == c2704e.ad && Float.compare(this.vip, c2704e.vip) == 0 && this.metrica.equals(c2704e.metrica) && this.license.equals(c2704e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + ((this.metrica.hashCode() + AbstractC1414e.license(this.ad.hashCode() * 31, this.vip, 31)) * 31);
    }

    public final String toString() {
        return "ScrollInfo(direction=" + this.ad + ", speedMultiplier=" + this.vip + ", maxScrollDistanceProvider=" + this.metrica + ", onScroll=" + this.license + ')';
    }
}
