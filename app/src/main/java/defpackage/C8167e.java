package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.function.Function;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8167e implements InterfaceC17847e, InterfaceC15135e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f16626e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16627e;

    public C8167e(int i) {
        this.f16627e = i;
        switch (i) {
            case 6:
                this.f16626e = new ConcurrentHashMap();
                return;
            default:
                this.f16626e = new LinkedHashMap();
                return;
        }
    }

    public /* synthetic */ C8167e(int i, Object obj) {
        this.f16627e = i;
        this.f16626e = obj;
    }

    public C8167e(AppMeasurementSdk appMeasurementSdk, C16911e c16911e) {
        this.f16627e = 4;
        this.f16626e = c16911e;
        appMeasurementSdk.ad(new C10873e(1, this));
    }

    public /* synthetic */ C8167e(C9149e c9149e) {
        this.f16627e = 3;
        Objects.requireNonNull(c9149e);
        this.f16626e = c9149e;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        switch (this.f16627e) {
            case 2:
                C11738e c11738e = (C11738e) ((C0159e) obj).loadAd();
                C7330e c7330e = (C7330e) this.f16626e;
                Parcel adcel = c11738e.adcel();
                AbstractC9126e.vip(adcel, c7330e);
                try {
                    c11738e.license.transact(1, adcel, null, 1);
                    adcel.recycle();
                    c8988e.vip(null);
                    return;
                } catch (Throwable th) {
                    adcel.recycle();
                    throw th;
                }
            default:
                C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
                BinderC15538e binderC15538e = new BinderC15538e((C3355e) this.f16626e, c8988e);
                Parcel m4156e = c18117e.m4156e();
                AbstractC1757e.metrica(m4156e, binderC15538e);
                c18117e.m4155e(m4156e, 27);
                return;
        }
    }

    public void ad(int i, String str) {
        ((LinkedHashMap) this.f16626e).put(str, new C5401e(i, 18, (byte) 0));
    }

    @Override // defpackage.InterfaceC15135e
    public void adcel(AbstractC1215e abstractC1215e, int i) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C7306e c7306e = new C7306e(6);
                c7306e.f14927e = Integer.valueOf(i);
                C11742e c11742e = new C11742e(c7306e);
                C11328e c11328e = (C11328e) this.f16626e;
                c11328e.ad(c11742e);
                C0385e c0385e = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e);
                c0385e.ad((C10078e) abstractC1215e);
                return;
        }
    }

    @Override // defpackage.InterfaceC15135e
    public /* synthetic */ void admob(AbstractC1215e abstractC1215e, boolean z) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C11742e c11742e = new C11742e(new C7306e(4));
                C11328e c11328e = (C11328e) this.f16626e;
                c11328e.ad(c11742e);
                C0385e c0385e = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e);
                c0385e.ad((C10078e) abstractC1215e);
                return;
        }
    }

    @Override // defpackage.InterfaceC15135e
    public void advert(AbstractC1215e abstractC1215e, int i) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C7306e c7306e = new C7306e(8);
                c7306e.f14927e = Integer.valueOf(i);
                C11742e c11742e = new C11742e(c7306e);
                C11328e c11328e = (C11328e) this.f16626e;
                c11328e.ad(c11742e);
                c11328e.appmetrica();
                return;
        }
    }

    @Override // defpackage.InterfaceC15135e
    public /* bridge */ /* synthetic */ void amazon(AbstractC1215e abstractC1215e) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC15135e
    public void appmetrica(AbstractC1215e abstractC1215e, String str) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C11742e c11742e = new C11742e(new C7306e(7));
                C11328e c11328e = (C11328e) this.f16626e;
                c11328e.ad(c11742e);
                C0385e c0385e = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e);
                c0385e.ad((C10078e) abstractC1215e);
                C0385e c0385e2 = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e2);
                String str2 = c0385e2.mopub;
                if (str2 == null) {
                    c0385e2.mopub = str;
                    return;
                } else {
                    if (TextUtils.equals(str, str2)) {
                        return;
                    }
                    c0385e2.vip(4);
                    return;
                }
        }
    }

    @Override // defpackage.InterfaceC15135e
    public void billing(AbstractC1215e abstractC1215e, int i) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C7306e c7306e = new C7306e(5);
                c7306e.f14927e = Integer.valueOf(i);
                C11742e c11742e = new C11742e(c7306e);
                C11328e c11328e = (C11328e) this.f16626e;
                c11328e.ad(c11742e);
                c11328e.appmetrica();
                return;
        }
    }

    public void license(String str, String str2) {
        ((LinkedHashMap) this.f16626e).put(str, new C17089e(str2, 1));
    }

    @Override // defpackage.InterfaceC15135e
    public void loadAd(AbstractC1215e abstractC1215e, int i) {
        int i2 = this.f16627e;
        Object obj = this.f16626e;
        switch (i2) {
            case 3:
                C18482e c18482e = C9149e.billing;
                Object[] objArr = {Integer.valueOf(i)};
                C18482e c18482e2 = C9149e.billing;
                c18482e2.vip("onSessionEnded with error = %d", objArr);
                C9149e c9149e = (C9149e) obj;
                c9149e.getClass();
                c18482e2.vip("No need to notify transferred if the transfer type is unknown", new Object[0]);
                c9149e.ad();
                return;
            default:
                C7306e c7306e = new C7306e(9);
                c7306e.f14927e = Integer.valueOf(i);
                C11328e c11328e = (C11328e) obj;
                c7306e.f14926e = Boolean.valueOf(((BinderC15170e) c11328e.f22772e).purchase == 2);
                c11328e.ad(new C11742e(c7306e));
                c11328e.appmetrica();
                return;
        }
    }

    public void metrica(String str, InterfaceC7004e interfaceC7004e) {
        ((LinkedHashMap) this.f16626e).put(str, interfaceC7004e);
    }

    @Override // defpackage.InterfaceC15135e
    public void mopub(AbstractC1215e abstractC1215e, String str) {
        int i = this.f16627e;
        Object obj = this.f16626e;
        switch (i) {
            case 3:
                C9149e c9149e = (C9149e) obj;
                c9149e.getClass();
                C9149e.billing.vip("onSessionStarted with transferType = %d", 0);
                if (c9149e.appmetrica) {
                    boolean z = c9149e.ad.f25010e;
                }
                c9149e.ad();
                return;
            default:
                C11328e c11328e = (C11328e) obj;
                c11328e.ad(new C11742e(new C7306e(4)));
                C0385e c0385e = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e);
                c0385e.ad((C10078e) abstractC1215e);
                C0385e c0385e2 = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e2);
                String str2 = c0385e2.mopub;
                if (str2 == null) {
                    c0385e2.mopub = str;
                    return;
                } else {
                    if (TextUtils.equals(str, str2)) {
                        return;
                    }
                    c0385e2.vip(4);
                    return;
                }
        }
    }

    public C0164e purchase(final C13150e c13150e, final C15071e c15071e) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f16626e;
        if (Build.VERSION.SDK_INT < 24) {
            C13400e c13400e = new C13400e(c13150e, c15071e);
            C0164e c0164e = new C0164e(c13400e);
            C0164e c0164e2 = (C0164e) concurrentHashMap.putIfAbsent(c13400e.metrica, c0164e);
            if (c0164e2 != null) {
                return c0164e2;
            }
            C3040e.ad(c13150e.vip, new C16452e(this));
            return c0164e;
        }
        final C13875e c13875e = new C13875e(10);
        c13875e.f27485e = false;
        Context context = c13150e.vip;
        String str = c15071e.license;
        if (str == null) {
            str = (String) c15071e.ad.apply(context);
            c15071e.license = str;
        }
        C0164e c0164e3 = (C0164e) ConcurrentMap$EL.computeIfAbsent(concurrentHashMap, str, new Function() { // from class: eؙۜٓ
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                C0164e c0164e4 = new C0164e(new C13400e(C13150e.this, c15071e));
                c13875e.f27485e = true;
                return c0164e4;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (c13875e.f27485e) {
            C3040e.ad(c13150e.vip, new C16452e(this));
        }
        return c0164e3;
    }

    @Override // defpackage.InterfaceC15135e
    public void startapp(AbstractC1215e abstractC1215e) {
        switch (this.f16627e) {
            case 3:
                return;
            default:
                C10078e c10078e = (C10078e) abstractC1215e;
                C7306e c7306e = new C7306e(2);
                C11328e c11328e = (C11328e) this.f16626e;
                c7306e.f14926e = Boolean.valueOf(((BinderC15170e) c11328e.f22772e).purchase == 2);
                c11328e.ad(new C11742e(c7306e));
                C0385e c0385e = (C0385e) c11328e.f22773e;
                AbstractC9528e.startapp(c0385e);
                c0385e.ad(c10078e);
                c10078e.advert = (C10182e) c11328e.f22770e;
                return;
        }
    }

    public String toString() {
        switch (this.f16627e) {
            case 0:
                return AbstractC13480e.m3608try(((LinkedHashMap) this.f16626e).entrySet(), ",", null, null, new C2091e(2), 30);
            default:
                return super.toString();
        }
    }

    public void vip(long j) {
        ((LinkedHashMap) this.f16626e).put("owner_id", new C14829e(j));
    }
}
