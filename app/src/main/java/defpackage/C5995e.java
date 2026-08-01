package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5995e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int ad;

    public static C12742e ad(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C5995e.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new C12742e();
        }
        C0316e mo289this = C0292e.f2297e.mo289this();
        for (int i = 0; i < readInt; i++) {
            mo289this.add(parcel.readValue(classLoader));
        }
        return new C12742e(mo289this.m301class());
    }

    public static C9929e vip(Parcel parcel, ClassLoader classLoader) {
        C9929e c9929e = new C9929e();
        if (classLoader == null) {
            classLoader = C9929e.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            c9929e.add(parcel.readValue(classLoader));
        }
        return c9929e;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.ad) {
            case 0:
                return ad(parcel, null);
            case 1:
                return new C9987e(parcel, null);
            case 2:
                return new C13291e(parcel, null);
            case 3:
                return new C1337e(parcel, null);
            case 4:
                return vip(parcel, null);
            default:
                return new C8008e(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.ad) {
            case 0:
                return ad(parcel, classLoader);
            case 1:
                return new C9987e(parcel, classLoader);
            case 2:
                return new C13291e(parcel, classLoader);
            case 3:
                return new C1337e(parcel, classLoader);
            case 4:
                return vip(parcel, classLoader);
            default:
                return new C8008e(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C12742e[i];
            case 1:
                return new C9987e[i];
            case 2:
                return new C13291e[i];
            case 3:
                return new C1337e[i];
            case 4:
                return new C9929e[i];
            default:
                return new C8008e[i];
        }
    }
}
