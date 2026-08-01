package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2349e extends AbstractC6484e {
    public static final Parcelable.Creator<C2349e> CREATOR = new C10765e(25);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f5886e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f5887e;

    public C2349e(int i, String str) {
        this.f5887e = i;
        this.f5886e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f5887e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f5886e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
