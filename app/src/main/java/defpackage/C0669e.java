package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0669e extends AbstractC6484e {
    public static final Parcelable.Creator<C0669e> CREATOR = new C18517e(27);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f2929e;

    public C0669e(int i) {
        this.f2929e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f2929e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
