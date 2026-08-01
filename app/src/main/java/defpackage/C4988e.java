package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4988e {
    public static final C4988e billing;
    public final int ad;
    public final Boolean appmetrica;
    public final int license;
    public final int metrica;
    public final C4622e purchase;
    public final Boolean vip;

    static {
        int i = 0;
        billing = new C4988e(i, i, 127);
    }

    public /* synthetic */ C4988e(int i, int i2, int i3) {
        this(-1, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2, (i3 & 32) != 0 ? null : Boolean.TRUE, null);
    }

    public C4988e(int i, Boolean bool, int i2, int i3, Boolean bool2, C4622e c4622e) {
        this.ad = i;
        this.vip = bool;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = bool2;
        this.purchase = c4622e;
    }

    public final C4988e ad(C4988e c4988e) {
        if (c4988e == null || c4988e.metrica() || c4988e.equals(this)) {
            return this;
        }
        if (metrica()) {
            return c4988e;
        }
        int i = this.ad;
        C17625e c17625e = new C17625e(i);
        if (i == -1) {
            c17625e = null;
        }
        int i2 = c17625e != null ? c17625e.ad : c4988e.ad;
        Boolean bool = this.vip;
        if (bool == null) {
            bool = c4988e.vip;
        }
        Boolean bool2 = bool;
        int i3 = this.metrica;
        C3445e c3445e = new C3445e(i3);
        if (i3 == 0) {
            c3445e = null;
        }
        int i4 = c3445e != null ? c3445e.ad : c4988e.metrica;
        int i5 = this.license;
        C10120e c10120e = i5 != -1 ? new C10120e(i5) : null;
        int i6 = c10120e != null ? c10120e.ad : c4988e.license;
        Boolean bool3 = this.appmetrica;
        if (bool3 == null) {
            bool3 = c4988e.appmetrica;
        }
        Boolean bool4 = bool3;
        C4622e c4622e = this.purchase;
        if (c4622e == null) {
            c4622e = c4988e.purchase;
        }
        return new C4988e(i2, bool2, i4, i6, bool4, c4622e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4988e)) {
            return false;
        }
        C4988e c4988e = (C4988e) obj;
        return this.ad == c4988e.ad && AbstractC7890e.billing(this.vip, c4988e.vip) && this.metrica == c4988e.metrica && this.license == c4988e.license && AbstractC7890e.billing(this.appmetrica, c4988e.appmetrica) && AbstractC7890e.billing(this.purchase, c4988e.purchase);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        Boolean bool = this.vip;
        int hashCode = (((((i + (bool != null ? bool.hashCode() : 0)) * 31) + this.metrica) * 31) + this.license) * 961;
        Boolean bool2 = this.appmetrica;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C4622e c4622e = this.purchase;
        return hashCode2 + (c4622e != null ? c4622e.f9951e.hashCode() : 0);
    }

    public final C16174e license(boolean z) {
        int i = this.ad;
        C17625e c17625e = new C17625e(i);
        if (i == -1) {
            c17625e = null;
        }
        int i2 = c17625e != null ? c17625e.ad : 0;
        Boolean bool = this.vip;
        boolean booleanValue = bool != null ? bool.booleanValue() : true;
        int i3 = this.metrica;
        C3445e c3445e = i3 != 0 ? new C3445e(i3) : null;
        int i4 = c3445e != null ? c3445e.ad : 1;
        int vip = vip();
        C4622e c4622e = this.purchase;
        if (c4622e == null) {
            c4622e = C4622e.f9949e;
        }
        return new C16174e(z, i2, booleanValue, i4, vip, c4622e);
    }

    public final boolean metrica() {
        return this.ad == -1 && this.vip == null && this.metrica == 0 && this.license == -1 && this.appmetrica == null && this.purchase == null;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C17625e.ad(this.ad)) + ", autoCorrectEnabled=" + this.vip + ", keyboardType=" + ((Object) C3445e.ad(this.metrica)) + ", imeAction=" + ((Object) C10120e.ad(this.license)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.appmetrica + ", hintLocales=" + this.purchase + ')';
    }

    public final int vip() {
        int i = this.license;
        C10120e c10120e = new C10120e(i);
        if (i == -1) {
            c10120e = null;
        }
        if (c10120e != null) {
            return c10120e.ad;
        }
        return 1;
    }
}
