package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6471e extends AbstractC6484e {
    public static final Parcelable.Creator<C6471e> CREATOR = new C0928e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f13385e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f13386e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13387e;

    public C6471e(long j, int i, String str) {
        this.f13387e = str;
        this.f13386e = j;
        this.f13385e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 1, this.f13387e);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeLong(this.f13386e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f13385e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
