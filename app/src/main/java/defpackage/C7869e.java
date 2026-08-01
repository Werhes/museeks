package defpackage;

import android.util.Base64;
import java.util.Arrays;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7869e {
    public final String ad;
    public final EnumC6651e metrica;
    public final byte[] vip;

    public C7869e(String str, byte[] bArr, EnumC6651e enumC6651e) {
        this.ad = str;
        this.vip = bArr;
        this.metrica = enumC6651e;
    }

    public static C12894e ad() {
        C12894e c12894e = new C12894e(6, false);
        c12894e.f25752e = EnumC6651e.f13723e;
        return c12894e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7869e) {
            C7869e c7869e = (C7869e) obj;
            if (this.ad.equals(c7869e.ad) && Arrays.equals(this.vip, c7869e.vip) && this.metrica.equals(c7869e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.ad.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.vip)) * 1000003) ^ this.metrica.hashCode();
    }

    public final String toString() {
        byte[] bArr = this.vip;
        String encodeToString = bArr == null ? BuildConfig.FLAVOR : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.ad);
        sb.append(", ");
        sb.append(this.metrica);
        sb.append(", ");
        return AbstractC1786e.signatures(sb, encodeToString, ")");
    }

    public final C7869e vip(EnumC6651e enumC6651e) {
        C12894e ad = ad();
        ad.crashlytics(this.ad);
        if (enumC6651e == null) {
            throw new NullPointerException("Null priority");
        }
        ad.f25752e = enumC6651e;
        ad.f25750e = this.vip;
        return ad.startapp();
    }
}
