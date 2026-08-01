package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12902e extends AbstractC11007e {
    public static final Parcelable.Creator<C12902e> CREATOR = new C6220e(6);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ClassLoader f25757e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25758e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Parcelable f25759e;

    public C12902e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? C12902e.class.getClassLoader() : classLoader;
        this.f25758e = parcel.readInt();
        this.f25759e = parcel.readParcelable(classLoader);
        this.f25757e = classLoader;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" position=");
        return AbstractC17861e.smaato(this.f25758e, "}", sb);
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f25758e);
        parcel.writeParcelable(this.f25759e, i);
    }
}
