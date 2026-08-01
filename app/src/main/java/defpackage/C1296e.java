package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296e implements InterfaceC16104e {
    public final int ad;
    public final C0194e appmetrica;
    public final List license;
    public final List metrica;
    public final C1900e purchase;
    public final int vip;

    public C1296e(int i, int i2, List list, List list2, C0194e c0194e, C1900e c1900e) {
        this.ad = i;
        this.vip = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.metrica = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.license = list2;
        this.appmetrica = c0194e;
        if (c1900e == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.purchase = c1900e;
    }

    @Override // defpackage.InterfaceC16104e
    public final int ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        C0194e c0194e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1296e) {
            C1296e c1296e = (C1296e) obj;
            C0194e c0194e2 = c1296e.appmetrica;
            if (this.ad == c1296e.ad && this.vip == c1296e.vip && this.metrica.equals(c1296e.metrica) && this.license.equals(c1296e.license) && ((c0194e = this.appmetrica) != null ? c0194e.equals(c0194e2) : c0194e2 == null) && this.purchase.equals(c1296e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.ad ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003;
        C0194e c0194e = this.appmetrica;
        return ((hashCode ^ (c0194e == null ? 0 : c0194e.hashCode())) * 1000003) ^ this.purchase.hashCode();
    }

    @Override // defpackage.InterfaceC16104e
    public final List license() {
        return this.license;
    }

    @Override // defpackage.InterfaceC16104e
    public final List metrica() {
        return this.metrica;
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.ad + ", recommendedFileFormat=" + this.vip + ", audioProfiles=" + this.metrica + ", videoProfiles=" + this.license + ", defaultAudioProfile=" + this.appmetrica + ", defaultVideoProfile=" + this.purchase + "}";
    }

    @Override // defpackage.InterfaceC16104e
    public final int vip() {
        return this.vip;
    }
}
