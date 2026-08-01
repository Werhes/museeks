package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17152e extends AbstractC6484e {
    public static final Parcelable.Creator<C17152e> CREATOR = new C18517e(7);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f33644e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f33645e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final byte[] f33646e;

    public C17152e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f33646e = bArr;
        this.f33645e = bArr2;
        this.f33644e = bArr3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17152e) {
            C17152e c17152e = (C17152e) obj;
            if (Arrays.equals(this.f33646e, c17152e.f33646e) && Arrays.equals(this.f33645e, c17152e.f33645e) && Arrays.equals(this.f33644e, c17152e.f33644e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f33646e)), Integer.valueOf(Arrays.hashCode(this.f33645e)), Integer.valueOf(Arrays.hashCode(this.f33644e))});
    }

    public final String toString() {
        byte[] bArr = this.f33646e;
        Integer valueOf = bArr == null ? null : Integer.valueOf(Arrays.hashCode(bArr));
        byte[] bArr2 = this.f33645e;
        Integer valueOf2 = bArr2 == null ? null : Integer.valueOf(Arrays.hashCode(bArr2));
        byte[] bArr3 = this.f33644e;
        return "BluetoothConnectivityInfo:<bluetoothMacAddress hash: " + valueOf + ", bluetoothUuid hash: " + valueOf2 + ", actions hash: " + (bArr3 != null ? Integer.valueOf(Arrays.hashCode(bArr3)) : null) + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        byte[] bArr = this.f33646e;
        AbstractC16852e.mopub(parcel, 1, bArr == null ? null : (byte[]) bArr.clone());
        byte[] bArr2 = this.f33645e;
        AbstractC16852e.mopub(parcel, 2, bArr2 == null ? null : (byte[]) bArr2.clone());
        byte[] bArr3 = this.f33644e;
        AbstractC16852e.mopub(parcel, 3, bArr3 != null ? (byte[]) bArr3.clone() : null);
        AbstractC16852e.ads(parcel, applovin);
    }
}
