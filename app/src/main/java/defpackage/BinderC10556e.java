package defpackage;

import android.os.Parcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC10556e extends AbstractBinderC3782e {
    public final Class appmetrica;
    public final InterfaceC15135e license;

    public BinderC10556e(InterfaceC15135e interfaceC15135e) {
        super("com.google.android.gms.cast.framework.ISessionManagerListener", 2);
        this.license = interfaceC15135e;
        this.appmetrica = C10078e.class;
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        Class cls = this.appmetrica;
        InterfaceC15135e interfaceC15135e = this.license;
        switch (i) {
            case 1:
                BinderC3838e binderC3838e = new BinderC3838e(interfaceC15135e);
                parcel2.writeNoException();
                AbstractC3336e.metrica(parcel2, binderC3838e);
                return true;
            case 2:
                InterfaceC15751e m1404e = BinderC3838e.m1404e(parcel.readStrongBinder());
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e = (AbstractC1215e) BinderC3838e.m1403e(m1404e);
                if (cls.isInstance(abstractC1215e) && interfaceC15135e != null) {
                    interfaceC15135e.startapp((AbstractC1215e) cls.cast(abstractC1215e));
                }
                parcel2.writeNoException();
                return true;
            case 3:
                InterfaceC15751e m1404e2 = BinderC3838e.m1404e(parcel.readStrongBinder());
                String readString = parcel.readString();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e2 = (AbstractC1215e) BinderC3838e.m1403e(m1404e2);
                if (cls.isInstance(abstractC1215e2) && interfaceC15135e != null) {
                    interfaceC15135e.mopub((AbstractC1215e) cls.cast(abstractC1215e2), readString);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC15751e m1404e3 = BinderC3838e.m1404e(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e3 = (AbstractC1215e) BinderC3838e.m1403e(m1404e3);
                if (cls.isInstance(abstractC1215e3) && interfaceC15135e != null) {
                    interfaceC15135e.billing((AbstractC1215e) cls.cast(abstractC1215e3), readInt);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC15751e m1404e4 = BinderC3838e.m1404e(parcel.readStrongBinder());
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e4 = (AbstractC1215e) BinderC3838e.m1403e(m1404e4);
                if (cls.isInstance(abstractC1215e4) && interfaceC15135e != null) {
                    interfaceC15135e.amazon((AbstractC1215e) cls.cast(abstractC1215e4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC15751e m1404e5 = BinderC3838e.m1404e(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e5 = (AbstractC1215e) BinderC3838e.m1403e(m1404e5);
                if (cls.isInstance(abstractC1215e5) && interfaceC15135e != null) {
                    interfaceC15135e.loadAd((AbstractC1215e) cls.cast(abstractC1215e5), readInt2);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC15751e m1404e6 = BinderC3838e.m1404e(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e6 = (AbstractC1215e) BinderC3838e.m1403e(m1404e6);
                if (cls.isInstance(abstractC1215e6) && interfaceC15135e != null) {
                    interfaceC15135e.appmetrica((AbstractC1215e) cls.cast(abstractC1215e6), readString2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC15751e m1404e7 = BinderC3838e.m1404e(parcel.readStrongBinder());
                int i2 = AbstractC3336e.ad;
                boolean z = parcel.readInt() != 0;
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e7 = (AbstractC1215e) BinderC3838e.m1403e(m1404e7);
                if (cls.isInstance(abstractC1215e7) && interfaceC15135e != null) {
                    interfaceC15135e.admob((AbstractC1215e) cls.cast(abstractC1215e7), z);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC15751e m1404e8 = BinderC3838e.m1404e(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e8 = (AbstractC1215e) BinderC3838e.m1403e(m1404e8);
                if (cls.isInstance(abstractC1215e8) && interfaceC15135e != null) {
                    interfaceC15135e.advert((AbstractC1215e) cls.cast(abstractC1215e8), readInt3);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC15751e m1404e9 = BinderC3838e.m1404e(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                AbstractC3336e.license(parcel);
                AbstractC1215e abstractC1215e9 = (AbstractC1215e) BinderC3838e.m1403e(m1404e9);
                if (cls.isInstance(abstractC1215e9) && interfaceC15135e != null) {
                    interfaceC15135e.adcel((AbstractC1215e) cls.cast(abstractC1215e9), readInt4);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
