package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؑۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0642e implements InterfaceC10846e, InterfaceC1835e, InterfaceC17847e, InterfaceC9307e, InterfaceC0987e, InterfaceC0771e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f2879e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f2880e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2881e;

    public /* synthetic */ C0642e(int i, Object obj) {
        this.f2881e = i;
        this.f2879e = obj;
    }

    public C0642e(C8130e c8130e, String str) {
        this.f2881e = 3;
        this.f2880e = str;
        this.f2879e = c8130e;
    }

    public /* synthetic */ C0642e(C8130e c8130e, String str, C2580e c2580e) {
        this.f2881e = 2;
        this.f2880e = str;
        this.f2879e = c2580e;
    }

    public C0642e(C18111e c18111e, InterfaceC10846e interfaceC10846e) {
        this.f2881e = 0;
        this.f2880e = interfaceC10846e;
        Objects.requireNonNull(c18111e);
        this.f2879e = c18111e;
    }

    public /* synthetic */ C0642e(Object obj, Object obj2, int i) {
        this.f2881e = i;
        this.f2880e = obj;
        this.f2879e = obj2;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        switch (this.f2881e) {
            case 2:
                C7971e c7971e = (C7971e) obj;
                C4627e c4627e = new C4627e((C8988e) obj2);
                String str = (String) this.f2880e;
                C2580e c2580e = (C2580e) this.f2879e;
                c7971e.getClass();
                BinderC3238e binderC3238e = new BinderC3238e(c7971e.metrica, c2580e, c7971e.f16146native);
                c7971e.f16143class.add(binderC3238e);
                C11125e c11125e = (C11125e) c7971e.loadAd();
                C2006e c2006e = new C2006e();
                c2006e.f5251e = new BinderC11050e(c4627e);
                c2006e.f5247e = str;
                c2006e.f5246e = binderC3238e;
                Parcel m4156e = c11125e.m4156e();
                int i = AbstractC0923e.ad;
                m4156e.writeInt(1);
                c2006e.writeToParcel(m4156e, 0);
                c11125e.m4153e(m4156e, 2006);
                return;
            case 3:
            default:
                int i2 = C3355e.mopub;
                BinderC15538e binderC15538e = new BinderC15538e((C8988e) obj2);
                C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
                String[] strArr = (String[]) this.f2879e;
                String str2 = (String) this.f2880e;
                Parcel m4156e2 = c18117e.m4156e();
                AbstractC1757e.metrica(m4156e2, binderC15538e);
                m4156e2.writeString(str2);
                m4156e2.writeInt(0);
                m4156e2.writeStringArray(strArr);
                m4156e2.writeByteArray(null);
                c18117e.m4155e(m4156e2, 1);
                return;
            case 4:
                BinderC0751e binderC0751e = new BinderC0751e((C4480e) this.f2880e, (C8988e) obj2);
                C18172e c18172e = (C18172e) ((C6735e) obj).loadAd();
                C10988e appmetrica = AbstractC10432e.appmetrica();
                String[] strArr2 = (String[]) this.f2879e;
                Parcel m4156e3 = c18172e.m4156e();
                AbstractC3336e.metrica(m4156e3, binderC0751e);
                m4156e3.writeStringArray(strArr2);
                AbstractC3336e.vip(m4156e3, appmetrica);
                c18172e.m4151e(m4156e3, 5);
                return;
        }
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        Bundle bundle;
        C5916e c5916e = (C5916e) this.f2880e;
        Bundle bundle2 = (Bundle) this.f2879e;
        c5916e.getClass();
        return (c0560e.advert() && (bundle = (Bundle) c0560e.adcel()) != null && bundle.containsKey("google.messenger")) ? c5916e.ad(bundle2).smaato(ExecutorC0082e.f1250e, C11047e.f21918e) : c0560e;
    }

    @Override // defpackage.InterfaceC0987e
    public ListenableFuture call() {
        C9664e c9664e = (C9664e) this.f2879e;
        RunnableC1156e license = c9664e.yandex.license("Initialize ".concat(String.valueOf(c9664e.ad)));
        try {
            synchronized (c9664e.billing) {
                try {
                    if (((List) this.f2880e) == null) {
                        this.f2880e = c9664e.startapp;
                        c9664e.startapp = Collections.EMPTY_LIST;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList(((List) this.f2880e).size());
            C17176e c17176e = new C17176e((C9664e) this.f2879e);
            Iterator it = ((List) this.f2880e).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((InterfaceC18244e) it.next()).apply(c17176e));
                } catch (Exception e) {
                    arrayList.add(AbstractC2017e.metrica(e));
                }
            }
            AbstractC17475e subscription = AbstractC17475e.subscription(arrayList);
            CallableC8878e callableC8878e = new CallableC8878e(7, this);
            C12136e c12136e = new C12136e(subscription, true);
            c12136e.f24302e = new C7219e(c12136e, callableC8878e);
            c12136e.remoteconfig();
            license.ad(c12136e);
            license.close();
            return c12136e;
        } catch (Throwable th2) {
            try {
                license.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.InterfaceC9307e
    /* renamed from: eؘؕۥ */
    public void mo268e(Exception exc) {
        if ((exc instanceof C10427e) && ((C10427e) exc).f20605e.f733e == 8003) {
            return;
        }
        ((C8130e) this.f2879e).mopub((String) this.f2880e);
    }

    @Override // defpackage.InterfaceC10846e
    public void mopub(String str, long j, long j2, long j3) {
        InterfaceC10846e interfaceC10846e = (InterfaceC10846e) this.f2880e;
        if (interfaceC10846e != null) {
            interfaceC10846e.mopub(str, j, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC10846e
    public void signatures(String str, long j, int i, Object obj, long j2, long j3) {
        ((C18111e) this.f2879e).billing = null;
        InterfaceC10846e interfaceC10846e = (InterfaceC10846e) this.f2880e;
        if (interfaceC10846e != null) {
            interfaceC10846e.signatures(str, j, i, obj, j2, j3);
        }
    }

    @Override // defpackage.InterfaceC1835e
    public C11467e vip(InterfaceC2268e interfaceC2268e) {
        C11467e m3217protected = ((C11467e) this.f2880e).m3217protected();
        String str = (String) this.f2879e;
        m3217protected.m3214implements(str, interfaceC2268e);
        ((HashMap) m3217protected.f23071e).put(str, Boolean.TRUE);
        return m3217protected;
    }
}
