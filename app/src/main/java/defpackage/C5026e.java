package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5026e extends AbstractC16278e {
    public final C12835e ad;
    public final Integer license;
    public final C15768e metrica;
    public final C15768e vip;

    public C5026e(C12835e c12835e, C15768e c15768e, C15768e c15768e2, Integer num) {
        this.ad = c12835e;
        this.vip = c15768e;
        this.metrica = c15768e2;
        this.license = num;
    }

    public static C5026e smaato(C12835e c12835e, C15768e c15768e, Integer num) {
        EllipticCurve curve;
        C15768e vip;
        C5709e c5709e = c12835e.license;
        C5709e c5709e2 = C5709e.license;
        if (!c5709e.equals(c5709e2) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + c5709e + " variant.");
        }
        if (c5709e.equals(c5709e2) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        C13903e c13903e = c12835e.ad;
        int length = c15768e.ad.length;
        String str = "Encoded public key byte length for " + c13903e + " must be %d, not " + length;
        C13903e c13903e2 = C13903e.purchase;
        C13903e c13903e3 = C13903e.appmetrica;
        C13903e c13903e4 = C13903e.license;
        if (c13903e == c13903e4) {
            if (length != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (c13903e == c13903e3) {
            if (length != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (c13903e == c13903e2) {
            if (length != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else {
            if (c13903e != C13903e.billing) {
                throw new GeneralSecurityException("Unable to validate public key length for " + c13903e);
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        if (c13903e == c13903e4 || c13903e == c13903e3 || c13903e == c13903e2) {
            if (c13903e == c13903e4) {
                curve = AbstractC2827e.ad.getCurve();
            } else if (c13903e == c13903e3) {
                curve = AbstractC2827e.vip.getCurve();
            } else {
                if (c13903e != c13903e2) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + c13903e);
                }
                curve = AbstractC2827e.metrica.getCurve();
            }
            AbstractC2827e.vip(AbstractC16091e.inmobi(curve, EnumC1901e.f5061e, c15768e.vip()), curve);
        }
        if (c5709e == c5709e2) {
            vip = AbstractC16176e.ad;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + c5709e);
            }
            if (c5709e == C5709e.metrica) {
                vip = AbstractC16176e.ad(num.intValue());
            } else {
                if (c5709e != C5709e.vip) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + c5709e);
                }
                vip = AbstractC16176e.vip(num.intValue());
            }
        }
        return new C5026e(c12835e, c15768e, vip, num);
    }

    @Override // defpackage.AbstractC16278e
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
