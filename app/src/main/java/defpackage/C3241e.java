package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3241e extends AbstractC6484e {
    public static final Parcelable.Creator<C3241e> CREATOR = new C6153e(15);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f7372e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f7373e;

    public C3241e(boolean z, int i) {
        this.f7373e = z;
        this.f7372e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f7373e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f7372e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
