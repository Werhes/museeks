package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7753e extends AbstractC6484e {
    public static final Parcelable.Creator<C7753e> CREATOR = new C0928e(14);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f15728e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f15729e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f15730e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f15731e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public String f15732e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C9416e f15733e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9416e f15734e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.remoteconfig(parcel, 2, this.f15732e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f15730e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f15729e);
        AbstractC16852e.remoteconfig(parcel, 5, this.f15731e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f15728e);
        AbstractC16852e.subscription(parcel, 7, this.f15734e, i);
        AbstractC16852e.subscription(parcel, 8, this.f15733e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
