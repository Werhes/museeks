package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7875e extends AbstractC6484e {
    public static final Parcelable.Creator<C7875e> CREATOR = new C0928e(10);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f15936e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f15937e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f15938e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f15939e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f15940e;

    public C7875e(int i, int i2, long j, String str, boolean z) {
        this.f15940e = z;
        this.f15938e = str;
        this.f15937e = C7582e.admob(i) - 1;
        this.f15939e = AbstractC16565e.billing(i2) - 1;
        this.f15936e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f15940e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 2, this.f15938e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f15937e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f15939e);
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(this.f15936e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
