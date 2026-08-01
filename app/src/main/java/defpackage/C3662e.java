package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؕ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3662e {
    public final int ad;
    public final Function1 metrica;
    public final String vip;

    public C3662e(int i, String str, Function1 function1) {
        this.ad = i;
        this.vip = str;
        this.metrica = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3662e)) {
            return false;
        }
        C3662e c3662e = (C3662e) obj;
        return this.ad == c3662e.ad && AbstractC7890e.billing(this.vip, c3662e.vip) && this.metrica.equals(c3662e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + AbstractC1786e.advert(this.ad * 31, 31, this.vip);
    }

    public final String toString() {
        return "Element(icon=" + this.ad + ", name=" + this.vip + ", clickAction=" + this.metrica + ')';
    }
}
