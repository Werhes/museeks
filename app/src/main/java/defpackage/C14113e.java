package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14113e extends AbstractC6484e {
    public static final Parcelable.Creator<C14113e> CREATOR = new C18517e(25);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f27924e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f27925e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f27926e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int[] f27927e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C2831e f27928e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int[] f27929e;

    public C14113e(C2831e c2831e, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f27928e = c2831e;
        this.f27926e = z;
        this.f27925e = z2;
        this.f27927e = iArr;
        this.f27924e = i;
        this.f27929e = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f27928e, i);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f27926e ? 1 : 0);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f27925e ? 1 : 0);
        AbstractC16852e.amazon(parcel, 4, this.f27927e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f27924e);
        AbstractC16852e.amazon(parcel, 6, this.f27929e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
