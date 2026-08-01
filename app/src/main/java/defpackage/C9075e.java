package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9075e extends AbstractC6484e {
    public static final Parcelable.Creator<C9075e> CREATOR = new C10765e(12);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f18177e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f18178e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f18179e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f18180e;

    public C9075e(int i, String str, String str2, String str3) {
        this.f18180e = i;
        this.f18178e = str;
        this.f18177e = str2;
        this.f18179e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f18180e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f18178e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f18177e);
        AbstractC16852e.remoteconfig(parcel, 4, this.f18179e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
