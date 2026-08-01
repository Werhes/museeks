package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15759e extends AbstractC6484e {
    public static final Parcelable.Creator<C15759e> CREATOR = new C10765e(19);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f31031e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f31032e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float[] f31033e;

    public C15759e(float[] fArr, int i, boolean z) {
        this.f31033e = fArr;
        this.f31032e = i;
        this.f31031e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        float[] fArr = this.f31033e;
        if (fArr != null) {
            int applovin2 = AbstractC16852e.applovin(parcel, 1);
            parcel.writeFloatArray(fArr);
            AbstractC16852e.ads(parcel, applovin2);
        }
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f31032e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f31031e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
