package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؗۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4931e extends AbstractC6484e {
    public static final Parcelable.Creator<C4931e> CREATOR = new C6153e(4);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final long f10433e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f10434e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f10435e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f10436e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f10437e;

    public C4931e(int i, int i2, int i3, int i4, long j) {
        this.f10437e = i;
        this.f10435e = i2;
        this.f10434e = i3;
        this.f10436e = i4;
        this.f10433e = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f10437e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f10435e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f10434e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f10436e);
        AbstractC16852e.isPro(parcel, 5, 8);
        parcel.writeLong(this.f10433e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
