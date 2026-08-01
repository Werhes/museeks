package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6419e extends AbstractC6484e {
    public static final Parcelable.Creator<C6419e> CREATOR = new C1304e(26);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4670e f13299e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f13300e;

    public C6419e(int i, C4670e c4670e) {
        this.f13300e = i;
        this.f13299e = c4670e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f13300e);
        AbstractC16852e.subscription(parcel, 2, this.f13299e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
