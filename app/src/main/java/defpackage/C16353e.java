package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16353e extends AbstractC6484e {
    public static final Parcelable.Creator<C16353e> CREATOR = new C0928e(18);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Point[] f32136e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C1134e f32137e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C4460e f32138e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f32139e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C1821e f32140e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C15590e f32141e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f32142e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C0114e f32143e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2528e f32144e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C14459e f32145e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f32146e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C7957e f32147e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f32148e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C11630e f32149e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f32150e;

    public C16353e(int i, String str, String str2, byte[] bArr, Point[] pointArr, int i2, C11630e c11630e, C2528e c2528e, C7957e c7957e, C1821e c1821e, C14459e c14459e, C4460e c4460e, C1134e c1134e, C15590e c15590e, C0114e c0114e) {
        this.f32148e = i;
        this.f32142e = str;
        this.f32139e = str2;
        this.f32146e = bArr;
        this.f32136e = pointArr;
        this.f32150e = i2;
        this.f32149e = c11630e;
        this.f32144e = c2528e;
        this.f32147e = c7957e;
        this.f32140e = c1821e;
        this.f32145e = c14459e;
        this.f32138e = c4460e;
        this.f32137e = c1134e;
        this.f32141e = c15590e;
        this.f32143e = c0114e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f32148e);
        AbstractC16852e.remoteconfig(parcel, 2, this.f32142e);
        AbstractC16852e.remoteconfig(parcel, 3, this.f32139e);
        AbstractC16852e.mopub(parcel, 4, this.f32146e);
        AbstractC16852e.tapsense(parcel, 5, this.f32136e, i);
        AbstractC16852e.isPro(parcel, 6, 4);
        parcel.writeInt(this.f32150e);
        AbstractC16852e.subscription(parcel, 7, this.f32149e, i);
        AbstractC16852e.subscription(parcel, 8, this.f32144e, i);
        AbstractC16852e.subscription(parcel, 9, this.f32147e, i);
        AbstractC16852e.subscription(parcel, 10, this.f32140e, i);
        AbstractC16852e.subscription(parcel, 11, this.f32145e, i);
        AbstractC16852e.subscription(parcel, 12, this.f32138e, i);
        AbstractC16852e.subscription(parcel, 13, this.f32137e, i);
        AbstractC16852e.subscription(parcel, 14, this.f32141e, i);
        AbstractC16852e.subscription(parcel, 15, this.f32143e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
