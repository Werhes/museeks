package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Objects;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C17659e implements InterfaceC17847e, InterfaceC10846e, InterfaceC1835e, InterfaceC14309e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f34612e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f34613e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34614e;

    public /* synthetic */ C17659e() {
        this.f34614e = 8;
    }

    public C17659e(Context context) {
        this.f34614e = 9;
        this.f34612e = new AtomicLong(-1L);
        this.f34613e = new AbstractC6950e(context, C4480e.advert, new C16172e("mlkit:vision"), C16258e.metrica);
    }

    public C17659e(AppMeasurementSdk appMeasurementSdk, C16911e c16911e) {
        this.f34614e = 4;
        this.f34612e = c16911e;
        appMeasurementSdk.ad(new C10873e(0, this));
        this.f34613e = new HashSet();
    }

    public C17659e(C5470e c5470e) {
        this.f34614e = 6;
        this.f34613e = c5470e == null ? null : c5470e.f11741e;
    }

    public /* synthetic */ C17659e(C8130e c8130e, C2580e c2580e, C18473e c18473e) {
        this.f34614e = 3;
        this.f34613e = c2580e;
        this.f34612e = c18473e;
    }

    public C17659e(C18111e c18111e, InterfaceC10846e interfaceC10846e) {
        this.f34614e = 1;
        this.f34613e = interfaceC10846e;
        Objects.requireNonNull(c18111e);
        this.f34612e = c18111e;
    }

    public /* synthetic */ C17659e(Object obj, Object obj2, int i) {
        this.f34614e = i;
        this.f34613e = obj;
        this.f34612e = obj2;
    }

    public /* synthetic */ C17659e(Object obj, Object obj2, boolean z, int i) {
        this.f34614e = i;
        this.f34613e = obj2;
        this.f34612e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        switch (this.f34614e) {
            case 0:
                BinderC6030e binderC6030e = new BinderC6030e((C4480e) this.f34613e, (C8988e) obj2, 1);
                C0563e c0563e = (C0563e) ((C2324e) obj).loadAd();
                C9705e c9705e = (C9705e) this.f34612e;
                Parcel adcel = c0563e.adcel();
                int i = AbstractC9126e.ad;
                adcel.writeStrongBinder(binderC6030e);
                AbstractC9126e.vip(adcel, c9705e);
                adcel.writeStrongBinder(null);
                c0563e.remoteconfig(adcel, 2);
                return;
            default:
                C7971e c7971e = (C7971e) obj;
                C4627e c4627e = new C4627e((C8988e) obj2);
                C2580e c2580e = (C2580e) this.f34613e;
                C18473e c18473e = (C18473e) this.f34612e;
                c7971e.getClass();
                BinderC16545e binderC16545e = new BinderC16545e(c2580e);
                c7971e.crashlytics.add(binderC16545e);
                C11125e c11125e = (C11125e) c7971e.loadAd();
                BinderC11050e binderC11050e = new BinderC11050e(c4627e);
                Parcel m4156e = c11125e.m4156e();
                int i2 = AbstractC0923e.ad;
                m4156e.writeInt(1);
                int applovin = AbstractC16852e.applovin(m4156e, 20293);
                AbstractC16852e.smaato(m4156e, 1, binderC11050e);
                AbstractC16852e.remoteconfig(m4156e, 3, "vkx_cdcm");
                AbstractC16852e.isPro(m4156e, 4, 8);
                m4156e.writeLong(0L);
                AbstractC16852e.subscription(m4156e, 5, c18473e, 0);
                AbstractC16852e.smaato(m4156e, 6, binderC16545e);
                AbstractC16852e.ads(m4156e, applovin);
                c11125e.m4153e(m4156e, 2003);
                return;
        }
    }

    public void ad(ArrayList arrayList) {
        OutputStream outputStream = (OutputStream) AbstractC4306e.appmetrica(arrayList);
        if (outputStream instanceof C15387e) {
            this.f34612e = (C15387e) outputStream;
            this.f34613e = (OutputStream) arrayList.get(0);
        }
    }

    @Override // defpackage.InterfaceC14309e
    public void license(Object obj) {
        C8320e c8320e = (C8320e) this.f34612e;
        c8320e.mo2250e();
        C6936e c6936e = (C6936e) c8320e.f36443e;
        C1195e c1195e = c6936e.f14198e;
        C6936e.purchase(c1195e);
        SparseArray m485e = c1195e.m485e();
        C6471e c6471e = (C6471e) this.f34613e;
        m485e.put(c6471e.f13385e, Long.valueOf(c6471e.f13386e));
        C1195e c1195e2 = c6936e.f14198e;
        C6936e.purchase(c1195e2);
        int[] iArr = new int[m485e.size()];
        long[] jArr = new long[m485e.size()];
        for (int i = 0; i < m485e.size(); i++) {
            iArr[i] = m485e.keyAt(i);
            jArr[i] = ((Long) m485e.valueAt(i)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        c1195e2.f3807e.m3004const(bundle);
        c8320e.f17002e = false;
        c8320e.f17010e = 1;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27496e.vip(c6471e.f13387e, "Successfully registered trigger URI");
        c8320e.m2400e();
    }

    @Override // defpackage.InterfaceC10846e
    public void mopub(String str, long j, long j2, long j3) {
        InterfaceC10846e interfaceC10846e = (InterfaceC10846e) this.f34613e;
        if (interfaceC10846e != null) {
            interfaceC10846e.mopub(str, j, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC10846e
    public void signatures(String str, long j, int i, Object obj, long j2, long j3) {
        int i2;
        InterfaceC10846e interfaceC10846e = (InterfaceC10846e) this.f34613e;
        if (interfaceC10846e != null) {
            if (i == 2001) {
                C18111e c18111e = (C18111e) this.f34612e;
                Object[] objArr = {Integer.valueOf(c18111e.startapp)};
                C18482e c18482e = (C18482e) c18111e.ad;
                Log.w(c18482e.ad, c18482e.license("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((C5710e) c18111e.yandex.f20137e).yandex.iterator();
                while (it.hasNext()) {
                    C8327e c8327e = (C8327e) it.next();
                    switch (c8327e.ad) {
                        case 0:
                            ((C9407e) c8327e.vip).vip();
                            break;
                    }
                }
                i2 = 2001;
            } else {
                i2 = i;
            }
            interfaceC10846e.signatures(str, j, i2, obj, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC1835e
    public C11467e vip(InterfaceC2268e interfaceC2268e) {
        C11467e m3217protected = ((C11467e) this.f34613e).m3217protected();
        m3217protected.m3214implements((String) this.f34612e, interfaceC2268e);
        return m3217protected;
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
        C8320e c8320e = (C8320e) this.f34612e;
        c8320e.mo2250e();
        C6936e c6936e = (C6936e) c8320e.f36443e;
        c8320e.f17002e = false;
        c8320e.m2399e().add((C6471e) this.f34613e);
        if (c8320e.f17010e > ((Integer) AbstractC17254e.f33827e.ad(null)).intValue()) {
            c8320e.f17010e = 1;
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27495e.metrica(C13879e.m3689e(c6936e.smaato().m3391e()), C13879e.m3689e(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
            return;
        }
        C13879e c13879e2 = c6936e.f14227e;
        C6936e.yandex(c13879e2);
        c13879e2.f27495e.license("registerTriggerAsync failed. App ID, delay in seconds, throwable", C13879e.m3689e(c6936e.smaato().m3391e()), C13879e.m3689e(String.valueOf(c8320e.f17010e)), C13879e.m3689e(th.toString()));
        int i = c8320e.f17010e;
        if (c8320e.f17001e == null) {
            c8320e.f17001e = new C2200e(c8320e, c6936e, 1);
        }
        c8320e.f17001e.vip(i * 1000);
        int i2 = c8320e.f17010e;
        c8320e.f17010e = i2 + i2;
    }
}
