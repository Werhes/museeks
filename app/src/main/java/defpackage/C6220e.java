package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6220e implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int ad;

    public /* synthetic */ C6220e(int i) {
        this.ad = i;
    }

    public static C0576e ad(Parcel parcel, ClassLoader classLoader) {
        InterfaceC1589e interfaceC1589e;
        if (classLoader == null) {
            classLoader = C6220e.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            interfaceC1589e = C10990e.f21771e;
        } else if (readInt == 1) {
            interfaceC1589e = C12575e.f25232e;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(AbstractC1634e.smaato("Unsupported MutableState policy ", readInt, " was restored"));
            }
            interfaceC1589e = C10990e.f21769e;
        }
        return new C0576e(readValue, interfaceC1589e);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.ad) {
            case 0:
                return ad(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC11007e.f21799e;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new C13846e(parcel, null);
            case 3:
                return new C17207e(parcel, null);
            case 4:
                return new C2307e(parcel, null);
            case 5:
                return new C11601e(parcel, null);
            default:
                return new C12902e(parcel, null);
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.ad) {
            case 0:
                return ad(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC11007e.f21799e;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new C13846e(parcel, classLoader);
            case 3:
                return new C17207e(parcel, classLoader);
            case 4:
                return new C2307e(parcel, classLoader);
            case 5:
                return new C11601e(parcel, classLoader);
            default:
                return new C12902e(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.ad) {
            case 0:
                return new C0576e[i];
            case 1:
                return new AbstractC11007e[i];
            case 2:
                return new C13846e[i];
            case 3:
                return new C17207e[i];
            case 4:
                return new C2307e[i];
            case 5:
                return new C11601e[i];
            default:
                return new C12902e[i];
        }
    }
}
