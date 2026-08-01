package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2528e extends AbstractC6484e {
    public static final Parcelable.Creator<C2528e> CREATOR = new C0928e(26);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f6378e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f6379e;

    public C2528e(int i, String str) {
        this.f6379e = i;
        this.f6378e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f6379e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f6378e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
