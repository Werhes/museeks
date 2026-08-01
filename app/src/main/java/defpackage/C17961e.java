package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17961e extends AbstractC6484e {
    public static final Parcelable.Creator<C17961e> CREATOR = new C10765e(13);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final double f35205e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final double f35206e;

    public C17961e(double d, double d2) {
        this.f35206e = d;
        this.f35205e = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeDouble(this.f35206e);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeDouble(this.f35205e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
