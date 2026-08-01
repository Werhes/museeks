package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2732e extends AbstractC15702e {
    public final C0225e ad;
    public final C17974e metrica;
    public final C5389e vip;

    public C2732e(C0225e c0225e, C5389e c5389e, C17974e c17974e) {
        this.ad = c0225e;
        this.vip = c5389e;
        this.metrica = c17974e;
    }

    public static ECParameterSpec Signature(C16149e c16149e) {
        if (c16149e == C16149e.vip) {
            return AbstractC2827e.ad;
        }
        if (c16149e == C16149e.metrica) {
            return AbstractC2827e.vip;
        }
        if (c16149e == C16149e.license) {
            return AbstractC2827e.metrica;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + c16149e);
    }

    public static C2732e amazon(C0225e c0225e, C17974e c17974e) {
        C15768e c15768e = c0225e.metrica;
        if (c15768e == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        byte[] vip = ((C15768e) c17974e.f35233e).vip();
        byte[] vip2 = c15768e.vip();
        if (vip.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(AbstractC14437e.adcel(vip), vip2)) {
            return new C2732e(c0225e, null, c17974e);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static C2732e loadAd(C0225e c0225e, C5389e c5389e) {
        ECPoint eCPoint = c0225e.vip;
        if (eCPoint == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        }
        BigInteger bigInteger = (BigInteger) c5389e.f11540e;
        C16149e c16149e = c0225e.ad.ad;
        BigInteger order = Signature(c16149e).getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (AbstractC2827e.billing(bigInteger, Signature(c16149e)).equals(eCPoint)) {
            return new C2732e(c0225e, c5389e, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    @Override // defpackage.AbstractC15702e
    public final AbstractC16278e advert() {
        return this.ad;
    }

    @Override // defpackage.AbstractC14783e
    public final AbstractC12699e metrica() {
        return this.ad.ad;
    }

    @Override // defpackage.AbstractC15702e
    public final AbstractC14783e smaato() {
        return this.ad;
    }
}
