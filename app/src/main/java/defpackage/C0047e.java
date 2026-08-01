package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؓؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0047e implements InterfaceC5560e, InterfaceC12765e, InterfaceC17847e, InterfaceC8444e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f1185e;

    public /* synthetic */ C0047e(Object obj) {
        this.f1185e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        int i = C3355e.mopub;
        BinderC15538e binderC15538e = new BinderC15538e((C8988e) obj2);
        C18117e c18117e = (C18117e) ((C1540e) obj).loadAd();
        byte[] ad = ((C10315e) this.f1185e).ad();
        Parcel m4156e = c18117e.m4156e();
        AbstractC1757e.metrica(m4156e, binderC15538e);
        m4156e.writeByteArray(ad);
        c18117e.m4155e(m4156e, 31);
    }

    public void ad(AbstractC13532e abstractC13532e) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f1185e;
        if (!abstractC13532e.smaato()) {
            if (!(abstractC13532e instanceof C3431e)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(abstractC13532e.getClass())));
            }
            C3431e c3431e = (C3431e) abstractC13532e;
            ad(c3431e.f7686e);
            ad(c3431e.f7684e);
            return;
        }
        int binarySearch = Arrays.binarySearch(C3431e.f7683e, abstractC13532e.startapp());
        if (binarySearch < 0) {
            binarySearch = (-(binarySearch + 1)) - 1;
        }
        int crashlytics = C3431e.crashlytics(binarySearch + 1);
        if (arrayDeque.isEmpty() || ((AbstractC13532e) arrayDeque.peek()).startapp() >= crashlytics) {
            arrayDeque.push(abstractC13532e);
            return;
        }
        int crashlytics2 = C3431e.crashlytics(binarySearch);
        AbstractC13532e abstractC13532e2 = (AbstractC13532e) arrayDeque.pop();
        while (!arrayDeque.isEmpty() && ((AbstractC13532e) arrayDeque.peek()).startapp() < crashlytics2) {
            abstractC13532e2 = new C3431e((AbstractC13532e) arrayDeque.pop(), abstractC13532e2);
        }
        C3431e c3431e2 = new C3431e(abstractC13532e2, abstractC13532e);
        while (!arrayDeque.isEmpty()) {
            int binarySearch2 = Arrays.binarySearch(C3431e.f7683e, c3431e2.f7685e);
            if (binarySearch2 < 0) {
                binarySearch2 = (-(binarySearch2 + 1)) - 1;
            }
            if (((AbstractC13532e) arrayDeque.peek()).startapp() >= C3431e.crashlytics(binarySearch2 + 1)) {
                break;
            } else {
                c3431e2 = new C3431e((AbstractC13532e) arrayDeque.pop(), c3431e2);
            }
        }
        arrayDeque.push(c3431e2);
    }

    @Override // defpackage.InterfaceC5560e
    public void adcel(C14758e c14758e) {
        ((InterfaceC11914e) this.f1185e).adcel(c14758e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [eْٕ۟, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    @Override // defpackage.InterfaceC12765e
    /* renamed from: final, reason: not valid java name */
    public void mo213final(C0560e c0560e) {
        C12487e c12487e;
        ?? r16;
        boolean z;
        BinderC8922e binderC8922e = (BinderC8922e) this.f1185e;
        C18482e c18482e = BinderC8922e.advert;
        boolean z2 = binderC8922e.startapp;
        if (c0560e.advert()) {
            Bundle bundle = (Bundle) c0560e.adcel();
            boolean z3 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            c18482e.vip("The module-to-client output switcher flag %s", true != z3 ? "not existed" : "existed");
            if (z3) {
                binderC8922e.adcel = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        }
        boolean z4 = binderC8922e.adcel;
        if (binderC8922e.appmetrica == null || (c12487e = binderC8922e.purchase) == null) {
            return;
        }
        boolean z5 = c12487e.f25014e;
        boolean z6 = c12487e.f25006e;
        boolean z7 = z4 && c12487e.f25003e;
        ?? obj = new Object();
        int i = Build.VERSION.SDK_INT;
        obj.ad = i >= 30;
        if (i >= 30) {
            obj.ad = z7;
        }
        if (i >= 30) {
            obj.metrica = z5;
        }
        if (i >= 30) {
            obj.vip = z6;
        }
        boolean z8 = c12487e.f25008e;
        if (i >= 30) {
            obj.license = z8;
        }
        C16936e c16936e = new C16936e(obj);
        C10085e.vip();
        C14090e metrica = C10085e.metrica();
        C16936e c16936e2 = metrica.signatures;
        HandlerC15673e handlerC15673e = metrica.ad;
        metrica.signatures = c16936e;
        if (metrica.startapp()) {
            if (metrica.subscription == null) {
                z = false;
                C11631e c11631e = new C11631e(metrica.billing, new C16089e(metrica));
                metrica.subscription = c11631e;
                metrica.ad(c11631e, true);
                metrica.smaato();
            } else {
                z = false;
            }
            C11631e c11631e2 = metrica.subscription;
            boolean z9 = c16936e.license;
            c11631e2.f23342e = z9;
            c11631e2.mopub();
            C0222e c0222e = metrica.metrica;
            c0222e.ad = z9;
            ((Handler) c0222e.appmetrica).post((RunnableC12991e) c0222e.startapp);
            boolean z10 = (c16936e2 == null || !c16936e2.metrica) ? z ? 1 : 0 : true;
            r16 = z;
            if (z10 != c16936e.metrica) {
                C11631e c11631e3 = metrica.subscription;
                c11631e3.f18727e = metrica.ads;
                r16 = z;
                if (!c11631e3.f18734e) {
                    c11631e3.f18734e = true;
                    c11631e3.f18728e.sendEmptyMessage(2);
                    r16 = z;
                }
            }
        } else {
            boolean z11 = false;
            C11631e c11631e4 = metrica.subscription;
            r16 = z11;
            if (c11631e4 != null) {
                C9701e license = metrica.license(c11631e4);
                if (license != null) {
                    C10085e.vip();
                    c11631e4.f18731e = null;
                    c11631e4.billing(null);
                    metrica.loadAd(license, null);
                    handlerC15673e.vip(514, license);
                    metrica.advert.remove(license);
                }
                metrica.subscription = null;
                C0222e c0222e2 = metrica.metrica;
                ((Handler) c0222e2.appmetrica).post((RunnableC12991e) c0222e2.startapp);
                r16 = z11;
            }
        }
        handlerC15673e.vip(769, c16936e);
        Boolean valueOf = Boolean.valueOf(z2);
        Boolean valueOf2 = Boolean.valueOf(z7);
        Boolean valueOf3 = Boolean.valueOf(z5);
        Boolean valueOf4 = Boolean.valueOf(z6);
        Object[] objArr = new Object[4];
        objArr[r16] = valueOf;
        objArr[1] = valueOf2;
        objArr[2] = valueOf3;
        objArr[3] = valueOf4;
        Log.i(c18482e.ad, c18482e.license("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", objArr));
        C9149e c9149e = binderC8922e.yandex;
        if (c9149e != null) {
            c9149e.appmetrica = (z2 && z7) ? true : r16;
        }
        if (z2 && z7) {
            C16594e.ad(EnumC3848e.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        if (z5) {
            C16594e.ad(EnumC3848e.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    @Override // defpackage.InterfaceC8444e
    public void yandex(String str, String str2, Bundle bundle) {
        C15398e c15398e = (C15398e) this.f1185e;
        if (!TextUtils.isEmpty(str)) {
            c15398e.mo2262e().m2254e(new RunnableC11327e(this, str, str2, bundle, 15));
            return;
        }
        C6936e c6936e = c15398e.f30352e;
        if (c6936e != null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.vip(str2, "AppId not known when logging event");
        }
    }
}
