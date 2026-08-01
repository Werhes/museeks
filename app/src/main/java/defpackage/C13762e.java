package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13762e extends AbstractC6484e {
    public static final Parcelable.Creator<C13762e> CREATOR = new C10765e(17);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f27268e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f27269e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final byte[] f27270e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f27271e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f27272e;

    public C13762e(boolean z, byte[] bArr, boolean z2, float f, boolean z3) {
        this.f27272e = z;
        this.f27270e = bArr;
        this.f27269e = z2;
        this.f27271e = f;
        this.f27268e = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f27272e ? 1 : 0);
        AbstractC16852e.mopub(parcel, 2, this.f27270e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f27269e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeFloat(this.f27271e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f27268e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
