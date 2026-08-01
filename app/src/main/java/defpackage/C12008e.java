package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۜۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12008e extends AbstractC11130e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static C12008e f24007e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C6071e f24008e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C12476e f24009e;

    @Override // defpackage.AbstractC11130e
    /* renamed from: const */
    public final int[] mo450const(int i) {
        int i2;
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            String str2 = (String) this.f22047e;
            if (str2 == null) {
                str2 = null;
            }
            if (i < str2.length()) {
                try {
                    C6071e c6071e = this.f24008e;
                    if (c6071e == null) {
                        c6071e = null;
                    }
                    C0763e billing = c6071e.billing();
                    int round = Math.round(billing.license - billing.vip);
                    if (i <= 0) {
                        i = 0;
                    }
                    C12476e c12476e = this.f24009e;
                    if (c12476e == null) {
                        c12476e = null;
                    }
                    int license = c12476e.vip.license(i);
                    C12476e c12476e2 = this.f24009e;
                    if (c12476e2 == null) {
                        c12476e2 = null;
                    }
                    float purchase = c12476e2.vip.purchase(license) + round;
                    C12476e c12476e3 = this.f24009e;
                    C12476e c12476e4 = c12476e3 == null ? null : c12476e3;
                    if (c12476e3 == null) {
                        c12476e3 = null;
                    }
                    if (purchase < c12476e4.vip.purchase(c12476e3.vip.purchase - 1)) {
                        C12476e c12476e5 = this.f24009e;
                        i2 = (c12476e5 != null ? c12476e5 : null).vip.appmetrica(purchase);
                    } else {
                        C12476e c12476e6 = this.f24009e;
                        i2 = (c12476e6 != null ? c12476e6 : null).vip.purchase;
                    }
                    return m3033e(i, m3310e(i2 - 1, 1) + 1);
                } catch (IllegalStateException unused) {
                }
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eًٓؓ */
    public final int[] mo454e(int i) {
        int i2;
        String str = (String) this.f22047e;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0 && i > 0) {
            try {
                C6071e c6071e = this.f24008e;
                if (c6071e == null) {
                    c6071e = null;
                }
                C0763e billing = c6071e.billing();
                int round = Math.round(billing.license - billing.vip);
                String str2 = (String) this.f22047e;
                if (str2 == null) {
                    str2 = null;
                }
                int length = str2.length();
                if (length <= i) {
                    i = length;
                }
                C12476e c12476e = this.f24009e;
                if (c12476e == null) {
                    c12476e = null;
                }
                int license = c12476e.vip.license(i);
                C12476e c12476e2 = this.f24009e;
                if (c12476e2 == null) {
                    c12476e2 = null;
                }
                float purchase = c12476e2.vip.purchase(license) - round;
                if (purchase > 0.0f) {
                    C12476e c12476e3 = this.f24009e;
                    if (c12476e3 == null) {
                        c12476e3 = null;
                    }
                    i2 = c12476e3.vip.appmetrica(purchase);
                } else {
                    i2 = 0;
                }
                String str3 = (String) this.f22047e;
                if (i == (str3 != null ? str3 : null).length() && i2 < license) {
                    i2++;
                }
                return m3033e(m3310e(i2, 2), i);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final int m3310e(int i, int i2) {
        C12476e c12476e = this.f24009e;
        if (c12476e == null) {
            c12476e = null;
        }
        int startapp = c12476e.startapp(i);
        C12476e c12476e2 = this.f24009e;
        if (c12476e2 == null) {
            c12476e2 = null;
        }
        if (i2 != c12476e2.adcel(startapp)) {
            C12476e c12476e3 = this.f24009e;
            return (c12476e3 != null ? c12476e3 : null).startapp(i);
        }
        return C12476e.purchase(this.f24009e != null ? r5 : null, i) - 1;
    }
}
