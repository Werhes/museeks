package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؐۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12168e extends AbstractC6484e {
    public static final Parcelable.Creator<C12168e> CREATOR = new C1318e(16);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f24459e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f24460e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f24461e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f24461e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f24460e);
        int i2 = this.f24459e;
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(i2);
        AbstractC16852e.ads(parcel, applovin);
    }
}
