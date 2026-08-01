package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11632e extends AbstractC6484e {
    public static final Parcelable.Creator<C11632e> CREATOR = new C1304e(28);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f23346e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23347e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23348e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final int f23349e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f23350e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f23351e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23352e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f23353e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f23354e;

    public C11632e(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f23352e = i;
        this.f23348e = i2;
        this.f23347e = i3;
        this.f23350e = j;
        this.f23346e = j2;
        this.f23354e = str;
        this.f23353e = str2;
        this.f23349e = i4;
        this.f23351e = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f23352e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f23348e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f23347e);
        AbstractC16852e.isPro(parcel, 4, 8);
        parcel.writeLong(this.f23350e);
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(this.f23346e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f23354e);
        AbstractC16852e.remoteconfig(parcel, 7, this.f23353e);
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(this.f23349e);
        AbstractC16852e.isPro(parcel, 9, 4);
        parcel.writeInt(this.f23351e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
