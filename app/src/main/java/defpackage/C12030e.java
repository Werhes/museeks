package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12030e extends AbstractC6484e {
    public static final Parcelable.Creator<C12030e> CREATOR = new C1318e(13);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f24056e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f24057e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f24058e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f24059e;

    public C12030e(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f24059e = bArr;
        this.f24057e = bArr2;
        this.f24056e = bArr3;
        this.f24058e = bArr4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12030e) {
            C12030e c12030e = (C12030e) obj;
            if (Arrays.equals(this.f24059e, c12030e.f24059e) && Arrays.equals(this.f24057e, c12030e.f24057e) && Arrays.equals(this.f24056e, c12030e.f24056e) && Arrays.equals(this.f24058e, c12030e.f24058e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f24059e)), Integer.valueOf(Arrays.hashCode(this.f24057e)), Integer.valueOf(Arrays.hashCode(this.f24056e)), Integer.valueOf(Arrays.hashCode(this.f24058e))});
    }

    public final String toString() {
        int hashCode = Arrays.hashCode(this.f24059e);
        int hashCode2 = Arrays.hashCode(this.f24057e);
        int hashCode3 = Arrays.hashCode(this.f24056e);
        int hashCode4 = Arrays.hashCode(this.f24058e);
        StringBuilder pro = AbstractC17861e.pro(hashCode, hashCode2, "WifiLanConnectivityInfo:<wifiLanPort hash: ", ">, <wifiLanIp hash: ", ">, <BSSID hash: ");
        pro.append(hashCode3);
        pro.append(">, <actions hash: ");
        pro.append(hashCode4);
        pro.append(">");
        return pro.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        byte[] bArr = this.f24059e;
        AbstractC16852e.mopub(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f24057e;
        AbstractC16852e.mopub(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f24056e;
        AbstractC16852e.mopub(parcel, 3, bArr3 == null ? null : (byte[]) bArr3.clone());
        byte[] bArr4 = this.f24058e;
        AbstractC16852e.mopub(parcel, 4, bArr4 != null ? (byte[]) bArr4.clone() : null);
        AbstractC16852e.ads(parcel, applovin);
    }
}
