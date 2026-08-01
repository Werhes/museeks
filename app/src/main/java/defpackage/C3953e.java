package defpackage;

import j$.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3953e extends AbstractC0301e {
    public static final Set billing;
    public final C16149e ad;
    public final AbstractC12699e appmetrica;
    public final C10607e license;
    public final C13194e metrica;
    public final C15768e purchase;
    public final C1906e vip;

    static {
        C5275e c5275e = new C5275e(12);
        int i = C14803e.f29331e;
        try {
            billing = (Set) c5275e.ad();
        } catch (Exception e) {
            throw new C14803e(e, 14);
        }
    }

    public C3953e(C16149e c16149e, C1906e c1906e, C13194e c13194e, AbstractC12699e abstractC12699e, C10607e c10607e, C15768e c15768e) {
        this.ad = c16149e;
        this.vip = c1906e;
        this.metrica = c13194e;
        this.appmetrica = abstractC12699e;
        this.license = c10607e;
        this.purchase = c15768e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِّؔ] */
    public static C2532e vip() {
        ?? obj = new Object();
        obj.f6388e = null;
        obj.f6386e = null;
        obj.f6385e = null;
        obj.f6387e = null;
        obj.f6384e = C10607e.license;
        obj.f6389e = null;
        return obj;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.license != C10607e.license;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3953e)) {
            return false;
        }
        C3953e c3953e = (C3953e) obj;
        return Objects.equals(c3953e.ad, this.ad) && Objects.equals(c3953e.vip, this.vip) && Objects.equals(c3953e.metrica, this.metrica) && Objects.equals(c3953e.appmetrica, this.appmetrica) && Objects.equals(c3953e.license, this.license) && Objects.equals(c3953e.purchase, this.purchase);
    }

    public final int hashCode() {
        return Objects.hash(C3953e.class, this.ad, this.vip, this.metrica, this.appmetrica, this.license, this.purchase);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.ad, this.vip, this.metrica, this.appmetrica, this.license, this.purchase);
    }
}
