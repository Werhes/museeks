package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11075e extends AbstractC6484e {
    public static final Parcelable.Creator<C11075e> CREATOR = new C1304e(17);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public List f21968e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f21969e;

    public C11075e(int i, List list) {
        this.f21969e = i;
        this.f21968e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f21969e);
        AbstractC16852e.isVip(parcel, 2, this.f21968e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
