package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2831e extends AbstractC6484e {
    public static final Parcelable.Creator<C2831e> CREATOR = new C1318e(15);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f6797e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f6798e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f6799e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f6800e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6801e;

    public C2831e(int i, boolean z, boolean z2, int i2, int i3) {
        this.f6801e = i;
        this.f6799e = z;
        this.f6798e = z2;
        this.f6800e = i2;
        this.f6797e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f6801e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f6799e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f6798e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f6800e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f6797e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
