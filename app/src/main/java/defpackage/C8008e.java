package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8008e extends AbstractC11007e {
    public static final Parcelable.Creator<C8008e> CREATOR = new C5995e(5);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f16250e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public boolean f16251e;

    public C8008e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f16250e = parcel.readInt();
        this.f16251e = parcel.readInt() != 0;
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f16250e);
        parcel.writeInt(this.f16251e ? 1 : 0);
    }
}
