package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۘ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17965e extends AbstractC6484e {
    public static final Parcelable.Creator<C17965e> CREATOR = new C1318e(17);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final long f35211e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f35212e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f35213e;

    public C17965e(int i, long j, long j2) {
        this.f35213e = j;
        this.f35212e = i;
        this.f35211e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(this.f35213e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f35212e);
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeLong(this.f35211e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
