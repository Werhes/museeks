package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘۟ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18030e extends AbstractC6484e {
    public static final Parcelable.Creator<C18030e> CREATOR = new C1318e(20);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String[] f35351e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f35352e;

    public C18030e(int i, String[] strArr) {
        this.f35352e = i;
        this.f35351e = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 1, 4);
        parcel.writeInt(this.f35352e);
        AbstractC16852e.pro(parcel, 2, this.f35351e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
