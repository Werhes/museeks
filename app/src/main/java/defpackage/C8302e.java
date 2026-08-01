package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8302e extends AbstractC6484e {
    public static final Parcelable.Creator<C8302e> CREATOR = new C1304e(27);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C4694e f16976e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C14758e f16977e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f16978e;

    public C8302e(int i, C14758e c14758e, C4694e c4694e) {
        this.f16978e = i;
        this.f16977e = c14758e;
        this.f16976e = c4694e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f16978e);
        AbstractC16852e.subscription(parcel, 2, this.f16977e, i);
        AbstractC16852e.subscription(parcel, 3, this.f16976e, i);
        AbstractC16852e.ads(parcel, applovin);
    }
}
