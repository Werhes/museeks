package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8660e extends AbstractC6484e {
    public static final Parcelable.Creator<C8660e> CREATOR = new C6153e(7);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f17491e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f17492e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f17493e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Bundle f17494e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f17495e;

    public C8660e(long j, long j2, boolean z, Bundle bundle, String str) {
        this.f17495e = j;
        this.f17493e = j2;
        this.f17492e = z;
        this.f17494e = bundle;
        this.f17491e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeLong(this.f17495e);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeLong(this.f17493e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f17492e ? 1 : 0);
        AbstractC16852e.adcel(parcel, 7, this.f17494e);
        AbstractC16852e.remoteconfig(parcel, 8, this.f17491e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
