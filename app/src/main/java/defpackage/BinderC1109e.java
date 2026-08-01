package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC1109e extends AbstractBinderC3782e {
    public final /* synthetic */ Object appmetrica;
    public final /* synthetic */ int license = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1109e(AbstractC1215e abstractC1215e) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 2);
        this.appmetrica = abstractC1215e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1109e(C10078e c10078e) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 2);
        this.appmetrica = c10078e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1109e(C12118e c12118e) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 2);
        this.appmetrica = c12118e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC1109e(AsyncTaskC16040e asyncTaskC16040e) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 2);
        this.appmetrica = asyncTaskC16040e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i2 = this.license;
        Object obj = this.appmetrica;
        int i3 = 1;
        switch (i2) {
            case 0:
                AbstractC1215e abstractC1215e = (AbstractC1215e) obj;
                switch (i) {
                    case 1:
                        BinderC3838e binderC3838e = new BinderC3838e(abstractC1215e);
                        parcel2.writeNoException();
                        AbstractC3336e.metrica(parcel2, binderC3838e);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        ((C10078e) abstractC1215e).purchase(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        ((C10078e) abstractC1215e).purchase(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i4 = AbstractC3336e.ad;
                        int i5 = parcel.readInt() != 0 ? 1 : 0;
                        AbstractC3336e.license(parcel);
                        C10078e c10078e = (C10078e) abstractC1215e;
                        InterfaceC4112e interfaceC4112e = c10078e.appmetrica;
                        if (interfaceC4112e != null) {
                            try {
                                C13560e c13560e = (C13560e) interfaceC4112e;
                                Parcel m4156e = c13560e.m4156e();
                                m4156e.writeInt(i5);
                                m4156e.writeInt(0);
                                c13560e.m4155e(m4156e, 6);
                            } catch (RemoteException e) {
                                C10078e.smaato.ad(e, "Unable to call %s on %s.", "disconnectFromDevice", InterfaceC4112e.class.getSimpleName());
                            }
                            c10078e.ad(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        C10078e c10078e2 = (C10078e) abstractC1215e;
                        c10078e2.getClass();
                        AbstractC9528e.appmetrica();
                        C5710e c5710e = c10078e2.adcel;
                        long appmetrica = c5710e == null ? 0L : c5710e.appmetrica() - c10078e2.adcel.ad();
                        parcel2.writeNoException();
                        parcel2.writeLong(appmetrica);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        C10078e c10078e3 = (C10078e) abstractC1215e;
                        c10078e3.getClass();
                        c10078e3.mopub = CastDevice.billing(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        C10078e c10078e4 = (C10078e) abstractC1215e;
                        c10078e4.getClass();
                        c10078e4.mopub = CastDevice.billing(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) AbstractC3336e.ad(parcel, Bundle.CREATOR);
                        AbstractC3336e.license(parcel);
                        C10078e c10078e5 = (C10078e) abstractC1215e;
                        c10078e5.getClass();
                        CastDevice billing = CastDevice.billing(bundle5);
                        if (billing != null) {
                            String str = billing.f672e;
                            if (!billing.equals(c10078e5.mopub)) {
                                Object[] objArr = !TextUtils.isEmpty(str) && ((castDevice2 = c10078e5.mopub) == null || !TextUtils.equals(castDevice2.f672e, str));
                                c10078e5.mopub = billing;
                                C10078e.smaato.vip("update to device (%s) with name %s", billing, true != objArr ? "unchanged" : "changed");
                                if (objArr != false && (castDevice = c10078e5.mopub) != null) {
                                    C6639e c6639e = c10078e5.yandex;
                                    if (c6639e != null) {
                                        C18482e c18482e = C6639e.tapsense;
                                        Log.i(c18482e.ad, c18482e.license("update Cast device to %s", castDevice));
                                        c6639e.loadAd = castDevice;
                                        c6639e.vip();
                                    }
                                    Iterator it = new HashSet(c10078e5.license).iterator();
                                    while (it.hasNext()) {
                                        ((C18017e) it.next()).getClass();
                                    }
                                    C10182e c10182e = c10078e5.advert;
                                    if (c10182e != null) {
                                        ((C11328e) c10182e.f20137e).license().signatures++;
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                    default:
                        return false;
                }
                return true;
            case 1:
                C12118e c12118e = (C12118e) obj;
                if (i == 1) {
                    String readString = parcel.readString();
                    AbstractC3336e.license(parcel);
                    c12118e.getClass();
                    Context context = c12118e.ad;
                    String str2 = c12118e.vip;
                    Context context2 = c12118e.ad;
                    C12487e c12487e = c12118e.license;
                    BinderC8922e binderC8922e = c12118e.appmetrica;
                    InterfaceC15751e metrica = new C10078e(context, str2, readString, c12487e, binderC8922e, new C6639e(context2, c12487e, binderC8922e)).metrica();
                    parcel2.writeNoException();
                    AbstractC3336e.metrica(parcel2, metrica);
                } else if (i == 2) {
                    boolean z = c12118e.license.f25002e;
                    parcel2.writeNoException();
                    int i6 = AbstractC3336e.ad;
                    parcel2.writeInt(z ? 1 : 0);
                } else if (i == 3) {
                    String str3 = c12118e.vip;
                    parcel2.writeNoException();
                    parcel2.writeString(str3);
                } else {
                    if (i != 4) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            case 2:
                if (i == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    AbstractC3336e.license(parcel);
                    AsyncTaskC16040e.ad((AsyncTaskC16040e) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                    parcel2.writeNoException();
                } else {
                    if (i != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
            default:
                C10078e c10078e6 = (C10078e) obj;
                if (i == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    AbstractC3336e.license(parcel);
                    C4612e c4612e = c10078e6.startapp;
                    if (c4612e != null && c4612e.f9941class == 3) {
                        c4612e.getClass();
                        C9321e ad = C0381e.ad();
                        ad.ad = new C15093e(c4612e, readString2, readString3, i3);
                        ad.appmetrica = 8407;
                        c4612e.appmetrica(1, ad.ad()).ad(new C0731e(7, this));
                    }
                    parcel2.writeNoException();
                } else if (i == 2) {
                    String readString4 = parcel.readString();
                    C9753e c9753e = (C9753e) AbstractC3336e.ad(parcel, C9753e.CREATOR);
                    AbstractC3336e.license(parcel);
                    C4612e c4612e2 = c10078e6.startapp;
                    if (c4612e2 != null && c4612e2.f9941class == 3) {
                        c4612e2.getClass();
                        C9321e ad2 = C0381e.ad();
                        ad2.ad = new C15024e(15, c4612e2, readString4, c9753e);
                        ad2.appmetrica = 8406;
                        c4612e2.appmetrica(1, ad2.ad()).ad(new C5354e(this));
                    }
                    parcel2.writeNoException();
                } else if (i == 3) {
                    String readString5 = parcel.readString();
                    AbstractC3336e.license(parcel);
                    C4612e c4612e3 = c10078e6.startapp;
                    if (c4612e3 != null && c4612e3.f9941class == 3) {
                        c4612e3.getClass();
                        C9321e ad3 = C0381e.ad();
                        ad3.ad = new C9271e(c4612e3, readString5);
                        ad3.appmetrica = 8409;
                        c4612e3.appmetrica(1, ad3.ad());
                    }
                    parcel2.writeNoException();
                } else if (i == 4) {
                    int readInt = parcel.readInt();
                    AbstractC3336e.license(parcel);
                    c10078e6.appmetrica(readInt);
                    parcel2.writeNoException();
                } else {
                    if (i != 5) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                }
                return true;
        }
    }
}
