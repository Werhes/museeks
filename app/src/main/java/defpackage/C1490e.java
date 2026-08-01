package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1490e {
    public final int ad;
    public final Function1 license;
    public final boolean metrica;
    public final int vip;

    public C1490e(int i, int i2, boolean z, Function1 function1) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
        this.license = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1490e)) {
            return false;
        }
        C1490e c1490e = (C1490e) obj;
        return this.ad == c1490e.ad && this.vip == c1490e.vip && this.metrica == c1490e.metrica && this.license.equals(c1490e.license);
    }

    public final int hashCode() {
        return this.license.hashCode() + (((((this.ad * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Action(icon=" + this.ad + ", name=" + this.vip + ", plusGray=" + this.metrica + ", clickAction=" + this.license + ')';
    }
}
