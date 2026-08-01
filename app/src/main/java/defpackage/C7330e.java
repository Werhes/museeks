package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٞۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7330e extends AbstractC6484e {
    public static final Parcelable.Creator<C7330e> CREATOR = new C1304e(21);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f14996e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f14997e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f14998e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f14999e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f15000e;

    public C7330e(int i, int i2, long j, String str, boolean z) {
        this.f15000e = i;
        this.f14998e = str;
        this.f14997e = j;
        this.f14999e = i2;
        this.f14996e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f15000e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f14998e);
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(this.f14997e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f14999e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f14996e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
