package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۣؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4460e extends AbstractC6484e {
    public static final Parcelable.Creator<C4460e> CREATOR = new C0928e(24);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final double f9670e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final double f9671e;

    public C4460e(double d, double d2) {
        this.f9671e = d;
        this.f9670e = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 8);
        parcel.writeDouble(this.f9671e);
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeDouble(this.f9670e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
