package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۢۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4453e extends AbstractC6484e {
    public static final Parcelable.Creator<C4453e> CREATOR = new C1304e(22);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f9655e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9656e;

    public C4453e(int i, boolean z) {
        this.f9656e = i;
        this.f9655e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f9656e);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f9655e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
