package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7131e extends AbstractC3004e {
    public final C12393e ad;
    public final Integer license;
    public final C15768e metrica;
    public final C17974e vip;

    public C7131e(C12393e c12393e, C17974e c17974e, C15768e c15768e, Integer num) {
        this.ad = c12393e;
        this.vip = c17974e;
        this.metrica = c15768e;
        this.license = num;
    }

    public static C7131e smaato(C12393e c12393e, C17974e c17974e, Integer num) {
        C15768e vip;
        C15768e c15768e = (C15768e) c17974e.f35233e;
        C11278e c11278e = c12393e.ad;
        C11278e c11278e2 = C11278e.f22660e;
        if (c11278e != c11278e2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + c11278e + " the value of idRequirement must be non-null");
        }
        if (c11278e == c11278e2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (c15768e.ad.length != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + c15768e.ad.length);
        }
        if (c11278e == c11278e2) {
            vip = AbstractC16176e.ad;
        } else {
            if (c11278e != C11278e.f22661e) {
                throw new IllegalStateException("Unknown Variant: " + c11278e);
            }
            vip = AbstractC16176e.vip(num.intValue());
        }
        return new C7131e(c12393e, c17974e, vip, num);
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
