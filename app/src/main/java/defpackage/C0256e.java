package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0256e extends AbstractC6484e {
    public static final Parcelable.Creator<C0256e> CREATOR = new C1318e(6);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public double f2250e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public double f2251e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        double d = this.f2251e;
        AbstractC16852e.isPro(parcel, 2, 8);
        parcel.writeDouble(d);
        double d2 = this.f2250e;
        AbstractC16852e.isPro(parcel, 3, 8);
        parcel.writeDouble(d2);
        AbstractC16852e.ads(parcel, applovin);
    }
}
