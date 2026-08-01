package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13846e extends AbstractC11007e {
    public static final Parcelable.Creator<C13846e> CREATOR = new C6220e(2);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f27429e;

    public C13846e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f27429e = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f27429e ? 1 : 0);
    }
}
