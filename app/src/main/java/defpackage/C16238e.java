package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16238e extends AbstractC15702e {
    public final C5026e ad;
    public final C17974e vip;

    public C16238e(C5026e c5026e, C17974e c17974e) {
        this.ad = c5026e;
        this.vip = c17974e;
    }

    public static C16238e amazon(C5026e c5026e, C17974e c17974e) {
        ECParameterSpec eCParameterSpec;
        C12835e c12835e = c5026e.ad;
        C15768e c15768e = (C15768e) c17974e.f35233e;
        C13903e c13903e = c12835e.ad;
        int length = c15768e.ad.length;
        String str = "Encoded private key byte length for " + c13903e + " must be %d, not " + length;
        C13903e c13903e2 = C13903e.billing;
        C13903e c13903e3 = C13903e.purchase;
        C13903e c13903e4 = C13903e.appmetrica;
        C13903e c13903e5 = C13903e.license;
        if (c13903e == c13903e5) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (c13903e == c13903e4) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (c13903e == c13903e3) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (c13903e != c13903e2) {
                throw new GeneralSecurityException("Unable to validate private key length for " + c13903e);
            }
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        byte[] vip = c5026e.vip.vip();
        byte[] vip2 = c15768e.vip();
        if (c13903e == c13903e5 || c13903e == c13903e4 || c13903e == c13903e3) {
            if (c13903e == c13903e5) {
                eCParameterSpec = AbstractC2827e.ad;
            } else if (c13903e == c13903e4) {
                eCParameterSpec = AbstractC2827e.vip;
            } else {
                if (c13903e != c13903e3) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + c13903e);
                }
                eCParameterSpec = AbstractC2827e.metrica;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger vip3 = AbstractC7354e.vip(vip2);
            if (vip3.signum() <= 0 || vip3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!AbstractC2827e.billing(vip3, eCParameterSpec).equals(AbstractC16091e.inmobi(eCParameterSpec.getCurve(), EnumC1901e.f5061e, vip))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (c13903e != c13903e2) {
                throw new IllegalArgumentException("Unable to validate key pair for " + c13903e);
            }
            if (!Arrays.equals(AbstractC14437e.adcel(vip2), vip)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new C16238e(c5026e, c17974e);
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
