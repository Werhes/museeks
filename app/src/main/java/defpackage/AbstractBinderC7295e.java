package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚْٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC7295e extends AbstractBinderC3782e implements InterfaceC12658e {
    public AbstractBinderC7295e() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener", 2);
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1944const(readInt);
                return true;
            case 2:
                C17005e c17005e = (C17005e) AbstractC3336e.ad(parcel, C17005e.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                AbstractC3336e.license(parcel);
                mo1949e(c17005e, readString, readString2, z);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                AbstractC3336e.license(parcel);
                mopub(readInt2);
                return true;
            case 4:
                parcel.readString();
                parcel.readDouble();
                int i2 = AbstractC3336e.ad;
                parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1947e();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                AbstractC3336e.license(parcel);
                mo1954import(readString3, readString4);
                return true;
            case 6:
                String readString5 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                AbstractC3336e.license(parcel);
                mo1943break(readString5, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1946e(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                AbstractC3336e.license(parcel);
                applovin(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1945e(readInt5);
                return true;
            case 10:
                parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1950e(readInt6, readLong);
                return true;
            case 11:
                parcel.readString();
                long readLong2 = parcel.readLong();
                AbstractC3336e.license(parcel);
                mo1951e(readLong2);
                return true;
            case 12:
                C18383e c18383e = (C18383e) AbstractC3336e.ad(parcel, C18383e.CREATOR);
                AbstractC3336e.license(parcel);
                mo1948e(c18383e);
                return true;
            case 13:
                C17448e c17448e = (C17448e) AbstractC3336e.ad(parcel, C17448e.CREATOR);
                AbstractC3336e.license(parcel);
                mo1953finally(c17448e);
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                AbstractC3336e.license(parcel);
                mo1952e(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                AbstractC3336e.license(parcel);
                vip(readInt8);
                return true;
            default:
                return false;
        }
    }
}
