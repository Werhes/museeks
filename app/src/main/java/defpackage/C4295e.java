package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4295e extends AbstractC6484e {
    public static final Parcelable.Creator<C4295e> CREATOR = new C18517e(23);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f9383e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C1032e[] f9384e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C14113e f9385e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Bundle f9386e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.adcel(parcel, 1, this.f9386e);
        AbstractC16852e.tapsense(parcel, 2, this.f9384e, i);
        int i2 = this.f9383e;
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(i2);
        AbstractC16852e.subscription(parcel, 4, this.f9385e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
