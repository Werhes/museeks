package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1982e extends AbstractC6484e {
    public static final Parcelable.Creator<C1982e> CREATOR = new C6153e(3);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f5189e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f5190e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5191e;

    public C1982e(String str, int i, String str2) {
        this.f5191e = str;
        this.f5190e = str2;
        this.f5189e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f5191e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f5190e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f5189e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
