package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4326e extends AbstractC6484e {
    public static final Parcelable.Creator<C4326e> CREATOR = new C10765e(4);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f9458e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C18374e f9459e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15759e f9460e;

    public C4326e(C15759e c15759e, C18374e c18374e, boolean z) {
        this.f9460e = c15759e;
        this.f9459e = c18374e;
        this.f9458e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.subscription(parcel, 1, this.f9460e, i);
        AbstractC16852e.subscription(parcel, 2, this.f9459e, i);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(1);
        AbstractC16852e.isPro(parcel, 4, 4);
        parcel.writeInt(this.f9458e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
