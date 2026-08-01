package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۤۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5251e {
    public static final C5251e appmetrica = new C11226e(0).license();
    public static final String billing;
    public static final String purchase;
    public static final String startapp;
    public static final String yandex;
    public final int ad;
    public final String license;
    public final int metrica;
    public final int vip;

    static {
        String str = AbstractC9413e.ad;
        purchase = Integer.toString(0, 36);
        billing = Integer.toString(1, 36);
        yandex = Integer.toString(2, 36);
        startapp = Integer.toString(3, 36);
    }

    public C5251e(C11226e c11226e) {
        this.ad = c11226e.vip;
        this.vip = c11226e.metrica;
        this.metrica = c11226e.license;
        this.license = (String) c11226e.appmetrica;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5251e)) {
            return false;
        }
        C5251e c5251e = (C5251e) obj;
        return this.ad == c5251e.ad && this.vip == c5251e.vip && this.metrica == c5251e.metrica && Objects.equals(this.license, c5251e.license);
    }

    public final int hashCode() {
        int i = (((((527 + this.ad) * 31) + this.vip) * 31) + this.metrica) * 31;
        String str = this.license;
        return i + (str == null ? 0 : str.hashCode());
    }
}
