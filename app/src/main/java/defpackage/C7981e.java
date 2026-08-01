package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7981e {
    public final int ad;
    public final Function1 metrica;
    public final int vip;

    public C7981e(int i, int i2, Function1 function1) {
        this.ad = i;
        this.vip = i2;
        this.metrica = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7981e)) {
            return false;
        }
        C7981e c7981e = (C7981e) obj;
        return this.ad == c7981e.ad && this.vip == c7981e.vip && this.metrica.equals(c7981e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (((this.ad * 31) + this.vip) * 31);
    }

    public final String toString() {
        return "SuggestedAction(name=" + this.ad + ", icon=" + this.vip + ", onClick=" + this.metrica + ')';
    }
}
