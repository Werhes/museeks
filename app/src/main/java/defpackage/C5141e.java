package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۚٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5141e extends AbstractC6484e {
    public static final Parcelable.Creator<C5141e> CREATOR = new C1318e(23);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f11017e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f11018e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f11019e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f11020e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f11021e;

    public C5141e(int i, int i2, int i3, int i4, long j) {
        this.f11021e = i;
        this.f11019e = i2;
        this.f11018e = i3;
        this.f11020e = j;
        this.f11017e = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f11021e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f11019e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f11018e);
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(this.f11020e);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f11017e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
