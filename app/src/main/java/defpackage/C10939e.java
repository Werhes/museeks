package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10939e extends AbstractC6484e {
    public static final Parcelable.Creator<C10939e> CREATOR = new C0928e(3);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f21670e;

    public C10939e(ArrayList arrayList) {
        this.f21670e = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isVip(parcel, 1, this.f21670e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
