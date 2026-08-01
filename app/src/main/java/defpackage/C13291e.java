package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13291e extends AbstractC11007e {
    public static final Parcelable.Creator<C13291e> CREATOR = new C5995e(2);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public SparseArray f26343e;

    public C13291e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f26343e = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f26343e.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // defpackage.AbstractC11007e, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f26343e;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f26343e.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f26343e.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
