package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3138e {
    public final int ad;
    public final Function1 appmetrica;
    public final Function0 license;
    public final int metrica;
    public final int vip;

    public C3138e(int i, int i2, int i3, Function0 function0, Function1 function1) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = function0;
        this.appmetrica = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3138e)) {
            return false;
        }
        C3138e c3138e = (C3138e) obj;
        return this.ad == c3138e.ad && this.vip == c3138e.vip && this.metrica == c3138e.metrica && this.license.equals(c3138e.license) && this.appmetrica.equals(c3138e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((this.license.hashCode() + (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31)) * 31);
    }

    public final String toString() {
        return "Effect(icon=" + this.ad + ", title=" + this.vip + ", description=" + this.metrica + ", navigateTo=" + this.license + ", isEnabled=" + this.appmetrica + ')';
    }
}
