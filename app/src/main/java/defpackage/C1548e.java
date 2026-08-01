package defpackage;

import java.math.BigInteger;
import java.util.HashMap;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1548e {
    public final BigInteger ad;
    public final long metrica;
    public final C7056e vip;

    public C1548e(C7056e c7056e, long j, BigInteger bigInteger) {
        if (c7056e == null) {
            throw new IllegalArgumentException("GUID must not be null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Position of header can't be negative.");
        }
        if (bigInteger == null || bigInteger.compareTo(BigInteger.ZERO) < 0) {
            throw new IllegalArgumentException("chunkLen must not be null nor negative.");
        }
        this.vip = c7056e;
        this.metrica = j;
        this.ad = bigInteger;
    }

    public String ad(String str) {
        StringBuilder isPro = AbstractC8703e.isPro(str, "-> GUID: ");
        C7056e c7056e = this.vip;
        if (c7056e == null) {
            C7056e c7056e2 = C7056e.license;
            throw new IllegalArgumentException("Argument must not be null.");
        }
        HashMap hashMap = C7056e.amazon;
        isPro.append(((C7056e) hashMap.get(c7056e)) != null ? ((C7056e) hashMap.get(c7056e)).ad : null);
        String str2 = AbstractC12394e.ad;
        isPro.append(str2);
        isPro.append(str);
        isPro.append("  | : Starts at position: ");
        long j = this.metrica;
        isPro.append(j);
        isPro.append(str2);
        isPro.append(str);
        isPro.append("  | : Last byte at: ");
        return AbstractC5087e.m1750native((this.ad.longValue() + j) - 1, str2, isPro);
    }

    public final String toString() {
        return ad(BuildConfig.FLAVOR);
    }
}
