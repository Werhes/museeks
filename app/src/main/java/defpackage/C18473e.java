package defpackage;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18473e extends AbstractC6484e {
    public static final Parcelable.Creator<C18473e> CREATOR = new C0928e(12);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public boolean f36197e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public byte[] f36198e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f36199e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f36200e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f36201e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f36202e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f36203e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f36204e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f36205e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int[] f36206e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public boolean f36207e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f36208e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f36209e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f36210e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f36211e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f36212e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C6611e f36213e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f36214e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public ParcelUuid f36215e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18473e) {
            C18473e c18473e = (C18473e) obj;
            if (AbstractC5729e.vip(this.f36213e, c18473e.f36213e) && AbstractC5729e.vip(Boolean.valueOf(this.f36204e), Boolean.valueOf(c18473e.f36204e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36200e), Boolean.valueOf(c18473e.f36200e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36211e), Boolean.valueOf(c18473e.f36211e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36197e), Boolean.valueOf(c18473e.f36197e)) && AbstractC5729e.vip(this.f36215e, c18473e.f36215e) && AbstractC5729e.vip(Boolean.valueOf(this.f36214e), Boolean.valueOf(c18473e.f36214e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36208e), Boolean.valueOf(c18473e.f36208e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36212e), Boolean.valueOf(c18473e.f36212e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36201e), Boolean.valueOf(c18473e.f36201e)) && AbstractC5729e.vip(Integer.valueOf(this.f36209e), Integer.valueOf(c18473e.f36209e)) && AbstractC5729e.vip(Integer.valueOf(this.f36199e), Integer.valueOf(c18473e.f36199e)) && Arrays.equals(this.f36198e, c18473e.f36198e) && AbstractC5729e.vip(Long.valueOf(this.f36202e), Long.valueOf(c18473e.f36202e)) && Arrays.equals(this.f36206e, c18473e.f36206e) && AbstractC5729e.vip(Boolean.valueOf(this.f36207e), Boolean.valueOf(c18473e.f36207e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36205e), Boolean.valueOf(c18473e.f36205e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36203e), Boolean.valueOf(c18473e.f36203e)) && AbstractC5729e.vip(Boolean.valueOf(this.f36210e), Boolean.valueOf(c18473e.f36210e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f36213e, Boolean.valueOf(this.f36204e), Boolean.valueOf(this.f36200e), Boolean.valueOf(this.f36211e), Boolean.valueOf(this.f36197e), this.f36215e, Boolean.valueOf(this.f36214e), Boolean.valueOf(this.f36208e), Boolean.valueOf(this.f36212e), Boolean.valueOf(this.f36201e), Integer.valueOf(this.f36209e), Integer.valueOf(this.f36199e), Integer.valueOf(Arrays.hashCode(this.f36198e)), Long.valueOf(this.f36202e), Integer.valueOf(Arrays.hashCode(this.f36206e)), Boolean.valueOf(this.f36207e), Boolean.valueOf(this.f36205e), Boolean.valueOf(this.f36203e), Boolean.valueOf(this.f36210e)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        C6611e c6611e = this.f36213e;
        boolean z = this.f36204e;
        boolean z2 = this.f36200e;
        boolean z3 = this.f36211e;
        boolean z4 = this.f36197e;
        ParcelUuid parcelUuid = this.f36215e;
        boolean z5 = this.f36214e;
        boolean z6 = this.f36208e;
        boolean z7 = this.f36212e;
        boolean z8 = this.f36201e;
        int i = this.f36209e;
        int i2 = this.f36199e;
        byte[] bArr = this.f36198e;
        String ad = bArr == null ? "null" : AbstractC17409e.ad(bArr);
        long j = this.f36202e;
        boolean z9 = this.f36207e;
        StringBuilder sb = new StringBuilder("DiscoveryOptions{strategy: ");
        sb.append(c6611e);
        sb.append(", forwardUnrecognizedBluetoothDevices: ");
        sb.append(z);
        sb.append(", enableBluetooth: ");
        sb.append(z2);
        sb.append(", enableBle: ");
        sb.append(z3);
        sb.append(", lowPower: ");
        sb.append(z4);
        sb.append(", fastAdvertisementServiceUuid: ");
        sb.append(parcelUuid);
        sb.append(", enableWifiLan: ");
        sb.append(z5);
        sb.append(", enableNfc: ");
        sb.append(z6);
        sb.append(", enableWifiAware: ");
        sb.append(z7);
        sb.append(", enableUwbRanging: ");
        sb.append(z8);
        sb.append(", uwbChannel: ");
        AbstractC10257e.signatures(sb, i, ", uwbPreambleIndex: ", i2, ", uwbAddress: ");
        sb.append(ad);
        sb.append(", flowId: ");
        sb.append(j);
        sb.append(", allowGattConnections: ");
        sb.append(z9);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f36213e, i);
        boolean z = this.f36204e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f36200e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f36211e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = this.f36197e;
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC16852e.subscription(parcel, 6, this.f36215e, i);
        boolean z5 = this.f36214e;
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = this.f36208e;
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(z6 ? 1 : 0);
        boolean z7 = this.f36212e;
        AbstractC16852e.isPro(parcel, 10, 4);
        parcel.writeInt(z7 ? 1 : 0);
        boolean z8 = this.f36201e;
        AbstractC16852e.isPro(parcel, 11, 4);
        parcel.writeInt(z8 ? 1 : 0);
        int i2 = this.f36209e;
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(i2);
        int i3 = this.f36199e;
        AbstractC16852e.isPro(parcel, 13, 4);
        parcel.writeInt(i3);
        AbstractC16852e.mopub(parcel, 14, this.f36198e);
        long j = this.f36202e;
        AbstractC16852e.isPro(parcel, 15, 8);
        parcel.writeLong(j);
        AbstractC16852e.amazon(parcel, 16, this.f36206e);
        boolean z9 = this.f36207e;
        AbstractC16852e.isPro(parcel, 17, 4);
        parcel.writeInt(z9 ? 1 : 0);
        boolean z10 = this.f36205e;
        AbstractC16852e.isPro(parcel, 18, 4);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f36203e;
        AbstractC16852e.isPro(parcel, 19, 4);
        parcel.writeInt(z11 ? 1 : 0);
        boolean z12 = this.f36210e;
        AbstractC16852e.isPro(parcel, 20, 4);
        parcel.writeInt(z12 ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
