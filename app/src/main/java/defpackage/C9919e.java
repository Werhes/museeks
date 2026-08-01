package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9919e {
    public static final C9919e appmetrica;
    public static final C9919e purchase;
    public final boolean ad;
    public final String[] license;
    public final String[] metrica;
    public final boolean vip;

    static {
        C6893e c6893e = C6893e.subscription;
        C6893e c6893e2 = C6893e.remoteconfig;
        C6893e c6893e3 = C6893e.pro;
        C6893e c6893e4 = C6893e.advert;
        C6893e c6893e5 = C6893e.amazon;
        C6893e c6893e6 = C6893e.smaato;
        C6893e c6893e7 = C6893e.loadAd;
        C6893e c6893e8 = C6893e.admob;
        C6893e c6893e9 = C6893e.Signature;
        List startapp = AbstractC6874e.startapp(c6893e, c6893e2, c6893e3, c6893e4, c6893e5, c6893e6, c6893e7, c6893e8, c6893e9);
        List startapp2 = AbstractC6874e.startapp(c6893e, c6893e2, c6893e3, c6893e4, c6893e5, c6893e6, c6893e7, c6893e8, c6893e9, C6893e.adcel, C6893e.mopub, C6893e.yandex, C6893e.startapp, C6893e.purchase, C6893e.billing, C6893e.appmetrica);
        C0142e c0142e = new C0142e();
        C6893e[] c6893eArr = (C6893e[]) startapp.toArray(new C6893e[0]);
        c0142e.vip((C6893e[]) Arrays.copyOf(c6893eArr, c6893eArr.length));
        EnumC17692e enumC17692e = EnumC17692e.TLS_1_3;
        EnumC17692e enumC17692e2 = EnumC17692e.TLS_1_2;
        c0142e.purchase(enumC17692e, enumC17692e2);
        c0142e.f1374e = true;
        c0142e.ad();
        C0142e c0142e2 = new C0142e();
        C6893e[] c6893eArr2 = (C6893e[]) startapp2.toArray(new C6893e[0]);
        c0142e2.vip((C6893e[]) Arrays.copyOf(c6893eArr2, c6893eArr2.length));
        c0142e2.purchase(enumC17692e, enumC17692e2);
        c0142e2.f1374e = true;
        appmetrica = c0142e2.ad();
        C0142e c0142e3 = new C0142e();
        C6893e[] c6893eArr3 = (C6893e[]) startapp2.toArray(new C6893e[0]);
        c0142e3.vip((C6893e[]) Arrays.copyOf(c6893eArr3, c6893eArr3.length));
        c0142e3.purchase(enumC17692e, enumC17692e2, EnumC17692e.TLS_1_1, EnumC17692e.TLS_1_0);
        c0142e3.f1374e = true;
        c0142e3.ad();
        purchase = new C9919e(false, false, null, null);
    }

    public C9919e(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.ad = z;
        this.vip = z2;
        this.metrica = strArr;
        this.license = strArr2;
    }

    public final void ad(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        String[] strArr = this.metrica;
        if (strArr != null) {
            enabledCipherSuites = AbstractC10220e.adcel(strArr, enabledCipherSuites, C6893e.metrica);
        }
        String[] strArr2 = this.license;
        String[] adcel = strArr2 != null ? AbstractC10220e.adcel(sSLSocket.getEnabledProtocols(), strArr2, C4992e.f10568e) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        C11021e c11021e = C6893e.metrica;
        byte[] bArr = AbstractC10220e.ad;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (c11021e.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.ad;
        if (!z2) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr3.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(adcel, adcel.length);
        if (!z2) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr5.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        C9919e c9919e = new C9919e(z2, this.vip, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (c9919e.metrica() != null) {
            sSLSocket.setEnabledProtocols(c9919e.license);
        }
        if (c9919e.vip() != null) {
            sSLSocket.setEnabledCipherSuites(c9919e.metrica);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9919e)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C9919e c9919e = (C9919e) obj;
        boolean z = c9919e.ad;
        boolean z2 = this.ad;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.metrica, c9919e.metrica) && Arrays.equals(this.license, c9919e.license) && this.vip == c9919e.vip;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.ad) {
            return 17;
        }
        String[] strArr = this.metrica;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.license;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.vip ? 1 : 0);
    }

    public final ArrayList metrica() {
        String[] strArr = this.license;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(AbstractC5729e.metrica(str));
        }
        return arrayList;
    }

    public final String toString() {
        if (!this.ad) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(vip(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(metrica(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return AbstractC1786e.isVip(sb, this.vip, ')');
    }

    public final ArrayList vip() {
        String[] strArr = this.metrica;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C6893e.vip.smaato(str));
        }
        return arrayList;
    }
}
