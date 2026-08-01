package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16405e extends AbstractC6484e {
    public static final Parcelable.Creator<C16405e> CREATOR = new C1318e(27);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Point[] f32206e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C16587e f32207e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C17961e f32208e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f32209e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C1982e f32210e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C15607e f32211e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f32212e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C2296e f32213e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2349e f32214e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C0285e f32215e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f32216e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C7766e f32217e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f32218e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C9075e f32219e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f32220e;

    public C16405e(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C9075e c9075e, C2349e c2349e, C7766e c7766e, C1982e c1982e, C0285e c0285e, C17961e c17961e, C16587e c16587e, C15607e c15607e, C2296e c2296e) {
        this.f32218e = i;
        this.f32212e = str;
        this.f32209e = str2;
        this.f32216e = bArr;
        this.f32206e = pointArr;
        this.f32220e = i2;
        this.f32219e = c9075e;
        this.f32214e = c2349e;
        this.f32217e = c7766e;
        this.f32210e = c1982e;
        this.f32215e = c0285e;
        this.f32208e = c17961e;
        this.f32207e = c16587e;
        this.f32211e = c15607e;
        this.f32213e = c2296e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f32218e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f32212e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f32209e);
        AbstractC16852e.mopub(parcel, 4, this.f32216e);
        AbstractC16852e.tapsense(parcel, 5, this.f32206e, i);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f32220e);
        AbstractC16852e.subscription(parcel, 7, this.f32219e, i);
        AbstractC16852e.subscription(parcel, 8, this.f32214e, i);
        AbstractC16852e.subscription(parcel, 9, this.f32217e, i);
        AbstractC16852e.subscription(parcel, 10, this.f32210e, i);
        AbstractC16852e.subscription(parcel, 11, this.f32215e, i);
        AbstractC16852e.subscription(parcel, 12, this.f32208e, i);
        AbstractC16852e.subscription(parcel, 13, this.f32207e, i);
        AbstractC16852e.subscription(parcel, 14, this.f32211e, i);
        AbstractC16852e.subscription(parcel, 15, this.f32213e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
