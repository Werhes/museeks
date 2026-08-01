package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1157e extends AbstractC6484e {
    public static final Parcelable.Creator<C1157e> CREATOR = new C0928e(2);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final List f3741e;

    public C1157e(ArrayList arrayList) {
        this.f3741e = arrayList;
    }

    public static C1157e billing(EnumC14201e... enumC14201eArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC14201eArr[0].f28063e));
        return new C1157e(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.loadAd(parcel, 1, this.f3741e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
