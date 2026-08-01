package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC16179e extends AbstractBinderC3782e {
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractBinderC16179e(String str, int i) {
        super(str, 2);
        this.license = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [eٖ٘ؔ] */
    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 0;
        int i3 = 1;
        switch (this.license) {
            case 0:
                if (i == 1) {
                    BinderC3838e binderC3838e = new BinderC3838e((BinderC15170e) this);
                    parcel2.writeNoException();
                    AbstractC3336e.metrica(parcel2, binderC3838e);
                } else if (i == 2) {
                    BinderC15170e binderC15170e = (BinderC15170e) this;
                    C18482e c18482e = BinderC15170e.billing;
                    Log.i(c18482e.ad, c18482e.license("onAppEnteredForeground", new Object[0]));
                    binderC15170e.purchase = 1;
                    Iterator it = binderC15170e.appmetrica.iterator();
                    while (it.hasNext()) {
                        ((C16009e) it.next()).ad.Signature();
                    }
                    parcel2.writeNoException();
                } else if (i == 3) {
                    BinderC15170e binderC15170e2 = (BinderC15170e) this;
                    C18482e c18482e2 = BinderC15170e.billing;
                    Log.i(c18482e2.ad, c18482e2.license("onAppEnteredBackground", new Object[0]));
                    binderC15170e2.purchase = 2;
                    Iterator it2 = binderC15170e2.appmetrica.iterator();
                    while (it2.hasNext()) {
                        C7031e c7031e = ((C16009e) it2.next()).ad;
                        c7031e.getClass();
                        C7031e.purchase.vip("Stopping RouteDiscovery.", new Object[0]);
                        c7031e.metrica.clear();
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            C9271e c9271e = c7031e.appmetrica;
                            if (((C10085e) c9271e.f18485e) == null) {
                                c9271e.f18485e = C10085e.license((Context) c9271e.f18486e);
                            }
                            C10085e c10085e = (C10085e) c9271e.f18485e;
                            if (c10085e != null) {
                                c10085e.yandex(c7031e);
                            }
                        } else {
                            new HandlerC9134e(Looper.getMainLooper(), 6).post(new RunnableC10538e(c7031e, i3));
                        }
                    }
                    parcel2.writeNoException();
                } else {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                C6506e c6506e = null;
                Bundle bundle = null;
                switch (i) {
                    case 1:
                        Bundle bundle2 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder != null) {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                            c6506e = queryLocalInterface instanceof C6506e ? (C6506e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback", 1);
                        }
                        AbstractC3336e.license(parcel);
                        BinderC8922e binderC8922e = (BinderC8922e) this;
                        C0056e vip = C0056e.vip(bundle2);
                        if (vip != null) {
                            HashMap hashMap = binderC8922e.billing;
                            if (!hashMap.containsKey(vip)) {
                                hashMap.put(vip, new HashSet());
                            }
                            ((Set) hashMap.get(vip)).add(new C14122e(c6506e, binderC8922e, binderC8922e.yandex));
                        }
                        parcel2.writeNoException();
                        break;
                    case 2:
                        Bundle bundle3 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        int readInt = parcel.readInt();
                        AbstractC3336e.license(parcel);
                        BinderC8922e binderC8922e2 = (BinderC8922e) this;
                        C0056e vip2 = C0056e.vip(bundle3);
                        if (vip2 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC8922e2.m2506e(vip2, readInt);
                            } else {
                                new HandlerC9134e(Looper.getMainLooper(), 6).post(new RunnableC10028e(binderC8922e2, vip2, readInt, 5));
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle4 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        BinderC8922e binderC8922e3 = (BinderC8922e) this;
                        C0056e vip3 = C0056e.vip(bundle4);
                        if (vip3 != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                binderC8922e3.m2507e(vip3);
                            } else {
                                new HandlerC9134e(Looper.getMainLooper(), 6).post(new RunnableC12554e(binderC8922e3, vip3, i3));
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 4:
                        Bundle bundle5 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        int readInt2 = parcel.readInt();
                        AbstractC3336e.license(parcel);
                        BinderC8922e binderC8922e4 = (BinderC8922e) this;
                        C0056e vip4 = C0056e.vip(bundle5);
                        if (vip4 != null) {
                            binderC8922e4.appmetrica.getClass();
                            C10085e.vip();
                            C14090e metrica = C10085e.metrica();
                            ArrayList arrayList = metrica.startapp;
                            if (!vip4.license()) {
                                if ((readInt2 & 2) != 0 || !metrica.Signature) {
                                    C16936e c16936e = metrica.signatures;
                                    boolean z = c16936e != null && c16936e.vip && metrica.startapp();
                                    int size = arrayList.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        C6541e c6541e = (C6541e) arrayList.get(i4);
                                        if (((readInt2 & 1) != 0 && c6541e.license()) || ((z && !c6541e.license() && c6541e.metrica() != metrica.subscription) || !c6541e.yandex(vip4))) {
                                        }
                                    }
                                }
                                i2 = 1;
                            }
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(i2);
                        break;
                    case 5:
                        String readString = parcel.readString();
                        AbstractC3336e.license(parcel);
                        C18482e c18482e3 = BinderC8922e.advert;
                        c18482e3.vip("select route with routeId = %s", readString);
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        Iterator it3 = C10085e.metrica().startapp.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                C6541e c6541e2 = (C6541e) it3.next();
                                if (c6541e2.metrica.equals(readString)) {
                                    c18482e3.vip("media route is found and selected", new Object[0]);
                                    c6541e2.advert(true);
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    case 6:
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        C6541e c6541e3 = C10085e.metrica().tapsense;
                        if (c6541e3 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        c6541e3.advert(true);
                        parcel2.writeNoException();
                        break;
                    case 7:
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        C6541e c6541e4 = C10085e.metrica().tapsense;
                        if (c6541e4 == null) {
                            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                        }
                        boolean equals = C10085e.purchase().metrica.equals(c6541e4.metrica);
                        parcel2.writeNoException();
                        int i5 = AbstractC3336e.ad;
                        parcel2.writeInt(equals ? 1 : 0);
                        break;
                    case 8:
                        String readString2 = parcel.readString();
                        AbstractC3336e.license(parcel);
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        Iterator it4 = C10085e.metrica().startapp.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                C6541e c6541e5 = (C6541e) it4.next();
                                if (c6541e5.metrica.equals(readString2)) {
                                    bundle = c6541e5.remoteconfig;
                                }
                            }
                        }
                        parcel2.writeNoException();
                        if (bundle == null) {
                            parcel2.writeInt(0);
                            break;
                        } else {
                            parcel2.writeInt(1);
                            bundle.writeToParcel(parcel2, 1);
                            break;
                        }
                    case 9:
                        ((BinderC8922e) this).appmetrica.getClass();
                        String str = C10085e.purchase().metrica;
                        parcel2.writeNoException();
                        parcel2.writeString(str);
                        break;
                    case 10:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 11:
                        BinderC8922e binderC8922e5 = (BinderC8922e) this;
                        HashMap hashMap2 = binderC8922e5.billing;
                        Iterator it5 = hashMap2.values().iterator();
                        while (it5.hasNext()) {
                            Iterator it6 = ((Set) it5.next()).iterator();
                            while (it6.hasNext()) {
                                binderC8922e5.appmetrica.yandex((AbstractC17065e) it6.next());
                            }
                        }
                        hashMap2.clear();
                        parcel2.writeNoException();
                        break;
                    case 12:
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        C6541e c6541e6 = C10085e.metrica().isVip;
                        if (c6541e6 != null && C10085e.purchase().metrica.equals(c6541e6.metrica)) {
                            i2 = 1;
                        }
                        parcel2.writeNoException();
                        int i6 = AbstractC3336e.ad;
                        parcel2.writeInt(i2);
                        break;
                    case 13:
                        int readInt3 = parcel.readInt();
                        AbstractC3336e.license(parcel);
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.adcel(readInt3);
                        parcel2.writeNoException();
                        break;
                    case 14:
                        String readString3 = parcel.readString();
                        AbstractC3336e.license(parcel);
                        C18482e c18482e4 = BinderC8922e.advert;
                        ((BinderC8922e) this).appmetrica.getClass();
                        C10085e.vip();
                        Iterator it7 = C10085e.metrica().appmetrica().iterator();
                        while (it7.hasNext()) {
                            C14756e c14756e = (C14756e) it7.next();
                            if (c14756e.metrica.equals(readString3)) {
                                c18482e4.vip("clean up the connectedGroupRoute = %s", c14756e);
                                C10085e.vip();
                                if (C10085e.metrica().adcel.get(c14756e.metrica) != null) {
                                    throw new ClassCastException();
                                }
                            }
                        }
                        C6541e purchase = C10085e.purchase();
                        if (purchase != null && !purchase.yandex && purchase.metrica.equals(readString3)) {
                            c18482e4.vip("clean up the selected route = %s", purchase);
                            C10085e.adcel(0);
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
        }
    }
}
