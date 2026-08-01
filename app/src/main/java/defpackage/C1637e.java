package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1637e {
    public final int ad;
    public final Function1 appmetrica;
    public final boolean license;
    public final boolean metrica;
    public final int vip;

    public C1637e(int i, int i2, boolean z, boolean z2, Function1 function1) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
        this.license = z2;
        this.appmetrica = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1637e)) {
            return false;
        }
        C1637e c1637e = (C1637e) obj;
        return this.ad == c1637e.ad && this.vip == c1637e.vip && this.metrica == c1637e.metrica && this.license == c1637e.license && this.appmetrica.equals(c1637e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + (((((((this.ad * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237)) * 31) + (this.license ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "Button(icon=" + this.ad + ", name=" + this.vip + ", accented=" + this.metrica + ", plusGray=" + this.license + ", clickAction=" + this.appmetrica + ')';
    }
}
