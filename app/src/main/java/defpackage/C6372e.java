package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6372e extends AbstractC6484e {
    public static final Parcelable.Creator<C6372e> CREATOR = new C0928e(6);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f13232e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13233e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13234e;

    public C6372e(String str, int i, String str2) {
        this.f13234e = str;
        this.f13233e = i;
        this.f13232e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f13234e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f13233e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f13232e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
