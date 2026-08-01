package defpackage;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15822e extends AbstractC6484e {
    public static final Parcelable.Creator<C15822e> CREATOR = new C6153e(23);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f31226e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f31227e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f31228e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final BluetoothDevice f31229e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f31230e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C13561e f31231e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f31232e;

    public C15822e(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr, int i, C13561e c13561e) {
        this.f31230e = str;
        this.f31228e = str2;
        this.f31227e = str3;
        this.f31229e = bluetoothDevice;
        this.f31226e = bArr;
        this.f31232e = i;
        this.f31231e = c13561e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15822e) {
            C15822e c15822e = (C15822e) obj;
            if (AbstractC5729e.vip(this.f31230e, c15822e.f31230e) && AbstractC5729e.vip(this.f31228e, c15822e.f31228e) && AbstractC5729e.vip(this.f31227e, c15822e.f31227e) && AbstractC5729e.vip(this.f31229e, c15822e.f31229e) && Arrays.equals(this.f31226e, c15822e.f31226e) && AbstractC5729e.vip(Integer.valueOf(this.f31232e), Integer.valueOf(c15822e.f31232e)) && AbstractC5729e.vip(this.f31231e, c15822e.f31231e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31230e, this.f31228e, this.f31227e, this.f31229e, Integer.valueOf(Arrays.hashCode(this.f31226e)), Integer.valueOf(this.f31232e), this.f31231e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f31230e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f31228e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f31227e);
        AbstractC16852e.subscription(parcel, 4, this.f31229e, i);
        AbstractC16852e.mopub(parcel, 5, this.f31226e);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f31232e);
        AbstractC16852e.subscription(parcel, 7, this.f31231e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
