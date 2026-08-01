package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18374e extends AbstractC6484e {
    public static final Parcelable.Creator<C18374e> CREATOR = new C10765e(21);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float[] f36045e;

    public C18374e(float[] fArr) {
        this.f36045e = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        float[] fArr = this.f36045e;
        if (fArr != null) {
            int applovin2 = AbstractC16852e.applovin(parcel, 1);
            parcel.writeFloatArray(fArr);
            AbstractC16852e.ads(parcel, applovin2);
        }
        AbstractC16852e.ads(parcel, applovin);
    }
}
