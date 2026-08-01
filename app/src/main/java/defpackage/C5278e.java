package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۦؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5278e extends AbstractC6484e {
    public static final Parcelable.Creator<C5278e> CREATOR = new C6153e(16);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f11364e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f11365e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f11366e;

    public C5278e(int i, boolean z, boolean z2) {
        this.f11366e = z;
        this.f11365e = z2;
        this.f11364e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f11366e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f11365e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f11364e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
