package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5453e {
    public final Size ad;
    public final boolean appmetrica;
    public final int license;
    public final InterfaceC2881e metrica;
    public final Rect vip;

    public C5453e(Size size, Rect rect, InterfaceC2881e interfaceC2881e, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.ad = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.vip = rect;
        this.metrica = interfaceC2881e;
        this.license = i;
        this.appmetrica = z;
    }

    public final boolean equals(Object obj) {
        InterfaceC2881e interfaceC2881e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5453e) {
            C5453e c5453e = (C5453e) obj;
            InterfaceC2881e interfaceC2881e2 = c5453e.metrica;
            if (this.ad.equals(c5453e.ad) && this.vip.equals(c5453e.vip) && ((interfaceC2881e = this.metrica) != null ? interfaceC2881e.equals(interfaceC2881e2) : interfaceC2881e2 == null) && this.license == c5453e.license && this.appmetrica == c5453e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003;
        InterfaceC2881e interfaceC2881e = this.metrica;
        return ((((hashCode ^ (interfaceC2881e == null ? 0 : interfaceC2881e.hashCode())) * 1000003) ^ this.license) * 1000003) ^ (this.appmetrica ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.ad);
        sb.append(", inputCropRect=");
        sb.append(this.vip);
        sb.append(", cameraInternal=");
        sb.append(this.metrica);
        sb.append(", rotationDegrees=");
        sb.append(this.license);
        sb.append(", mirroring=");
        return AbstractC8703e.signatures(sb, this.appmetrica, "}");
    }
}
