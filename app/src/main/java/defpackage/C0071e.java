package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0071e extends AbstractC6484e {
    public static final Parcelable.Creator<C0071e> CREATOR = new C18517e(1);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String[] f1233e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f1234e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        int i2 = this.f1234e;
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(i2);
        AbstractC16852e.pro(parcel, 3, this.f1233e);
        AbstractC16852e.ads(parcel, applovin);
    }
}
