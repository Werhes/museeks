package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0225e extends AbstractC16278e {
    public final C3953e ad;
    public final Integer appmetrica;
    public final C15768e license;
    public final C15768e metrica;
    public final ECPoint vip;

    public C0225e(C3953e c3953e, ECPoint eCPoint, C15768e c15768e, C15768e c15768e2, Integer num) {
        this.ad = c3953e;
        this.vip = eCPoint;
        this.metrica = c15768e;
        this.license = c15768e2;
        this.appmetrica = num;
    }

    public static void Signature(C10607e c10607e, Integer num) {
        C10607e c10607e2 = C10607e.license;
        if (c10607e.equals(c10607e2) || num != null) {
            if (c10607e.equals(c10607e2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + c10607e + " variant.");
        }
    }

    public static C0225e amazon(C3953e c3953e, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        C16149e c16149e = c3953e.ad;
        C10607e c10607e = c3953e.license;
        if (c16149e.equals(C16149e.appmetrica)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        Signature(c10607e, num);
        if (c16149e == C16149e.vip) {
            curve = AbstractC2827e.ad.getCurve();
        } else if (c16149e == C16149e.metrica) {
            curve = AbstractC2827e.vip.getCurve();
        } else {
            if (c16149e != C16149e.license) {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + c16149e);
            }
            curve = AbstractC2827e.metrica.getCurve();
        }
        AbstractC2827e.vip(eCPoint, curve);
        return new C0225e(c3953e, eCPoint, null, loadAd(c10607e, num), num);
    }

    public static C15768e loadAd(C10607e c10607e, Integer num) {
        if (c10607e == C10607e.license) {
            return AbstractC16176e.ad;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + c10607e);
        }
        if (c10607e == C10607e.metrica) {
            return AbstractC16176e.ad(num.intValue());
        }
        if (c10607e == C10607e.vip) {
            return AbstractC16176e.vip(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + c10607e);
    }

    public static C0225e smaato(C3953e c3953e, C15768e c15768e, Integer num) {
        C16149e c16149e = c3953e.ad;
        C10607e c10607e = c3953e.license;
        if (!c16149e.equals(C16149e.appmetrica)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        Signature(c10607e, num);
        if (c15768e.ad.length == 32) {
            return new C0225e(c3953e, null, c15768e, loadAd(c10607e, num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    @Override // defpackage.AbstractC16278e
    public final C15768e advert() {
        return this.license;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final Integer vip() {
        return this.appmetrica;
    }
}
