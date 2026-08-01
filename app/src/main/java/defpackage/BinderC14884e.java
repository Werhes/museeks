package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC14884e extends AbstractBinderC5235e implements InterfaceC8227e {
    public String appmetrica;
    public Boolean license;
    public final C15398e metrica;

    public BinderC14884e(C15398e c15398e) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        AbstractC9528e.startapp(c15398e);
        this.metrica = c15398e;
        this.appmetrica = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [eٖ٘ؔ] */
    /* JADX WARN: Type inference failed for: r8v8, types: [eٖ٘ؔ] */
    @Override // defpackage.AbstractBinderC5235e
    public final boolean adcel(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        List list;
        C15398e c15398e = this.metrica;
        ArrayList arrayList = null;
        InterfaceC6486e interfaceC6486e = null;
        InterfaceC7517e interfaceC7517e = null;
        int i2 = 1;
        switch (i) {
            case 1:
                C15541e c15541e = (C15541e) AbstractC1757e.ad(parcel, C15541e.CREATOR);
                C8019e c8019e = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1647e(c15541e, c8019e);
                parcel2.writeNoException();
                return true;
            case 2:
                C9097e c9097e = (C9097e) AbstractC1757e.ad(parcel, C9097e.CREATOR);
                C8019e c8019e2 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1654e(c9097e, c8019e2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            default:
                return false;
            case 4:
                C8019e c8019e3 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1661final(c8019e3);
                parcel2.writeNoException();
                return true;
            case 5:
                C15541e c15541e2 = (C15541e) AbstractC1757e.ad(parcel, C15541e.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                AbstractC1757e.license(parcel);
                AbstractC9528e.startapp(c15541e2);
                AbstractC9528e.purchase(readString);
                m3885e(readString, true);
                m3887e(new RunnableC11666e(this, c15541e2, readString, false, 14));
                parcel2.writeNoException();
                return true;
            case 6:
                C8019e c8019e4 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1652e(c8019e4);
                parcel2.writeNoException();
                return true;
            case 7:
                C8019e c8019e5 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                z = parcel.readInt() != 0;
                AbstractC1757e.license(parcel);
                m3886e(c8019e5);
                String str = c8019e5.f16300e;
                AbstractC9528e.startapp(str);
                try {
                    List<C10030e> list2 = (List) c15398e.mo2262e().m2249e(new CallableC4347e(this, (Object) str, i2)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (C10030e c10030e : list2) {
                        if (!z && C5240e.m1785e(c10030e.metrica)) {
                        }
                        arrayList2.add(new C9097e(c10030e));
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                } catch (ExecutionException e2) {
                    e = e2;
                    c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str), e, "Failed to get user properties. appId");
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                C15541e c15541e3 = (C15541e) AbstractC1757e.ad(parcel, C15541e.CREATOR);
                String readString2 = parcel.readString();
                AbstractC1757e.license(parcel);
                byte[] mo1649e = mo1649e(readString2, c15541e3);
                parcel2.writeNoException();
                parcel2.writeByteArray(mo1649e);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                AbstractC1757e.license(parcel);
                mo1663package(readLong, readString3, readString4, readString5);
                parcel2.writeNoException();
                return true;
            case 11:
                C8019e c8019e6 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                String mo1655e = mo1655e(c8019e6);
                parcel2.writeNoException();
                parcel2.writeString(mo1655e);
                return true;
            case 12:
                C15148e c15148e = (C15148e) AbstractC1757e.ad(parcel, C15148e.CREATOR);
                C8019e c8019e7 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1656e(c15148e, c8019e7);
                parcel2.writeNoException();
                return true;
            case 13:
                C15148e c15148e2 = (C15148e) AbstractC1757e.ad(parcel, C15148e.CREATOR);
                AbstractC1757e.license(parcel);
                AbstractC9528e.startapp(c15148e2);
                AbstractC9528e.startapp(c15148e2.f29980e);
                AbstractC9528e.purchase(c15148e2.f29987e);
                m3885e(c15148e2.f29987e, true);
                m3887e(new RunnableC12554e((Object) this, (Object) new C15148e(c15148e2), false, 9));
                parcel2.writeNoException();
                return true;
            case 14:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                ClassLoader classLoader = AbstractC1757e.ad;
                z = parcel.readInt() != 0;
                C8019e c8019e8 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                List mo1664return = mo1664return(readString6, readString7, z, c8019e8);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo1664return);
                return true;
            case 15:
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                ClassLoader classLoader2 = AbstractC1757e.ad;
                z = parcel.readInt() != 0;
                AbstractC1757e.license(parcel);
                List mo1667this = mo1667this(readString8, readString9, readString10, z);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo1667this);
                return true;
            case 16:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                C8019e c8019e9 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                List mo1659e = mo1659e(readString11, readString12, c8019e9);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo1659e);
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                AbstractC1757e.license(parcel);
                List mo1660e = mo1660e(readString13, readString14, readString15);
                parcel2.writeNoException();
                parcel2.writeTypedList(mo1660e);
                return true;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8019e c8019e10 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1657e(c8019e10);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                Bundle bundle = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                C8019e c8019e11 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1665static(bundle, c8019e11);
                parcel2.writeNoException();
                return true;
            case 20:
                C8019e c8019e12 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1653e(c8019e12);
                parcel2.writeNoException();
                return true;
            case 21:
                C8019e c8019e13 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                C12221e mo1662goto = mo1662goto(c8019e13);
                parcel2.writeNoException();
                if (mo1662goto == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                mo1662goto.writeToParcel(parcel2, 1);
                return true;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C8019e c8019e14 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                Bundle bundle2 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                AbstractC1757e.license(parcel);
                m3886e(c8019e14);
                String str2 = c8019e14.f16300e;
                AbstractC9528e.startapp(str2);
                if (c15398e.m3958package().m2822e(null, AbstractC17254e.f33812e)) {
                    try {
                        list = (List) c15398e.mo2262e().m2248e(new CallableC9880e(this, c8019e14, bundle2, 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e3) {
                        c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                } else {
                    try {
                        list = (List) c15398e.mo2262e().m2249e(new CallableC9880e(this, c8019e14, bundle2, 1)).get();
                    } catch (InterruptedException | ExecutionException e4) {
                        c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C8019e c8019e15 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1668volatile(c8019e15);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C8019e c8019e16 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1651e(c8019e16);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C8019e c8019e17 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1650e(c8019e17);
                parcel2.writeNoException();
                return true;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                C8019e c8019e18 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                C1157e c1157e = (C1157e) AbstractC1757e.ad(parcel, C1157e.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    interfaceC7517e = queryLocalInterface instanceof InterfaceC7517e ? (InterfaceC7517e) queryLocalInterface : new AbstractC16277e(readStrongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 5);
                }
                AbstractC1757e.license(parcel);
                mo1666synchronized(c8019e18, c1157e, interfaceC7517e);
                parcel2.writeNoException();
                return true;
            case 30:
                C8019e c8019e19 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                C17965e c17965e = (C17965e) AbstractC1757e.ad(parcel, C17965e.CREATOR);
                AbstractC1757e.license(parcel);
                mo1658e(c8019e19, c17965e);
                parcel2.writeNoException();
                return true;
            case 31:
                C8019e c8019e20 = (C8019e) AbstractC1757e.ad(parcel, C8019e.CREATOR);
                Bundle bundle3 = (Bundle) AbstractC1757e.ad(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    interfaceC6486e = queryLocalInterface2 instanceof InterfaceC6486e ? (InterfaceC6486e) queryLocalInterface2 : new AbstractC16277e(readStrongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 5);
                }
                AbstractC1757e.license(parcel);
                mo1648e(c8019e20, bundle3, interfaceC6486e);
                parcel2.writeNoException();
                return true;
        }
    }

    /* renamed from: eؚؑ۟, reason: contains not printable characters */
    public final void m3885e(String str, boolean z) {
        boolean isEmpty = TextUtils.isEmpty(str);
        C15398e c15398e = this.metrica;
        if (isEmpty) {
            c15398e.mo2261e().f27502e.ad("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                if (this.license == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.appmetrica) && !AbstractC16155e.smaato(c15398e.f30352e.f14225e, Binder.getCallingUid()) && !C6274e.ad(c15398e.f30352e.f14225e).vip(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    this.license = Boolean.valueOf(z2);
                }
                if (this.license.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                c15398e.mo2261e().f27502e.vip(C13879e.m3689e(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.appmetrica == null) {
            Context context = c15398e.f30352e.f14225e;
            int callingUid = Binder.getCallingUid();
            int i = AbstractC18410e.appmetrica;
            if (AbstractC16155e.amazon(callingUid, context, str)) {
                this.appmetrica = str;
            }
        }
        if (str.equals(this.appmetrica)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّؔٞ */
    public final void mo1647e(C15541e c15541e, C8019e c8019e) {
        AbstractC9528e.startapp(c15541e);
        m3886e(c8019e);
        m3887e(new RunnableC11666e(this, c15541e, c8019e, false, 13));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؕؗؑ */
    public final void mo1648e(C8019e c8019e, Bundle bundle, InterfaceC6486e interfaceC6486e) {
        m3886e(c8019e);
        String str = c8019e.f16300e;
        AbstractC9528e.startapp(str);
        this.metrica.mo2262e().m2254e(new RunnableC3512e(this, c8019e, bundle, interfaceC6486e, str));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eَُؗ */
    public final byte[] mo1649e(String str, C15541e c15541e) {
        AbstractC9528e.purchase(str);
        AbstractC9528e.startapp(c15541e);
        m3885e(str, true);
        C15398e c15398e = this.metrica;
        C14937e c14937e = c15398e.mo2261e().f27496e;
        C6936e c6936e = c15398e.f30352e;
        C7269e c7269e = c6936e.f14202e;
        String str2 = c15541e.f30689e;
        c14937e.vip(c7269e.ad(str2), "Log and bundle. event");
        c15398e.mo2259e().getClass();
        long nanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) c15398e.mo2262e().m2248e(new CallableC8878e(this, c15541e, str)).get();
            if (bArr == null) {
                c15398e.mo2261e().f27502e.vip(C13879e.m3689e(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            c15398e.mo2259e().getClass();
            c15398e.mo2261e().f27496e.license("Log and bundle processed. event, size, time_ms", c6936e.f14202e.ad(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            c15398e.mo2261e().f27502e.license("Failed to log and bundle. appId, event, error", C13879e.m3689e(str), c6936e.f14202e.ad(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            c15398e.mo2261e().f27502e.license("Failed to log and bundle. appId, event, error", C13879e.m3689e(str), c6936e.f14202e.ad(str2), e);
            return null;
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؚٕؗ */
    public final void mo1650e(C8019e c8019e) {
        m3886e(c8019e);
        m3887e(new RunnableC8555e(this, c8019e, 1));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؚۜؑ */
    public final void mo1651e(C8019e c8019e) {
        AbstractC9528e.purchase(c8019e.f16300e);
        AbstractC9528e.startapp(c8019e.f16295e);
        remoteconfig(new RunnableC8555e(this, c8019e, 5));
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public final void m3886e(C8019e c8019e) {
        AbstractC9528e.startapp(c8019e);
        String str = c8019e.f16300e;
        AbstractC9528e.purchase(str);
        m3885e(str, false);
        this.metrica.m3960return().m1807e(c8019e.f16282e);
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eَٖٓ */
    public final void mo1652e(C8019e c8019e) {
        m3886e(c8019e);
        m3887e(new RunnableC8555e(this, c8019e, 2));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّؓٙ */
    public final void mo1653e(C8019e c8019e) {
        AbstractC9528e.purchase(c8019e.f16300e);
        AbstractC9528e.startapp(c8019e.f16295e);
        remoteconfig(new RunnableC8555e(this, c8019e, 4));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّ۟ٝ */
    public final void mo1654e(C9097e c9097e, C8019e c8019e) {
        AbstractC9528e.startapp(c9097e);
        m3886e(c8019e);
        m3887e(new RunnableC11666e(this, c9097e, c8019e, false, 15));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eّ۟ۘ */
    public final String mo1655e(C8019e c8019e) {
        m3886e(c8019e);
        C15398e c15398e = this.metrica;
        try {
            return (String) c15398e.mo2262e().m2249e(new CallableC4347e(c15398e, c8019e)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(c8019e.f16300e), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eْۢؕ */
    public final void mo1656e(C15148e c15148e, C8019e c8019e) {
        AbstractC9528e.startapp(c15148e);
        AbstractC9528e.startapp(c15148e.f29980e);
        m3886e(c8019e);
        C15148e c15148e2 = new C15148e(c15148e);
        c15148e2.f29987e = c8019e.f16300e;
        m3887e(new RunnableC11666e(this, c15148e2, c8019e, false, 12));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٓٔؔ */
    public final void mo1657e(C8019e c8019e) {
        String str = c8019e.f16300e;
        AbstractC9528e.purchase(str);
        m3885e(str, false);
        m3887e(new RunnableC8555e(this, c8019e, 3));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٖٔۧ */
    public final void mo1658e(C8019e c8019e, C17965e c17965e) {
        m3886e(c8019e);
        m3887e(new RunnableC11666e(16, this, c8019e, c17965e));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eٌٗۙ */
    public final List mo1659e(String str, String str2, C8019e c8019e) {
        m3886e(c8019e);
        String str3 = c8019e.f16300e;
        AbstractC9528e.startapp(str3);
        C15398e c15398e = this.metrica;
        try {
            return (List) c15398e.mo2262e().m2249e(new CallableC9692e(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            c15398e.mo2261e().f27502e.vip(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: eؙٟ٘ */
    public final List mo1660e(String str, String str2, String str3) {
        m3885e(str, true);
        C15398e c15398e = this.metrica;
        try {
            return (List) c15398e.mo2262e().m2249e(new CallableC9692e(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            c15398e.mo2261e().f27502e.vip(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: eٍۡ, reason: contains not printable characters */
    public final void m3887e(Runnable runnable) {
        C15398e c15398e = this.metrica;
        if (c15398e.mo2262e().m2247e()) {
            runnable.run();
        } else {
            c15398e.mo2262e().m2254e(runnable);
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: final */
    public final void mo1661final(C8019e c8019e) {
        m3886e(c8019e);
        m3887e(new RunnableC8555e(this, c8019e, 0));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: goto */
    public final C12221e mo1662goto(C8019e c8019e) {
        m3886e(c8019e);
        String str = c8019e.f16300e;
        AbstractC9528e.purchase(str);
        C15398e c15398e = this.metrica;
        try {
            return (C12221e) c15398e.mo2262e().m2248e(new CallableC4347e(this, (Object) c8019e, 2)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str), e, "Failed to get consent. appId");
            return new C12221e(null);
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: package */
    public final void mo1663package(long j, String str, String str2, String str3) {
        m3887e(new RunnableC2360e(this, str2, str3, str, j, 2));
    }

    public final void remoteconfig(Runnable runnable) {
        C15398e c15398e = this.metrica;
        if (c15398e.mo2262e().m2247e()) {
            runnable.run();
        } else {
            c15398e.mo2262e().m2253e(runnable);
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: return */
    public final List mo1664return(String str, String str2, boolean z, C8019e c8019e) {
        m3886e(c8019e);
        String str3 = c8019e.f16300e;
        AbstractC9528e.startapp(str3);
        C15398e c15398e = this.metrica;
        try {
            List<C10030e> list = (List) c15398e.mo2262e().m2249e(new CallableC9692e(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10030e c10030e : list) {
                if (!z && C5240e.m1785e(c10030e.metrica)) {
                }
                arrayList.add(new C9097e(c10030e));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: static */
    public final void mo1665static(Bundle bundle, C8019e c8019e) {
        m3886e(c8019e);
        String str = c8019e.f16300e;
        AbstractC9528e.startapp(str);
        m3887e(new RunnableC11327e(7, this, bundle, str, c8019e, false));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: synchronized */
    public final void mo1666synchronized(C8019e c8019e, C1157e c1157e, InterfaceC7517e interfaceC7517e) {
        m3886e(c8019e);
        String str = c8019e.f16300e;
        AbstractC9528e.startapp(str);
        this.metrica.mo2262e().m2254e(new RunnableC11327e(5, this, str, c1157e, interfaceC7517e, false));
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: this */
    public final List mo1667this(String str, String str2, String str3, boolean z) {
        m3885e(str, true);
        C15398e c15398e = this.metrica;
        try {
            List<C10030e> list = (List) c15398e.mo2262e().m2249e(new CallableC9692e(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C10030e c10030e : list) {
                if (!z && C5240e.m1785e(c10030e.metrica)) {
                }
                arrayList.add(new C9097e(c10030e));
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            c15398e.mo2261e().f27502e.metrica(C13879e.m3689e(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.InterfaceC8227e
    /* renamed from: volatile */
    public final void mo1668volatile(C8019e c8019e) {
        AbstractC9528e.purchase(c8019e.f16300e);
        AbstractC9528e.startapp(c8019e.f16295e);
        remoteconfig(new RunnableC8555e(this, c8019e, 6));
    }
}
