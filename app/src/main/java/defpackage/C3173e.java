package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3173e extends AbstractC6484e {
    public static final Parcelable.Creator<C3173e> CREATOR = new C1318e(4);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f7284e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f7285e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f7286e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f7287e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f7287e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.remoteconfig(parcel, 3, this.f7285e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f7284e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f7286e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
