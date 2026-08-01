package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍِٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9416e extends AbstractC6484e {
    public static final Parcelable.Creator<C9416e> CREATOR = new C0928e(13);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f18740e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f18741e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f18742e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f18743e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18744e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f18745e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f18746e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f18747e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f18745e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        int i3 = this.f18742e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i3);
        int i4 = this.f18741e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i4);
        int i5 = this.f18744e;
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(i5);
        int i6 = this.f18740e;
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(i6);
        int i7 = this.f18747e;
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(i7);
        boolean z = this.f18746e;
        AbstractC16852e.isPro(parcel, 8, 4);
        parcel.writeInt(z ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 9, this.f18743e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
