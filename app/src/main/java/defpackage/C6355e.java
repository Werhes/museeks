package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙّؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6355e {
    public final C4637e ad;
    public final int adcel;
    public final List appmetrica;
    public final int billing;
    public final C14677e license;
    public final Size metrica;
    public final InterfaceC12330e purchase;
    public final boolean startapp;
    public final int vip;
    public final Range yandex;

    public C6355e(C4637e c4637e, int i, Size size, C14677e c14677e, List list, InterfaceC12330e interfaceC12330e, int i2, Range range, boolean z, int i3) {
        this.ad = c4637e;
        this.vip = i;
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.metrica = size;
        if (c14677e == null) {
            throw new NullPointerException("Null dynamicRange");
        }
        this.license = c14677e;
        if (list == null) {
            throw new NullPointerException("Null captureTypes");
        }
        this.appmetrica = list;
        this.purchase = interfaceC12330e;
        this.billing = i2;
        if (range == null) {
            throw new NullPointerException("Null targetFrameRate");
        }
        this.yandex = range;
        this.startapp = z;
        this.adcel = i3;
    }

    public final boolean equals(Object obj) {
        InterfaceC12330e interfaceC12330e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6355e) {
            C6355e c6355e = (C6355e) obj;
            InterfaceC12330e interfaceC12330e2 = c6355e.purchase;
            if (this.ad.equals(c6355e.ad) && this.vip == c6355e.vip && this.metrica.equals(c6355e.metrica) && this.license.equals(c6355e.license) && this.appmetrica.equals(c6355e.appmetrica) && ((interfaceC12330e = this.purchase) != null ? interfaceC12330e.equals(interfaceC12330e2) : interfaceC12330e2 == null) && this.billing == c6355e.billing && this.yandex.equals(c6355e.yandex) && this.startapp == c6355e.startapp && this.adcel == c6355e.adcel) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica.hashCode()) * 1000003;
        InterfaceC12330e interfaceC12330e = this.purchase;
        return ((((((((hashCode ^ (interfaceC12330e == null ? 0 : interfaceC12330e.hashCode())) * 1000003) ^ this.billing) * 1000003) ^ this.yandex.hashCode()) * 1000003) ^ (this.startapp ? 1231 : 1237)) * 1000003) ^ this.adcel;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.ad);
        sb.append(", imageFormat=");
        sb.append(this.vip);
        sb.append(", size=");
        sb.append(this.metrica);
        sb.append(", dynamicRange=");
        sb.append(this.license);
        sb.append(", captureTypes=");
        sb.append(this.appmetrica);
        sb.append(", implementationOptions=");
        sb.append(this.purchase);
        sb.append(", sessionType=");
        sb.append(this.billing);
        sb.append(", targetFrameRate=");
        sb.append(this.yandex);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.startapp);
        sb.append(", customMaxFrameRate=");
        return AbstractC17861e.smaato(this.adcel, "}", sb);
    }
}
