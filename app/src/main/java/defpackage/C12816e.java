package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12816e {
    public static final C12816e metrica = new C12816e(BuildConfig.FLAVOR);
    public final C13579e ad;
    public transient C12816e vip;

    public C12816e(C13579e c13579e) {
        this.ad = c13579e;
    }

    public C12816e(C13579e c13579e, C12816e c12816e) {
        this.ad = c13579e;
        this.vip = c12816e;
    }

    public C12816e(String str) {
        this.ad = new C13579e(this, str);
    }

    public final C12816e ad(C0520e c0520e) {
        return new C12816e(this.ad.ad(c0520e), this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12816e) {
            return AbstractC7890e.billing(this.ad, ((C12816e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.ad.hashCode();
    }

    public final String toString() {
        return this.ad.toString();
    }

    public final C12816e vip() {
        C12816e c12816e = this.vip;
        if (c12816e != null) {
            return c12816e;
        }
        C13579e c13579e = this.ad;
        if (c13579e.metrica()) {
            throw new IllegalStateException("root");
        }
        C12816e c12816e2 = new C12816e(c13579e.appmetrica());
        this.vip = c12816e2;
        return c12816e2;
    }
}
