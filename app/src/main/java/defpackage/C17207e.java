package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗۖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17207e extends AbstractC11007e {
    public static final Parcelable.Creator<C17207e> CREATOR = new C6220e(3);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f33735e;

    public C17207e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C17207e.class.getClassLoader();
        }
        this.f33735e = parcel.readInt() == 1;
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f33735e ? 1 : 0);
    }
}
