package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۡۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6719e extends AbstractC6484e {
    public static final Parcelable.Creator<C6719e> CREATOR = new C6153e(18);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f13873e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f13874e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f13875e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C15924e f13876e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f13877e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final boolean f13878e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C13561e f13879e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f13880e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f13881e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13882e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f13883e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f13884e;

    public C6719e(String str, String str2, String str3, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, boolean z2, int i, C15924e c15924e, C13561e c13561e, int i2) {
        this.f13882e = str;
        this.f13877e = str2;
        this.f13875e = str3;
        this.f13880e = z;
        this.f13873e = bArr;
        this.f13884e = bArr2;
        this.f13883e = bArr3;
        this.f13878e = z2;
        this.f13881e = i;
        this.f13876e = c15924e;
        this.f13879e = c13561e;
        this.f13874e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6719e) {
            C6719e c6719e = (C6719e) obj;
            if (AbstractC5729e.vip(this.f13882e, c6719e.f13882e) && AbstractC5729e.vip(this.f13877e, c6719e.f13877e) && AbstractC5729e.vip(this.f13875e, c6719e.f13875e) && AbstractC5729e.vip(Boolean.valueOf(this.f13880e), Boolean.valueOf(c6719e.f13880e)) && Arrays.equals(this.f13873e, c6719e.f13873e) && Arrays.equals(this.f13884e, c6719e.f13884e) && Arrays.equals(this.f13883e, c6719e.f13883e) && AbstractC5729e.vip(Boolean.valueOf(this.f13878e), Boolean.valueOf(c6719e.f13878e)) && AbstractC5729e.vip(Integer.valueOf(this.f13881e), Integer.valueOf(c6719e.f13881e)) && AbstractC5729e.vip(this.f13876e, c6719e.f13876e) && AbstractC5729e.vip(this.f13879e, c6719e.f13879e) && AbstractC5729e.vip(Integer.valueOf(this.f13874e), Integer.valueOf(c6719e.f13874e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13882e, this.f13877e, this.f13875e, Boolean.valueOf(this.f13880e), Integer.valueOf(Arrays.hashCode(this.f13873e)), Integer.valueOf(Arrays.hashCode(this.f13884e)), Integer.valueOf(Arrays.hashCode(this.f13883e)), Boolean.valueOf(this.f13878e), Integer.valueOf(this.f13881e), this.f13876e, this.f13879e, Integer.valueOf(this.f13874e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f13882e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f13877e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f13875e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f13880e ? 1 : 0);
        AbstractC16852e.mopub(parcel, 5, this.f13873e);
        AbstractC16852e.mopub(parcel, 6, this.f13884e);
        AbstractC16852e.mopub(parcel, 7, this.f13883e);
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(this.f13878e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(this.f13881e);
        AbstractC16852e.subscription(parcel, 10, this.f13876e, i);
        AbstractC16852e.subscription(parcel, 11, this.f13879e, i);
        AbstractC16852e.isPro(parcel, 12, 4);
        parcel.writeInt(this.f13874e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
