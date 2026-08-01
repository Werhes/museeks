package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٟۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8121e extends AbstractC6484e {
    public static final Parcelable.Creator<C8121e> CREATOR = new C0928e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C3173e[] f16480e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public String f16481e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f16482e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C5917e[] f16483e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public C9902e f16484e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C0071e[] f16485e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String[] f16486e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 2, this.f16484e, i);
        AbstractC16852e.remoteconfig(parcel, 3, this.f16482e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f16481e);
        AbstractC16852e.tapsense(parcel, 5, this.f16483e, i);
        AbstractC16852e.tapsense(parcel, 6, this.f16480e, i);
        AbstractC16852e.pro(parcel, 7, this.f16486e);
        AbstractC16852e.tapsense(parcel, 8, this.f16485e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
