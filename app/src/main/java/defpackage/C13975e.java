package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13975e extends AbstractC6484e {
    public static final Parcelable.Creator<C13975e> CREATOR = new C6153e(19);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f27693e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f27694e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f27695e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f27696e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27697e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f27698e;

    public C13975e(int i, boolean z, ArrayList arrayList, int i2, String str, boolean z2) {
        ArrayList arrayList2 = new ArrayList();
        this.f27694e = arrayList2;
        this.f27697e = i;
        this.f27695e = z;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.f27696e = i2;
        this.f27693e = str;
        this.f27698e = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int applovin = AbstractC16852e.applovin(parcel, 20293);
        AbstractC16852e.isPro(parcel, 2, 4);
        parcel.writeInt(this.f27697e);
        AbstractC16852e.isPro(parcel, 3, 4);
        parcel.writeInt(this.f27695e ? 1 : 0);
        AbstractC16852e.signatures(parcel, 4, this.f27694e);
        AbstractC16852e.isPro(parcel, 5, 4);
        parcel.writeInt(this.f27696e);
        AbstractC16852e.remoteconfig(parcel, 6, this.f27693e);
        AbstractC16852e.isPro(parcel, 7, 4);
        parcel.writeInt(this.f27698e ? 1 : 0);
        AbstractC16852e.ads(parcel, applovin);
    }
}
