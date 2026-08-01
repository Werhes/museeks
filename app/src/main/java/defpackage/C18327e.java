package defpackage;

import android.util.Range;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18327e {
    public final int ad;
    public final boolean adcel;
    public final boolean appmetrica;
    public final boolean billing;
    public final int license;
    public final boolean metrica;
    public final boolean purchase;
    public final Range startapp;
    public final int vip;
    public final boolean yandex;

    public C18327e(int i, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        this.ad = i;
        this.vip = i2;
        this.metrica = z;
        this.license = i3;
        this.appmetrica = z2;
        this.purchase = z3;
        this.billing = z4;
        this.yandex = z5;
        this.startapp = range;
        this.adcel = z6;
    }

    public static C18327e ad(C18327e c18327e, boolean z, Range range, int i) {
        int i2 = c18327e.ad;
        int i3 = c18327e.vip;
        boolean z2 = c18327e.metrica;
        int i4 = c18327e.license;
        boolean z3 = c18327e.appmetrica;
        boolean z4 = c18327e.purchase;
        boolean z5 = c18327e.billing;
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            range = c18327e.startapp;
        }
        return new C18327e(i2, i3, z2, i4, z3, z4, z5, z, range, c18327e.adcel);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18327e)) {
            return false;
        }
        C18327e c18327e = (C18327e) obj;
        return this.ad == c18327e.ad && this.vip == c18327e.vip && this.metrica == c18327e.metrica && this.license == c18327e.license && this.appmetrica == c18327e.appmetrica && this.purchase == c18327e.purchase && this.billing == c18327e.billing && this.yandex == c18327e.yandex && AbstractC7890e.billing(this.startapp, c18327e.startapp) && this.adcel == c18327e.adcel;
    }

    public final int hashCode() {
        return ((this.startapp.hashCode() + ((((((((AbstractC1786e.mopub(this.license, ((((this.ad * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237)) * 31, 31) + (this.appmetrica ? 1231 : 1237)) * 31) + (this.purchase ? 1231 : 1237)) * 31) + (this.billing ? 1231 : 1237)) * 31) + (this.yandex ? 1231 : 1237)) * 31)) * 31) + (this.adcel ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
        sb.append(this.ad);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.vip);
        sb.append(", hasVideoCapture=");
        sb.append(this.metrica);
        sb.append(", videoStabilization=");
        int i = this.license;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "PREVIEW" : "ON" : "OFF" : "UNSPECIFIED");
        sb.append(", isUltraHdrOn=");
        sb.append(this.appmetrica);
        sb.append(", isHighSpeedOn=");
        sb.append(this.purchase);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.billing);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.yandex);
        sb.append(", targetFpsRange=");
        sb.append(this.startapp);
        sb.append(", isStrictFpsRequired=");
        return AbstractC1786e.isVip(sb, this.adcel, ')');
    }
}
