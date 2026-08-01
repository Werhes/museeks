package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12455e extends AbstractC6484e {
    public static final Parcelable.Creator<C12455e> CREATOR = new C0928e(19);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f24920e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24921e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f24922e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final String f24923e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f24924e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24925e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final boolean f24926e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f24927e;

    public C12455e(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
        this.f24925e = i;
        this.f24922e = i2;
        this.f24921e = i3;
        this.f24924e = i4;
        this.f24920e = i5;
        this.f24927e = i6;
        this.f24926e = z;
        this.f24923e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f24925e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f24922e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f24921e);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f24924e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f24920e);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f24927e);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f24926e ? 1 : 0);
        AbstractC16852e.remoteconfig(parcel, 8, this.f24923e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
