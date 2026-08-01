package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۡؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3679e extends AbstractC3004e {
    public final C0631e ad;
    public final Integer license;
    public final C15768e metrica;
    public final C17974e vip;

    public C3679e(C0631e c0631e, C17974e c17974e, C15768e c15768e, Integer num) {
        this.ad = c0631e;
        this.vip = c17974e;
        this.metrica = c15768e;
        this.license = num;
    }

    public static C3679e smaato(C14911e c14911e, C17974e c17974e, Integer num) {
        C15768e vip;
        C15768e c15768e = (C15768e) c17974e.f35233e;
        C14911e c14911e2 = C14911e.f29549e;
        if (c14911e != c14911e2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c14911e + " the value of idRequirement must be non-null");
        }
        if (c14911e == c14911e2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c15768e.ad.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + c15768e.ad.length);
        }
        C0631e c0631e = new C0631e(c14911e);
        if (c14911e == c14911e2) {
            vip = AbstractC16176e.ad;
        } else if (c14911e == C14911e.f29546e) {
            vip = AbstractC16176e.ad(num.intValue());
        } else {
            if (c14911e != C14911e.f29548e) {
                throw new IllegalStateException("Unknown Variant: " + c14911e);
            }
            vip = AbstractC16176e.vip(num.intValue());
        }
        return new C3679e(c0631e, c17974e, vip, num);
    }

    @Override // defpackage.AbstractC3004e
    public final C15768e advert() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.license;
    }
}
