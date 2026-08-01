package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٞۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11894e extends AbstractC6484e {
    public static final Parcelable.Creator<C11894e> CREATOR = new C6153e(29);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f23828e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f23829e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f23830e;

    public C11894e(int i, int i2, int i3) {
        this.f23830e = i;
        this.f23829e = i2;
        this.f23828e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f23830e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f23829e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f23828e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
