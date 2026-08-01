package defpackage;

import java.math.BigInteger;

/* renamed from: eؙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16833e implements InterfaceC4563e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final BigInteger f32971e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC9932e f32972e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f32973e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BigInteger f32974e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC0362e f32975e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public BigInteger f32976e;

    public C16833e(AbstractC0362e abstractC0362e, AbstractC9932e abstractC9932e, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f32976e = null;
        if (abstractC0362e == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.f32975e = abstractC0362e;
        this.f32972e = ad(abstractC0362e, abstractC9932e);
        this.f32974e = bigInteger;
        this.f32971e = bigInteger2;
        this.f32973e = AbstractC12442e.license(bArr);
    }

    public C16833e(C9300e c9300e) {
        this(c9300e.f18531e.f34438e, c9300e.f18530e.loadAd(), c9300e.f18532e, c9300e.f18529e, c9300e.Signature());
    }

    public static AbstractC9932e ad(AbstractC0362e abstractC0362e, AbstractC9932e abstractC9932e) {
        if (abstractC9932e == null) {
            throw new NullPointerException("Point cannot be null");
        }
        if (!abstractC0362e.startapp(abstractC9932e.ad)) {
            throw new IllegalArgumentException("Point must be on the same curve");
        }
        AbstractC9932e Signature = abstractC0362e.amazon(abstractC9932e).Signature();
        if (Signature.advert()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (Signature.mopub(false, true)) {
            return Signature;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16833e)) {
            return false;
        }
        C16833e c16833e = (C16833e) obj;
        return this.f32975e.startapp(c16833e.f32975e) && this.f32972e.license(c16833e.f32972e) && this.f32974e.equals(c16833e.f32974e);
    }

    public final int hashCode() {
        return ((((this.f32975e.hashCode() ^ 1028) * 257) ^ this.f32972e.hashCode()) * 257) ^ this.f32974e.hashCode();
    }
}
