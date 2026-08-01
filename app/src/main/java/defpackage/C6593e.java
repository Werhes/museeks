package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: eؙٜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6593e extends C13572e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f13604e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f13605e;

    public C6593e(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(i, secureRandom);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.f13605e = bigInteger;
        this.f13604e = i2;
    }
}
