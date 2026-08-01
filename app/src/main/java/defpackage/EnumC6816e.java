package defpackage;

import java.math.BigInteger;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۧۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC6816e {
    CONTENT_BRANDING(C7056e.license, 32, false, false, false, false),
    CONTENT_DESCRIPTION(C7056e.appmetrica, 16, false, false, false, false),
    EXTENDED_CONTENT(C7056e.purchase, 16, false, false, false, false),
    METADATA_LIBRARY_OBJECT(C7056e.mopub, 32, true, true, true, true),
    METADATA_OBJECT(C7056e.adcel, 16, false, true, false, true);


    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f14041e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final BigInteger f14042e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f14043e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f14044e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C7056e f14045e;

    EnumC6816e(C7056e c7056e, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f14045e = c7056e;
        BigInteger subtract = BigInteger.valueOf(2L).pow(i).subtract(BigInteger.ONE);
        this.f14042e = subtract;
        if (subtract.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
            this.f14041e = subtract.longValue();
        } else {
            this.f14041e = -1L;
        }
        this.f14043e = z;
        this.f14044e = z4;
    }

    public final IllegalArgumentException ad(String str, byte[] bArr, int i) {
        IllegalArgumentException illegalArgumentException;
        if (str == null || bArr == null) {
            illegalArgumentException = new IllegalArgumentException("Arguments must not be null.");
        } else {
            String str2 = AbstractC12394e.ad;
            if (str.length() > 32766) {
                Locale.getDefault();
                illegalArgumentException = new IllegalArgumentException(AbstractC1634e.smaato("Trying to create field but UTF-16LE representation is ", str.length(), " and exceeds maximum allowed of 65535."));
            } else {
                illegalArgumentException = null;
            }
        }
        C7056e c7056e = this.f14045e;
        if (illegalArgumentException == null) {
            long length = bArr.length;
            long j = this.f14041e;
            if ((j != -1 && j < length) || length < 0) {
                illegalArgumentException = new IllegalArgumentException(String.format(Locale.getDefault(), "Trying to create field with %s bytes of data but the maximum data allowed in WMA files is %s for %s.", Integer.valueOf(bArr.length), this.f14042e, c7056e.ad));
            }
        }
        if (illegalArgumentException == null && i == 6 && !this.f14043e) {
            Locale.getDefault();
            illegalArgumentException = new IllegalArgumentException(AbstractC17861e.Signature("The use of GUID ist not allowed for ", c7056e.ad));
        }
        return (illegalArgumentException == null && this == CONTENT_DESCRIPTION && i != 0) ? new IllegalArgumentException("Only Strings are allowed in content description objects") : illegalArgumentException;
    }
}
